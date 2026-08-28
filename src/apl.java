import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apl {
   private static final yf a = yf.a.a(new xo(xo.a.a, xi.c("chat.type.team.hover"))).a(new xg(xg.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xi.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ew> $$0) {
      LiteralCommandNode<ew> $$1 = $$0.register((LiteralArgumentBuilder)ex.a("teammsg").then(ex.a("message", fn.a()).executes($$0x -> {
         ew $$1x = (ew)$$0x.getSource();
         bue $$2 = $$1x.g();
         fan $$3 = $$2.cs();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aro> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cs() == $$3).toList();
            if (!$$4.isEmpty()) {
               fn.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ex.a("tm").redirect($$1));
   }

   private static void a(ew $$0, bue $$1, fan $$2, List<aro> $$3, xy $$4) {
      xi $$5 = $$2.d().c(a);
      xe.a $$6 = xe.a(xe.i, $$0).c($$5);
      xe.a $$7 = xe.a(xe.j, $$0).c($$5);
      xx $$8 = xx.a($$4);
      boolean $$9 = false;

      for (aro $$10 : $$3) {
         xe.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avo.e);
      }
   }
}
