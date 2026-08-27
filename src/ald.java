import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class ald {
   private static final wa a = wa.a.a(new vj(vj.a.a, vd.c("chat.type.team.hover"))).a(new vb(vb.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vd.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register((LiteralArgumentBuilder)dt.a("teammsg").then(dt.a("message", ej.a()).executes($$0x -> {
         ds $$1x = (ds)$$0x.getSource();
         blp $$2 = $$1x.g();
         eml $$3 = $$2.cg();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<ana> $$4 = $$1x.l().ae().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cg() == $$3).toList();
            if (!$$4.isEmpty()) {
               ej.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dt.a("tm").redirect($$1));
   }

   private static void a(ds $$0, blp $$1, eml $$2, List<ana> $$3, vt $$4) {
      vd $$5 = $$2.d().c(a);
      uz.a $$6 = uz.a(uz.g, $$0).c($$5);
      uz.a $$7 = uz.a(uz.h, $$0).c($$5);
      vs $$8 = vs.a($$4);
      boolean $$9 = false;

      for (ana $$10 : $$3) {
         uz.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(aqp.f);
      }
   }
}
