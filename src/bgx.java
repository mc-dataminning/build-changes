import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bgx implements bgj, cfz {
   private final int c;
   private final hn<ciy> d;
   @Nullable
   private List<bgl> e;

   public bgx(int $$0) {
      this.c = $$0;
      this.d = hn.a($$0, ciy.b);
   }

   public bgx(ciy... $$0) {
      this.c = $$0.length;
      this.d = hn.a(ciy.b, $$0);
   }

   public void a(bgl $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bgl $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public ciy a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : ciy.b;
   }

   public List<ciy> f() {
      List<ciy> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public ciy a(int $$0, int $$1) {
      ciy $$2 = bgk.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public ciy a(cit $$0, int $$1) {
      ciy $$2 = new ciy($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         ciy $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            ciy $$6 = $$4.a($$5);
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

   public ciy a(ciy $$0) {
      if ($$0.b()) {
         return ciy.b;
      } else {
         ciy $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return ciy.b;
         } else {
            this.c($$1);
            return $$1.b() ? ciy.b : $$1;
         }
      }
   }

   public boolean b(ciy $$0) {
      boolean $$1 = false;

      for (ciy $$2 : this.d) {
         if ($$2.b() || ciy.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public ciy b(int $$0) {
      ciy $$1 = this.d.get($$0);
      if ($$1.b()) {
         return ciy.b;
      } else {
         this.d.set($$0, ciy.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, ciy $$1) {
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
      for (ciy $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bgl $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cbn $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cbr $$0) {
      for (ciy $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(ciy $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         ciy $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(ciy $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         ciy $$2 = this.a($$1);
         if (ciy.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(ciy $$0, ciy $$1) {
      int $$2 = Math.min(this.ac_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(qx $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ciy $$2 = ciy.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public qx g() {
      qx $$0 = new qx();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         ciy $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new qr()));
         }
      }

      return $$0;
   }
}
