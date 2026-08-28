import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aph {
   private static final yb a = yb.a.a(new xk(xk.a.a, xe.c("chat.type.team.hover"))).a(new xc(xc.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<eu> $$0) {
      LiteralCommandNode<eu> $$1 = $$0.register((LiteralArgumentBuilder)ev.a("teammsg").then(ev.a("message", fl.a()).executes($$0x -> {
         eu $$1x = (eu)$$0x.getSource();
         btr $$2 = $$1x.g();
         ezw $$3 = $$2.co();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<ark> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.co() == $$3).toList();
            if (!$$4.isEmpty()) {
               fl.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ev.a("tm").redirect($$1));
   }

   private static void a(eu $$0, btr $$1, ezw $$2, List<ark> $$3, xu $$4) {
      xe $$5 = $$2.d().c(a);
      xa.a $$6 = xa.a(xa.i, $$0).c($$5);
      xa.a $$7 = xa.a(xa.j, $$0).c($$5);
      xt $$8 = xt.a($$4);
      boolean $$9 = false;

      for (ark $$10 : $$3) {
         xa.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avj.e);
      }
   }
}
