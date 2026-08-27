import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bhh implements bgt, cgi {
   private final int c;
   private final hp<cjh> d;
   @Nullable
   private List<bgv> e;

   public bhh(int $$0) {
      this.c = $$0;
      this.d = hp.a($$0, cjh.b);
   }

   public bhh(cjh... $$0) {
      this.c = $$0.length;
      this.d = hp.a(cjh.b, $$0);
   }

   public void a(bgv $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bgv $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cjh a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cjh.b;
   }

   public List<cjh> f() {
      List<cjh> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cjh a(int $$0, int $$1) {
      cjh $$2 = bgu.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cjh a(cjc $$0, int $$1) {
      cjh $$2 = new cjh($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cjh $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cjh $$6 = $$4.a($$5);
            $$2.g($$6.L());
            if ($$2.L() == $$1) {
               break;
            }
         }
      }

      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cjh a(cjh $$0) {
      if ($$0.b()) {
         return cjh.b;
      } else {
         cjh $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cjh.b;
         } else {
            this.c($$1);
            return $$1.b() ? cjh.b : $$1;
         }
      }
   }

   public boolean b(cjh $$0) {
      boolean $$1 = false;

      for (cjh $$2 : this.d) {
         if ($$2.b() || cjh.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cjh b(int $$0) {
      cjh $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cjh.b;
      } else {
         this.d.set($$0, cjh.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cjh $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ag_()) {
         $$1.f(this.ag_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.c;
   }

   @Override
   public boolean af_() {
      for (cjh $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bgv $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cbw $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cca $$0) {
      for (cjh $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cjh $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cjh $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cjh $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cjh $$2 = this.a($$1);
         if (cjh.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cjh $$0, cjh $$1) {
      int $$2 = Math.min(this.ag_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(re $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cjh $$2 = cjh.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public re g() {
      re $$0 = new re();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cjh $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new qy()));
         }
      }

      return $$0;
   }
}
