import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class ait {
   private static final ue a = ue.a.a(new tn(tn.a.a, ti.c("chat.type.team.hover"))).a(new tg(tg.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ti.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<dt> $$0) {
      LiteralCommandNode<dt> $$1 = $$0.register((LiteralArgumentBuilder)du.a("teammsg").then(du.a("message", ei.a()).executes($$0x -> {
         dt $$1x = (dt)$$0x.getSource();
         bil $$2 = $$1x.g();
         eif $$3 = (eif)$$2.cf();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<ako> $$4 = $$1x.l().ac().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cf() == $$3).toList();
            if (!$$4.isEmpty()) {
               ei.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)du.a("tm").redirect($$1));
   }

   private static void a(dt $$0, bil $$1, eif $$2, List<ako> $$3, tx $$4) {
      ti $$5 = $$2.d().c(a);
      te.a $$6 = te.a(te.g, $$0).c($$5);
      te.a $$7 = te.a(te.h, $$0).c($$5);
      tw $$8 = tw.a($$4);
      boolean $$9 = false;

      for (ako $$10 : $$3) {
         te.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(aoc.f);
      }
   }
}
