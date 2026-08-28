import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bui implements btu, cws {
   private final int b;
   private final jn<cyy> c;
   @Nullable
   private List<btw> d;

   public bui(int $$0) {
      this.b = $$0;
      this.c = jn.a($$0, cyy.k);
   }

   public bui(cyy... $$0) {
      this.b = $$0.length;
      this.c = jn.a(cyy.k, $$0);
   }

   public void a(btw $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(btw $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public cyy a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : cyy.k;
   }

   public List<cyy> f() {
      List<cyy> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cyy a(int $$0, int $$1) {
      cyy $$2 = btv.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public cyy a(cyu $$0, int $$1) {
      cyy $$2 = new cyy($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         cyy $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            cyy $$6 = $$4.a($$5);
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

   public cyy b(cyy $$0) {
      if ($$0.f()) {
         return cyy.k;
      } else {
         cyy $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return cyy.k;
         } else {
            this.d($$1);
            return $$1.f() ? cyy.k : $$1;
         }
      }
   }

   public boolean c(cyy $$0) {
      boolean $$1 = false;

      for (cyy $$2 : this.c) {
         if ($$2.f() || cyy.c($$2, $$0) && $$2.M() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cyy b(int $$0) {
      cyy $$1 = this.c.get($$0);
      if ($$1.f()) {
         return cyy.k;
      } else {
         this.c.set($$0, cyy.k);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cyy $$1) {
      this.c.set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public int b() {
      return this.b;
   }

   @Override
   public boolean c() {
      for (cyy $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (btw $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cqy $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(crd $$0) {
      for (cyy $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(cyy $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cyy $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(cyy $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         cyy $$2 = this.a($$1);
         if (cyy.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(cyy $$0, cyy $$1) {
      int $$2 = this.f_($$1);
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(uf $$0, jg.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         cyy.a($$1, (uw)$$0.a($$2)).ifPresent(this::b);
      }
   }

   public uf a(jg.a $$0) {
      uf $$1 = new uf();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cyy $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jn<cyy> g() {
      return this.c;
   }
}
