import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bsf implements brr, ctl {
   private final int b;
   private final jy<cvx> c;
   @Nullable
   private List<brt> d;

   public bsf(int $$0) {
      this.b = $$0;
      this.c = jy.a($$0, cvx.k);
   }

   public bsf(cvx... $$0) {
      this.b = $$0.length;
      this.c = jy.a(cvx.k, $$0);
   }

   public void a(brt $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(brt $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cvx a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cvx.k;
   }

   public List<cvx> f() {
      List<cvx> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cvx a(int $$0, int $$1) {
      cvx $$2 = brs.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cvx a(cvt $$0, int $$1) {
      cvx $$2 = new cvx($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cvx $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cvx $$6 = $$4.a($$5);
            $$2.g($$6.L());
            if ($$2.L() == $$1) {
               break;
            }
         }
      }

      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cvx b(cvx $$0) {
      if ($$0.f()) {
         return cvx.k;
      } else {
         cvx $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return cvx.k;
         } else {
            this.d($$1);
            return $$1.f() ? cvx.k : $$1;
         }
      }
   }

   public boolean c(cvx $$0) {
      boolean $$1 = false;

      for (cvx $$2 : this.c) {
         if ($$2.f() || cvx.c($$2, $$0) && $$2.L() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cvx b(int $$0) {
      cvx $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cvx.k;
      } else {
         this.c.set($$0, cvx.k);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cvx $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public boolean c() {
      for (cvx $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (brt $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(coh $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(com $$0) {
      for (cvx $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cvx $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cvx $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cvx $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cvx $$2 = this.a($$1);
         if (cvx.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cvx $$0, cvx $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(up $$0, jr.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cvx.a($$1, (vg)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public up a(jr.a $$0) {
      up $$1 = new up();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvx $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jy<cvx> g() {
      return this.c;
   }
}
