import java.util.Map;

public class cto extends ctw {
   public cto(ctf $$0) {
      super("", $$0, ctx.a(Map.of('#', ctm.a(cqp.qN), 'x', ctm.a(cqp.rT)), "###", "#x#", "###"), new cqm(cqp.uh));
   }

   @Override
   public boolean a(cmg $$0, cxb $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cqm $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            eka $$3 = cqt.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cqm a(cmg $$0, iz $$1) {
      cqm $$2 = a($$0).c(1);
      $$2.x().a("map_scale_direction", 1);
      return $$2;
   }

   private static cqm a(cmg $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cqm $$2 = $$0.a($$1);
         if ($$2.a(cqp.rT)) {
            return $$2;
         }
      }

      return cqm.h;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.f;
   }
}
