import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class cby extends ccc {
   private static final int a = 200;
   private final cgt b;
   private int c;
   private int d;

   public cby(cgt $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cgt $$0) {
      return b(200 + $$0.eb().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gB()) {
         return false;
      } else if (this.b.gy()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cgt> $$0 = $$0x -> $$0x.gA() || !$$0x.gy();
         List<? extends cgt> $$1 = this.b.dY().a((Class<? extends cgt>)this.b.getClass(), this.b.cT().c(8.0, 8.0, 8.0), $$0);
         cgt $$2 = (cgt)DataFixUtils.orElse($$1.stream().filter(cgt::gA).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gy()));
         return this.b.gy();
      }
   }

   @Override
   public boolean c() {
      return this.b.gy() && this.b.gC();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gz();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gD();
      }
   }
}
