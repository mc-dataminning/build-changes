import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aot {
   private static final xw a = xw.a.a(new xf(xf.a.a, wz.c("chat.type.team.hover"))).a(new wx(wx.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<et> $$0) {
      LiteralCommandNode<et> $$1 = $$0.register((LiteralArgumentBuilder)eu.a("teammsg").then(eu.a("message", fk.a()).executes($$0x -> {
         et $$1x = (et)$$0x.getSource();
         bsr $$2 = $$1x.g();
         exz $$3 = $$2.ck();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aqv> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.ck() == $$3).toList();
            if (!$$4.isEmpty()) {
               fk.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)eu.a("tm").redirect($$1));
   }

   private static void a(et $$0, bsr $$1, exz $$2, List<aqv> $$3, xp $$4) {
      wz $$5 = $$2.d().c(a);
      wv.a $$6 = wv.a(wv.i, $$0).c($$5);
      wv.a $$7 = wv.a(wv.j, $$0).c($$5);
      xo $$8 = xo.a($$4);
      boolean $$9 = false;

      for (aqv $$10 : $$3) {
         wv.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(aur.e);
      }
   }
}
