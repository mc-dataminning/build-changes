import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apk {
   private static final xt a = xt.a.a(new xc.e(ww.c("chat.type.team.hover"))).a(new wu.g("/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ei> $$0) {
      LiteralCommandNode<ei> $$1 = $$0.register((LiteralArgumentBuilder)ej.a("teammsg").then(ej.a("message", ez.a()).executes($$0x -> {
         ei $$1x = (ei)$$0x.getSource();
         bwa $$2 = $$1x.g();
         few $$3 = $$2.cr();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<arp> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cr() == $$3).toList();
            if (!$$4.isEmpty()) {
               ez.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ej.a("tm").redirect($$1));
   }

   private static void a(ei $$0, bwa $$1, few $$2, List<arp> $$3, xm $$4) {
      ww $$5 = $$2.d().c(a);
      ws.a $$6 = ws.a(ws.i, $$0).c($$5);
      ws.a $$7 = ws.a(ws.j, $$0).c($$5);
      xl $$8 = xl.a($$4);
      boolean $$9 = false;

      for (arp $$10 : $$3) {
         ws.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avo.e);
      }
   }
}
