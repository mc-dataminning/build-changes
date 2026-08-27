import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bmf implements blp, cmd {
   private final int c;
   private final is<cpd> d;
   @Nullable
   private List<blr> e;

   public bmf(int $$0) {
      this.c = $$0;
      this.d = is.a($$0, cpd.h);
   }

   public bmf(cpd... $$0) {
      this.c = $$0.length;
      this.d = is.a(cpd.h, $$0);
   }

   public void a(blr $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(blr $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cpd a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cpd.h;
   }

   public List<cpd> f() {
      List<cpd> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cpd a(int $$0, int $$1) {
      cpd $$2 = blq.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cpd a(coy $$0, int $$1) {
      cpd $$2 = new cpd($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cpd $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            cpd $$6 = $$4.a($$5);
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

   public cpd a(cpd $$0) {
      if ($$0.b()) {
         return cpd.h;
      } else {
         cpd $$1 = $$0.q();
         this.d($$1);
         if ($$1.b()) {
            return cpd.h;
         } else {
            this.c($$1);
            return $$1.b() ? cpd.h : $$1;
         }
      }
   }

   public boolean b(cpd $$0) {
      boolean $$1 = false;

      for (cpd $$2 : this.d) {
         if ($$2.b() || cpd.c($$2, $$0) && $$2.M() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cpd b(int $$0) {
      cpd $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cpd.h;
      } else {
         this.d.set($$0, cpd.h);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cpd $$1) {
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
      for (cpd $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (blr $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(chl $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(chp $$0) {
      for (cpd $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cpd $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cpd $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cpd $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cpd $$2 = this.a($$1);
         if (cpd.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cpd $$0, cpd $$1) {
      int $$2 = Math.min(this.al_(), $$1.g());
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(tc $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cpd $$2 = cpd.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public tc g() {
      tc $$0 = new tc();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cpd $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new sw()));
         }
      }

      return $$0;
   }

   public is<cpd> h() {
      return this.d;
   }
}
