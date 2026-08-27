import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ajw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("pos", fm.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("block", fj.a($$1))
                                 .executes($$0x -> a((du)$$0x.getSource(), fm.a($$0x, "pos"), fj.a($$0x, "block"), ajw.b.a, null)))
                              .then(dv.a("destroy").executes($$0x -> a((du)$$0x.getSource(), fm.a($$0x, "pos"), fj.a($$0x, "block"), ajw.b.b, null))))
                           .then(
                              dv.a("keep")
                                 .executes($$0x -> a((du)$$0x.getSource(), fm.a($$0x, "pos"), fj.a($$0x, "block"), ajw.b.a, $$0xx -> $$0xx.c().t($$0xx.d())))
                           ))
                        .then(dv.a("replace").executes($$0x -> a((du)$$0x.getSource(), fm.a($$0x, "pos"), fj.a($$0x, "block"), ajw.b.a, null)))
                  )
            )
      );
   }

   private static int a(du $$0, ht $$1, fh $$2, ajw.b $$3, @Nullable Predicate<dhm> $$4) throws CommandSyntaxException {
      ame $$5 = $$0.f();
      if ($$4 != null && !$$4.test(new dhm($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == ajw.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dfd $$7 = $$5.c_($$1);
            bio.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> ur.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fh filter(dwz var1, ht var2, fh var3, ame var4);
   }

   public static enum b {
      a,
      b;
   }
}
