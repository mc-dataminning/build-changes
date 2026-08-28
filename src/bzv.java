import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bzv extends bzz {
   private static final int a = 200;
   private final ceq b;
   private int c;
   private int d;

   public bzv(ceq $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(ceq $$0) {
      return b(200 + $$0.dT().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gu()) {
         return false;
      } else if (this.b.gr()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<ceq> $$0 = $$0x -> $$0x.gt() || !$$0x.gr();
         List<? extends ceq> $$1 = this.b.dQ().a((Class<? extends ceq>)this.b.getClass(), this.b.cL().c(8.0, 8.0, 8.0), $$0);
         ceq $$2 = (ceq)DataFixUtils.orElse($$1.stream().filter(ceq::gt).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gr()));
         return this.b.gr();
      }
   }

   @Override
   public boolean b() {
      return this.b.gr() && this.b.gv();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gs();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gw();
      }
   }
}
