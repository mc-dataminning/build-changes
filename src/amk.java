import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amk {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("commands.enchant.failed.entity", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.enchant.failed.itemless", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.enchant.failed.incompatible", $$0));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.enchant.failed.level", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.enchant.failed"));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("enchant").requires($$0x -> $$0x.c(2)))
            .then(
               er.a("targets", fd.b())
                  .then(
                     ((RequiredArgumentBuilder)er.a("enchantment", fp.a($$1, lr.aK))
                           .executes($$0x -> a((eq)$$0x.getSource(), fd.b($$0x, "targets"), fp.g($$0x, "enchantment"), 1)))
                        .then(
                           er.a("level", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a(
                                       (eq)$$0x.getSource(), fd.b($$0x, "targets"), fp.g($$0x, "enchantment"), IntegerArgumentType.getInteger($$0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(eq $$0, Collection<? extends bsg> $$1, jj<czl> $$2, int $$3) throws CommandSyntaxException {
      czl $$4 = $$2.a();
      if ($$3 > $$4.e()) {
         throw d.create($$3, $$4.e());
      } else {
         int $$5 = 0;

         for (bsg $$6 : $$1) {
            if ($$6 instanceof btb) {
               btb $$7 = (btb)$$6;
               cuc $$8 = $$7.eU();
               if (!$$8.e()) {
                  if ($$4.c($$8) && czn.a(czn.b($$8).a(), $$2)) {
                     $$8.a($$2, $$3);
                     $$5++;
                  } else if ($$1.size() == 1) {
                     throw c.create($$8.g().n($$8).getString());
                  }
               } else if ($$1.size() == 1) {
                  throw b.create($$7.ag().getString());
               }
            } else if ($$1.size() == 1) {
               throw a.create($$6.ag().getString());
            }
         }

         if ($$5 == 0) {
            throw e.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> wu.a("commands.enchant.success.single", czl.a($$2, $$3), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> wu.a("commands.enchant.success.multiple", czl.a($$2, $$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }
}
