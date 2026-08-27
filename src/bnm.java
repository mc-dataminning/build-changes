import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bnm implements bmw, cno {
   private final int c;
   private final iu<cqm> d;
   @Nullable
   private List<bmy> e;

   public bnm(int $$0) {
      this.c = $$0;
      this.d = iu.a($$0, cqm.h);
   }

   public bnm(cqm... $$0) {
      this.c = $$0.length;
      this.d = iu.a(cqm.h, $$0);
   }

   public void a(bmy $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bmy $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cqm a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cqm.h;
   }

   public List<cqm> f() {
      List<cqm> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cqm a(int $$0, int $$1) {
      cqm $$2 = bmx.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cqm a(cqh $$0, int $$1) {
      cqm $$2 = new cqm($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cqm $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.M();
            cqm $$6 = $$4.a($$5);
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

   public cqm a(cqm $$0) {
      if ($$0.b()) {
         return cqm.h;
      } else {
         cqm $$1 = $$0.q();
         this.d($$1);
         if ($$1.b()) {
            return cqm.h;
         } else {
            this.c($$1);
            return $$1.b() ? cqm.h : $$1;
         }
      }
   }

   public boolean b(cqm $$0) {
      boolean $$1 = false;

      for (cqm $$2 : this.d) {
         if ($$2.b() || cqm.c($$2, $$0) && $$2.M() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cqm b(int $$0) {
      cqm $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cqm.h;
      } else {
         this.d.set($$0, cqm.h);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cqm $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.M() > this.ak_()) {
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
      for (cqm $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bmy $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(ciy $$0) {
      for (cqm $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cqm $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cqm $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cqm $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cqm $$2 = this.a($$1);
         if (cqm.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cqm $$0, cqm $$1) {
      int $$2 = Math.min(this.ak_(), $$1.g());
      int $$3 = Math.min($$0.M(), $$2 - $$1.M());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(tg $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cqm $$2 = cqm.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public tg g() {
      tg $$0 = new tg();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cqm $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new ta()));
         }
      }

      return $$0;
   }

   public iu<cqm> h() {
      return this.d;
   }
}
