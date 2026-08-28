import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aos {
   private static final xv a = xv.a.a(new xe(xe.a.a, wy.c("chat.type.team.hover"))).a(new ww(ww.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<et> $$0) {
      LiteralCommandNode<et> $$1 = $$0.register((LiteralArgumentBuilder)eu.a("teammsg").then(eu.a("message", fk.a()).executes($$0x -> {
         et $$1x = (et)$$0x.getSource();
         bsq $$2 = $$1x.g();
         exv $$3 = $$2.ck();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aqu> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.ck() == $$3).toList();
            if (!$$4.isEmpty()) {
               fk.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)eu.a("tm").redirect($$1));
   }

   private static void a(et $$0, bsq $$1, exv $$2, List<aqu> $$3, xo $$4) {
      wy $$5 = $$2.d().c(a);
      wu.a $$6 = wu.a(wu.i, $$0).c($$5);
      wu.a $$7 = wu.a(wu.j, $$0).c($$5);
      xn $$8 = xn.a($$4);
      boolean $$9 = false;

      for (aqu $$10 : $$3) {
         wu.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(auq.e);
      }
   }
}
