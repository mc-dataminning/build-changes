import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dms extends dic {
   public static final MapCodec<dms> a = b(dms::new);
   public static final dwm b = dwl.n;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   protected dms(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, @Nullable bvh $$3, cwm $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cyv $$5 = $$4.a(ku.Y, cyv.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dub $$5) {
         $$5.t();
         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if ($$1.c(b)) {
         return bsk.f;
      } else {
         cwm $$7 = $$4.b($$5);
         bsk $$8 = cwr.a($$2, $$3, $$7, $$4);
         return (bsk)(!$$8.a() ? bsk.f : $$8);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dub $$5) {
            $$5.t();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dub($$0, $$1);
   }

   @Override
   public boolean f_(dvv $$0) {
      return true;
   }

   @Override
   public int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      if ($$1.c_($$2) instanceof dub $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return $$1.c_($$2) instanceof dub $$3 ? $$3.u() : 0;
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$1.c(b) ? a($$2, dta.e, dub::a) : null;
   }
}
