import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class apl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      Predicate<ebu> $$2 = $$0x -> $$0x.c().v($$0x.d());
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               el.a("pos", gh.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("block", ge.a($$1))
                                    .executes($$0x -> a((ek)$$0x.getSource(), gh.a($$0x, "pos"), ge.a($$0x, "block"), apl.a.a, null, false)))
                                 .then(el.a("destroy").executes($$0x -> a((ek)$$0x.getSource(), gh.a($$0x, "pos"), ge.a($$0x, "block"), apl.a.b, null, false))))
                              .then(el.a("keep").executes($$1x -> a((ek)$$1x.getSource(), gh.a($$1x, "pos"), ge.a($$1x, "block"), apl.a.a, $$2, false))))
                           .then(el.a("replace").executes($$0x -> a((ek)$$0x.getSource(), gh.a($$0x, "pos"), ge.a($$0x, "block"), apl.a.a, null, false))))
                        .then(el.a("strict").executes($$0x -> a((ek)$$0x.getSource(), gh.a($$0x, "pos"), ge.a($$0x, "block"), apl.a.a, null, true)))
                  )
            )
      );
   }

   private static int a(ek $$0, iw $$1, gc $$2, apl.a $$3, @Nullable Predicate<ebu> $$4, boolean $$5) throws CommandSyntaxException {
      asb $$6 = $$0.e();
      if ($$6.ak()) {
         throw a.create();
      } else if ($$4 != null && !$$4.test(new ebu($$6, $$1, true))) {
         throw a.create();
      } else {
         boolean $$7;
         if ($$3 == apl.a.b) {
            $$6.b($$1, true);
            $$7 = !$$2.a().l() || !$$6.a_($$1).l();
         } else {
            $$7 = true;
         }

         if ($$7 && !$$2.a($$6, $$1, 2 | ($$5 ? 816 : 256))) {
            throw a.create();
         } else {
            if (!$$5) {
               $$6.a($$1, $$2.a().b());
            }

            $$0.a(() -> xg.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public static enum a {
      a,
      b;
   }
}
