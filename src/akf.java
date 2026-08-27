import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class akf {
   private static final vo a = vo.a.a(new ux(ux.a.a, ur.c("chat.type.team.hover"))).a(new up(up.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register((LiteralArgumentBuilder)dv.a("teammsg").then(dv.a("message", ek.a()).executes($$0x -> {
         du $$1x = (du)$$0x.getSource();
         bki $$2 = $$1x.h();
         ekf $$3 = $$2.cf();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<amb> $$4 = $$1x.m().ac().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cf() == $$3).toList();
            if (!$$4.isEmpty()) {
               ek.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dv.a("tm").redirect($$1));
   }

   private static void a(du $$0, bki $$1, ekf $$2, List<amb> $$3, vh $$4) {
      ur $$5 = $$2.d().c(a);
      un.a $$6 = un.a(un.g, $$0).c($$5);
      un.a $$7 = un.a(un.h, $$0).c($$5);
      vg $$8 = vg.a($$4);
      boolean $$9 = false;

      for (amb $$10 : $$3) {
         un.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(apq.f);
      }
   }
}
