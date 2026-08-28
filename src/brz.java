import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class brz implements brl, ctb {
   private final int b;
   private final jx<cvs> c;
   @Nullable
   private List<brn> d;

   public brz(int $$0) {
      this.b = $$0;
      this.c = jx.a($$0, cvs.k);
   }

   public brz(cvs... $$0) {
      this.b = $$0.length;
      this.c = jx.a(cvs.k, $$0);
   }

   public void a(brn $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(brn $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cvs a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cvs.k;
   }

   public List<cvs> f() {
      List<cvs> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cvs a(int $$0, int $$1) {
      cvs $$2 = brm.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cvs a(cvn $$0, int $$1) {
      cvs $$2 = new cvs($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cvs $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.K();
            cvs $$6 = $$4.a($$5);
            $$2.g($$6.K());
            if ($$2.K() == $$1) {
               break;
            }
         }
      }

      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cvs b(cvs $$0) {
      if ($$0.f()) {
         return cvs.k;
      } else {
         cvs $$1 = $$0.u();
         this.e($$1);
         if ($$1.f()) {
            return cvs.k;
         } else {
            this.d($$1);
            return $$1.f() ? cvs.k : $$1;
         }
      }
   }

   public boolean c(cvs $$0) {
      boolean $$1 = false;

      for (cvs $$2 : this.c) {
         if ($$2.f() || cvs.c($$2, $$0) && $$2.K() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cvs b(int $$0) {
      cvs $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cvs.k;
      } else {
         this.c.set($$0, cvs.k);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cvs $$1) {
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
      for (cvs $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (brn $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cnx $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(coc $$0) {
      for (cvs $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cvs $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cvs $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cvs $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cvs $$2 = this.a($$1);
         if (cvs.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cvs $$0, cvs $$1) {
      int $$2 = this.f_($$1);
      int $$3 = Math.min($$0.K(), $$2 - $$1.K());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(um $$0, jq.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cvs.a($$1, (vd)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public um a(jq.a $$0) {
      um $$1 = new um();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvs $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jx<cvs> g() {
      return this.c;
   }
}
