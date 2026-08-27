import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ank {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               dw.a("pos", fq.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("block", fn.a($$1))
                                 .executes($$0x -> a((dv)$$0x.getSource(), fq.a($$0x, "pos"), fn.a($$0x, "block"), ank.b.a, null)))
                              .then(dw.a("destroy").executes($$0x -> a((dv)$$0x.getSource(), fq.a($$0x, "pos"), fn.a($$0x, "block"), ank.b.b, null))))
                           .then(
                              dw.a("keep")
                                 .executes($$0x -> a((dv)$$0x.getSource(), fq.a($$0x, "pos"), fn.a($$0x, "block"), ank.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(dw.a("replace").executes($$0x -> a((dv)$$0x.getSource(), fq.a($$0x, "pos"), fn.a($$0x, "block"), ank.b.a, null)))
                  )
            )
      );
   }

   private static int a(dv $$0, id $$1, fl $$2, ank.b $$3, @Nullable Predicate<dpm> $$4) throws CommandSyntaxException {
      apu $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dpm($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == ank.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dmo $$7 = $$5.c_($$1);
            bnw.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> wi.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fl filter(efi var1, id var2, fl var3, apu var4);
   }

   public static enum b {
      a,
      b;
   }
}
