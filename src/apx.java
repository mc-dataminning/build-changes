import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apx {
   private static final yd a = yd.a.a(new xm.e(xg.c("chat.type.team.hover"))).a(new xe.g("/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralCommandNode<ek> $$1 = $$0.register((LiteralArgumentBuilder)el.a("teammsg").then(el.a("message", fb.a()).executes($$0x -> {
         ek $$1x = (ek)$$0x.getSource();
         bxe $$2 = $$1x.g();
         fhc $$3 = $$2.cq();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<asc> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cq() == $$3).toList();
            if (!$$4.isEmpty()) {
               fb.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)el.a("tm").redirect($$1));
   }

   private static void a(ek $$0, bxe $$1, fhc $$2, List<asc> $$3, xw $$4) {
      xg $$5 = $$2.e().c(a);
      xc.a $$6 = xc.a(xc.i, $$0).c($$5);
      xc.a $$7 = xc.a(xc.j, $$0).c($$5);
      xv $$8 = xv.a($$4);
      boolean $$9 = false;

      for (asc $$10 : $$3) {
         xc.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(awb.e);
      }
   }
}
