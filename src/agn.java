import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class agn {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> te.a("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> te.a("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> te.a("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(te.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("targets", ed.b())
                  .then(
                     ((RequiredArgumentBuilder)dt.a("enchantment", ep.a($$1, jd.r))
                           .executes($$0x -> a((ds)$$0x.getSource(), ed.b($$0x, "targets"), ep.g($$0x, "enchantment"), 1)))
                        .then(
                           dt.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ds)$$0x.getSource(), ed.b($$0x, "targets"), ep.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<? extends big> $$1, hf<cnd> $$2, int $$3) throws CommandSyntaxException {
      cnd $$4 = $$2.a();
      if ($$3 > $$4.a()) {
         throw d.create($$3, $$4.a());
      } else {
         int $$5 = 0;

         for (big $$6 : $$1) {
            if ($$6 instanceof biw) {
               biw $$7 = (biw)$$6;
               ciw $$8 = $$7.eR();
               if (!$$8.b()) {
                  if ($$4.a($$8) && cnf.a(cnf.a($$8).keySet(), $$4)) {
                     $$8.a($$4, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.d().m($$8).getString());
                  }
               } else if ($$1.size() == 1) {
                  throw b.create($$7.ab().getString());
               }
            } else if ($$1.size() == 1) {
               throw a.create($$6.ab().getString());
            }
         }

         if ($$5 == 0) {
            throw e.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> te.a("commands.enchant.success.single", $$4.d($$3), $$1.iterator().next().H_()), true);
            } else {
               $$0.a(() -> te.a("commands.enchant.success.multiple", $$4.d($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
