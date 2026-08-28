import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aps {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ex.a("pos", gs.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("block", gp.a($$1))
                                 .executes($$0x -> a((ew)$$0x.getSource(), gs.a($$0x, "pos"), gp.a($$0x, "block"), aps.b.a, null)))
                              .then(ex.a("destroy").executes($$0x -> a((ew)$$0x.getSource(), gs.a($$0x, "pos"), gp.a($$0x, "block"), aps.b.b, null))))
                           .then(
                              ex.a("keep")
                                 .executes($$0x -> a((ew)$$0x.getSource(), gs.a($$0x, "pos"), gp.a($$0x, "block"), aps.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(ex.a("replace").executes($$0x -> a((ew)$$0x.getSource(), gs.a($$0x, "pos"), gp.a($$0x, "block"), aps.b.a, null)))
                  )
            )
      );
   }

   private static int a(ew $$0, jh $$1, gn $$2, aps.b $$3, @Nullable Predicate<dxy> $$4) throws CommandSyntaxException {
      ash $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dxy($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aps.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().l() || !$$5.a_($$1).l();
         } else {
            duw $$7 = $$5.c_($$1);
            bsz.a($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> xv.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      gn filter(eob var1, jh var2, gn var3, ash var4);
   }

   public static enum b {
      a,
      b;
   }
}
