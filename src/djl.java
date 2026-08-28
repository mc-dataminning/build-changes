import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends deu {
   public static final MapCodec<djl> a = b(djl::new);
   public static final dtc b = dtb.n;

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   protected djl(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, @Nullable btc $$3, cud $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cwr $$5 = $$4.a(kn.O, cwr.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dqs $$5) {
         $$5.l();
         return bqh.a($$1.B);
      } else {
         return bqh.e;
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dqs $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqs($$0, $$1);
   }

   @Override
   public boolean e_(dsl $$0) {
      return true;
   }

   @Override
   public int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      if ($$1.c_($$2) instanceof dqs $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqs $$3 && $$3.f().g() instanceof cuy $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return $$1.c(b) ? a($$2, dps.e, dqs::a) : null;
   }
}
