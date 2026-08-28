import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class drs extends dej {
   public static final MapCodec<drs> a = b(drs::new);
   public static final dsu b = dru.a;
   public static final dsy<dtc> c = dru.c;

   @Override
   public MapCodec<drs> a() {
      return a;
   }

   public drs(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, dtc.a));
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return null;
   }

   public static dpf a(iz $$0, dsa $$1, dsa $$2, je $$3, boolean $$4, boolean $$5) {
      return new drw($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$2, dph.k, drw::a);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpf $$5 = $$1.c_($$2);
         if ($$5 instanceof drw) {
            ((drw)$$5).k();
         }
      }
   }

   @Override
   public void a(dbx $$0, iz $$1, dsa $$2) {
      iz $$3 = $$1.a($$2.c(b).g());
      dsa $$4 = $$0.a_($$3);
      if ($$4.b() instanceof drt && $$4.c(drt.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqs.c;
      } else {
         return bqs.e;
      }
   }

   @Override
   protected List<cun> a(dsa $$0, eqj.a $$1) {
      drw $$2 = this.a($$1.a(), iz.a($$1.a(etc.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return ewf.a();
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      drw $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ewf.a();
   }

   @Nullable
   private drw a(dbc $$0, iz $$1) {
      dpf $$2 = $$0.c_($$1);
      return $$2 instanceof drw ? (drw)$$2 : null;
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return cun.l;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
