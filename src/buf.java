import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class buf implements btr, cwm {
   private final int b;
   private final jn<cys> c;
   @Nullable
   private List<btt> d;

   public buf(int $$0) {
      this.b = $$0;
      this.c = jn.a($$0, cys.k);
   }

   public buf(cys... $$0) {
      this.b = $$0.length;
      this.c = jn.a(cys.k, $$0);
   }

   public void a(btt $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(btt $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cys a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cys.k;
   }

   public List<cys> f() {
      List<cys> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cys a(int $$0, int $$1) {
      cys $$2 = bts.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cys a(cyo $$0, int $$1) {
      cys $$2 = new cys($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cys $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            cys $$6 = $$4.a($$5);
            $$2.g($$6.M());
            if ($$2.M() == $$1) {
               break;
            }
         }
      }

      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cys b(cys $$0) {
      if ($$0.f()) {
         return cys.k;
      } else {
         cys $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return cys.k;
         } else {
            this.d($$1);
            return $$1.f() ? cys.k : $$1;
         }
      }
   }

   public boolean c(cys $$0) {
      boolean $$1 = false;

      for (cys $$2 : this.c) {
         if ($$2.f() || cys.c($$2, $$0) && $$2.M() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cys b(int $$0) {
      cys $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cys.k;
      } else {
         this.c.set($$0, cys.k);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cys $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public boolean c() {
      for (cys $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (btt $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cqs $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cqx $$0) {
      for (cys $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cys $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cys $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cys $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cys $$2 = this.a($$1);
         if (cys.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cys $$0, cys $$1) {
      int $$2 = this.e_($$1);
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(ud $$0, jg.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cys.a($$1, (uu)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public ud a(jg.a $$0) {
      ud $$1 = new ud();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cys $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jn<cys> g() {
      return this.c;
   }
}
