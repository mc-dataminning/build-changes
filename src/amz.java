import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class amz {
   private static final wn a = wn.a.a(new vw(vw.a.a, vq.c("chat.type.team.hover"))).a(new vo(vo.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register((LiteralArgumentBuilder)dv.a("teammsg").then(dv.a("message", el.a()).executes($$0x -> {
         du $$1x = (du)$$0x.getSource();
         bnq $$2 = $$1x.g();
         eoy $$3 = $$2.cg();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aox> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cg() == $$3).toList();
            if (!$$4.isEmpty()) {
               el.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dv.a("tm").redirect($$1));
   }

   private static void a(du $$0, bnq $$1, eoy $$2, List<aox> $$3, wg $$4) {
      vq $$5 = $$2.d().c(a);
      vm.a $$6 = vm.a(vm.g, $$0).c($$5);
      vm.a $$7 = vm.a(vm.h, $$0).c($$5);
      wf $$8 = wf.a($$4);
      boolean $$9 = false;

      for (aox $$10 : $$3) {
         vm.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(aso.f);
      }
   }
}
