import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxq extends ddb implements ddq {
   public static final MapCodec<cxq> a = b(cxq::new);
   public static final djy b = djx.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final emm e = cwq.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final emm f = cwq.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final emm g = cwq.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<cxq> a() {
      return a;
   }

   public cxq(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ic.a.b));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
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
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ees.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(b) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
