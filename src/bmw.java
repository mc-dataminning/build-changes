import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bmw extends bkp<caz> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cix e;
   private final List<cix> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bmw(int $$0, int $$1) {
      super(ImmutableMap.of(brz.q, bsa.a), $$0, $$1);
   }

   public boolean a(akk $$0, caz $$1) {
      bjy<?> $$2 = $$1.dM();
      if ($$2.c(brz.q).isEmpty()) {
         return false;
      } else {
         biy $$3 = $$2.c(brz.q).get();
         return $$3.ag() == bim.bt && $$1.bv() && $$3.bv() && !$$1.i_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(akk $$0, caz $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dM().c(brz.q).isPresent();
   }

   public void b(akk $$0, caz $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(akk $$0, caz $$1, long $$2) {
      biy $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(akk $$0, caz $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dM().b(brz.q);
      c($$1);
      this.e = null;
   }

   private void a(biy $$0, caz $$1) {
      boolean $$2 = false;
      cix $$3 = $$0.eR();
      if (this.e == null || !cix.b(this.e, $$3)) {
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

   private void a(caz $$0) {
      a($$0, this.f.get(0));
   }

   private void b(caz $$0) {
      for (coi $$1 : $$0.gc()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.d());
         }
      }
   }

   private boolean a(coi $$0) {
      return cix.b(this.e, $$0.b()) || cix.b(this.e, $$0.c());
   }

   private static void c(caz $$0) {
      $$0.a(bin.a, cix.b);
      $$0.a(bin.a, 0.085F);
   }

   private static void a(caz $$0, cix $$1) {
      $$0.a(bin.a, $$1);
      $$0.a(bin.a, 0.0F);
   }

   private biy d(caz $$0) {
      bjy<?> $$1 = $$0.dM();
      biy $$2 = $$1.c(brz.q).get();
      $$1.a(brz.n, new bla($$2, true));
      return $$2;
   }

   private void e(caz $$0) {
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
