import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aoy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ew.a("pos", gr.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("block", go.a($$1))
                                 .executes($$0x -> a((ev)$$0x.getSource(), gr.a($$0x, "pos"), go.a($$0x, "block"), aoy.b.a, null)))
                              .then(ew.a("destroy").executes($$0x -> a((ev)$$0x.getSource(), gr.a($$0x, "pos"), go.a($$0x, "block"), aoy.b.b, null))))
                           .then(
                              ew.a("keep")
                                 .executes($$0x -> a((ev)$$0x.getSource(), gr.a($$0x, "pos"), go.a($$0x, "block"), aoy.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(ew.a("replace").executes($$0x -> a((ev)$$0x.getSource(), gr.a($$0x, "pos"), go.a($$0x, "block"), aoy.b.a, null)))
                  )
            )
      );
   }

   private static int a(ev $$0, jg $$1, gm $$2, aoy.b $$3, @Nullable Predicate<dvh> $$4) throws CommandSyntaxException {
      arm $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dvh($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aoy.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().l() || !$$5.a_($$1).l();
         } else {
            dsg $$7 = $$5.c_($$1);
            brp.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> xh.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      gm filter(elj var1, jg var2, gm var3, arm var4);
   }

   public static enum b {
      a,
      b;
   }
}
