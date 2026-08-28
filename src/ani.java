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

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               ej.a("targets", ev.b())
                  .then(
                     ((RequiredArgumentBuilder)ej.a("enchantment", fh.a($$1, mg.aQ))
                           .executes($$0x -> a((ei)$$0x.getSource(), ev.b($$0x, "targets"), fh.g($$0x, "enchantment"), 1)))
                        .then(
                           ej.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ei)$$0x.getSource(), ev.b($$0x, "targets"), fh.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ei $$0, Collection<? extends bwd> $$1, je<dfl> $$2, int $$3) throws CommandSyntaxException {
      dfl $$4 = $$2.a();
      if ($$3 > $$4.e()) {
         throw d.create($$3, $$4.e());
      } else {
         int $$5 = 0;

         for (bwd $$6 : $$1) {
            if ($$6 instanceof bxc) {
               bxc $$7 = (bxc)$$6;
               cyy $$8 = $$7.fa();
               if (!$$8.f()) {
                  if ($$4.c($$8) && dfn.a(dfn.b($$8).a(), $$2)) {
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
               $$0.a(() -> wy.a("commands.enchant.success.single", dfl.a($$2, $$3), $$1.iterator().next().m_()), true);
            } else {
               $$0.a(() -> wy.a("commands.enchant.success.multiple", dfl.a($$2, $$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
