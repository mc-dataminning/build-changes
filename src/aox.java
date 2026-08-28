import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aox {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      Predicate<dyq> $$2 = $$0x -> $$0x.c().u($$0x.d());
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("pos", gu.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("block", gr.a($$1))
                                    .executes($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "pos"), gr.a($$0x, "block"), aox.a.a, null, false)))
                                 .then(ey.a("destroy").executes($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "pos"), gr.a($$0x, "block"), aox.a.b, null, false))))
                              .then(ey.a("keep").executes($$1x -> a((ex)$$1x.getSource(), gu.a($$1x, "pos"), gr.a($$1x, "block"), aox.a.a, $$2, false))))
                           .then(ey.a("replace").executes($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "pos"), gr.a($$0x, "block"), aox.a.a, null, false))))
                        .then(ey.a("strict").executes($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "pos"), gr.a($$0x, "block"), aox.a.a, null, true)))
                  )
            )
      );
   }

   private static int a(ex $$0, jj $$1, gp $$2, aox.a $$3, @Nullable Predicate<dyq> $$4, boolean $$5) throws CommandSyntaxException {
      arn $$6 = $$0.e();
      if ($$6.ak()) {
         throw a.create();
      } else if ($$4 != null && !$$4.test(new dyq($$6, $$1, true))) {
         throw a.create();
      } else {
         boolean $$7;
         if ($$3 == aox.a.b) {
            $$6.b($$1, true);
            $$7 = !$$2.a().l() || !$$6.a_($$1).l();
         } else {
            $$7 = true;
         }

         if ($$7 && !$$2.a($$6, $$1, 2 | ($$5 ? 304 : 256))) {
            throw a.create();
         } else {
            if (!$$5) {
               $$6.a($$1, $$2.a().b());
            }

            $$0.a(() -> wv.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public static enum a {
      a,
      b;
   }
}
