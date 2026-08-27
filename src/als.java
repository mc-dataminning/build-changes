import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class als {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wg.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wg.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wg.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> wg.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wg.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("targets", eh.b())
                  .then(
                     ((RequiredArgumentBuilder)dv.a("enchantment", et.a($$1, ks.t))
                           .executes($$0x -> a((du)$$0x.getSource(), eh.b($$0x, "targets"), et.g($$0x, "enchantment"), 1)))
                        .then(
                           dv.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (du)$$0x.getSource(), eh.b($$0x, "targets"), et.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, Collection<? extends bpv> $$1, il<cwq> $$2, int $$3) throws CommandSyntaxException {
      cwq $$4 = $$2.a();
      if ($$3 > $$4.a()) {
         throw d.create($$3, $$4.a());
      } else {
         int $$5 = 0;

         for (bpv $$6 : $$1) {
            if ($$6 instanceof bqo) {
               bqo $$7 = (bqo)$$6;
               crj $$8 = $$7.eU();
               if (!$$8.d()) {
                  if ($$4.a($$8) && cwr.a(cwr.b($$8).a(), $$4)) {
                     $$8.a($$4, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.f().o($$8).getString());
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
               $$0.a(() -> wg.a("commands.enchant.success.single", $$4.d($$3), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> wg.a("commands.enchant.success.multiple", $$4.d($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
