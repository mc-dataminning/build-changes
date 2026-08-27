import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bjj implements biu, cip {
   private final int c;
   private final ip<clo> d;
   @Nullable
   private List<biw> e;

   public bjj(int $$0) {
      this.c = $$0;
      this.d = ip.a($$0, clo.b);
   }

   public bjj(clo... $$0) {
      this.c = $$0.length;
      this.d = ip.a(clo.b, $$0);
   }

   public void a(biw $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(biw $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public clo a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : clo.b;
   }

   public List<clo> f() {
      List<clo> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public clo a(int $$0, int $$1) {
      clo $$2 = biv.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public clo a(clj $$0, int $$1) {
      clo $$2 = new clo($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         clo $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            clo $$6 = $$4.a($$5);
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

   public clo a(clo $$0) {
      if ($$0.b()) {
         return clo.b;
      } else {
         clo $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return clo.b;
         } else {
            this.c($$1);
            return $$1.b() ? clo.b : $$1;
         }
      }
   }

   public boolean b(clo $$0) {
      boolean $$1 = false;

      for (clo $$2 : this.d) {
         if ($$2.b() || clo.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public clo b(int $$0) {
      clo $$1 = this.d.get($$0);
      if ($$1.b()) {
         return clo.b;
      } else {
         this.d.set($$0, clo.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, clo $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.al_()) {
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
      for (clo $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (biw $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(ced $$0) {
      for (clo $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(clo $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         clo $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(clo $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         clo $$2 = this.a($$1);
         if (clo.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(clo $$0, clo $$1) {
      int $$2 = Math.min(this.al_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(sj $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         clo $$2 = clo.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public sj g() {
      sj $$0 = new sj();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         clo $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new sd()));
         }
      }

      return $$0;
   }

   public ip<clo> h() {
      return this.d;
   }
}
