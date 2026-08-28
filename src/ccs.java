import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class ccs extends ccw {
   private static final int a = 200;
   private final chn b;
   private int c;
   private int d;

   public ccs(chn $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(chn $$0) {
      return b(200 + $$0.dX().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gv()) {
         return false;
      } else if (this.b.gs()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<chn> $$0 = $$0x -> $$0x.gu() || !$$0x.gs();
         List<? extends chn> $$1 = this.b.dU().a((Class<? extends chn>)this.b.getClass(), this.b.cQ().c(8.0, 8.0, 8.0), $$0);
         chn $$2 = (chn)DataFixUtils.orElse($$1.stream().filter(chn::gu).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gs()));
         return this.b.gs();
      }
   }

   @Override
   public boolean c() {
      return this.b.gs() && this.b.gw();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gt();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gx();
      }
   }
}
