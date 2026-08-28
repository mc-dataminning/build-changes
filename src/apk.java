import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class apk {
   private static final ye a = ye.a.a(new xn(xn.a.a, xh.c("chat.type.team.hover"))).a(new xf(xf.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ev> $$0) {
      LiteralCommandNode<ev> $$1 = $$0.register((LiteralArgumentBuilder)ew.a("teammsg").then(ew.a("message", fm.a()).executes($$0x -> {
         ev $$1x = (ev)$$0x.getSource();
         btz $$2 = $$1x.g();
         fah $$3 = $$2.cs();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<arn> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cs() == $$3).toList();
            if (!$$4.isEmpty()) {
               fm.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ew.a("tm").redirect($$1));
   }

   private static void a(ev $$0, btz $$1, fah $$2, List<arn> $$3, xx $$4) {
      xh $$5 = $$2.d().c(a);
      xd.a $$6 = xd.a(xd.i, $$0).c($$5);
      xd.a $$7 = xd.a(xd.j, $$0).c($$5);
      xw $$8 = xw.a($$4);
      boolean $$9 = false;

      for (arn $$10 : $$3) {
         xd.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(avn.e);
      }
   }
}
