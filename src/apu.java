import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apu {
   private static final yh a = yh.a.a(new xq(xq.a.a, xk.c("chat.type.team.hover"))).a(new xi(xi.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xk.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ew> $$0) {
      LiteralCommandNode<ew> $$1 = $$0.register((LiteralArgumentBuilder)ex.a("teammsg").then(ex.a("message", fn.a()).executes($$0x -> {
         ew $$1x = (ew)$$0x.getSource();
         bvb $$2 = $$1x.g();
         fcr $$3 = $$2.cr();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<ary> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cr() == $$3).toList();
            if (!$$4.isEmpty()) {
               fn.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ex.a("tm").redirect($$1));
   }

   private static void a(ew $$0, bvb $$1, fcr $$2, List<ary> $$3, ya $$4) {
      xk $$5 = $$2.d().c(a);
      xg.a $$6 = xg.a(xg.i, $$0).c($$5);
      xg.a $$7 = xg.a(xg.j, $$0).c($$5);
      xz $$8 = xz.a($$4);
      boolean $$9 = false;

      for (ary $$10 : $$3) {
         xg.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avy.e);
      }
   }
}
