import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bgx implements bgj, cfy {
   private final int c;
   private final hn<cix> d;
   @Nullable
   private List<bgl> e;

   public bgx(int $$0) {
      this.c = $$0;
      this.d = hn.a($$0, cix.b);
   }

   public bgx(cix... $$0) {
      this.c = $$0.length;
      this.d = hn.a(cix.b, $$0);
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
   public cix a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cix.b;
   }

   public List<cix> f() {
      List<cix> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cix a(int $$0, int $$1) {
      cix $$2 = bgk.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cix a(cis $$0, int $$1) {
      cix $$2 = new cix($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cix $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cix $$6 = $$4.a($$5);
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

   public cix a(cix $$0) {
      if ($$0.b()) {
         return cix.b;
      } else {
         cix $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cix.b;
         } else {
            this.c($$1);
            return $$1.b() ? cix.b : $$1;
         }
      }
   }

   public boolean b(cix $$0) {
      boolean $$1 = false;

      for (cix $$2 : this.d) {
         if ($$2.b() || cix.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cix b(int $$0) {
      cix $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cix.b;
      } else {
         this.d.set($$0, cix.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cix $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ab_()) {
         $$1.f(this.ab_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.c;
   }

   @Override
   public boolean aa_() {
      for (cix $$0 : this.d) {
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
   public boolean a(cbm $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cbq $$0) {
      for (cix $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cix $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cix $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cix $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cix $$2 = this.a($$1);
         if (cix.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cix $$0, cix $$1) {
      int $$2 = Math.min(this.ab_(), $$1.g());
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
         cix $$2 = cix.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public qx g() {
      qx $$0 = new qx();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cix $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new qr()));
         }
      }

      return $$0;
   }
}
