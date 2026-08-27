import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aov {
   private static final yb a = yb.a.a(new xk(xk.a.a, xe.c("chat.type.team.hover"))).a(new xc(xc.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<eh> $$0) {
      LiteralCommandNode<eh> $$1 = $$0.register((LiteralArgumentBuilder)ei.a("teammsg").then(ei.a("message", ey.a()).executes($$0x -> {
         eh $$1x = (eh)$$0x.getSource();
         brv $$2 = $$1x.g();
         ext $$3 = $$2.co();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aqu> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.co() == $$3).toList();
            if (!$$4.isEmpty()) {
               ey.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ei.a("tm").redirect($$1));
   }

   private static void a(eh $$0, brv $$1, ext $$2, List<aqu> $$3, xu $$4) {
      xe $$5 = $$2.d().c(a);
      xa.a $$6 = xa.a(xa.g, $$0).c($$5);
      xa.a $$7 = xa.a(xa.h, $$0).c($$5);
      xt $$8 = xt.a($$4);
      boolean $$9 = false;

      for (aqu $$10 : $$3) {
         xa.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(auq.f);
      }
   }
}
