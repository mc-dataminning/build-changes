import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class brw implements bri, csy {
   private final int b;
   private final jw<cvp> c;
   @Nullable
   private List<brk> d;

   public brw(int $$0) {
      this.b = $$0;
      this.c = jw.a($$0, cvp.k);
   }

   public brw(cvp... $$0) {
      this.b = $$0.length;
      this.c = jw.a(cvp.k, $$0);
   }

   public void a(brk $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(brk $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cvp a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cvp.k;
   }

   public List<cvp> f() {
      List<cvp> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cvp a(int $$0, int $$1) {
      cvp $$2 = brj.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cvp a(cvk $$0, int $$1) {
      cvp $$2 = new cvp($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cvp $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.J();
            cvp $$6 = $$4.a($$5);
            $$2.g($$6.J());
            if ($$2.J() == $$1) {
               break;
            }
         }
      }

      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cvp b(cvp $$0) {
      if ($$0.f()) {
         return cvp.k;
      } else {
         cvp $$1 = $$0.u();
         this.e($$1);
         if ($$1.f()) {
            return cvp.k;
         } else {
            this.d($$1);
            return $$1.f() ? cvp.k : $$1;
         }
      }
   }

   public boolean c(cvp $$0) {
      boolean $$1 = false;

      for (cvp $$2 : this.c) {
         if ($$2.f() || cvp.c($$2, $$0) && $$2.J() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cvp b(int $$0) {
      cvp $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cvp.k;
      } else {
         this.c.set($$0, cvp.k);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cvp $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public boolean c() {
      for (cvp $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (brk $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cnu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cnz $$0) {
      for (cvp $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cvp $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cvp $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cvp $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cvp $$2 = this.a($$1);
         if (cvp.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cvp $$0, cvp $$1) {
      int $$2 = this.f_($$1);
      int $$3 = Math.min($$0.J(), $$2 - $$1.J());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(ul $$0, jp.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cvp.a($$1, (vc)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public ul a(jp.a $$0) {
      ul $$1 = new ul();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvp $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jw<cvp> g() {
      return this.c;
   }
}
