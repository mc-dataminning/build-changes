import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class akx {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vq.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vq.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vq.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> vq.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vq.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("targets", eh.b())
                  .then(
                     ((RequiredArgumentBuilder)dv.a("enchantment", et.a($$1, kg.t))
                           .executes($$0x -> a((du)$$0x.getSource(), eh.b($$0x, "targets"), et.g($$0x, "enchantment"), 1)))
                        .then(
                           dv.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (du)$$0x.getSource(), eh.b($$0x, "targets"), et.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, Collection<? extends bnq> $$1, ij<ctm> $$2, int $$3) throws CommandSyntaxException {
      ctm $$4 = $$2.a();
      if ($$3 > $$4.a()) {
         throw d.create($$3, $$4.a());
      } else {
         int $$5 = 0;

         for (bnq $$6 : $$1) {
            if ($$6 instanceof boi) {
               boi $$7 = (boi)$$6;
               cpd $$8 = $$7.eT();
               if (!$$8.b()) {
                  if ($$4.a($$8) && ctn.a(ctn.a($$8).keySet(), $$4)) {
                     $$8.a($$4, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.d().m($$8).getString());
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
               $$0.a(() -> vq.a("commands.enchant.success.single", $$4.d($$3), $$1.iterator().next().Q_()), true);
            } else {
               $$0.a(() -> vq.a("commands.enchant.success.multiple", $$4.d($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
