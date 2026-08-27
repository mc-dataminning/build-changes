import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bmx extends bkq<cba> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private ciy e;
   private final List<ciy> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bmx(int $$0, int $$1) {
      super(ImmutableMap.of(bsa.q, bsb.a), $$0, $$1);
   }

   public boolean a(akk $$0, cba $$1) {
      bjz<?> $$2 = $$1.dM();
      if ($$2.c(bsa.q).isEmpty()) {
         return false;
      } else {
         biy $$3 = $$2.c(bsa.q).get();
         return $$3.ag() == bim.bt && $$1.bv() && $$3.bv() && !$$1.i_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(akk $$0, cba $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dM().c(bsa.q).isPresent();
   }

   public void b(akk $$0, cba $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(akk $$0, cba $$1, long $$2) {
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

   public void d(akk $$0, cba $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dM().b(bsa.q);
      c($$1);
      this.e = null;
   }

   private void a(biy $$0, cba $$1) {
      boolean $$2 = false;
      ciy $$3 = $$0.eR();
      if (this.e == null || !ciy.b(this.e, $$3)) {
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

   private void a(cba $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cba $$0) {
      for (coj $$1 : $$0.gb()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.d());
         }
      }
   }

   private boolean a(coj $$0) {
      return ciy.b(this.e, $$0.b()) || ciy.b(this.e, $$0.c());
   }

   private static void c(cba $$0) {
      $$0.a(bin.a, ciy.b);
      $$0.a(bin.a, 0.085F);
   }

   private static void a(cba $$0, ciy $$1) {
      $$0.a(bin.a, $$1);
      $$0.a(bin.a, 0.0F);
   }

   private biy d(cba $$0) {
      bjz<?> $$1 = $$0.dM();
      biy $$2 = $$1.c(bsa.q).get();
      $$1.a(bsa.n, new blb($$2, true));
      return $$2;
   }

   private void e(cba $$0) {
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
