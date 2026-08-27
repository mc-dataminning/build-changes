import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class ani {
   private static final wr a = wr.a.a(new wa(wa.a.a, vu.c("chat.type.team.hover"))).a(new vs(vs.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vu.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register((LiteralArgumentBuilder)dv.a("teammsg").then(dv.a("message", el.a()).executes($$0x -> {
         du $$1x = (du)$$0x.getSource();
         bow $$2 = $$1x.g();
         eqq $$3 = $$2.cg();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<apg> $$4 = $$1x.l().ah().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cg() == $$3).toList();
            if (!$$4.isEmpty()) {
               el.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dv.a("tm").redirect($$1));
   }

   private static void a(du $$0, bow $$1, eqq $$2, List<apg> $$3, wk $$4) {
      vu $$5 = $$2.d().c(a);
      vq.a $$6 = vq.a(vq.g, $$0).c($$5);
      vq.a $$7 = vq.a(vq.h, $$0).c($$5);
      wj $$8 = wj.a($$4);
      boolean $$9 = false;

      for (apg $$10 : $$3) {
         vq.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(atb.f);
      }
   }
}
