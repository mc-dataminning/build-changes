import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bki implements bjt, cjy {
   private final int c;
   private final iq<cmx> d;
   @Nullable
   private List<bjv> e;

   public bki(int $$0) {
      this.c = $$0;
      this.d = iq.a($$0, cmx.f);
   }

   public bki(cmx... $$0) {
      this.c = $$0.length;
      this.d = iq.a(cmx.f, $$0);
   }

   public void a(bjv $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bjv $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cmx a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cmx.f;
   }

   public List<cmx> f() {
      List<cmx> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cmx a(int $$0, int $$1) {
      cmx $$2 = bju.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cmx a(cms $$0, int $$1) {
      cmx $$2 = new cmx($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cmx $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cmx $$6 = $$4.a($$5);
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

   public cmx a(cmx $$0) {
      if ($$0.b()) {
         return cmx.f;
      } else {
         cmx $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cmx.f;
         } else {
            this.c($$1);
            return $$1.b() ? cmx.f : $$1;
         }
      }
   }

   public boolean b(cmx $$0) {
      boolean $$1 = false;

      for (cmx $$2 : this.d) {
         if ($$2.b() || cmx.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cmx b(int $$0) {
      cmx $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cmx.f;
      } else {
         this.d.set($$0, cmx.f);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cmx $$1) {
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
      for (cmx $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bjv $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cfh $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cfl $$0) {
      for (cmx $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cmx $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cmx $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cmx $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cmx $$2 = this.a($$1);
         if (cmx.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cmx $$0, cmx $$1) {
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
         cmx $$2 = cmx.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public st g() {
      st $$0 = new st();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmx $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new sn()));
         }
      }

      return $$0;
   }

   public iq<cmx> h() {
      return this.d;
   }
}
