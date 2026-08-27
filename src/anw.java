import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class anw {
   private static final xf a = xf.a.a(new wo(wo.a.a, wi.c("chat.type.team.hover"))).a(new wg(wg.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<dv> $$0) {
      LiteralCommandNode<dv> $$1 = $$0.register((LiteralArgumentBuilder)dw.a("teammsg").then(dw.a("message", em.a()).executes($$0x -> {
         dv $$1x = (dv)$$0x.getSource();
         bqa $$2 = $$1x.g();
         eti $$3 = $$2.cg();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<apv> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cg() == $$3).toList();
            if (!$$4.isEmpty()) {
               em.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dw.a("tm").redirect($$1));
   }

   private static void a(dv $$0, bqa $$1, eti $$2, List<apv> $$3, wy $$4) {
      wi $$5 = $$2.d().c(a);
      we.a $$6 = we.a(we.g, $$0).c($$5);
      we.a $$7 = we.a(we.h, $$0).c($$5);
      wx $$8 = wx.a($$4);
      boolean $$9 = false;

      for (apv $$10 : $$3) {
         we.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(atr.f);
      }
   }
}
