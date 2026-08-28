import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlm extends dgv {
   public static final MapCodec<dlm> a = b(dlm::new);
   public static final dvf b = dve.n;

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   protected dlm(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, @Nullable buk $$3, cvp $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cye $$5 = $$4.a(kr.T, cye.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dsv $$5) {
         $$5.t();
         return brp.a;
      } else {
         return brp.e;
      }
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$1.c(b)) {
         return brp.f;
      } else {
         cvp $$7 = $$4.b($$5);
         brp $$8 = cvu.a($$2, $$3, $$7, $$4);
         return (brp)(!$$8.a() ? brp.f : $$8);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dsv $$5) {
            $$5.t();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dsv($$0, $$1);
   }

   @Override
   public boolean f_(duo $$0) {
      return true;
   }

   @Override
   public int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      if ($$1.c_($$2) instanceof dsv $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return $$1.c_($$2) instanceof dsv $$3 ? $$3.u() : 0;
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$1.c(b) ? a($$2, dru.e, dsv::a) : null;
   }
}
