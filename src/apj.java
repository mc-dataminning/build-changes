import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apj {
   private static final xs a = xs.a.a(new xb.e(wv.c("chat.type.team.hover"))).a(new wt.g("/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ex> $$0) {
      LiteralCommandNode<ex> $$1 = $$0.register((LiteralArgumentBuilder)ey.a("teammsg").then(ey.a("message", fo.a()).executes($$0x -> {
         ex $$1x = (ex)$$0x.getSource();
         bvs $$2 = $$1x.g();
         fdu $$3 = $$2.cr();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aro> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cr() == $$3).toList();
            if (!$$4.isEmpty()) {
               fo.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ey.a("tm").redirect($$1));
   }

   private static void a(ex $$0, bvs $$1, fdu $$2, List<aro> $$3, xl $$4) {
      wv $$5 = $$2.d().c(a);
      wr.a $$6 = wr.a(wr.i, $$0).c($$5);
      wr.a $$7 = wr.a(wr.j, $$0).c($$5);
      xk $$8 = xk.a($$4);
      boolean $$9 = false;

      for (aro $$10 : $$3) {
         wr.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avn.e);
      }
   }
}
