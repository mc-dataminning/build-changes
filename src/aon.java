import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aon {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("pos", gt.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("block", gq.a($$1))
                                 .executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aon.b.a, null)))
                              .then(ey.a("destroy").executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aon.b.b, null))))
                           .then(
                              ey.a("keep")
                                 .executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aon.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(ey.a("replace").executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aon.b.a, null)))
                  )
            )
      );
   }

   private static int a(ex $$0, ji $$1, go $$2, aon.b $$3, @Nullable Predicate<dwz> $$4) throws CommandSyntaxException {
      arc $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dwz($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aon.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().l() || !$$5.a_($$1).l();
         } else {
            dtx $$7 = $$5.c_($$1);
            brz.a($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> wo.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      go filter(enc var1, ji var2, go var3, arc var4);
   }

   public static enum b {
      a,
      b;
   }
}
