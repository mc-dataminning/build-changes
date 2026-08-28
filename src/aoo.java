import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aoo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("pos", gt.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("block", gq.a($$1))
                                 .executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aoo.b.a, null)))
                              .then(ey.a("destroy").executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aoo.b.b, null))))
                           .then(
                              ey.a("keep")
                                 .executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aoo.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(ey.a("replace").executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aoo.b.a, null)))
                  )
            )
      );
   }

   private static int a(ex $$0, ji $$1, go $$2, aoo.b $$3, @Nullable Predicate<dxb> $$4) throws CommandSyntaxException {
      ard $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dxb($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aoo.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().l() || !$$5.a_($$1).l();
         } else {
            dtz $$7 = $$5.c_($$1);
            bsb.a($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> wp.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      go filter(ene var1, ji var2, go var3, ard var4);
   }

   public static enum b {
      a,
      b;
   }
}
