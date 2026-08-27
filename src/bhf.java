import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bhf implements bgr, cgg {
   private final int c;
   private final hp<cjf> d;
   @Nullable
   private List<bgt> e;

   public bhf(int $$0) {
      this.c = $$0;
      this.d = hp.a($$0, cjf.b);
   }

   public bhf(cjf... $$0) {
      this.c = $$0.length;
      this.d = hp.a(cjf.b, $$0);
   }

   public void a(bgt $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bgt $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cjf a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cjf.b;
   }

   public List<cjf> f() {
      List<cjf> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cjf a(int $$0, int $$1) {
      cjf $$2 = bgs.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cjf a(cja $$0, int $$1) {
      cjf $$2 = new cjf($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cjf $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cjf $$6 = $$4.a($$5);
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

   public cjf a(cjf $$0) {
      if ($$0.b()) {
         return cjf.b;
      } else {
         cjf $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cjf.b;
         } else {
            this.c($$1);
            return $$1.b() ? cjf.b : $$1;
         }
      }
   }

   public boolean b(cjf $$0) {
      boolean $$1 = false;

      for (cjf $$2 : this.d) {
         if ($$2.b() || cjf.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cjf b(int $$0) {
      cjf $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cjf.b;
      } else {
         this.d.set($$0, cjf.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cjf $$1) {
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
      for (cjf $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bgt $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cby $$0) {
      for (cjf $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cjf $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cjf $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cjf $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cjf $$2 = this.a($$1);
         if (cjf.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cjf $$0, cjf $$1) {
      int $$2 = Math.min(this.ag_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(rd $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cjf $$2 = cjf.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public rd g() {
      rd $$0 = new rd();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cjf $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new qx()));
         }
      }

      return $$0;
   }
}
