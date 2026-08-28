import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bzw extends caa {
   private static final int a = 200;
   private final cer b;
   private int c;
   private int d;

   public bzw(cer $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cer $$0) {
      return b(200 + $$0.dU().a(200) % 20);
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
         Predicate<cer> $$0 = $$0x -> $$0x.gs() || !$$0x.gq();
         List<? extends cer> $$1 = this.b.dR().a((Class<? extends cer>)this.b.getClass(), this.b.cM().c(8.0, 8.0, 8.0), $$0);
         cer $$2 = (cer)DataFixUtils.orElse($$1.stream().filter(cer::gs).findAny(), this.b);
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
