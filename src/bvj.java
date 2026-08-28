import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bvj implements buv, cye {
   private final int b;
   private final jp<dak> c;
   @Nullable
   private List<bux> d;

   public bvj(int $$0) {
      this.b = $$0;
      this.c = jp.a($$0, dak.l);
   }

   public bvj(dak... $$0) {
      this.b = $$0.length;
      this.c = jp.a(dak.l, $$0);
   }

   public void a(bux $$0) {
      if (this.d == null) {
         this.d = Lists.newArrayList();
      }

      this.d.add($$0);
   }

   public void b(bux $$0) {
      if (this.d != null) {
         this.d.remove($$0);
      }
   }

   @Override
   public dak a(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? this.c.get($$0) : dak.l;
   }

   public List<dak> f() {
      List<dak> $$0 = this.c.stream().filter($$0x -> !$$0x.f()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public dak a(int $$0, int $$1) {
      dak $$2 = buw.a(this.c, $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   public dak a(dag $$0, int $$1) {
      dak $$2 = new dak($$0, 0);

      for (int $$3 = this.b - 1; $$3 >= 0; $$3--) {
         dak $$4 = this.a($$3);
         if ($$4.h().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            dak $$6 = $$4.a($$5);
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

   public dak b(dak $$0) {
      if ($$0.f()) {
         return dak.l;
      } else {
         dak $$1 = $$0.v();
         this.e($$1);
         if ($$1.f()) {
            return dak.l;
         } else {
            this.d($$1);
            return $$1.f() ? dak.l : $$1;
         }
      }
   }

   public boolean c(dak $$0) {
      boolean $$1 = false;

      for (dak $$2 : this.c) {
         if ($$2.f() || dak.c($$2, $$0) && $$2.M() < $$2.k()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public dak b(int $$0) {
      dak $$1 = this.c.get($$0);
      if ($$1.f()) {
         return dak.l;
      } else {
         this.c.set($$0, dak.l);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, dak $$1) {
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
      for (dak $$0 : this.c) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.d != null) {
         for (bux $$0 : this.d) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(csi $$0) {
      return true;
   }

   @Override
   public void a() {
      this.c.clear();
      this.e();
   }

   @Override
   public void fillStackedContents(cso $$0) {
      for (dak $$1 : this.c) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.c.stream().filter($$0 -> !$$0.f()).collect(Collectors.toList()).toString();
   }

   private void d(dak $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         dak $$2 = this.a($$1);
         if ($$2.f()) {
            this.a($$1, $$0.g());
            return;
         }
      }
   }

   private void e(dak $$0) {
      for (int $$1 = 0; $$1 < this.b; $$1++) {
         dak $$2 = this.a($$1);
         if (dak.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.f()) {
               return;
            }
         }
      }
   }

   private void a(dak $$0, dak $$1) {
      int $$2 = this.f_($$1);
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(ug $$0, ji.a $$1) {
      this.a();
      $$0.j().flatMap($$1x -> dak.a($$1, $$1x).stream()).forEach(this::b);
   }

   public ug a(ji.a $$0) {
      ug $$1 = new ug();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         dak $$3 = this.a($$2);
         if (!$$3.f()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public jp<dak> g() {
      return this.c;
   }
}
