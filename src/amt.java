import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amt {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               ei.a("targets", eu.b())
                  .then(
                     ((RequiredArgumentBuilder)ei.a("enchantment", fg.a($$1, li.u))
                           .executes($$0x -> a((eh)$$0x.getSource(), eu.b($$0x, "targets"), fg.g($$0x, "enchantment"), 1)))
                        .then(
                           ei.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (eh)$$0x.getSource(), eu.b($$0x, "targets"), fg.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(eh $$0, Collection<? extends brv> $$1, ja<dad> $$2, int $$3) throws CommandSyntaxException {
      dad $$4 = $$2.a();
      if ($$3 > $$4.g()) {
         throw d.create($$3, $$4.g());
      } else {
         int $$5 = 0;

         for (brv $$6 : $$1) {
            if ($$6 instanceof bso) {
               bso $$7 = (bso)$$6;
               cuh $$8 = $$7.fg();
               if (!$$8.d()) {
                  if ($$4.b($$8) && dae.a(dae.b($$8).a(), $$4)) {
                     $$8.a($$4, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.f().o($$8).getString());
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
               $$0.a(() -> xe.a("commands.enchant.success.single", $$4.e($$3), $$1.iterator().next().P_()), true);
            } else {
               $$0.a(() -> xe.a("commands.enchant.success.multiple", $$4.e($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
