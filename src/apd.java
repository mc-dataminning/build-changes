import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apd {
   private static final yi a = yi.a.a(new xr(xr.a.a, xl.c("chat.type.team.hover"))).a(new xj(xj.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ep> $$0) {
      LiteralCommandNode<ep> $$1 = $$0.register((LiteralArgumentBuilder)eq.a("teammsg").then(eq.a("message", fg.a()).executes($$0x -> {
         ep $$1x = (ep)$$0x.getSource();
         bsp $$2 = $$1x.g();
         ewl $$3 = $$2.cj();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<arc> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cj() == $$3).toList();
            if (!$$4.isEmpty()) {
               fg.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)eq.a("tm").redirect($$1));
   }

   private static void a(ep $$0, bsp $$1, ewl $$2, List<arc> $$3, yb $$4) {
      xl $$5 = $$2.d().c(a);
      xh.a $$6 = xh.a(xh.g, $$0).c($$5);
      xh.a $$7 = xh.a(xh.h, $$0).c($$5);
      ya $$8 = ya.a($$4);
      boolean $$9 = false;

      for (arc $$10 : $$3) {
         xh.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(auz.e);
      }
   }
}
