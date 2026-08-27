import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxw extends cvv implements ddj {
   public static final MapCodec<cxw> a = b(cxw::new);
   public static final djr b = djq.C;
   private static final int d = 3;
   protected static final emf c = cwj.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<cxw> a() {
      return a;
   }

   public cxw(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dha($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$2, dgq.z, $$0.B ? dha::a : dha::b);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.b;
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(b) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
      if ($$4.A()) {
         dgo $$5 = $$0.c_($$1);
         if ($$5 instanceof dgj) {
            ((dgj)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(asg.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
