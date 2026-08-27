import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bha implements bgm, cgb {
   private final int c;
   private final hp<cja> d;
   @Nullable
   private List<bgo> e;

   public bha(int $$0) {
      this.c = $$0;
      this.d = hp.a($$0, cja.b);
   }

   public bha(cja... $$0) {
      this.c = $$0.length;
      this.d = hp.a(cja.b, $$0);
   }

   public void a(bgo $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bgo $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cja a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cja.b;
   }

   public List<cja> f() {
      List<cja> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cja a(int $$0, int $$1) {
      cja $$2 = bgn.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cja a(civ $$0, int $$1) {
      cja $$2 = new cja($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cja $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cja $$6 = $$4.a($$5);
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

   public cja a(cja $$0) {
      if ($$0.b()) {
         return cja.b;
      } else {
         cja $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cja.b;
         } else {
            this.c($$1);
            return $$1.b() ? cja.b : $$1;
         }
      }
   }

   public boolean b(cja $$0) {
      boolean $$1 = false;

      for (cja $$2 : this.d) {
         if ($$2.b() || cja.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cja b(int $$0) {
      cja $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cja.b;
      } else {
         this.d.set($$0, cja.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cja $$1) {
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
      for (cja $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bgo $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cbp $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cbt $$0) {
      for (cja $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cja $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cja $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cja $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cja $$2 = this.a($$1);
         if (cja.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cja $$0, cja $$1) {
      int $$2 = Math.min(this.ab_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(ra $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cja $$2 = cja.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public ra g() {
      ra $$0 = new ra();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cja $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new qu()));
         }
      }

      return $$0;
   }
}
