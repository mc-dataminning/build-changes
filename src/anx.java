import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class anx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ee.a("pos", fz.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("block", fw.a($$1))
                                 .executes($$0x -> a((ed)$$0x.getSource(), fz.a($$0x, "pos"), fw.a($$0x, "block"), anx.b.a, null)))
                              .then(ee.a("destroy").executes($$0x -> a((ed)$$0x.getSource(), fz.a($$0x, "pos"), fw.a($$0x, "block"), anx.b.b, null))))
                           .then(
                              ee.a("keep")
                                 .executes($$0x -> a((ed)$$0x.getSource(), fz.a($$0x, "pos"), fw.a($$0x, "block"), anx.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(ee.a("replace").executes($$0x -> a((ed)$$0x.getSource(), fz.a($$0x, "pos"), fw.a($$0x, "block"), anx.b.a, null)))
                  )
            )
      );
   }

   private static int a(ed $$0, in $$1, fu $$2, anx.b $$3, @Nullable Predicate<dql> $$4) throws CommandSyntaxException {
      aqh $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dql($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == anx.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dnm $$7 = $$5.c_($$1);
            bpd.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> wu.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fu filter(egh var1, in var2, fu var3, aqh var4);
   }

   public static enum b {
      a,
      b;
   }
}
