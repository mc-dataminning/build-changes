import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bkj implements bju, cjz {
   private final int c;
   private final iq<cmy> d;
   @Nullable
   private List<bjw> e;

   public bkj(int $$0) {
      this.c = $$0;
      this.d = iq.a($$0, cmy.f);
   }

   public bkj(cmy... $$0) {
      this.c = $$0.length;
      this.d = iq.a(cmy.f, $$0);
   }

   public void a(bjw $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bjw $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cmy a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cmy.f;
   }

   public List<cmy> f() {
      List<cmy> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cmy a(int $$0, int $$1) {
      cmy $$2 = bjv.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cmy a(cmt $$0, int $$1) {
      cmy $$2 = new cmy($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cmy $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cmy $$6 = $$4.a($$5);
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

   public cmy a(cmy $$0) {
      if ($$0.b()) {
         return cmy.f;
      } else {
         cmy $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cmy.f;
         } else {
            this.c($$1);
            return $$1.b() ? cmy.f : $$1;
         }
      }
   }

   public boolean b(cmy $$0) {
      boolean $$1 = false;

      for (cmy $$2 : this.d) {
         if ($$2.b() || cmy.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cmy b(int $$0) {
      cmy $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cmy.f;
      } else {
         this.d.set($$0, cmy.f);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cmy $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.c;
   }

   @Override
   public boolean ai_() {
      for (cmy $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bjw $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cfm $$0) {
      for (cmy $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cmy $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cmy $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cmy $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cmy $$2 = this.a($$1);
         if (cmy.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cmy $$0, cmy $$1) {
      int $$2 = Math.min(this.ak_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(st $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cmy $$2 = cmy.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public st g() {
      st $$0 = new st();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmy $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new sn()));
         }
      }

      return $$0;
   }

   public iq<cmy> h() {
      return this.d;
   }
}
