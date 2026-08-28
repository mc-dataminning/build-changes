import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dsd extends deu {
   public static final MapCodec<dsd> a = b(dsd::new);
   public static final dtf b = dsf.a;
   public static final dtj<dtn> c = dsf.c;

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   public dsd(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, dtn.a));
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return null;
   }

   public static dpq a(ja $$0, dsl $$1, dsl $$2, jf $$3, boolean $$4, boolean $$5) {
      return new dsh($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$2, dps.k, dsh::a);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpq $$5 = $$1.c_($$2);
         if ($$5 instanceof dsh) {
            ((dsh)$$5).k();
         }
      }
   }

   @Override
   public void a(dch $$0, ja $$1, dsl $$2) {
      ja $$3 = $$1.a($$2.c(b).g());
      dsl $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dse && $$4.c(dse.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqh.c;
      } else {
         return bqh.e;
      }
   }

   @Override
   protected List<cud> a(dsl $$0, eqz.a $$1) {
      dsh $$2 = this.a($$1.a(), ja.a($$1.a(ets.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return ewx.a();
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      dsh $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ewx.a();
   }

   @Nullable
   private dsh a(dbm $$0, ja $$1) {
      dpq $$2 = $$0.c_($$1);
      return $$2 instanceof dsh ? (dsh)$$2 : null;
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return cud.l;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
