import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dby extends cur implements dcf {
   public static final MapCodec<dby> a = b(dby::new);
   public static final die b = did.F;
   public static final die c = did.C;
   public static final die d = did.G;
   protected static final eks e = cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ib.a.b);

   @Override
   public MapCodec<dby> a() {
      return a;
   }

   public dby(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bkv $$3) {
      if ($$0 instanceof ami $$4) {
         amj $$5 = dgp.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dfk.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if ($$1 instanceof ami $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dfk.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dfk.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return e;
   }

   @Override
   public eks f(dhn $$0, crl $$1, hx $$2) {
      return e;
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgp($$0, $$1);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == ecy.c));
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(c) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, clo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bid.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return !$$0.B ? cur.a($$2, dfk.L, ($$0x, $$1x, $$2x, $$3) -> dmg.c.a($$0x, $$3.gh(), $$3.gi())) : null;
   }
}
