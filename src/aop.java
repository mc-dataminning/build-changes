import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aop {
   private static final xu a = xu.a.a(new xd(xd.a.a, wx.c("chat.type.team.hover"))).a(new wv(wv.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ee> $$0) {
      LiteralCommandNode<ee> $$1 = $$0.register((LiteralArgumentBuilder)ef.a("teammsg").then(ef.a("message", ev.a()).executes($$0x -> {
         ee $$1x = (ee)$$0x.getSource();
         brw $$2 = $$1x.g();
         evl $$3 = $$2.cj();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aqo> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cj() == $$3).toList();
            if (!$$4.isEmpty()) {
               ev.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ef.a("tm").redirect($$1));
   }

   private static void a(ee $$0, brw $$1, evl $$2, List<aqo> $$3, xn $$4) {
      wx $$5 = $$2.d().c(a);
      wt.a $$6 = wt.a(wt.g, $$0).c($$5);
      wt.a $$7 = wt.a(wt.h, $$0).c($$5);
      xm $$8 = xm.a($$4);
      boolean $$9 = false;

      for (aqo $$10 : $$3) {
         wt.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(auk.e);
      }
   }
}
