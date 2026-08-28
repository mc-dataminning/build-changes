import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bzs extends bzw {
   private static final int a = 200;
   private final cen b;
   private int c;
   private int d;

   public bzs(cen $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cen $$0) {
      return b(200 + $$0.dS().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gt()) {
         return false;
      } else if (this.b.gq()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cen> $$0 = $$0x -> $$0x.gs() || !$$0x.gq();
         List<? extends cen> $$1 = this.b.dP().a((Class<? extends cen>)this.b.getClass(), this.b.cK().c(8.0, 8.0, 8.0), $$0);
         cen $$2 = (cen)DataFixUtils.orElse($$1.stream().filter(cen::gs).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gq()));
         return this.b.gq();
      }
   }

   @Override
   public boolean b() {
      return this.b.gq() && this.b.gu();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gr();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gv();
      }
   }
}
