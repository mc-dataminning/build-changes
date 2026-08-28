import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxl extends bvd<cmf> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cuk e;
   private final List<cuk> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bxl(int $$0, int $$1) {
      super(ImmutableMap.of(cco.q, ccp.a), $$0, $$1);
   }

   public boolean a(arb $$0, cmf $$1) {
      bum<?> $$2 = $$1.dS();
      if ($$2.c(cco.q).isEmpty()) {
         return false;
      } else {
         btk $$3 = $$2.c(cco.q).get();
         return $$3.ak() == bsv.by && $$1.bD() && $$3.bD() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arb $$0, cmf $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dS().c(cco.q).isPresent();
   }

   public void b(arb $$0, cmf $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arb $$0, cmf $$1, long $$2) {
      btk $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arb $$0, cmf $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dS().b(cco.q);
      c($$1);
      this.e = null;
   }

   private void a(btk $$0, cmf $$1) {
      boolean $$2 = false;
      cuk $$3 = $$0.eX();
      if (this.e == null || !cuk.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.e()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cmf $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cmf $$0) {
      for (dar $$1 : $$0.gs()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dar $$0) {
      return cuk.b(this.e, $$0.b()) || cuk.b(this.e, $$0.c());
   }

   private static void c(cmf $$0) {
      $$0.a(bsw.a, cuk.l);
      $$0.a(bsw.a, 0.085F);
   }

   private static void a(cmf $$0, cuk $$1) {
      $$0.a(bsw.a, $$1);
      $$0.a(bsw.a, 0.0F);
   }

   private btk d(cmf $$0) {
      bum<?> $$1 = $$0.dS();
      btk $$2 = $$1.c(cco.q).get();
      $$1.a(cco.n, new bvo($$2, true));
      return $$2;
   }

   private void e(cmf $$0) {
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
