import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxj extends dcu implements ddj {
   public static final MapCodec<cxj> a = b(cxj::new);
   public static final djr b = djq.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final emf e = cwj.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final emf f = cwj.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final emf g = cwj.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<cxj> a() {
      return a;
   }

   public cxj(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ic.a.b));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
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
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eel.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(b) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
