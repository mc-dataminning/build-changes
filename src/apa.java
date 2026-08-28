import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class apa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      Predicate<ead> $$2 = $$0x -> $$0x.c().v($$0x.d());
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ej.a("pos", gf.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("block", gc.a($$1))
                                    .executes($$0x -> a((ei)$$0x.getSource(), gf.a($$0x, "pos"), gc.a($$0x, "block"), apa.a.a, null, false)))
                                 .then(ej.a("destroy").executes($$0x -> a((ei)$$0x.getSource(), gf.a($$0x, "pos"), gc.a($$0x, "block"), apa.a.b, null, false))))
                              .then(ej.a("keep").executes($$1x -> a((ei)$$1x.getSource(), gf.a($$1x, "pos"), gc.a($$1x, "block"), apa.a.a, $$2, false))))
                           .then(ej.a("replace").executes($$0x -> a((ei)$$0x.getSource(), gf.a($$0x, "pos"), gc.a($$0x, "block"), apa.a.a, null, false))))
                        .then(ej.a("strict").executes($$0x -> a((ei)$$0x.getSource(), gf.a($$0x, "pos"), gc.a($$0x, "block"), apa.a.a, null, true)))
                  )
            )
      );
   }

   private static int a(ei $$0, iu $$1, ga $$2, apa.a $$3, @Nullable Predicate<ead> $$4, boolean $$5) throws CommandSyntaxException {
      arq $$6 = $$0.e();
      if ($$6.ak()) {
         throw a.create();
      } else if ($$4 != null && !$$4.test(new ead($$6, $$1, true))) {
         throw a.create();
      } else {
         boolean $$7;
         if ($$3 == apa.a.b) {
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

            $$0.a(() -> wy.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public static enum a {
      a,
      b;
   }
}
