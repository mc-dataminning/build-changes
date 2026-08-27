import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bjt implements bje, cji {
   private final int c;
   private final io<cmh> d;
   @Nullable
   private List<bjg> e;

   public bjt(int $$0) {
      this.c = $$0;
      this.d = io.a($$0, cmh.f);
   }

   public bjt(cmh... $$0) {
      this.c = $$0.length;
      this.d = io.a(cmh.f, $$0);
   }

   public void a(bjg $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bjg $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cmh a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cmh.f;
   }

   public List<cmh> f() {
      List<cmh> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cmh a(int $$0, int $$1) {
      cmh $$2 = bjf.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cmh a(cmc $$0, int $$1) {
      cmh $$2 = new cmh($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cmh $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cmh $$6 = $$4.a($$5);
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

   public cmh a(cmh $$0) {
      if ($$0.b()) {
         return cmh.f;
      } else {
         cmh $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cmh.f;
         } else {
            this.c($$1);
            return $$1.b() ? cmh.f : $$1;
         }
      }
   }

   public boolean b(cmh $$0) {
      boolean $$1 = false;

      for (cmh $$2 : this.d) {
         if ($$2.b() || cmh.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cmh b(int $$0) {
      cmh $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cmh.f;
      } else {
         this.d.set($$0, cmh.f);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cmh $$1) {
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
      for (cmh $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bjg $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cer $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cev $$0) {
      for (cmh $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cmh $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cmh $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cmh $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cmh $$2 = this.a($$1);
         if (cmh.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cmh $$0, cmh $$1) {
      int $$2 = Math.min(this.ak_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(sp $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cmh $$2 = cmh.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public sp g() {
      sp $$0 = new sp();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmh $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new sj()));
         }
      }

      return $$0;
   }

   public io<cmh> h() {
      return this.d;
   }
}
