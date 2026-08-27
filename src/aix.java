import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aix {
   private static final uj a = uj.a.a(new ts(ts.a.a, tn.c("chat.type.team.hover"))).a(new tl(tl.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tn.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<dt> $$0) {
      LiteralCommandNode<dt> $$1 = $$0.register((LiteralArgumentBuilder)du.a("teammsg").then(du.a("message", ei.a()).executes($$0x -> {
         dt $$1x = (dt)$$0x.getSource();
         bis $$2 = $$1x.g();
         eim $$3 = (eim)$$2.cf();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<akt> $$4 = $$1x.l().ac().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cf() == $$3).toList();
            if (!$$4.isEmpty()) {
               ei.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)du.a("tm").redirect($$1));
   }

   private static void a(dt $$0, bis $$1, eim $$2, List<akt> $$3, uc $$4) {
      tn $$5 = $$2.d().c(a);
      tj.a $$6 = tj.a(tj.g, $$0).c($$5);
      tj.a $$7 = tj.a(tj.h, $$0).c($$5);
      ub $$8 = ub.a($$4);
      boolean $$9 = false;

      for (akt $$10 : $$3) {
         tj.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(aoi.f);
      }
   }
}
