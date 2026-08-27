import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class agm {
   private static final ts a = ts.a.a(new tb(tb.a.a, sw.c("chat.type.team.hover"))).a(new su(su.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(sw.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralCommandNode<ds> $$1 = $$0.register((LiteralArgumentBuilder)dt.a("teammsg").then(dt.a("message", eg.a()).executes($$0x -> {
         ds $$1x = (ds)$$0x.getSource();
         bfj $$2 = $$1x.g();
         efe $$3 = (efe)$$2.cd();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<aig> $$4 = $$1x.l().ac().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cd() == $$3).toList();
            if (!$$4.isEmpty()) {
               eg.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dt.a("tm").redirect($$1));
   }

   private static void a(ds $$0, bfj $$1, efe $$2, List<aig> $$3, tl $$4) {
      sw $$5 = $$2.d().c(a);
      ss.a $$6 = ss.a(ss.g, $$0).c($$5);
      ss.a $$7 = ss.a(ss.h, $$0).c($$5);
      tk $$8 = tk.a($$4);
      boolean $$9 = false;

      for (aig $$10 : $$3) {
         ss.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(alk.f);
      }
   }
}
