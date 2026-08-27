import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ais {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vb.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vb.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vb.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> vb.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vb.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("targets", ee.b())
                  .then(
                     ((RequiredArgumentBuilder)dt.a("enchantment", eq.a($$1, kc.t))
                           .executes($$0x -> a((ds)$$0x.getSource(), ee.b($$0x, "targets"), eq.g($$0x, "enchantment"), 1)))
                        .then(
                           dt.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ds)$$0x.getSource(), ee.b($$0x, "targets"), eq.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<? extends blf> $$1, ie<cqs> $$2, int $$3) throws CommandSyntaxException {
      cqs $$4 = $$2.a();
      if ($$3 > $$4.a()) {
         throw d.create($$3, $$4.a());
      } else {
         int $$5 = 0;

         for (blf $$6 : $$1) {
            if ($$6 instanceof blv) {
               blv $$7 = (blv)$$6;
               cmh $$8 = $$7.eT();
               if (!$$8.b()) {
                  if ($$4.a($$8) && cqu.a(cqu.a($$8).keySet(), $$4)) {
                     $$8.a($$4, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.d().m($$8).getString());
                  }
               } else if ($$1.size() == 1) {
                  throw b.create($$7.ad().getString());
               }
            } else if ($$1.size() == 1) {
               throw a.create($$6.ad().getString());
            }
         }

         if ($$5 == 0) {
            throw e.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> vb.a("commands.enchant.success.single", $$4.d($$3), $$1.iterator().next().Q_()), true);
            } else {
               $$0.a(() -> vb.a("commands.enchant.success.multiple", $$4.d($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
