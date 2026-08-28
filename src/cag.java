import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class cag extends cak {
   private static final int a = 200;
   private final cfb b;
   private int c;
   private int d;

   public cag(cfb $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cfb $$0) {
      return b(200 + $$0.dT().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gs()) {
         return false;
      } else if (this.b.gp()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cfb> $$0 = $$0x -> $$0x.gr() || !$$0x.gp();
         List<? extends cfb> $$1 = this.b.dQ().a((Class<? extends cfb>)this.b.getClass(), this.b.cL().c(8.0, 8.0, 8.0), $$0);
         cfb $$2 = (cfb)DataFixUtils.orElse($$1.stream().filter(cfb::gr).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gp()));
         return this.b.gp();
      }
   }

   @Override
   public boolean c() {
      return this.b.gp() && this.b.gt();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gq();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gu();
      }
   }
}
