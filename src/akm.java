import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class akm {
   private static final vs a = vs.a.a(new vb(vb.a.a, uv.c("chat.type.team.hover"))).a(new ut(ut.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(uv.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register((LiteralArgumentBuilder)dv.a("teammsg").then(dv.a("message", ek.a()).executes($$0x -> {
         du $$1x = (du)$$0x.getSource();
         bkv $$2 = $$1x.g();
         ekw $$3 = $$2.cg();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<amj> $$4 = $$1x.l().ae().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cg() == $$3).toList();
            if (!$$4.isEmpty()) {
               ek.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dv.a("tm").redirect($$1));
   }

   private static void a(du $$0, bkv $$1, ekw $$2, List<amj> $$3, vl $$4) {
      uv $$5 = $$2.d().c(a);
      ur.a $$6 = ur.a(ur.g, $$0).c($$5);
      ur.a $$7 = ur.a(ur.h, $$0).c($$5);
      vk $$8 = vk.a($$4);
      boolean $$9 = false;

      for (amj $$10 : $$3) {
         ur.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(apy.f);
      }
   }
}
