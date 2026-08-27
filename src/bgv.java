import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bgv implements bgh, cfx {
   private final int c;
   private final ho<ciw> d;
   @Nullable
   private List<bgj> e;

   public bgv(int $$0) {
      this.c = $$0;
      this.d = ho.a($$0, ciw.b);
   }

   public bgv(ciw... $$0) {
      this.c = $$0.length;
      this.d = ho.a(ciw.b, $$0);
   }

   public void a(bgj $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bgj $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public ciw a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : ciw.b;
   }

   public List<ciw> f() {
      List<ciw> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public ciw a(int $$0, int $$1) {
      ciw $$2 = bgi.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public ciw a(cir $$0, int $$1) {
      ciw $$2 = new ciw($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         ciw $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            ciw $$6 = $$4.a($$5);
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

   public ciw a(ciw $$0) {
      if ($$0.b()) {
         return ciw.b;
      } else {
         ciw $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return ciw.b;
         } else {
            this.c($$1);
            return $$1.b() ? ciw.b : $$1;
         }
      }
   }

   public boolean b(ciw $$0) {
      boolean $$1 = false;

      for (ciw $$2 : this.d) {
         if ($$2.b() || ciw.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public ciw b(int $$0) {
      ciw $$1 = this.d.get($$0);
      if ($$1.b()) {
         return ciw.b;
      } else {
         this.d.set($$0, ciw.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, ciw $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ac_()) {
         $$1.f(this.ac_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.c;
   }

   @Override
   public boolean ab_() {
      for (ciw $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bgj $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cbp $$0) {
      for (ciw $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(ciw $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         ciw $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(ciw $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         ciw $$2 = this.a($$1);
         if (ciw.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(ciw $$0, ciw $$1) {
      int $$2 = Math.min(this.ac_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(qy $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ciw $$2 = ciw.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public qy g() {
      qy $$0 = new qy();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         ciw $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new qs()));
         }
      }

      return $$0;
   }
}
