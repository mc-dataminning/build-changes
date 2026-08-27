import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aiw {
   private static final uh a = uh.a.a(new tq(tq.a.a, tl.c("chat.type.team.hover"))).a(new tj(tj.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tl.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<dt> $$0) {
      LiteralCommandNode<dt> $$1 = $$0.register((LiteralArgumentBuilder)du.a("teammsg").then(du.a("message", ei.a()).executes($$0x -> {
         dt $$1x = (dt)$$0x.getSource();
         biq $$2 = $$1x.g();
         eik $$3 = (eik)$$2.cg();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aks> $$4 = $$1x.l().ac().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cg() == $$3).toList();
            if (!$$4.isEmpty()) {
               ei.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)du.a("tm").redirect($$1));
   }

   private static void a(dt $$0, biq $$1, eik $$2, List<aks> $$3, ua $$4) {
      tl $$5 = $$2.d().c(a);
      th.a $$6 = th.a(th.g, $$0).c($$5);
      th.a $$7 = th.a(th.h, $$0).c($$5);
      tz $$8 = tz.a($$4);
      boolean $$9 = false;

      for (aks $$10 : $$3) {
         th.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(aoh.f);
      }
   }
}
