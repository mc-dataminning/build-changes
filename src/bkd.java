import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bkd implements bjo, cjs {
   private final int c;
   private final iq<cmr> d;
   @Nullable
   private List<bjq> e;

   public bkd(int $$0) {
      this.c = $$0;
      this.d = iq.a($$0, cmr.f);
   }

   public bkd(cmr... $$0) {
      this.c = $$0.length;
      this.d = iq.a(cmr.f, $$0);
   }

   public void a(bjq $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bjq $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public cmr a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : cmr.f;
   }

   public List<cmr> f() {
      List<cmr> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public cmr a(int $$0, int $$1) {
      cmr $$2 = bjp.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public cmr a(cmm $$0, int $$1) {
      cmr $$2 = new cmr($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         cmr $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            cmr $$6 = $$4.a($$5);
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

   public cmr a(cmr $$0) {
      if ($$0.b()) {
         return cmr.f;
      } else {
         cmr $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return cmr.f;
         } else {
            this.c($$1);
            return $$1.b() ? cmr.f : $$1;
         }
      }
   }

   public boolean b(cmr $$0) {
      boolean $$1 = false;

      for (cmr $$2 : this.d) {
         if ($$2.b() || cmr.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public cmr b(int $$0) {
      cmr $$1 = this.d.get($$0);
      if ($$1.b()) {
         return cmr.f;
      } else {
         this.d.set($$0, cmr.f);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, cmr $$1) {
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
      for (cmr $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bjq $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cff $$0) {
      for (cmr $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(cmr $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cmr $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(cmr $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         cmr $$2 = this.a($$1);
         if (cmr.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(cmr $$0, cmr $$1) {
      int $$2 = Math.min(this.ak_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(sr $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cmr $$2 = cmr.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public sr g() {
      sr $$0 = new sr();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmr $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new sl()));
         }
      }

      return $$0;
   }

   public iq<cmr> h() {
      return this.d;
   }
}
