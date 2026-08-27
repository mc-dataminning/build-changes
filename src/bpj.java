import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bpj extends bnc<cdm> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private clo e;
   private final List<clo> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bpj(int $$0, int $$1) {
      super(ImmutableMap.of(bum.q, bun.a), $$0, $$1);
   }

   public boolean a(ami $$0, cdm $$1) {
      bml<?> $$2 = $$1.dP();
      if ($$2.c(bum.q).isEmpty()) {
         return false;
      } else {
         bll $$3 = $$2.c(bum.q).get();
         return $$3.ai() == bkz.bt && $$1.bx() && $$3.bx() && !$$1.o_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(ami $$0, cdm $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dP().c(bum.q).isPresent();
   }

   public void b(ami $$0, cdm $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ami $$0, cdm $$1, long $$2) {
      bll $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ami $$0, cdm $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dP().b(bum.q);
      c($$1);
      this.e = null;
   }

   private void a(bll $$0, cdm $$1) {
      boolean $$2 = false;
      clo $$3 = $$0.eU();
      if (this.e == null || !clo.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.b()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cdm $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cdm $$0) {
      for (crd $$1 : $$0.gh()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(crd $$0) {
      return clo.b(this.e, $$0.b()) || clo.b(this.e, $$0.c());
   }

   private static void c(cdm $$0) {
      $$0.a(bla.a, clo.b);
      $$0.a(bla.a, 0.085F);
   }

   private static void a(cdm $$0, clo $$1) {
      $$0.a(bla.a, $$1);
      $$0.a(bla.a, 0.0F);
   }

   private bll d(cdm $$0) {
      bml<?> $$1 = $$0.dP();
      bll $$2 = $$1.c(bum.q).get();
      $$1.a(bum.n, new bnn($$2, true));
      return $$2;
   }

   private void e(cdm $$0) {
      if (this.f.size() >= 2 && ++this.g >= 40) {
         this.h++;
         this.g = 0;
         if (this.h > this.f.size() - 1) {
            this.h = 0;
         }

         a($$0, this.f.get(this.h));
      }
   }
}
