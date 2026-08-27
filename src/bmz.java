import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bmz extends bks<cbc> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cja e;
   private final List<cja> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bmz(int $$0, int $$1) {
      super(ImmutableMap.of(bsc.q, bsd.a), $$0, $$1);
   }

   public boolean a(akn $$0, cbc $$1) {
      bkb<?> $$2 = $$1.dM();
      if ($$2.c(bsc.q).isEmpty()) {
         return false;
      } else {
         bjb $$3 = $$2.c(bsc.q).get();
         return $$3.ag() == bip.bt && $$1.bv() && $$3.bv() && !$$1.i_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(akn $$0, cbc $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dM().c(bsc.q).isPresent();
   }

   public void b(akn $$0, cbc $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(akn $$0, cbc $$1, long $$2) {
      bjb $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(akn $$0, cbc $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dM().b(bsc.q);
      c($$1);
      this.e = null;
   }

   private void a(bjb $$0, cbc $$1) {
      boolean $$2 = false;
      cja $$3 = $$0.eR();
      if (this.e == null || !cja.b(this.e, $$3)) {
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

   private void a(cbc $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cbc $$0) {
      for (coo $$1 : $$0.gc()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.d());
         }
      }
   }

   private boolean a(coo $$0) {
      return cja.b(this.e, $$0.b()) || cja.b(this.e, $$0.c());
   }

   private static void c(cbc $$0) {
      $$0.a(biq.a, cja.b);
      $$0.a(biq.a, 0.085F);
   }

   private static void a(cbc $$0, cja $$1) {
      $$0.a(biq.a, $$1);
      $$0.a(biq.a, 0.0F);
   }

   private bjb d(cbc $$0) {
      bkb<?> $$1 = $$0.dM();
      bjb $$2 = $$1.c(bsc.q).get();
      $$1.a(bsc.n, new bld($$2, true));
      return $$2;
   }

   private void e(cbc $$0) {
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
