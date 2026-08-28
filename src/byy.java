import com.google.common.collect.ImmutableMap;

public class byy<E extends clz> extends bvf<E> {
   public byy(int $$0) {
      super(ImmutableMap.of(ccq.o, ccr.b, ccq.m, ccr.b), $$0);
   }

   protected boolean a(aqt $$0, E $$1, long $$2) {
      return $$1.dM() == null;
   }

   protected boolean a(aqt $$0, E $$1) {
      return $$1.aF() || $$1.bf() || $$1.bt();
   }

   protected void b(aqt $$0, E $$1, long $$2) {
      if ($$1.aF()) {
         $$1.b(bty.o);
         $$1.a(avo.BL, 5.0F, 1.0F);
      } else {
         $$1.a(avo.BG, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aqt $$0, E $$1, long $$2) {
      if ($$1.dM() == null) {
         $$1.a(bsq.c.b);
      }
   }
}
