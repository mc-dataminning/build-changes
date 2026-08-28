import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ang {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               ev.a("targets", fh.b())
                  .then(
                     ((RequiredArgumentBuilder)ev.a("enchantment", ft.a($$1, lw.aN))
                           .executes($$0x -> a((eu)$$0x.getSource(), fh.b($$0x, "targets"), ft.g($$0x, "enchantment"), 1)))
                        .then(
                           ev.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (eu)$$0x.getSource(), fh.b($$0x, "targets"), ft.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(eu $$0, Collection<? extends btr> $$1, jo<dbn> $$2, int $$3) throws CommandSyntaxException {
      dbn $$4 = $$2.a();
      if ($$3 > $$4.e()) {
         throw d.create($$3, $$4.e());
      } else {
         int $$5 = 0;

         for (btr $$6 : $$1) {
            if ($$6 instanceof bun) {
               bun $$7 = (bun)$$6;
               cvs $$8 = $$7.eW();
               if (!$$8.f()) {
                  if ($$4.c($$8) && dbp.a(dbp.b($$8).a(), $$2)) {
                     $$8.a($$2, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.y().getString());
                  }
               } else if ($$1.size() == 1) {
                  throw b.create($$7.aj().getString());
               }
            } else if ($$1.size() == 1) {
               throw a.create($$6.aj().getString());
            }
         }

         if ($$5 == 0) {
            throw e.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xe.a("commands.enchant.success.single", dbn.a($$2, $$3), $$1.iterator().next().R_()), true);
            } else {
               $$0.a(() -> xe.a("commands.enchant.success.multiple", dbn.a($$2, $$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
