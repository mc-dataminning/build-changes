import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bje implements biq, cik {
   private final int c;
   private final il<clj> d;
   @Nullable
   private List<bis> e;

   public bje(int $$0) {
      this.c = $$0;
      this.d = il.a($$0, clj.b);
   }

   public bje(clj... $$0) {
      this.c = $$0.length;
      this.d = il.a(clj.b, $$0);
   }

   public void a(bis $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bis $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public clj a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : clj.b;
   }

   public List<clj> f() {
      List<clj> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public clj a(int $$0, int $$1) {
      clj $$2 = bir.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public clj a(cle $$0, int $$1) {
      clj $$2 = new clj($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         clj $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            clj $$6 = $$4.a($$5);
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

   public clj a(clj $$0) {
      if ($$0.b()) {
         return clj.b;
      } else {
         clj $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return clj.b;
         } else {
            this.c($$1);
            return $$1.b() ? clj.b : $$1;
         }
      }
   }

   public boolean b(clj $$0) {
      boolean $$1 = false;

      for (clj $$2 : this.d) {
         if ($$2.b() || clj.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public clj b(int $$0) {
      clj $$1 = this.d.get($$0);
      if ($$1.b()) {
         return clj.b;
      } else {
         this.d.set($$0, clj.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, clj $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.c;
   }

   @Override
   public boolean ai_() {
      for (clj $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bis $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cdu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cdy $$0) {
      for (clj $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(clj $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         clj $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(clj $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         clj $$2 = this.a($$1);
         if (clj.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(clj $$0, clj $$1) {
      int $$2 = Math.min(this.aj_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(sf $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         clj $$2 = clj.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public sf g() {
      sf $$0 = new sf();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         clj $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new rz()));
         }
      }

      return $$0;
   }

   public il<clj> h() {
      return this.d;
   }
}
