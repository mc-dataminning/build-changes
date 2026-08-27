import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bhl implements bgx, cgm {
   private final int c;
   private final hn<cjl> d;
   @Nullable
   private List<bgz> e;

   public bhl(int $$0) {
      this.c = $$0;
      this.d = hn.a($$0, cjl.b);
   }

   public bhl(cjl... $$0) {
      this.c = $$0.length;
      this.d = hn.a(cjl.b, $$0);
   }

   public void a(bgz $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bgz $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cjl a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cjl.b;
   }

   public List<cjl> f() {
      List<cjl> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cjl a(int $$0, int $$1) {
      cjl $$2 = bgy.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cjl a(cjg $$0, int $$1) {
      cjl $$2 = new cjl($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cjl $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cjl $$6 = $$4.a($$5);
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

   public cjl a(cjl $$0) {
      if ($$0.b()) {
         return cjl.b;
      } else {
         cjl $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cjl.b;
         } else {
            this.c($$1);
            return $$1.b() ? cjl.b : $$1;
         }
      }
   }

   public boolean b(cjl $$0) {
      boolean $$1 = false;

      for (cjl $$2 : this.d) {
         if ($$2.b() || cjl.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cjl b(int $$0) {
      cjl $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cjl.b;
      } else {
         this.d.set($$0, cjl.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cjl $$1) {
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
      for (cjl $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bgz $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cca $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cce $$0) {
      for (cjl $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cjl $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cjl $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cjl $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cjl $$2 = this.a($$1);
         if (cjl.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cjl $$0, cjl $$1) {
      int $$2 = Math.min(this.ag_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(rc $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cjl $$2 = cjl.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public rc g() {
      rc $$0 = new rc();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cjl $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new qw()));
         }
      }

      return $$0;
   }
}
