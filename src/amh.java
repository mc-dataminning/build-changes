import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amh {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               ee.a("targets", eq.b())
                  .then(
                     ((RequiredArgumentBuilder)ee.a("enchantment", fc.a($$1, le.u))
                           .executes($$0x -> a((ed)$$0x.getSource(), eq.b($$0x, "targets"), fc.g($$0x, "enchantment"), 1)))
                        .then(
                           ee.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ed)$$0x.getSource(), eq.b($$0x, "targets"), fc.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ed $$0, Collection<? extends brh> $$1, iw<cyg> $$2, int $$3) throws CommandSyntaxException {
      cyg $$4 = $$2.a();
      if ($$3 > $$4.g()) {
         throw d.create($$3, $$4.g());
      } else {
         int $$5 = 0;

         for (brh $$6 : $$1) {
            if ($$6 instanceof bsa) {
               bsa $$7 = (bsa)$$6;
               csz $$8 = $$7.eV();
               if (!$$8.d()) {
                  if ($$4.b($$8) && cyh.a(cyh.b($$8).a(), $$4)) {
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
               $$0.a(() -> wu.a("commands.enchant.success.single", $$4.e($$3), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> wu.a("commands.enchant.success.multiple", $$4.e($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
