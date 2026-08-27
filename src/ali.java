import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class ali {
   private static final wd a = wd.a.a(new vm(vm.a.a, vg.c("chat.type.team.hover"))).a(new ve(ve.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vg.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register((LiteralArgumentBuilder)dt.a("teammsg").then(dt.a("message", ej.a()).executes($$0x -> {
         ds $$1x = (ds)$$0x.getSource();
         blw $$2 = $$1x.g();
         enb $$3 = $$2.cg();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<anf> $$4 = $$1x.l().ae().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cg() == $$3).toList();
            if (!$$4.isEmpty()) {
               ej.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dt.a("tm").redirect($$1));
   }

   private static void a(ds $$0, blw $$1, enb $$2, List<anf> $$3, vw $$4) {
      vg $$5 = $$2.d().c(a);
      vc.a $$6 = vc.a(vc.g, $$0).c($$5);
      vc.a $$7 = vc.a(vc.h, $$0).c($$5);
      vv $$8 = vv.a($$4);
      boolean $$9 = false;

      for (anf $$10 : $$3) {
         vc.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(aqw.f);
      }
   }
}
