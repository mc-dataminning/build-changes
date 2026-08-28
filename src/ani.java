import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ani {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wy.c("commands.enchant.failed"));

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

   private static int a(ej $$0, Collection<? extends bwi> $$1, jf<dfx> $$2, int $$3) throws CommandSyntaxException {
      dfx $$4 = $$2.a();
      if ($$3 > $$4.e()) {
         throw d.create($$3, $$4.e());
      } else {
         int $$5 = 0;

         for (bwi $$6 : $$1) {
            if ($$6 instanceof bxj) {
               bxj $$7 = (bxj)$$6;
               czk $$8 = $$7.fa();
               if (!$$8.f()) {
                  if ($$4.c($$8) && dfz.a(dfz.b($$8).a(), $$2)) {
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
               $$0.a(() -> wy.a("commands.enchant.success.single", dfx.a($$2, $$3), $$1.iterator().next().m_()), true);
            } else {
               $$0.a(() -> wy.a("commands.enchant.success.multiple", dfx.a($$2, $$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
