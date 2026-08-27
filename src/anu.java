import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class anu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("setblock").requires($$0x -> $$0x.c(2)))
            .then(
               ed.a("pos", fx.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("block", fu.a($$1))
                                 .executes($$0x -> a((ec)$$0x.getSource(), fx.a($$0x, "pos"), fu.a($$0x, "block"), anu.b.a, null)))
                              .then(ed.a("destroy").executes($$0x -> a((ec)$$0x.getSource(), fx.a($$0x, "pos"), fu.a($$0x, "block"), anu.b.b, null))))
                           .then(
                              ed.a("keep")
                                 .executes($$0x -> a((ec)$$0x.getSource(), fx.a($$0x, "pos"), fu.a($$0x, "block"), anu.b.a, $$0xx -> $$0xx.c().u($$0xx.d())))
                           ))
                        .then(ed.a("replace").executes($$0x -> a((ec)$$0x.getSource(), fx.a($$0x, "pos"), fu.a($$0x, "block"), anu.b.a, null)))
                  )
            )
      );
   }

   private static int a(ec $$0, im $$1, fs $$2, anu.b $$3, @Nullable Predicate<dqc> $$4) throws CommandSyntaxException {
      aqe $$5 = $$0.e();
      if ($$4 != null && !$$4.test(new dqc($$5, $$1, true))) {
         throw a.create();
      } else {
         boolean $$6;
         if ($$3 == anu.b.b) {
            $$5.b($$1, true);
            $$6 = !$$2.a().i() || !$$5.a_($$1).i();
         } else {
            dnd $$7 = $$5.c_($$1);
            boh.a_($$7);
            $$6 = true;
         }

         if ($$6 && !$$2.a($$5, $$1, 2)) {
            throw a.create();
         } else {
            $$5.b($$1, $$2.a().b());
            $$0.a(() -> ws.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public interface a {
      @Nullable
      fs filter(efy var1, im var2, fs var3, aqe var4);
   }

   public static enum b {
      a,
      b;
   }
}
