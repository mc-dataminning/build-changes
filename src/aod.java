import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aod {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ef.a("pos", ga.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("block", fx.a($$1))
                                 .executes($$0x -> a((ee)$$0x.getSource(), ga.a($$0x, "pos"), fx.a($$0x, "block"), aod.b.a, null)))
                              .then(ef.a("destroy").executes($$0x -> a((ee)$$0x.getSource(), ga.a($$0x, "pos"), fx.a($$0x, "block"), aod.b.b, null))))
                           .then(
                              ef.a("keep")
                                 .executes($$0x -> a((ee)$$0x.getSource(), ga.a($$0x, "pos"), fx.a($$0x, "block"), aod.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(ef.a("replace").executes($$0x -> a((ee)$$0x.getSource(), ga.a($$0x, "pos"), fx.a($$0x, "block"), aod.b.a, null)))
                  )
            )
      );
   }

   private static int a(ee $$0, io $$1, fv $$2, aod.b $$3, @Nullable Predicate<drh> $$4) throws CommandSyntaxException {
      aqn $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new drh($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == aod.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            doi $$7 = $$5.c_($$1);
            bpn.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> wx.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fv filter(ehd var1, io var2, fv var3, aqn var4);
   }

   public static enum b {
      a,
      b;
   }
}
