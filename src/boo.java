import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class boo implements bny, cox {
   private final int c;
   private final iw<crs> d;
   @Nullable
   private List<boa> e;

   public boo(int $$0) {
      this.c = $$0;
      this.d = iw.a($$0, crs.i);
   }

   public boo(crs... $$0) {
      this.c = $$0.length;
      this.d = iw.a(crs.i, $$0);
   }

   public void a(boa $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(boa $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public crs a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : crs.i;
   }

   public List<crs> f() {
      List<crs> $$0 = this.d.stream().filter($$0x -> !$$0x.d()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public crs a(int $$0, int $$1) {
      crs $$2 = bnz.a(this.d, $$0, $$1);
      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   public crs a(crn $$0, int $$1) {
      crs $$2 = new crs($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         crs $$4 = this.a($$3);
         if ($$4.f().equals($$0)) {
            int $$5 = $$1 - $$2.G();
            crs $$6 = $$4.a($$5);
            $$2.f($$6.G());
            if ($$2.G() == $$1) {
               break;
            }
         }
      }

      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   public crs a(crs $$0) {
      if ($$0.d()) {
         return crs.i;
      } else {
         crs $$1 = $$0.r();
         this.d($$1);
         if ($$1.d()) {
            return crs.i;
         } else {
            this.c($$1);
            return $$1.d() ? crs.i : $$1;
         }
      }
   }

   public boolean b(crs $$0) {
      boolean $$1 = false;

      for (crs $$2 : this.d) {
         if ($$2.d() || crs.c($$2, $$0) && $$2.G() < $$2.i()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public crs b(int $$0) {
      crs $$1 = this.d.get($$0);
      if ($$1.d()) {
         return crs.i;
      } else {
         this.d.set($$0, crs.i);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, crs $$1) {
      this.d.set($$0, $$1);
      if (!$$1.d() && $$1.G() > this.ah_()) {
         $$1.e(this.ah_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.c;
   }

   @Override
   public boolean c() {
      for (crs $$0 : this.d) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (boa $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cka $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cke $$0) {
      for (crs $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.d()).collect(Collectors.toList()).toString();
   }

   private void c(crs $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         crs $$2 = this.a($$1);
         if ($$2.d()) {
            this.a($$1, $$0.e());
            return;
         }
      }
   }

   private void d(crs $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         crs $$2 = this.a($$1);
         if (crs.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.d()) {
               return;
            }
         }
      }
   }

   private void a(crs $$0, crs $$1) {
      int $$2 = Math.min(this.ah_(), $$1.i());
      int $$3 = Math.min($$0.G(), $$2 - $$1.G());
      if ($$3 > 0) {
         $$1.f($$3);
         $$0.g($$3);
         this.e();
      }
   }

   public void a(tu $$0, ip.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         crs.a($$1, (ul)$$0.a($$2)).ifPresent(this::a);
      }
   }

   public tu a(ip.a $$0) {
      tu $$1 = new tu();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         crs $$3 = this.a($$2);
         if (!$$3.d()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public iw<crs> g() {
      return this.d;
   }
}
