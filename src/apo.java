import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apo {
   private static final yi a = yi.a.a(new xr(xr.a.a, xl.c("chat.type.team.hover"))).a(new xj(xj.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ew> $$0) {
      LiteralCommandNode<ew> $$1 = $$0.register((LiteralArgumentBuilder)ex.a("teammsg").then(ex.a("message", fn.a()).executes($$0x -> {
         ew $$1x = (ew)$$0x.getSource();
         bui $$2 = $$1x.g();
         far $$3 = $$2.ct();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<arr> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.ct() == $$3).toList();
            if (!$$4.isEmpty()) {
               fn.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ex.a("tm").redirect($$1));
   }

   private static void a(ew $$0, bui $$1, far $$2, List<arr> $$3, yb $$4) {
      xl $$5 = $$2.d().c(a);
      xh.a $$6 = xh.a(xh.i, $$0).c($$5);
      xh.a $$7 = xh.a(xh.j, $$0).c($$5);
      ya $$8 = ya.a($$4);
      boolean $$9 = false;

      for (arr $$10 : $$3) {
         xh.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avr.e);
      }
   }
}
