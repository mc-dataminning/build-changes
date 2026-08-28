import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class drp extends deg {
   public static final MapCodec<drp> a = b(drp::new);
   public static final dsr b = drr.a;
   public static final dsv<dsz> c = drr.c;

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   public drp(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, dsz.a));
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return null;
   }

   public static dpc a(iz $$0, drx $$1, drx $$2, je $$3, boolean $$4, boolean $$5) {
      return new drt($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$2, dpe.k, drt::a);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpc $$5 = $$1.c_($$2);
         if ($$5 instanceof drt) {
            ((drt)$$5).k();
         }
      }
   }

   @Override
   public void a(dbu $$0, iz $$1, drx $$2) {
      iz $$3 = $$1.a($$2.c(b).g());
      drx $$4 = $$0.a_($$3);
      if ($$4.b() instanceof drq && $$4.c(drq.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqp.c;
      } else {
         return bqp.e;
      }
   }

   @Override
   protected List<cuk> a(drx $$0, eqg.a $$1) {
      drt $$2 = this.a($$1.a(), iz.a($$1.a(esz.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ewc.a();
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      drt $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ewc.a();
   }

   @Nullable
   private drt a(daz $$0, iz $$1) {
      dpc $$2 = $$0.c_($$1);
      return $$2 instanceof drt ? (drt)$$2 : null;
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return cuk.l;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
