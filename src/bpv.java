import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bpv implements bpf, cqe {
   private final int b;
   private final jf<csz> c;
   @Nullable
   private List<bph> d;

   public bpv(int $$0) {
      this.b = $$0;
      this.c = jf.a($$0, csz.i);
   }

   public bpv(csz... $$0) {
      this.b = $$0.length;
      this.c = jf.a(csz.i, $$0);
   }

   public void a(bph $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bph $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public csz a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : csz.i;
   }

   public List<csz> f() {
      List<csz> $$0 = this.c.stream().filter($$0x -> !$$0x.d()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public csz a(int $$0, int $$1) {
      csz $$2 = bpg.a(this.c, $$0, $$1);
      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   public csz a(csu $$0, int $$1) {
      csz $$2 = new csz($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         csz $$4 = this.a($$3);
         if ($$4.f().equals($$0)) {
            int $$5 = $$1 - $$2.G();
            csz $$6 = $$4.a($$5);
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

   public csz b(csz $$0) {
      if ($$0.d()) {
         return csz.i;
      } else {
         csz $$1 = $$0.r();
         this.e($$1);
         if ($$1.d()) {
            return csz.i;
         } else {
            this.d($$1);
            return $$1.d() ? csz.i : $$1;
         }
      }
   }

   public boolean c(csz $$0) {
      boolean $$1 = false;

      for (csz $$2 : this.c) {
         if ($$2.d() || csz.c($$2, $$0) && $$2.G() < $$2.i()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public csz b(int $$0) {
      csz $$1 = this.c.get($$0);
      if ($$1.d()) {
         return csz.i;
      } else {
         this.c.set($$0, csz.i);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, csz $$1) {
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
      for (csz $$0 : this.c) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bph $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(clh $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void a(cll $$0) {
      for (csz $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.d()).collect(Collectors.toList()).toString();
   }

   private void d(csz $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         csz $$2 = this.a($$1);
         if ($$2.d()) {
            this.a($$1, $$0.e());
            return;
         }
      }
   }

   private void e(csz $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         csz $$2 = this.a($$1);
         if (csz.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.d()) {
               return;
            }
         }
      }
   }

   private void a(csz $$0, csz $$1) {
      int $$2 = this.a($$1);
      int $$3 = Math.min($$0.G(), $$2 - $$1.G());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(ug $$0, iy.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         csz.a($$1, (ux)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public ug a(iy.a $$0) {
      ug $$1 = new ug();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         csz $$3 = this.a($$2);
         if (!$$3.d()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jf<csz> g() {
      return this.c;
   }
}
