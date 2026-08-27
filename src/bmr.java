import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bmr extends bmv {
   private static final int a = 200;
   private final brk b;
   private int c;
   private int d;

   public bmr(brk $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(brk $$0) {
      return b(200 + $$0.ec().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.ge()) {
         return false;
      } else if (this.b.gb()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<brk> $$0 = $$0x -> $$0x.gd() || !$$0x.gb();
         List<? extends brk> $$1 = this.b.dI().a((Class<? extends brk>)this.b.getClass(), this.b.cE().c(8.0, 8.0, 8.0), $$0);
         brk $$2 = (brk)DataFixUtils.orElse($$1.stream().filter(brk::gd).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gb()));
         return this.b.gb();
      }
   }

   @Override
   public boolean b() {
      return this.b.gb() && this.b.gf();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gc();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gg();
      }
   }
}
