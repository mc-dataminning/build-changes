import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxp extends dda implements ddp {
   public static final MapCodec<cxp> a = b(cxp::new);
   public static final djx b = djw.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final eml e = cwp.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eml f = cwp.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eml g = cwp.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<cxp> a() {
      return a;
   }

   public cxp(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ic.a.b));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      switch ((ic.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eer.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(b) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
