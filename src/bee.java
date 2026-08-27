import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bee implements bdq, cda {
   private final int c;
   private final hn<cfz> d;
   @Nullable
   private List<bds> e;

   public bee(int $$0) {
      this.c = $$0;
      this.d = hn.a($$0, cfz.b);
   }

   public bee(cfz... $$0) {
      this.c = $$0.length;
      this.d = hn.a(cfz.b, $$0);
   }

   public void a(bds $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bds $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cfz a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cfz.b;
   }

   public List<cfz> f() {
      List<cfz> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cfz a(int $$0, int $$1) {
      cfz $$2 = bdr.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cfz a(cfu $$0, int $$1) {
      cfz $$2 = new cfz($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cfz $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cfz $$6 = $$4.a($$5);
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

   public cfz a(cfz $$0) {
      if ($$0.b()) {
         return cfz.b;
      } else {
         cfz $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cfz.b;
         } else {
            this.c($$1);
            return $$1.b() ? cfz.b : $$1;
         }
      }
   }

   public boolean b(cfz $$0) {
      boolean $$1 = false;

      for (cfz $$2 : this.d) {
         if ($$2.b() || cfz.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cfz b(int $$0) {
      cfz $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cfz.b;
      } else {
         this.d.set($$0, cfz.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cfz $$1) {
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
      for (cfz $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bds $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(byo $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(bys $$0) {
      for (cfz $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cfz $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cfz $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cfz $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cfz $$2 = this.a($$1);
         if (cfz.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cfz $$0, cfz $$1) {
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
         cfz $$2 = cfz.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public qx g() {
      qx $$0 = new qx();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cfz $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new qr()));
         }
      }

      return $$0;
   }
}
