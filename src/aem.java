import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aem {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(sw.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("targets", ec.b())
                  .then(
                     ((RequiredArgumentBuilder)dt.a("enchantment", eo.a($$1, jc.r))
                           .executes($$0x -> a((ds)$$0x.getSource(), ec.b($$0x, "targets"), eo.g($$0x, "enchantment"), 1)))
                        .then(
                           dt.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ds)$$0x.getSource(), ec.b($$0x, "targets"), eo.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<? extends bfj> $$1, he<ckg> $$2, int $$3) throws CommandSyntaxException {
      ckg $$4 = $$2.a();
      if ($$3 > $$4.a()) {
         throw d.create($$3, $$4.a());
      } else {
         int $$5 = 0;

         for (bfj $$6 : $$1) {
            if ($$6 instanceof bfz) {
               bfz $$7 = (bfz)$$6;
               cfz $$8 = $$7.eO();
               if (!$$8.b()) {
                  if ($$4.a($$8) && cki.a(cki.a($$8).keySet(), $$4)) {
                     $$8.a($$4, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.d().m($$8).getString());
                  }
               } else if ($$1.size() == 1) {
                  throw b.create($$7.Z().getString());
               }
            } else if ($$1.size() == 1) {
               throw a.create($$6.Z().getString());
            }
         }

         if ($$5 == 0) {
            throw e.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> sw.a("commands.enchant.success.single", $$4.d($$3), $$1.iterator().next().H_()), true);
            } else {
               $$0.a(() -> sw.a("commands.enchant.success.multiple", $$4.d($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
