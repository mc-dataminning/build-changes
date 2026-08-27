import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class boz implements boj, cpi {
   private final int c;
   private final je<csd> d;
   @Nullable
   private List<bol> e;

   public boz(int $$0) {
      this.c = $$0;
      this.d = je.a($$0, csd.i);
   }

   public boz(csd... $$0) {
      this.c = $$0.length;
      this.d = je.a(csd.i, $$0);
   }

   public void a(bol $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bol $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public csd a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : csd.i;
   }

   public List<csd> f() {
      List<csd> $$0 = this.d.stream().filter($$0x -> !$$0x.d()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public csd a(int $$0, int $$1) {
      csd $$2 = bok.a(this.d, $$0, $$1);
      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   public csd a(cry $$0, int $$1) {
      csd $$2 = new csd($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         csd $$4 = this.a($$3);
         if ($$4.f().equals($$0)) {
            int $$5 = $$1 - $$2.G();
            csd $$6 = $$4.a($$5);
            $$2.f($$6.G());
            if ($$2.G() == $$1) {
               break;
            }
         }
      }

      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   public csd a(csd $$0) {
      if ($$0.d()) {
         return csd.i;
      } else {
         csd $$1 = $$0.r();
         this.d($$1);
         if ($$1.d()) {
            return csd.i;
         } else {
            this.c($$1);
            return $$1.d() ? csd.i : $$1;
         }
      }
   }

   public boolean b(csd $$0) {
      boolean $$1 = false;

      for (csd $$2 : this.d) {
         if ($$2.d() || csd.c($$2, $$0) && $$2.G() < $$2.i()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public csd b(int $$0) {
      csd $$1 = this.d.get($$0);
      if ($$1.d()) {
         return csd.i;
      } else {
         this.d.set($$0, csd.i);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, csd $$1) {
      this.d.set($$0, $$1);
      if (!$$1.d() && $$1.G() > this.ah_()) {
         $$1.e(this.ah_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.c;
   }

   @Override
   public boolean c() {
      for (csd $$0 : this.d) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bol $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(ckp $$0) {
      for (csd $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.d()).collect(Collectors.toList()).toString();
   }

   private void c(csd $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         csd $$2 = this.a($$1);
         if ($$2.d()) {
            this.a($$1, $$0.e());
            return;
         }
      }
   }

   private void d(csd $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         csd $$2 = this.a($$1);
         if (csd.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.d()) {
               return;
            }
         }
      }
   }

   private void a(csd $$0, csd $$1) {
      int $$2 = Math.min(this.ah_(), $$1.i());
      int $$3 = Math.min($$0.G(), $$2 - $$1.G());
      if ($$3 > 0) {
         $$1.f($$3);
         $$0.g($$3);
         this.e();
      }
   }

   public void a(ue $$0, ix.a $$1) {
      this.a();

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         csd.a($$1, (uv)$$0.a($$2)).ifPresent(this::a);
      }
   }

   public ue a(ix.a $$0) {
      ue $$1 = new ue();

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         csd $$3 = this.a($$2);
         if (!$$3.d()) {
            $$1.add($$3.a($$0));
         }
      }

      return $$1;
   }

   public je<csd> g() {
      return this.d;
   }
}
