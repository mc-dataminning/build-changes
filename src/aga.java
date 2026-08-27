import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aga {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(sw.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("pos", fi.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("block", ff.a($$1))
                                 .executes($$0x -> a((ds)$$0x.getSource(), fi.a($$0x, "pos"), ff.a($$0x, "block"), aga.b.a, null)))
                              .then(dt.a("destroy").executes($$0x -> a((ds)$$0x.getSource(), fi.a($$0x, "pos"), ff.a($$0x, "block"), aga.b.b, null))))
                           .then(
                              dt.a("keep")
                                 .executes($$0x -> a((ds)$$0x.getSource(), fi.a($$0x, "pos"), ff.a($$0x, "block"), aga.b.a, $$0xx -> $$0xx.c().t($$0xx.d())))
                           ))
                        .then(dt.a("replace").executes($$0x -> a((ds)$$0x.getSource(), fi.a($$0x, "pos"), ff.a($$0x, "block"), aga.b.a, null)))
                  )
            )
      );
   }

   private static int a(ds $$0, gu $$1, fd $$2, aga.b $$3, @Nullable Predicate<dcf> $$4) throws CommandSyntaxException {
      aif $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dcf($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aga.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            czn $$7 = $$5.c_($$1);
            bdo.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> sw.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fd filter(drs var1, gu var2, fd var3, aif var4);
   }

   public static enum b {
      a,
      b;
   }
}
