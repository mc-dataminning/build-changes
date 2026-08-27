import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aie {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ur.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ur.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ur.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ur.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("targets", eg.b())
                  .then(
                     ((RequiredArgumentBuilder)dv.a("enchantment", es.a($$1, jz.s))
                           .executes($$0x -> a((du)$$0x.getSource(), eg.b($$0x, "targets"), es.g($$0x, "enchantment"), 1)))
                        .then(
                           dv.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (du)$$0x.getSource(), eg.b($$0x, "targets"), es.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, Collection<? extends bki> $$1, ib<cpm> $$2, int $$3) throws CommandSyntaxException {
      cpm $$4 = $$2.a();
      if ($$3 > $$4.a()) {
         throw d.create($$3, $$4.a());
      } else {
         int $$5 = 0;

         for (bki $$6 : $$1) {
            if ($$6 instanceof bky) {
               bky $$7 = (bky)$$6;
               clb $$8 = $$7.eS();
               if (!$$8.b()) {
                  if ($$4.a($$8) && cpo.a(cpo.a($$8).keySet(), $$4)) {
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
               $$0.a(() -> ur.a("commands.enchant.success.single", $$4.d($$3), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> ur.a("commands.enchant.success.multiple", $$4.d($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
