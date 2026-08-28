import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class drw extends den {
   public static final MapCodec<drw> a = b(drw::new);
   public static final dsy b = dry.a;
   public static final dtc<dtg> c = dry.c;

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   public drw(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, dtg.a));
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return null;
   }

   public static dpj a(iz $$0, dse $$1, dse $$2, je $$3, boolean $$4, boolean $$5) {
      return new dsa($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$2, dpl.k, dsa::a);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpj $$5 = $$1.c_($$2);
         if ($$5 instanceof dsa) {
            ((dsa)$$5).k();
         }
      }
   }

   @Override
   public void a(dcb $$0, iz $$1, dse $$2) {
      iz $$3 = $$1.a($$2.c(b).g());
      dse $$4 = $$0.a_($$3);
      if ($$4.b() instanceof drx && $$4.c(drx.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqw.c;
      } else {
         return bqw.e;
      }
   }

   @Override
   protected List<cur> a(dse $$0, eqn.a $$1) {
      dsa $$2 = this.a($$1.a(), iz.a($$1.a(etg.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return ewj.a();
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      dsa $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ewj.a();
   }

   @Nullable
   private dsa a(dbg $$0, iz $$1) {
      dpj $$2 = $$0.c_($$1);
      return $$2 instanceof dsa ? (dsa)$$2 : null;
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return cur.l;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
