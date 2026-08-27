import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bqj implements bpt, crj {
   private final int b;
   private final jj<cuh> c;
   @Nullable
   private List<bpv> d;

   public bqj(int $$0) {
      this.b = $$0;
      this.c = jj.a($$0, cuh.i);
   }

   public bqj(cuh... $$0) {
      this.b = $$0.length;
      this.c = jj.a(cuh.i, $$0);
   }

   public void a(bpv $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bpv $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cuh a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cuh.i;
   }

   public List<cuh> f() {
      List<cuh> $$0 = this.c.stream().filter($$0x -> !$$0x.d()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cuh a(int $$0, int $$1) {
      cuh $$2 = bpu.a(this.c, $$0, $$1);
      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   public cuh a(cuc $$0, int $$1) {
      cuh $$2 = new cuh($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cuh $$4 = this.a($$3);
         if ($$4.f().equals($$0)) {
            int $$5 = $$1 - $$2.G();
            cuh $$6 = $$4.a($$5);
            $$2.g($$6.G());
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

   public cuh b(cuh $$0) {
      if ($$0.d()) {
         return cuh.i;
      } else {
         cuh $$1 = $$0.r();
         this.e($$1);
         if ($$1.d()) {
            return cuh.i;
         } else {
            this.d($$1);
            return $$1.d() ? cuh.i : $$1;
         }
      }
   }

   public boolean c(cuh $$0) {
      boolean $$1 = false;

      for (cuh $$2 : this.c) {
         if ($$2.d() || cuh.c($$2, $$0) && $$2.G() < $$2.i()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cuh b(int $$0) {
      cuh $$1 = this.c.get($$0);
      if ($$1.d()) {
         return cuh.i;
      } else {
         this.c.set($$0, cuh.i);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cuh $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.a($$1));
      this.e();
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public boolean c() {
      for (cuh $$0 : this.c) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bpv $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cly $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void a(cmc $$0) {
      for (cuh $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.d()).collect(Collectors.toList()).toString();
   }

   private void d(cuh $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cuh $$2 = this.a($$1);
         if ($$2.d()) {
            this.a($$1, $$0.e());
            return;
         }
      }
   }

   private void e(cuh $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cuh $$2 = this.a($$1);
         if (cuh.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.d()) {
               return;
            }
         }
      }
   }

   private void a(cuh $$0, cuh $$1) {
      int $$2 = this.a($$1);
      int $$3 = Math.min($$0.G(), $$2 - $$1.G());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(uq $$0, jc.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cuh.a($$1, (vh)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public uq a(jc.a $$0) {
      uq $$1 = new uq();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cuh $$3 = this.a($$2);
         if (!$$3.d()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jj<cuh> g() {
      return this.c;
   }
}
