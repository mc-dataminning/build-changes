import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bkl implements bjv, ckh {
   private final int c;
   private final iq<cng> d;
   @Nullable
   private List<bjx> e;

   public bkl(int $$0) {
      this.c = $$0;
      this.d = iq.a($$0, cng.f);
   }

   public bkl(cng... $$0) {
      this.c = $$0.length;
      this.d = iq.a(cng.f, $$0);
   }

   public void a(bjx $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bjx $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cng a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cng.f;
   }

   public List<cng> f() {
      List<cng> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cng a(int $$0, int $$1) {
      cng $$2 = bjw.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cng a(cnb $$0, int $$1) {
      cng $$2 = new cng($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cng $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cng $$6 = $$4.a($$5);
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

   public cng a(cng $$0) {
      if ($$0.b()) {
         return cng.f;
      } else {
         cng $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cng.f;
         } else {
            this.c($$1);
            return $$1.b() ? cng.f : $$1;
         }
      }
   }

   public boolean b(cng $$0) {
      boolean $$1 = false;

      for (cng $$2 : this.d) {
         if ($$2.b() || cng.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cng b(int $$0) {
      cng $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cng.f;
      } else {
         this.d.set($$0, cng.f);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cng $$1) {
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
      for (cng $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bjx $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cfu $$0) {
      for (cng $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cng $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cng $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cng $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cng $$2 = this.a($$1);
         if (cng.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cng $$0, cng $$1) {
      int $$2 = Math.min(this.al_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(su $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cng $$2 = cng.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public su g() {
      su $$0 = new su();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cng $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new so()));
         }
      }

      return $$0;
   }

   public iq<cng> h() {
      return this.d;
   }
}
