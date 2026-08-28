import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apa {
   private static final xm a = xm.a.a(new wv(wv.a.a, wp.c("chat.type.team.hover"))).a(new wn(wn.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ex> $$0) {
      LiteralCommandNode<ex> $$1 = $$0.register((LiteralArgumentBuilder)ey.a("teammsg").then(ey.a("message", fo.a()).executes($$0x -> {
         ex $$1x = (ex)$$0x.getSource();
         buk $$2 = $$1x.g();
         fbz $$3 = $$2.cr();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<are> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cr() == $$3).toList();
            if (!$$4.isEmpty()) {
               fo.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ey.a("tm").redirect($$1));
   }

   private static void a(ex $$0, buk $$1, fbz $$2, List<are> $$3, xf $$4) {
      wp $$5 = $$2.d().c(a);
      wl.a $$6 = wl.a(wl.i, $$0).c($$5);
      wl.a $$7 = wl.a(wl.j, $$0).c($$5);
      xe $$8 = xe.a($$4);
      boolean $$9 = false;

      for (are $$10 : $$3) {
         wl.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avd.e);
      }
   }
}
