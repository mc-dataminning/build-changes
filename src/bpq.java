import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bpq extends bpu {
   private static final int a = 200;
   private final buj b;
   private int c;
   private int d;

   public bpq(buj $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(buj $$0) {
      return b(200 + $$0.ee().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gf()) {
         return false;
      } else if (this.b.gc()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<buj> $$0 = $$0x -> $$0x.ge() || !$$0x.gc();
         List<? extends buj> $$1 = this.b.dK().a((Class<? extends buj>)this.b.getClass(), this.b.cG().c(8.0, 8.0, 8.0), $$0);
         buj $$2 = (buj)DataFixUtils.orElse($$1.stream().filter(buj::ge).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gc()));
         return this.b.gc();
      }
   }

   @Override
   public boolean b() {
      return this.b.gc() && this.b.gg();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gd();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gh();
      }
   }
}
