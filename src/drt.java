import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class drt extends dek {
   public static final MapCodec<drt> a = b(drt::new);
   public static final dsv b = drv.a;
   public static final dsz<dtd> c = drv.c;

   @Override
   public MapCodec<drt> a() {
      return a;
   }

   public drt(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, dtd.a));
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return null;
   }

   public static dpg a(iz $$0, dsb $$1, dsb $$2, je $$3, boolean $$4, boolean $$5) {
      return new drx($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$2, dpi.k, drx::a);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpg $$5 = $$1.c_($$2);
         if ($$5 instanceof drx) {
            ((drx)$$5).k();
         }
      }
   }

   @Override
   public void a(dby $$0, iz $$1, dsb $$2) {
      iz $$3 = $$1.a($$2.c(b).g());
      dsb $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dru && $$4.c(dru.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqt.c;
      } else {
         return bqt.e;
      }
   }

   @Override
   protected List<cuo> a(dsb $$0, eqk.a $$1) {
      drx $$2 = this.a($$1.a(), iz.a($$1.a(etd.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return ewg.a();
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      drx $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ewg.a();
   }

   @Nullable
   private drx a(dbd $$0, iz $$1) {
      dpg $$2 = $$0.c_($$1);
      return $$2 instanceof drx ? (drx)$$2 : null;
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return cuo.l;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
