import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bsr implements bsd, cub {
   private final int b;
   private final jz<cwm> c;
   @Nullable
   private List<bsf> d;

   public bsr(int $$0) {
      this.b = $$0;
      this.c = jz.a($$0, cwm.k);
   }

   public bsr(cwm... $$0) {
      this.b = $$0.length;
      this.c = jz.a(cwm.k, $$0);
   }

   public void a(bsf $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bsf $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cwm a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cwm.k;
   }

   public List<cwm> f() {
      List<cwm> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cwm a(int $$0, int $$1) {
      cwm $$2 = bse.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cwm a(cwi $$0, int $$1) {
      cwm $$2 = new cwm($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cwm $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cwm $$6 = $$4.a($$5);
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

   public cwm b(cwm $$0) {
      if ($$0.f()) {
         return cwm.k;
      } else {
         cwm $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return cwm.k;
         } else {
            this.d($$1);
            return $$1.f() ? cwm.k : $$1;
         }
      }
   }

   public boolean c(cwm $$0) {
      boolean $$1 = false;

      for (cwm $$2 : this.c) {
         if ($$2.f() || cwm.c($$2, $$0) && $$2.L() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cwm b(int $$0) {
      cwm $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cwm.k;
      } else {
         this.c.set($$0, cwm.k);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cwm $$1) {
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
      for (cwm $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bsf $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cou $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(coz $$0) {
      for (cwm $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cwm $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cwm $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cwm $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cwm $$2 = this.a($$1);
         if (cwm.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cwm $$0, cwm $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(ur $$0, js.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cwm.a($$1, (vi)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public ur a(js.a $$0) {
      ur $$1 = new ur();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwm $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jz<cwm> g() {
      return this.c;
   }
}
