import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bmu implements bme, cms {
   private final int c;
   private final iu<cpq> d;
   @Nullable
   private List<bmg> e;

   public bmu(int $$0) {
      this.c = $$0;
      this.d = iu.a($$0, cpq.h);
   }

   public bmu(cpq... $$0) {
      this.c = $$0.length;
      this.d = iu.a(cpq.h, $$0);
   }

   public void a(bmg $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bmg $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cpq a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cpq.h;
   }

   public List<cpq> f() {
      List<cpq> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cpq a(int $$0, int $$1) {
      cpq $$2 = bmf.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cpq a(cpl $$0, int $$1) {
      cpq $$2 = new cpq($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cpq $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            cpq $$6 = $$4.a($$5);
            $$2.g($$6.M());
            if ($$2.M() == $$1) {
               break;
            }
         }
      }

      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cpq a(cpq $$0) {
      if ($$0.b()) {
         return cpq.h;
      } else {
         cpq $$1 = $$0.q();
         this.d($$1);
         if ($$1.b()) {
            return cpq.h;
         } else {
            this.c($$1);
            return $$1.b() ? cpq.h : $$1;
         }
      }
   }

   public boolean b(cpq $$0) {
      boolean $$1 = false;

      for (cpq $$2 : this.d) {
         if ($$2.b() || cpq.c($$2, $$0) && $$2.M() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cpq b(int $$0) {
      cpq $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cpq.h;
      } else {
         this.d.set($$0, cpq.h);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cpq $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.al_()) {
         $$1.f(this.al_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.c;
   }

   @Override
   public boolean aj_() {
      for (cpq $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bmg $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cia $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cie $$0) {
      for (cpq $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cpq $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cpq $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cpq $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cpq $$2 = this.a($$1);
         if (cpq.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cpq $$0, cpq $$1) {
      int $$2 = Math.min(this.al_(), $$1.g());
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(te $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cpq $$2 = cpq.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public te g() {
      te $$0 = new te();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cpq $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new sy()));
         }
      }

      return $$0;
   }

   public iu<cpq> h() {
      return this.d;
   }
}
