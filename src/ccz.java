import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class ccz extends cdd {
   private static final int a = 200;
   private final chu b;
   private int c;
   private int d;

   public ccz(chu $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(chu $$0) {
      return b(200 + $$0.dZ().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gt()) {
         return false;
      } else if (this.b.gq()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<chu> $$0 = $$0x -> $$0x.gs() || !$$0x.gq();
         List<? extends chu> $$1 = this.b.dW().a((Class<? extends chu>)this.b.getClass(), this.b.cR().c(8.0, 8.0, 8.0), $$0);
         chu $$2 = (chu)DataFixUtils.orElse($$1.stream().filter(chu::gs).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gq()));
         return this.b.gq();
      }
   }

   @Override
   public boolean c() {
      return this.b.gq() && this.b.gu();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gr();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gv();
      }
   }
}
