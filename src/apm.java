import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apm {
   private static final xv a = xv.a.a(new xe.e(wy.c("chat.type.team.hover"))).a(new ww.g("/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ej> $$0) {
      LiteralCommandNode<ej> $$1 = $$0.register((LiteralArgumentBuilder)ek.a("teammsg").then(ek.a("message", fa.a()).executes($$0x -> {
         ej $$1x = (ej)$$0x.getSource();
         bwi $$2 = $$1x.g();
         ffx $$3 = $$2.cp();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<arr> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cp() == $$3).toList();
            if (!$$4.isEmpty()) {
               fa.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ek.a("tm").redirect($$1));
   }

   private static void a(ej $$0, bwi $$1, ffx $$2, List<arr> $$3, xo $$4) {
      wy $$5 = $$2.e().c(a);
      wu.a $$6 = wu.a(wu.i, $$0).c($$5);
      wu.a $$7 = wu.a(wu.j, $$0).c($$5);
      xn $$8 = xn.a($$4);
      boolean $$9 = false;

      for (arr $$10 : $$3) {
         wu.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avq.e);
      }
   }
}
