import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class ccb extends ccf {
   private static final int a = 200;
   private final cgw b;
   private int c;
   private int d;

   public ccb(cgw $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cgw $$0) {
      return b(200 + $$0.dY().a(200) % 20);
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
         Predicate<cgw> $$0 = $$0x -> $$0x.gr() || !$$0x.gp();
         List<? extends cgw> $$1 = this.b.dV().a((Class<? extends cgw>)this.b.getClass(), this.b.cR().c(8.0, 8.0, 8.0), $$0);
         cgw $$2 = (cgw)DataFixUtils.orElse($$1.stream().filter(cgw::gr).findAny(), this.b);
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
