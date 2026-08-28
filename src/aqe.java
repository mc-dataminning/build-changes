import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aqe {
   private static final ys a = ys.a.a(new yb(yb.a.a, xv.c("chat.type.team.hover"))).a(new xt(xt.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xv.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ew> $$0) {
      LiteralCommandNode<ew> $$1 = $$0.register((LiteralArgumentBuilder)ex.a("teammsg").then(ex.a("message", fn.a()).executes($$0x -> {
         ew $$1x = (ew)$$0x.getSource();
         bvk $$2 = $$1x.g();
         fcy $$3 = $$2.cr();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<asi> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cr() == $$3).toList();
            if (!$$4.isEmpty()) {
               fn.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ex.a("tm").redirect($$1));
   }

   private static void a(ew $$0, bvk $$1, fcy $$2, List<asi> $$3, yl $$4) {
      xv $$5 = $$2.d().c(a);
      xr.a $$6 = xr.a(xr.i, $$0).c($$5);
      xr.a $$7 = xr.a(xr.j, $$0).c($$5);
      yk $$8 = yk.a($$4);
      boolean $$9 = false;

      for (asi $$10 : $$3) {
         xr.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(awi.e);
      }
   }
}
