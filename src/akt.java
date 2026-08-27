import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class akt {
   private static final vy a = vy.a.a(new vh(vh.a.a, vb.c("chat.type.team.hover"))).a(new uz(uz.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register((LiteralArgumentBuilder)dt.a("teammsg").then(dt.a("message", ei.a()).executes($$0x -> {
         ds $$1x = (ds)$$0x.getSource();
         blf $$2 = $$1x.g();
         ely $$3 = $$2.cg();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<amq> $$4 = $$1x.l().ae().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cg() == $$3).toList();
            if (!$$4.isEmpty()) {
               ei.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dt.a("tm").redirect($$1));
   }

   private static void a(ds $$0, blf $$1, ely $$2, List<amq> $$3, vr $$4) {
      vb $$5 = $$2.d().c(a);
      ux.a $$6 = ux.a(ux.g, $$0).c($$5);
      ux.a $$7 = ux.a(ux.h, $$0).c($$5);
      vq $$8 = vq.a($$4);
      boolean $$9 = false;

      for (amq $$10 : $$3) {
         ux.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(aqf.f);
      }
   }
}
