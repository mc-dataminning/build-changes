import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apo {
   private static final xx a = xx.a.a(new xg.e(xa.c("chat.type.team.hover"))).a(new wy.g("/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ej> $$0) {
      LiteralCommandNode<ej> $$1 = $$0.register((LiteralArgumentBuilder)ek.a("teammsg").then(ek.a("message", fa.a()).executes($$0x -> {
         ej $$1x = (ej)$$0x.getSource();
         bwt $$2 = $$1x.g();
         fgq $$3 = $$2.cq();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<art> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cq() == $$3).toList();
            if (!$$4.isEmpty()) {
               fa.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ek.a("tm").redirect($$1));
   }

   private static void a(ej $$0, bwt $$1, fgq $$2, List<art> $$3, xq $$4) {
      xa $$5 = $$2.e().c(a);
      ww.a $$6 = ww.a(ww.i, $$0).c($$5);
      ww.a $$7 = ww.a(ww.j, $$0).c($$5);
      xp $$8 = xp.a($$4);
      boolean $$9 = false;

      for (art $$10 : $$3) {
         ww.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avs.e);
      }
   }
}
