import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class drz extends der {
   public static final MapCodec<drz> a = b(drz::new);
   public static final dtb b = dsb.a;
   public static final dtf<dtj> c = dsb.c;

   @Override
   public MapCodec<drz> a() {
      return a;
   }

   public drz(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, dtj.a));
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return null;
   }

   public static dpn a(ja $$0, dsh $$1, dsh $$2, jf $$3, boolean $$4, boolean $$5) {
      return new dsd($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$2, dpp.k, dsd::a);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpn $$5 = $$1.c_($$2);
         if ($$5 instanceof dsd) {
            ((dsd)$$5).k();
         }
      }
   }

   @Override
   public void a(dce $$0, ja $$1, dsh $$2) {
      ja $$3 = $$1.a($$2.c(b).g());
      dsh $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dsa && $$4.c(dsa.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqd.c;
      } else {
         return bqd.e;
      }
   }

   @Override
   protected List<cua> a(dsh $$0, eqr.a $$1) {
      dsd $$2 = this.a($$1.a(), ja.a($$1.a(etk.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return ewp.a();
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      dsd $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ewp.a();
   }

   @Nullable
   private dsd a(dbj $$0, ja $$1) {
      dpn $$2 = $$0.c_($$1);
      return $$2 instanceof dsd ? (dsd)$$2 : null;
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return cua.l;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
