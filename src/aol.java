import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aol {
   private static final xr a = xr.a.a(new xa(xa.a.a, wu.c("chat.type.team.hover"))).a(new ws(ws.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<eq> $$0) {
      LiteralCommandNode<eq> $$1 = $$0.register((LiteralArgumentBuilder)er.a("teammsg").then(er.a("message", fh.a()).executes($$0x -> {
         eq $$1x = (eq)$$0x.getSource();
         bsh $$2 = $$1x.g();
         exg $$3 = $$2.cl();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aqn> $$4 = $$1x.l().ai().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cl() == $$3).toList();
            if (!$$4.isEmpty()) {
               fh.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)er.a("tm").redirect($$1));
   }

   private static void a(eq $$0, bsh $$1, exg $$2, List<aqn> $$3, xk $$4) {
      wu $$5 = $$2.d().c(a);
      wq.a $$6 = wq.a(wq.i, $$0).c($$5);
      wq.a $$7 = wq.a(wq.j, $$0).c($$5);
      xj $$8 = xj.a($$4);
      boolean $$9 = false;

      for (aqn $$10 : $$3) {
         wq.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(auj.e);
      }
   }
}
