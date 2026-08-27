import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aio {
   private static final ua a = ua.a.a(new tj(tj.a.a, te.c("chat.type.team.hover"))).a(new tc(tc.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register((LiteralArgumentBuilder)dt.a("teammsg").then(dt.a("message", eh.a()).executes($$0x -> {
         ds $$1x = (ds)$$0x.getSource();
         big $$2 = $$1x.g();
         eic $$3 = (eic)$$2.cf();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<akj> $$4 = $$1x.l().ac().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cf() == $$3).toList();
            if (!$$4.isEmpty()) {
               eh.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dt.a("tm").redirect($$1));
   }

   private static void a(ds $$0, big $$1, eic $$2, List<akj> $$3, tt $$4) {
      te $$5 = $$2.d().c(a);
      ta.a $$6 = ta.a(ta.g, $$0).c($$5);
      ta.a $$7 = ta.a(ta.h, $$0).c($$5);
      ts $$8 = ts.a($$4);
      boolean $$9 = false;

      for (akj $$10 : $$3) {
         ta.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(anx.f);
      }
   }
}
