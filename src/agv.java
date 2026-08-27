import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class agv {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tm.a("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tm.a("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tm.a("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> tm.a("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(tm.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               du.a("targets", ee.b())
                  .then(
                     ((RequiredArgumentBuilder)du.a("enchantment", eq.a($$1, je.r))
                           .executes($$0x -> a((dt)$$0x.getSource(), ee.b($$0x, "targets"), eq.g($$0x, "enchantment"), 1)))
                        .then(
                           du.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (dt)$$0x.getSource(), ee.b($$0x, "targets"), eq.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dt $$0, Collection<? extends biq> $$1, hg<cno> $$2, int $$3) throws CommandSyntaxException {
      cno $$4 = $$2.a();
      if ($$3 > $$4.a()) {
         throw d.create($$3, $$4.a());
      } else {
         int $$5 = 0;

         for (biq $$6 : $$1) {
            if ($$6 instanceof bjg) {
               bjg $$7 = (bjg)$$6;
               cjf $$8 = $$7.eS();
               if (!$$8.b()) {
                  if ($$4.a($$8) && cnq.a(cnq.a($$8).keySet(), $$4)) {
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
               $$0.a(() -> tm.a("commands.enchant.success.single", $$4.d($$3), $$1.iterator().next().N_()), true);
            } else {
               $$0.a(() -> tm.a("commands.enchant.success.multiple", $$4.d($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
