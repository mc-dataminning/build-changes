import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aic {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("pos", fj.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("block", fg.a($$1))
                                 .executes($$0x -> a((ds)$$0x.getSource(), fj.a($$0x, "pos"), fg.a($$0x, "block"), aic.b.a, null)))
                              .then(dt.a("destroy").executes($$0x -> a((ds)$$0x.getSource(), fj.a($$0x, "pos"), fg.a($$0x, "block"), aic.b.b, null))))
                           .then(
                              dt.a("keep")
                                 .executes($$0x -> a((ds)$$0x.getSource(), fj.a($$0x, "pos"), fg.a($$0x, "block"), aic.b.a, $$0xx -> $$0xx.c().t($$0xx.d())))
                           ))
                        .then(dt.a("replace").executes($$0x -> a((ds)$$0x.getSource(), fj.a($$0x, "pos"), fg.a($$0x, "block"), aic.b.a, null)))
                  )
            )
      );
   }

   private static int a(ds $$0, gv $$1, fe $$2, aic.b $$3, @Nullable Predicate<dfc> $$4) throws CommandSyntaxException {
      aki $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dfc($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aic.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dck $$7 = $$5.c_($$1);
            bgf.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> te.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fe filter(dup var1, gv var2, fe var3, aki var4);
   }

   public static enum b {
      a,
      b;
   }
}
