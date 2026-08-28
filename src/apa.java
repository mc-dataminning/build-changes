import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class apa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      Predicate<eax> $$2 = $$0x -> $$0x.c().v($$0x.d());
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ek.a("pos", gg.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("block", gd.a($$1))
                                    .executes($$0x -> a((ej)$$0x.getSource(), gg.a($$0x, "pos"), gd.a($$0x, "block"), apa.a.a, null, false)))
                                 .then(ek.a("destroy").executes($$0x -> a((ej)$$0x.getSource(), gg.a($$0x, "pos"), gd.a($$0x, "block"), apa.a.b, null, false))))
                              .then(ek.a("keep").executes($$1x -> a((ej)$$1x.getSource(), gg.a($$1x, "pos"), gd.a($$1x, "block"), apa.a.a, $$2, false))))
                           .then(ek.a("replace").executes($$0x -> a((ej)$$0x.getSource(), gg.a($$0x, "pos"), gd.a($$0x, "block"), apa.a.a, null, false))))
                        .then(ek.a("strict").executes($$0x -> a((ej)$$0x.getSource(), gg.a($$0x, "pos"), gd.a($$0x, "block"), apa.a.a, null, true)))
                  )
            )
      );
   }

   private static int a(ej $$0, iv $$1, gb $$2, apa.a $$3, @Nullable Predicate<eax> $$4, boolean $$5) throws CommandSyntaxException {
      arq $$6 = $$0.e();
      if ($$6.ak()) {
         throw a.create();
      } else if ($$4 != null && !$$4.test(new eax($$6, $$1, true))) {
         throw a.create();
      } else {
         boolean $$7;
         if ($$3 == apa.a.b) {
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
