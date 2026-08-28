import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amr {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wy.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               eu.a("targets", fg.b())
                  .then(
                     ((RequiredArgumentBuilder)eu.a("enchantment", fs.a($$1, lu.aL))
                           .executes($$0x -> a((et)$$0x.getSource(), fg.b($$0x, "targets"), fs.g($$0x, "enchantment"), 1)))
                        .then(
                           eu.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (et)$$0x.getSource(), fg.b($$0x, "targets"), fs.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(et $$0, Collection<? extends bsq> $$1, jm<daa> $$2, int $$3) throws CommandSyntaxException {
      daa $$4 = $$2.a();
      if ($$3 > $$4.e()) {
         throw d.create($$3, $$4.e());
      } else {
         int $$5 = 0;

         for (bsq $$6 : $$1) {
            if ($$6 instanceof btl) {
               btl $$7 = (btl)$$6;
               cuo $$8 = $$7.eU();
               if (!$$8.e()) {
                  if ($$4.c($$8) && dac.a(dac.b($$8).a(), $$2)) {
                     $$8.a($$2, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.g().n($$8).getString());
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
               $$0.a(() -> wy.a("commands.enchant.success.single", daa.a($$2, $$3), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> wy.a("commands.enchant.success.multiple", daa.a($$2, $$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
