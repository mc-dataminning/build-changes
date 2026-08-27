import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bvq extends bvu {
   private static final int a = 200;
   private final cal b;
   private int c;
   private int d;

   public bvq(cal $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cal $$0) {
      return b(200 + $$0.ef().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gr()) {
         return false;
      } else if (this.b.go()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cal> $$0 = $$0x -> $$0x.gq() || !$$0x.go();
         List<? extends cal> $$1 = this.b.dJ().a((Class<? extends cal>)this.b.getClass(), this.b.cE().c(8.0, 8.0, 8.0), $$0);
         cal $$2 = (cal)DataFixUtils.orElse($$1.stream().filter(cal::gq).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.go()));
         return this.b.go();
      }
   }

   @Override
   public boolean b() {
      return this.b.go() && this.b.gs();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gp();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gt();
      }
   }
}
