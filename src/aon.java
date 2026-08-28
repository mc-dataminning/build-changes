import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aon {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      Predicate<dxu> $$2 = $$0x -> $$0x.c().u($$0x.d());
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("pos", gt.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("block", gq.a($$1))
                                    .executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aon.a.a, null, false)))
                                 .then(ey.a("destroy").executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aon.a.b, null, false))))
                              .then(ey.a("keep").executes($$1x -> a((ex)$$1x.getSource(), gt.a($$1x, "pos"), gq.a($$1x, "block"), aon.a.a, $$2, false))))
                           .then(ey.a("replace").executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aon.a.a, null, false))))
                        .then(ey.a("strict").executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gq.a($$0x, "block"), aon.a.a, null, true)))
                  )
            )
      );
   }

   private static int a(ex $$0, ji $$1, go $$2, aon.a $$3, @Nullable Predicate<dxu> $$4, boolean $$5) throws CommandSyntaxException {
      ard $$6 = $$0.e();
      if ($$6.ak()) {
         throw a.create();
      } else if ($$4 != null && !$$4.test(new dxu($$6, $$1, true))) {
         throw a.create();
      } else {
         boolean $$7;
         if ($$3 == aon.a.b) {
            $$6.b($$1, true);
            $$7 = !$$2.a().l() || !$$6.a_($$1).l();
         } else {
            $$7 = true;
         }

         if ($$7 && !$$2.a($$6, $$1, 2 | ($$5 ? 304 : 256))) {
            throw a.create();
         } else {
            if (!$$5) {
               $$6.a($$1, $$2.a().b());
            }

            $$0.a(() -> wp.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public static enum a {
      a,
      b;
   }
}
