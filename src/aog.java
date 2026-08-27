import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aog {
   private static final xp a = xp.a.a(new wy(wy.a.a, ws.c("chat.type.team.hover"))).a(new wq(wq.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ec> $$0) {
      LiteralCommandNode<ec> $$1 = $$0.register((LiteralArgumentBuilder)ed.a("teammsg").then(ed.a("message", et.a()).executes($$0x -> {
         ec $$1x = (ec)$$0x.getSource();
         bql $$2 = $$1x.g();
         eue $$3 = $$2.ch();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aqf> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.ch() == $$3).toList();
            if (!$$4.isEmpty()) {
               et.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ed.a("tm").redirect($$1));
   }

   private static void a(ec $$0, bql $$1, eue $$2, List<aqf> $$3, xi $$4) {
      ws $$5 = $$2.d().c(a);
      wo.a $$6 = wo.a(wo.g, $$0).c($$5);
      wo.a $$7 = wo.a(wo.h, $$0).c($$5);
      xh $$8 = xh.a($$4);
      boolean $$9 = false;

      for (aqf $$10 : $$3) {
         wo.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(aub.f);
      }
   }
}
