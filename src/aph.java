import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aph {
   private static final ym a = ym.a.a(new xv(xv.a.a, xp.c("chat.type.team.hover"))).a(new xn(xn.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ep> $$0) {
      LiteralCommandNode<ep> $$1 = $$0.register((LiteralArgumentBuilder)eq.a("teammsg").then(eq.a("message", fg.a()).executes($$0x -> {
         ep $$1x = (ep)$$0x.getSource();
         bsu $$2 = $$1x.g();
         ewq $$3 = $$2.cj();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<arg> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cj() == $$3).toList();
            if (!$$4.isEmpty()) {
               fg.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)eq.a("tm").redirect($$1));
   }

   private static void a(ep $$0, bsu $$1, ewq $$2, List<arg> $$3, yf $$4) {
      xp $$5 = $$2.d().c(a);
      xl.a $$6 = xl.a(xl.g, $$0).c($$5);
      xl.a $$7 = xl.a(xl.h, $$0).c($$5);
      ye $$8 = ye.a($$4);
      boolean $$9 = false;

      for (arg $$10 : $$3) {
         xl.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avd.e);
      }
   }
}
