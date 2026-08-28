import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class ceb extends cef {
   private static final int a = 200;
   private final cix b;
   private int c;
   private int d;

   public ceb(cix $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cix $$0) {
      return b(200 + $$0.dX().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gw()) {
         return false;
      } else if (this.b.gt()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cix> $$0 = $$0x -> $$0x.gv() || !$$0x.gt();
         List<? extends cix> $$1 = this.b.dU().a((Class<? extends cix>)this.b.getClass(), this.b.cQ().c(8.0, 8.0, 8.0), $$0);
         cix $$2 = (cix)DataFixUtils.orElse($$1.stream().filter(cix::gv).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gt()));
         return this.b.gt();
      }
   }

   @Override
   public boolean c() {
      return this.b.gt() && this.b.gx();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gu();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gy();
      }
   }
}
