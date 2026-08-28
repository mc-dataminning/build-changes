import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ank {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xi.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xi.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xi.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> xi.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xi.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               ex.a("targets", fj.b())
                  .then(
                     ((RequiredArgumentBuilder)ex.a("enchantment", fv.a($$1, lz.aM))
                           .executes($$0x -> a((ew)$$0x.getSource(), fj.b($$0x, "targets"), fv.g($$0x, "enchantment"), 1)))
                        .then(
                           ex.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ew)$$0x.getSource(), fj.b($$0x, "targets"), fv.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ew $$0, Collection<? extends bue> $$1, jq<dbs> $$2, int $$3) throws CommandSyntaxException {
      dbs $$4 = $$2.a();
      if ($$3 > $$4.e()) {
         throw d.create($$3, $$4.e());
      } else {
         int $$5 = 0;

         for (bue $$6 : $$1) {
            if ($$6 instanceof bva) {
               bva $$7 = (bva)$$6;
               cwb $$8 = $$7.fb();
               if (!$$8.f()) {
                  if ($$4.c($$8) && dbu.a(dbu.b($$8).a(), $$2)) {
                     $$8.a($$2, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.y().getString());
                  }
               } else if ($$1.size() == 1) {
                  throw b.create($$7.am().getString());
               }
            } else if ($$1.size() == 1) {
               throw a.create($$6.am().getString());
            }
         }

         if ($$5 == 0) {
            throw e.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xi.a("commands.enchant.success.single", dbs.a($$2, $$3), $$1.iterator().next().S_()), true);
            } else {
               $$0.a(() -> xi.a("commands.enchant.success.multiple", dbs.a($$2, $$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
