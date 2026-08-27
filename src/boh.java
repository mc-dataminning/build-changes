import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class boh extends bma<cck> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private ckj e;
   private final List<ckj> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public boh(int $$0, int $$1) {
      super(ImmutableMap.of(btk.q, btl.a), $$0, $$1);
   }

   public boolean a(alq $$0, cck $$1) {
      blj<?> $$2 = $$1.dN();
      if ($$2.c(btk.q).isEmpty()) {
         return false;
      } else {
         bkj $$3 = $$2.c(btk.q).get();
         return $$3.ag() == bjx.bt && $$1.bv() && $$3.bv() && !$$1.n_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(alq $$0, cck $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dN().c(btk.q).isPresent();
   }

   public void b(alq $$0, cck $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(alq $$0, cck $$1, long $$2) {
      bkj $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(alq $$0, cck $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dN().b(btk.q);
      c($$1);
      this.e = null;
   }

   private void a(bkj $$0, cck $$1) {
      boolean $$2 = false;
      ckj $$3 = $$0.eS();
      if (this.e == null || !ckj.b(this.e, $$3)) {
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

   private void a(cck $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cck $$0) {
      for (cpx $$1 : $$0.gg()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(cpx $$0) {
      return ckj.b(this.e, $$0.b()) || ckj.b(this.e, $$0.c());
   }

   private static void c(cck $$0) {
      $$0.a(bjy.a, ckj.b);
      $$0.a(bjy.a, 0.085F);
   }

   private static void a(cck $$0, ckj $$1) {
      $$0.a(bjy.a, $$1);
      $$0.a(bjy.a, 0.0F);
   }

   private bkj d(cck $$0) {
      blj<?> $$1 = $$0.dN();
      bkj $$2 = $$1.c(btk.q).get();
      $$1.a(btk.n, new bml($$2, true));
      return $$2;
   }

   private void e(cck $$0) {
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
