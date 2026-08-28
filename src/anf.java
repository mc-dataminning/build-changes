import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anf {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xp.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xp.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xp.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> xp.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xp.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               eq.a("targets", fc.b())
                  .then(
                     ((RequiredArgumentBuilder)eq.a("enchantment", fo.a($$1, lq.u))
                           .executes($$0x -> a((ep)$$0x.getSource(), fc.b($$0x, "targets"), fo.g($$0x, "enchantment"), 1)))
                        .then(
                           eq.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ep)$$0x.getSource(), fc.b($$0x, "targets"), fo.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ep $$0, Collection<? extends bsu> $$1, ji<daa> $$2, int $$3) throws CommandSyntaxException {
      daa $$4 = $$2.a();
      if ($$3 > $$4.g()) {
         throw d.create($$3, $$4.g());
      } else {
         int $$5 = 0;

         for (bsu $$6 : $$1) {
            if ($$6 instanceof btp) {
               btp $$7 = (btp)$$6;
               cup $$8 = $$7.eX();
               if (!$$8.e()) {
                  if ($$4.b($$8) && dab.a(dab.b($$8).a(), $$4)) {
                     $$8.a($$4, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.g().o($$8).getString());
                  }
               } else if ($$1.size() == 1) {
                  throw b.create($$7.af().getString());
               }
            } else if ($$1.size() == 1) {
               throw a.create($$6.af().getString());
            }
         }

         if ($$5 == 0) {
            throw e.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xp.a("commands.enchant.success.single", $$4.e($$3), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> xp.a("commands.enchant.success.multiple", $$4.e($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
