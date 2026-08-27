import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aiq {
   private static final ub a = ub.a.a(new tk(tk.a.a, tf.c("chat.type.team.hover"))).a(new td(td.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<dr> $$0) {
      LiteralCommandNode<dr> $$1 = $$0.register((LiteralArgumentBuilder)ds.a("teammsg").then(ds.a("message", eg.a()).executes($$0x -> {
         dr $$1x = (dr)$$0x.getSource();
         bii $$2 = $$1x.g();
         eib $$3 = (eib)$$2.cf();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<akl> $$4 = $$1x.l().ac().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cf() == $$3).toList();
            if (!$$4.isEmpty()) {
               eg.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)ds.a("tm").redirect($$1));
   }

   private static void a(dr $$0, bii $$1, eib $$2, List<akl> $$3, tu $$4) {
      tf $$5 = $$2.d().c(a);
      tb.a $$6 = tb.a(tb.g, $$0).c($$5);
      tb.a $$7 = tb.a(tb.h, $$0).c($$5);
      tt $$8 = tt.a($$4);
      boolean $$9 = false;

      for (akl $$10 : $$3) {
         tb.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(anz.f);
      }
   }
}
