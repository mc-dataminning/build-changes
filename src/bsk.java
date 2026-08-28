import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bsk implements brw, ctq {
   private final int b;
   private final jz<cwb> c;
   @Nullable
   private List<bry> d;

   public bsk(int $$0) {
      this.b = $$0;
      this.c = jz.a($$0, cwb.k);
   }

   public bsk(cwb... $$0) {
      this.b = $$0.length;
      this.c = jz.a(cwb.k, $$0);
   }

   public void a(bry $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bry $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cwb a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cwb.k;
   }

   public List<cwb> f() {
      List<cwb> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cwb a(int $$0, int $$1) {
      cwb $$2 = brx.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cwb a(cvx $$0, int $$1) {
      cwb $$2 = new cwb($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cwb $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cwb $$6 = $$4.a($$5);
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

   public cwb b(cwb $$0) {
      if ($$0.f()) {
         return cwb.k;
      } else {
         cwb $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return cwb.k;
         } else {
            this.d($$1);
            return $$1.f() ? cwb.k : $$1;
         }
      }
   }

   public boolean c(cwb $$0) {
      boolean $$1 = false;

      for (cwb $$2 : this.c) {
         if ($$2.f() || cwb.c($$2, $$0) && $$2.L() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cwb b(int $$0) {
      cwb $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cwb.k;
      } else {
         this.c.set($$0, cwb.k);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cwb $$1) {
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
      for (cwb $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bry $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(com $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cos $$0) {
      for (cwb $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cwb $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cwb $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cwb $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cwb $$2 = this.a($$1);
         if (cwb.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cwb $$0, cwb $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(uq $$0, js.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cwb.a($$1, (vh)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public uq a(js.a $$0) {
      uq $$1 = new uq();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwb $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jz<cwb> g() {
      return this.c;
   }
}
