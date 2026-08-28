import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bso implements bsa, ctu {
   private final int b;
   private final jz<cwf> c;
   @Nullable
   private List<bsc> d;

   public bso(int $$0) {
      this.b = $$0;
      this.c = jz.a($$0, cwf.k);
   }

   public bso(cwf... $$0) {
      this.b = $$0.length;
      this.c = jz.a(cwf.k, $$0);
   }

   public void a(bsc $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bsc $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cwf a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cwf.k;
   }

   public List<cwf> f() {
      List<cwf> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cwf a(int $$0, int $$1) {
      cwf $$2 = bsb.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cwf a(cwb $$0, int $$1) {
      cwf $$2 = new cwf($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cwf $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cwf $$6 = $$4.a($$5);
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

   public cwf b(cwf $$0) {
      if ($$0.f()) {
         return cwf.k;
      } else {
         cwf $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return cwf.k;
         } else {
            this.d($$1);
            return $$1.f() ? cwf.k : $$1;
         }
      }
   }

   public boolean c(cwf $$0) {
      boolean $$1 = false;

      for (cwf $$2 : this.c) {
         if ($$2.f() || cwf.c($$2, $$0) && $$2.L() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cwf b(int $$0) {
      cwf $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cwf.k;
      } else {
         this.c.set($$0, cwf.k);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cwf $$1) {
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
      for (cwf $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bsc $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cor $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cow $$0) {
      for (cwf $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cwf $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cwf $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cwf $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cwf $$2 = this.a($$1);
         if (cwf.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cwf $$0, cwf $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(ut $$0, js.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cwf.a($$1, (vk)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public ut a(js.a $$0) {
      ut $$1 = new ut();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwf $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jz<cwf> g() {
      return this.c;
   }
}
