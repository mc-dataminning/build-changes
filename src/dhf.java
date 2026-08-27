import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dhf extends cur {
   public static final MapCodec<dhf> a = b(dhf::new);
   public static final dih b = dhh.a;
   public static final dil<dip> c = dhh.c;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c).a(c, dip.a));
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return null;
   }

   public static dfi a(hx $$0, dhn $$1, dhn $$2, ib $$3, boolean $$4, boolean $$5) {
      return new dhj($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$2, dfk.k, dhj::a);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dfi $$5 = $$1.c_($$2);
         if ($$5 instanceof dhj) {
            ((dhj)$$5).l();
         }
      }
   }

   @Override
   public void a(csg $$0, hx $$1, dhn $$2) {
      hx $$3 = $$1.a($$2.c(b).g());
      dhn $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dhg && $$4.c(dhg.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bjb.b;
      } else {
         return bjb.d;
      }
   }

   @Override
   public List<clo> a(dhn $$0, efi.a $$1) {
      dhj $$2 = this.a($$1.a(), hx.a($$1.a(ehn.f)));
      return $$2 == null ? Collections.emptyList() : $$2.k().a($$1);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return ekp.a();
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      dhj $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ekp.a();
   }

   @Nullable
   private dhj a(crl $$0, hx $$1) {
      dfi $$2 = $$0.c_($$1);
      return $$2 instanceof dhj ? (dhj)$$2 : null;
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return clo.b;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
