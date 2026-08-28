import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apg {
   private static final yl a = yl.a.a(new xu(xu.a.a, xo.c("chat.type.team.hover"))).a(new xm(xm.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ep> $$0) {
      LiteralCommandNode<ep> $$1 = $$0.register((LiteralArgumentBuilder)eq.a("teammsg").then(eq.a("message", fg.a()).executes($$0x -> {
         ep $$1x = (ep)$$0x.getSource();
         bss $$2 = $$1x.g();
         ewo $$3 = $$2.cj();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<arf> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cj() == $$3).toList();
            if (!$$4.isEmpty()) {
               fg.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)eq.a("tm").redirect($$1));
   }

   private static void a(ep $$0, bss $$1, ewo $$2, List<arf> $$3, ye $$4) {
      xo $$5 = $$2.d().c(a);
      xk.a $$6 = xk.a(xk.g, $$0).c($$5);
      xk.a $$7 = xk.a(xk.h, $$0).c($$5);
      yd $$8 = yd.a($$4);
      boolean $$9 = false;

      for (arf $$10 : $$3) {
         xk.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avc.e);
      }
   }
}
