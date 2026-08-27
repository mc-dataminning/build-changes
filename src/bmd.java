import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bmd implements bln, clz {
   private final int c;
   private final is<coz> d;
   @Nullable
   private List<blp> e;

   public bmd(int $$0) {
      this.c = $$0;
      this.d = is.a($$0, coz.h);
   }

   public bmd(coz... $$0) {
      this.c = $$0.length;
      this.d = is.a(coz.h, $$0);
   }

   public void a(blp $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(blp $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public coz a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : coz.h;
   }

   public List<coz> f() {
      List<coz> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public coz a(int $$0, int $$1) {
      coz $$2 = blo.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public coz a(cou $$0, int $$1) {
      coz $$2 = new coz($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         coz $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            coz $$6 = $$4.a($$5);
            $$2.g($$6.M());
            if ($$2.M() == $$1) {
               break;
            }
         }
      }

      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public coz a(coz $$0) {
      if ($$0.b()) {
         return coz.h;
      } else {
         coz $$1 = $$0.q();
         this.d($$1);
         if ($$1.b()) {
            return coz.h;
         } else {
            this.c($$1);
            return $$1.b() ? coz.h : $$1;
         }
      }
   }

   public boolean b(coz $$0) {
      boolean $$1 = false;

      for (coz $$2 : this.d) {
         if ($$2.b() || coz.c($$2, $$0) && $$2.M() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public coz b(int $$0) {
      coz $$1 = this.d.get($$0);
      if ($$1.b()) {
         return coz.h;
      } else {
         this.d.set($$0, coz.h);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, coz $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.al_()) {
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
      for (coz $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (blp $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(chh $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(chl $$0) {
      for (coz $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(coz $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         coz $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(coz $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         coz $$2 = this.a($$1);
         if (coz.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(coz $$0, coz $$1) {
      int $$2 = Math.min(this.al_(), $$1.g());
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(tc $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         coz $$2 = coz.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public tc g() {
      tc $$0 = new tc();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         coz $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new sw()));
         }
      }

      return $$0;
   }

   public is<coz> h() {
      return this.d;
   }
}
