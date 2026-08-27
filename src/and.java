import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class and {
   private static final wp a = wp.a.a(new vy(vy.a.a, vs.c("chat.type.team.hover"))).a(new vq(vq.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vs.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register((LiteralArgumentBuilder)dv.a("teammsg").then(dv.a("message", el.a()).executes($$0x -> {
         du $$1x = (du)$$0x.getSource();
         bof $$2 = $$1x.g();
         epu $$3 = $$2.cd();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<apb> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cd() == $$3).toList();
            if (!$$4.isEmpty()) {
               el.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dv.a("tm").redirect($$1));
   }

   private static void a(du $$0, bof $$1, epu $$2, List<apb> $$3, wi $$4) {
      vs $$5 = $$2.d().c(a);
      vo.a $$6 = vo.a(vo.g, $$0).c($$5);
      vo.a $$7 = vo.a(vo.h, $$0).c($$5);
      wh $$8 = wh.a($$4);
      boolean $$9 = false;

      for (apb $$10 : $$3) {
         vo.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(ass.f);
      }
   }
}
