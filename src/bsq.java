import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bsq implements bsc, cud {
   private final int b;
   private final ka<cwo> c;
   @Nullable
   private List<bse> d;

   public bsq(int $$0) {
      this.b = $$0;
      this.c = ka.a($$0, cwo.j);
   }

   public bsq(cwo... $$0) {
      this.b = $$0.length;
      this.c = ka.a(cwo.j, $$0);
   }

   public void a(bse $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bse $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cwo a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cwo.j;
   }

   public List<cwo> f() {
      List<cwo> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cwo a(int $$0, int $$1) {
      cwo $$2 = bsd.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cwo a(cwk $$0, int $$1) {
      cwo $$2 = new cwo($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cwo $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            cwo $$6 = $$4.a($$5);
            $$2.g($$6.M());
            if ($$2.M() == $$1) {
               break;
            }
         }
      }

      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cwo b(cwo $$0) {
      if ($$0.f()) {
         return cwo.j;
      } else {
         cwo $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return cwo.j;
         } else {
            this.d($$1);
            return $$1.f() ? cwo.j : $$1;
         }
      }
   }

   public boolean c(cwo $$0) {
      boolean $$1 = false;

      for (cwo $$2 : this.c) {
         if ($$2.f() || cwo.c($$2, $$0) && $$2.M() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cwo b(int $$0) {
      cwo $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cwo.j;
      } else {
         this.c.set($$0, cwo.j);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cwo $$1) {
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
      for (cwo $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bse $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cow $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cpb $$0) {
      for (cwo $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cwo $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cwo $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cwo $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cwo $$2 = this.a($$1);
         if (cwo.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cwo $$0, cwo $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(tw $$0, jt.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cwo.a($$1, (un)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public tw a(jt.a $$0) {
      tw $$1 = new tw();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwo $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public ka<cwo> g() {
      return this.c;
   }
}
