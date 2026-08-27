import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class alh {
   private static final wc a = wc.a.a(new vl(vl.a.a, vf.c("chat.type.team.hover"))).a(new vd(vd.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register((LiteralArgumentBuilder)dt.a("teammsg").then(dt.a("message", ej.a()).executes($$0x -> {
         ds $$1x = (ds)$$0x.getSource();
         blv $$2 = $$1x.g();
         ems $$3 = $$2.cg();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<ane> $$4 = $$1x.l().ae().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cg() == $$3).toList();
            if (!$$4.isEmpty()) {
               ej.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dt.a("tm").redirect($$1));
   }

   private static void a(ds $$0, blv $$1, ems $$2, List<ane> $$3, vv $$4) {
      vf $$5 = $$2.d().c(a);
      vb.a $$6 = vb.a(vb.g, $$0).c($$5);
      vb.a $$7 = vb.a(vb.h, $$0).c($$5);
      vu $$8 = vu.a($$4);
      boolean $$9 = false;

      for (ane $$10 : $$3) {
         vb.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(aqv.f);
      }
   }
}
