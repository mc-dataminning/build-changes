import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddc extends cvv implements ddj {
   public static final MapCodec<ddc> a = b(ddc::new);
   public static final djr b = djq.F;
   public static final djr c = djq.C;
   public static final djr d = djq.G;
   protected static final emf e = cwj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ic.a.b);

   @Override
   public MapCodec<ddc> a() {
      return a;
   }

   public ddc(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, blp $$3) {
      if ($$0 instanceof amz $$4) {
         ana $$5 = dhv.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dgq.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if ($$1 instanceof amz $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dgq.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dgq.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return e;
   }

   @Override
   public emf f(dja $$0, cso $$1, hx $$2) {
      return e;
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhv($$0, $$1);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eel.c));
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(c) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, cmr $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bix.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return !$$0.B ? cvv.a($$2, dgq.L, ($$0x, $$1x, $$2x, $$3) -> dnt.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }
}
