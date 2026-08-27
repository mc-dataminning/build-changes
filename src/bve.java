import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bve extends bsw<cjy> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private csd e;
   private final List<csd> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bve(int $$0, int $$1) {
      super(ImmutableMap.of(cah.q, cai.a), $$0, $$1);
   }

   public boolean a(aqe $$0, cjy $$1) {
      bsf<?> $$2 = $$1.dQ();
      if ($$2.c(cah.q).isEmpty()) {
         return false;
      } else {
         bre $$3 = $$2.c(cah.q).get();
         return $$3.ai() == bqr.bx && $$1.bB() && $$3.bB() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aqe $$0, cjy $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dQ().c(cah.q).isPresent();
   }

   public void b(aqe $$0, cjy $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aqe $$0, cjy $$1, long $$2) {
      bre $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aqe $$0, cjy $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dQ().b(cah.q);
      c($$1);
      this.e = null;
   }

   private void a(bre $$0, cjy $$1) {
      boolean $$2 = false;
      csd $$3 = $$0.eV();
      if (this.e == null || !csd.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.d()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cjy $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cjy $$0) {
      for (cys $$1 : $$0.gr()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(cys $$0) {
      return csd.b(this.e, $$0.b()) || csd.b(this.e, $$0.c());
   }

   private static void c(cjy $$0) {
      $$0.a(bqs.a, csd.i);
      $$0.a(bqs.a, 0.085F);
   }

   private static void a(cjy $$0, csd $$1) {
      $$0.a(bqs.a, $$1);
      $$0.a(bqs.a, 0.0F);
   }

   private bre d(cjy $$0) {
      bsf<?> $$1 = $$0.dQ();
      bre $$2 = $$1.c(cah.q).get();
      $$1.a(cah.n, new bth($$2, true));
      return $$2;
   }

   private void e(cjy $$0) {
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
