import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class cdj extends cdn {
   private static final int a = 200;
   private final cie b;
   private int c;
   private int d;

   public cdj(cie $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cie $$0) {
      return b(200 + $$0.dY().a(200) % 20);
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
         Predicate<cie> $$0 = $$0x -> $$0x.gs() || !$$0x.gq();
         List<? extends cie> $$1 = this.b.dV().a((Class<? extends cie>)this.b.getClass(), this.b.cR().c(8.0, 8.0, 8.0), $$0);
         cie $$2 = (cie)DataFixUtils.orElse($$1.stream().filter(cie::gs).findAny(), this.b);
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
