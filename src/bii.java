import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bii implements bhu, chk {
   private final int c;
   private final il<ckj> d;
   @Nullable
   private List<bhw> e;

   public bii(int $$0) {
      this.c = $$0;
      this.d = il.a($$0, ckj.b);
   }

   public bii(ckj... $$0) {
      this.c = $$0.length;
      this.d = il.a(ckj.b, $$0);
   }

   public void a(bhw $$0) {
      if (this.e == null) {
         this.e = Lists.newArrayList();
      }

      this.e.add($$0);
   }

   public void b(bhw $$0) {
      if (this.e != null) {
         this.e.remove($$0);
      }
   }

   @Override
   public ckj a(int $$0) {
      return $$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : ckj.b;
   }

   public List<ckj> f() {
      List<ckj> $$0 = this.d.stream().filter($$0x -> !$$0x.b()).collect(Collectors.toList());
      this.a();
      return $$0;
   }

   @Override
   public ckj a(int $$0, int $$1) {
      ckj $$2 = bhv.a(this.d, $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   public ckj a(cke $$0, int $$1) {
      ckj $$2 = new ckj($$0, 0);

      for (int $$3 = this.c - 1; $$3 >= 0; $$3--) {
         ckj $$4 = this.a($$3);
         if ($$4.d().equals($$0)) {
            int $$5 = $$1 - $$2.L();
            ckj $$6 = $$4.a($$5);
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

   public ckj a(ckj $$0) {
      if ($$0.b()) {
         return ckj.b;
      } else {
         ckj $$1 = $$0.p();
         this.d($$1);
         if ($$1.b()) {
            return ckj.b;
         } else {
            this.c($$1);
            return $$1.b() ? ckj.b : $$1;
         }
      }
   }

   public boolean b(ckj $$0) {
      boolean $$1 = false;

      for (ckj $$2 : this.d) {
         if ($$2.b() || ckj.c($$2, $$0) && $$2.L() < $$2.g()) {
            $$1 = true;
            break;
         }
      }

      return $$1;
   }

   @Override
   public ckj b(int $$0) {
      ckj $$1 = this.d.get($$0);
      if ($$1.b()) {
         return ckj.b;
      } else {
         this.d.set($$0, ckj.b);
         return $$1;
      }
   }

   @Override
   public void a(int $$0, ckj $$1) {
      this.d.set($$0, $$1);
      if (!$$1.b() && $$1.L() > this.aj_()) {
         $$1.f(this.aj_());
      }

      this.e();
   }

   @Override
   public int b() {
      return this.c;
   }

   @Override
   public boolean ai_() {
      for (ckj $$0 : this.d) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void e() {
      if (this.e != null) {
         for (bhw $$0 : this.e) {
            $$0.a(this);
         }
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return true;
   }

   @Override
   public void a() {
      this.d.clear();
      this.e();
   }

   @Override
   public void a(cdb $$0) {
      for (ckj $$1 : this.d) {
         $$0.b($$1);
      }
   }

   @Override
   public String toString() {
      return this.d.stream().filter($$0 -> !$$0.b()).collect(Collectors.toList()).toString();
   }

   private void c(ckj $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         ckj $$2 = this.a($$1);
         if ($$2.b()) {
            this.a($$1, $$0.c());
            return;
         }
      }
   }

   private void d(ckj $$0) {
      for (int $$1 = 0; $$1 < this.c; $$1++) {
         ckj $$2 = this.a($$1);
         if (ckj.c($$2, $$0)) {
            this.a($$0, $$2);
            if ($$0.b()) {
               return;
            }
         }
      }
   }

   private void a(ckj $$0, ckj $$1) {
      int $$2 = Math.min(this.aj_(), $$1.g());
      int $$3 = Math.min($$0.L(), $$2 - $$1.L());
      if ($$3 > 0) {
         $$1.g($$3);
         $$0.h($$3);
         this.e();
      }
   }

   public void a(rz $$0) {
      this.a();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ckj $$2 = ckj.a($$0.a($$1));
         if (!$$2.b()) {
            this.a($$2);
         }
      }
   }

   public rz g() {
      rz $$0 = new rz();

      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         ckj $$2 = this.a($$1);
         if (!$$2.b()) {
            $$0.add($$2.b(new rt()));
         }
      }

      return $$0;
   }
}
