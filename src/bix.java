import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bix implements bij, cic {
   private final int c;
   private final il<clb> d;
   @Nullable
   private List<bil> e;

   public bix(int $$0) {
      this.c = $$0;
      this.d = il.a($$0, clb.b);
   }

   public bix(clb... $$0) {
      this.c = $$0.length;
      this.d = il.a(clb.b, $$0);
   }

   public void a(bil $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bil $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public clb a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : clb.b;
   }

   public List<clb> f() {
      List<clb> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public clb a(int $$0, int $$1) {
      clb $$2 = bik.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public clb a(ckw $$0, int $$1) {
      clb $$2 = new clb($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         clb $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            clb $$6 = $$4.a($$5);
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

   public clb a(clb $$0) {
      if ($$0.b()) {
         return clb.b;
      } else {
         clb $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return clb.b;
         } else {
            this.c($$1);
            return $$1.b() ? clb.b : $$1;
         }
      }
   }

   public boolean b(clb $$0) {
      boolean $$1 = false;

      for (clb $$2 : this.d) {
         if ($$2.b() || clb.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public clb b(int $$0) {
      clb $$1 = this.d.get($$0);
      if ($$1.b()) {
         return clb.b;
      } else {
         this.d.set($$0, clb.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, clb $$1) {
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
      for (clb $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bil $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cdq $$0) {
      for (clb $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(clb $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         clb $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(clb $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         clb $$2 = this.a($$1);
         if (clb.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(clb $$0, clb $$1) {
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
         clb $$2 = clb.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public sf g() {
      sf $$0 = new sf();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         clb $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new rz()));
         }
      }

      return $$0;
   }

   public il<clb> h() {
      return this.d;
   }
}
