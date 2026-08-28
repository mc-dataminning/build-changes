import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class brr implements brd, css {
   private final int b;
   private final jw<cvl> c;
   @Nullable
   private List<brf> d;

   public brr(int $$0) {
      this.b = $$0;
      this.c = jw.a($$0, cvl.k);
   }

   public brr(cvl... $$0) {
      this.b = $$0.length;
      this.c = jw.a(cvl.k, $$0);
   }

   public void a(brf $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(brf $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cvl a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cvl.k;
   }

   public List<cvl> f() {
      List<cvl> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cvl a(int $$0, int $$1) {
      cvl $$2 = bre.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cvl a(cvg $$0, int $$1) {
      cvl $$2 = new cvl($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cvl $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.J();
            cvl $$6 = $$4.a($$5);
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

   public cvl b(cvl $$0) {
      if ($$0.f()) {
         return cvl.k;
      } else {
         cvl $$1 = $$0.u();
         this.e($$1);
         if ($$1.f()) {
            return cvl.k;
         } else {
            this.d($$1);
            return $$1.f() ? cvl.k : $$1;
         }
      }
   }

   public boolean c(cvl $$0) {
      boolean $$1 = false;

      for (cvl $$2 : this.c) {
         if ($$2.f() || cvl.c($$2, $$0) && $$2.J() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cvl b(int $$0) {
      cvl $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cvl.k;
      } else {
         this.c.set($$0, cvl.k);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cvl $$1) {
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
      for (cvl $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (brf $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cnp $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cnu $$0) {
      for (cvl $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cvl $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cvl $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cvl $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cvl $$2 = this.a($$1);
         if (cvl.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cvl $$0, cvl $$1) {
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
         cvl.a($$1, (vc)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public ul a(jp.a $$0) {
      ul $$1 = new ul();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvl $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jw<cvl> g() {
      return this.c;
   }
}
