import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apq {
   private static final xz a = xz.a.a(new xi.e(xc.c("chat.type.team.hover"))).a(new xa.g("/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xc.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralCommandNode<ek> $$1 = $$0.register((LiteralArgumentBuilder)el.a("teammsg").then(el.a("message", fb.a()).executes($$0x -> {
         ek $$1x = (ek)$$0x.getSource();
         bwv $$2 = $$1x.g();
         fgs $$3 = $$2.cq();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<arv> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cq() == $$3).toList();
            if (!$$4.isEmpty()) {
               fb.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)el.a("tm").redirect($$1));
   }

   private static void a(ek $$0, bwv $$1, fgs $$2, List<arv> $$3, xs $$4) {
      xc $$5 = $$2.e().c(a);
      wy.a $$6 = wy.a(wy.i, $$0).c($$5);
      wy.a $$7 = wy.a(wy.j, $$0).c($$5);
      xr $$8 = xr.a($$4);
      boolean $$9 = false;

      for (arv $$10 : $$3) {
         wy.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avu.e);
      }
   }
}
