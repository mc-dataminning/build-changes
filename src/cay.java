import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class cay extends cbc {
   private static final int a = 200;
   private final cft b;
   private int c;
   private int d;

   public cay(cft $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cft $$0) {
      return b(200 + $$0.dV().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gu()) {
         return false;
      } else if (this.b.gr()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cft> $$0 = $$0x -> $$0x.gt() || !$$0x.gr();
         List<? extends cft> $$1 = this.b.dS().a((Class<? extends cft>)this.b.getClass(), this.b.cO().c(8.0, 8.0, 8.0), $$0);
         cft $$2 = (cft)DataFixUtils.orElse($$1.stream().filter(cft::gt).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gr()));
         return this.b.gr();
      }
   }

   @Override
   public boolean c() {
      return this.b.gr() && this.b.gv();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gs();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gw();
      }
   }
}
