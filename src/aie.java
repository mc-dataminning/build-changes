import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aie {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ds.a("pos", fi.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("block", ff.a($$1))
                                 .executes($$0x -> a((dr)$$0x.getSource(), fi.a($$0x, "pos"), ff.a($$0x, "block"), aie.b.a, null)))
                              .then(ds.a("destroy").executes($$0x -> a((dr)$$0x.getSource(), fi.a($$0x, "pos"), ff.a($$0x, "block"), aie.b.b, null))))
                           .then(
                              ds.a("keep")
                                 .executes($$0x -> a((dr)$$0x.getSource(), fi.a($$0x, "pos"), ff.a($$0x, "block"), aie.b.a, $$0xx -> $$0xx.c().t($$0xx.d())))
                           ))
                        .then(ds.a("replace").executes($$0x -> a((dr)$$0x.getSource(), fi.a($$0x, "pos"), ff.a($$0x, "block"), aie.b.a, null)))
                  )
            )
      );
   }

   private static int a(dr $$0, gu $$1, fd $$2, aie.b $$3, @Nullable Predicate<dfe> $$4) throws CommandSyntaxException {
      akk $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dfe($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aie.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dcm $$7 = $$5.c_($$1);
            bgh.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> tf.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fd filter(dur var1, gu var2, fd var3, akk var4);
   }

   public static enum b {
      a,
      b;
   }
}
