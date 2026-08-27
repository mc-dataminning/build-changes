import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class anu {
   private static final xd a = xd.a.a(new wm(wm.a.a, wg.c("chat.type.team.hover"))).a(new we(we.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wg.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register((LiteralArgumentBuilder)dv.a("teammsg").then(dv.a("message", el.a()).executes($$0x -> {
         du $$1x = (du)$$0x.getSource();
         bpv $$2 = $$1x.g();
         esz $$3 = $$2.cg();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<apt> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cg() == $$3).toList();
            if (!$$4.isEmpty()) {
               el.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dv.a("tm").redirect($$1));
   }

   private static void a(du $$0, bpv $$1, esz $$2, List<apt> $$3, ww $$4) {
      wg $$5 = $$2.d().c(a);
      wc.a $$6 = wc.a(wc.g, $$0).c($$5);
      wc.a $$7 = wc.a(wc.h, $$0).c($$5);
      wv $$8 = wv.a($$4);
      boolean $$9 = false;

      for (apt $$10 : $$3) {
         wc.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(atp.f);
      }
   }
}
