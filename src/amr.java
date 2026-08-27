import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class amr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vs.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("pos", fo.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("block", fl.a($$1))
                                 .executes($$0x -> a((du)$$0x.getSource(), fo.a($$0x, "pos"), fl.a($$0x, "block"), amr.b.a, null)))
                              .then(dv.a("destroy").executes($$0x -> a((du)$$0x.getSource(), fo.a($$0x, "pos"), fl.a($$0x, "block"), amr.b.b, null))))
                           .then(
                              dv.a("keep")
                                 .executes($$0x -> a((du)$$0x.getSource(), fo.a($$0x, "pos"), fl.a($$0x, "block"), amr.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(dv.a("replace").executes($$0x -> a((du)$$0x.getSource(), fo.a($$0x, "pos"), fl.a($$0x, "block"), amr.b.a, null)))
                  )
            )
      );
   }

   private static int a(du $$0, ib $$1, fj $$2, amr.b $$3, @Nullable Predicate<dmi> $$4) throws CommandSyntaxException {
      apa $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dmi($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == amr.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            djl $$7 = $$5.c_($$1);
            bmc.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> vs.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fj filter(eby var1, ib var2, fj var3, apa var4);
   }

   public static enum b {
      a,
      b;
   }
}
