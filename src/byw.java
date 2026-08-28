import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class byw extends bwo<cnt> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cvx e;
   private final List<cvx> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public byw(int $$0, int $$1) {
      super(ImmutableMap.of(cdz.q, cea.a), $$0, $$1);
   }

   public boolean a(arm $$0, cnt $$1) {
      bvx<?> $$2 = $$1.ed();
      if ($$2.c(cdz.q).isEmpty()) {
         return false;
      } else {
         buv $$3 = $$2.c(cdz.q).get();
         return $$3.aq() == bug.by && $$1.bM() && $$3.bM() && !$$1.p_() && $$1.g((btz)$$3) <= 17.0;
      }
   }

   public boolean a(arm $$0, cnt $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ed().c(cdz.q).isPresent();
   }

   public void b(arm $$0, cnt $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arm $$0, cnt $$1, long $$2) {
      buv $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arm $$0, cnt $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ed().b(cdz.q);
      c($$1);
      this.e = null;
   }

   private void a(buv $$0, cnt $$1) {
      boolean $$2 = false;
      cvx $$3 = $$0.fb();
      if (this.e == null || !cvx.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.f()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cnt $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cnt $$0) {
      for (dds $$1 : $$0.gx()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dds $$0) {
      return cvx.b(this.e, $$0.b()) || cvx.b(this.e, $$0.c());
   }

   private static void c(cnt $$0) {
      $$0.a(buh.a, cvx.k);
      $$0.a(buh.a, 0.085F);
   }

   private static void a(cnt $$0, cvx $$1) {
      $$0.a(buh.a, $$1);
      $$0.a(buh.a, 0.0F);
   }

   private buv d(cnt $$0) {
      bvx<?> $$1 = $$0.ed();
      buv $$2 = $$1.c(cdz.q).get();
      $$1.a(cdz.n, new bwz($$2, true));
      return $$2;
   }

   private void e(cnt $$0) {
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
