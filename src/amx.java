import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amx {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wp.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wp.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wp.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wp.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("targets", fk.b())
                  .then(
                     ((RequiredArgumentBuilder)ey.a("enchantment", fw.a($$1, mc.aO))
                           .executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"), fw.g($$0x, "enchantment"), 1)))
                        .then(
                           ey.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ex)$$0x.getSource(), fk.b($$0x, "targets"), fw.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, Collection<? extends bum> $$1, jr<dda> $$2, int $$3) throws CommandSyntaxException {
      dda $$4 = $$2.a();
      if ($$3 > $$4.e()) {
         throw d.create($$3, $$4.e());
      } else {
         int $$5 = 0;

         for (bum $$6 : $$1) {
            if ($$6 instanceof bvi) {
               bvi $$7 = (bvi)$$6;
               cwq $$8 = $$7.eZ();
               if (!$$8.f()) {
                  if ($$4.c($$8) && ddc.a(ddc.b($$8).a(), $$2)) {
                     $$8.a($$2, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.y().getString());
                  }
               } else if ($$1.size() == 1) {
                  throw b.create($$7.al().getString());
               }
            } else if ($$1.size() == 1) {
               throw a.create($$6.al().getString());
            }
         }

         if ($$5 == 0) {
            throw e.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> wp.a("commands.enchant.success.single", dda.a($$2, $$3), $$1.iterator().next().p_()), true);
            } else {
               $$0.a(() -> wp.a("commands.enchant.success.multiple", dda.a($$2, $$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
