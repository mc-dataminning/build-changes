import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class ape {
   private static final ya a = ya.a.a(new xj(xj.a.a, xd.c("chat.type.team.hover"))).a(new xb(xb.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<et> $$0) {
      LiteralCommandNode<et> $$1 = $$0.register((LiteralArgumentBuilder)eu.a("teammsg").then(eu.a("message", fk.a()).executes($$0x -> {
         et $$1x = (et)$$0x.getSource();
         btj $$2 = $$1x.g();
         ezd $$3 = $$2.co();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<arh> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.co() == $$3).toList();
            if (!$$4.isEmpty()) {
               fk.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)eu.a("tm").redirect($$1));
   }

   private static void a(et $$0, btj $$1, ezd $$2, List<arh> $$3, xt $$4) {
      xd $$5 = $$2.d().c(a);
      wz.a $$6 = wz.a(wz.i, $$0).c($$5);
      wz.a $$7 = wz.a(wz.j, $$0).c($$5);
      xs $$8 = xs.a($$4);
      boolean $$9 = false;

      for (arh $$10 : $$3) {
         wz.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avg.e);
      }
   }
}
