import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class alu {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wi.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wi.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> wi.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wi.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               dw.a("targets", ei.b())
                  .then(
                     ((RequiredArgumentBuilder)dw.a("enchantment", eu.a($$1, ku.u))
                           .executes($$0x -> a((dv)$$0x.getSource(), ei.b($$0x, "targets"), eu.g($$0x, "enchantment"), 1)))
                        .then(
                           dw.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (dv)$$0x.getSource(), ei.b($$0x, "targets"), eu.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dv $$0, Collection<? extends bqa> $$1, in<cwz> $$2, int $$3) throws CommandSyntaxException {
      cwz $$4 = $$2.a();
      if ($$3 > $$4.a()) {
         throw d.create($$3, $$4.a());
      } else {
         int $$5 = 0;

         for (bqa $$6 : $$1) {
            if ($$6 instanceof bqt) {
               bqt $$7 = (bqt)$$6;
               crs $$8 = $$7.eU();
               if (!$$8.d()) {
                  if ($$4.a($$8) && cxa.a(cxa.b($$8).a(), $$4)) {
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
               $$0.a(() -> wi.a("commands.enchant.success.single", $$4.d($$3), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> wi.a("commands.enchant.success.multiple", $$4.d($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
