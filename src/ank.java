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
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xa.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xa.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xa.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> xa.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xa.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               ek.a("targets", ew.b())
                  .then(
                     ((RequiredArgumentBuilder)ek.a("enchantment", fi.a($$1, mh.aR))
                           .executes($$0x -> a((ej)$$0x.getSource(), ew.b($$0x, "targets"), fi.g($$0x, "enchantment"), 1)))
                        .then(
                           ek.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ej)$$0x.getSource(), ew.b($$0x, "targets"), fi.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ej $$0, Collection<? extends bwt> $$1, jf<dgl> $$2, int $$3) throws CommandSyntaxException {
      dgl $$4 = $$2.a();
      if ($$3 > $$4.e()) {
         throw d.create($$3, $$4.e());
      } else {
         int $$5 = 0;

         for (bwt $$6 : $$1) {
            if ($$6 instanceof bxu) {
               bxu $$7 = (bxu)$$6;
               czy $$8 = $$7.fb();
               if (!$$8.f()) {
                  if ($$4.c($$8) && dgn.a(dgn.b($$8).a(), $$2)) {
                     $$8.a($$2, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.y().getString());
                  }
               } else if ($$1.size() == 1) {
                  throw b.create($$7.ai().getString());
               }
            } else if ($$1.size() == 1) {
               throw a.create($$6.ai().getString());
            }
         }

         if ($$5 == 0) {
            throw e.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xa.a("commands.enchant.success.single", dgl.a($$2, $$3), $$1.iterator().next().m_()), true);
            } else {
               $$0.a(() -> xa.a("commands.enchant.success.multiple", dgl.a($$2, $$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
