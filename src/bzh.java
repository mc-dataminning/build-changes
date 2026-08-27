import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bzh extends bzl {
   private static final int a = 200;
   private final ced b;
   private int c;
   private int d;

   public bzh(ced $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(ced $$0) {
      return b(200 + $$0.et().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gE()) {
         return false;
      } else if (this.b.gB()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<ced> $$0 = $$0x -> $$0x.gD() || !$$0x.gB();
         List<? extends ced> $$1 = this.b.dU().a((Class<? extends ced>)this.b.getClass(), this.b.cP().c(8.0, 8.0, 8.0), $$0);
         ced $$2 = (ced)DataFixUtils.orElse($$1.stream().filter(ced::gD).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gB()));
         return this.b.gB();
      }
   }

   @Override
   public boolean b() {
      return this.b.gB() && this.b.gF();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gC();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gG();
      }
   }
}
