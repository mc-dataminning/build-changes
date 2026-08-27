import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ame {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ws.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ws.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               ed.a("targets", ep.b())
                  .then(
                     ((RequiredArgumentBuilder)ed.a("enchantment", fb.a($$1, ld.u))
                           .executes($$0x -> a((ec)$$0x.getSource(), ep.b($$0x, "targets"), fb.g($$0x, "enchantment"), 1)))
                        .then(
                           ed.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (ec)$$0x.getSource(), ep.b($$0x, "targets"), fb.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ec $$0, Collection<? extends bql> $$1, iv<cxn> $$2, int $$3) throws CommandSyntaxException {
      cxn $$4 = $$2.a();
      if ($$3 > $$4.a()) {
         throw d.create($$3, $$4.a());
      } else {
         int $$5 = 0;

         for (bql $$6 : $$1) {
            if ($$6 instanceof bre) {
               bre $$7 = (bre)$$6;
               csd $$8 = $$7.eV();
               if (!$$8.d()) {
                  if ($$4.a($$8) && cxo.a(cxo.b($$8).a(), $$4)) {
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
               $$0.a(() -> ws.a("commands.enchant.success.single", $$4.d($$3), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> ws.a("commands.enchant.success.multiple", $$4.d($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
