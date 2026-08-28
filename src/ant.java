import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ant {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xg.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xg.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xg.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> xg.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xg.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               el.a("targets", ex.b())
                  .then(
                     ((RequiredArgumentBuilder)el.a("enchantment", fj.a($$1, mi.aR))
                           .executes($$0x -> a((ek)$$0x.getSource(), ex.b($$0x, "targets"), fj.g($$0x, "enchantment"), 1)))
                        .then(
                           el.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ek)$$0x.getSource(), ex.b($$0x, "targets"), fj.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<? extends bxe> $$1, jg<dgx> $$2, int $$3) throws CommandSyntaxException {
      dgx $$4 = $$2.a();
      if ($$3 > $$4.e()) {
         throw d.create($$3, $$4.e());
      } else {
         int $$5 = 0;

         for (bxe $$6 : $$1) {
            if ($$6 instanceof byf) {
               byf $$7 = (byf)$$6;
               dak $$8 = $$7.fb();
               if (!$$8.f()) {
                  if ($$4.c($$8) && dgz.a(dgz.b($$8).a(), $$2)) {
                     $$8.a($$2, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.y().getString());
                  }
               } else if ($$1.size() == 1) {
                  throw b.create($$7.ah().getString());
               }
            } else if ($$1.size() == 1) {
               throw a.create($$6.ah().getString());
            }
         }

         if ($$5 == 0) {
            throw e.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xg.a("commands.enchant.success.single", dgx.a($$2, $$3), $$1.iterator().next().P_()), true);
            } else {
               $$0.a(() -> xg.a("commands.enchant.success.multiple", dgx.a($$2, $$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
