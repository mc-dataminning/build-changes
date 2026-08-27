import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class ajv {
   private static final vf a = vf.a.a(new uo(uo.a.a, ui.c("chat.type.team.hover"))).a(new ug(ug.a.d, "/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ui.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<du> $$0) {
      LiteralCommandNode<du> $$1 = $$0.register((LiteralArgumentBuilder)dv.a("teammsg").then(dv.a("message", ek.a()).executes($$0x -> {
         du $$1x = (du)$$0x.getSource();
         bjt $$2 = $$1x.h();
         ejc $$3 = $$2.cf();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<alr> $$4 = $$1x.m().ac().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cf() == $$3).toList();
            if (!$$4.isEmpty()) {
               ek.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)dv.a("tm").redirect($$1));
   }

   private static void a(du $$0, bjt $$1, ejc $$2, List<alr> $$3, uy $$4) {
      ui $$5 = $$2.d().c(a);
      ue.a $$6 = ue.a(ue.g, $$0).c($$5);
      ue.a $$7 = ue.a(ue.h, $$0).c($$5);
      ux $$8 = ux.a($$4);
      boolean $$9 = false;

      for (alr $$10 : $$3) {
         ue.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.i();
      }

      if ($$9) {
         $$0.a(apg.f);
      }
   }
}
