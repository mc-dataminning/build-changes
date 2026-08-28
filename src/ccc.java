import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class ccc extends ccg {
   private static final int a = 200;
   private final cgx b;
   private int c;
   private int d;

   public ccc(cgx $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cgx $$0) {
      return b(200 + $$0.dY().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gx()) {
         return false;
      } else if (this.b.gu()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cgx> $$0 = $$0x -> $$0x.gw() || !$$0x.gu();
         List<? extends cgx> $$1 = this.b.dV().a((Class<? extends cgx>)this.b.getClass(), this.b.cR().c(8.0, 8.0, 8.0), $$0);
         cgx $$2 = (cgx)DataFixUtils.orElse($$1.stream().filter(cgx::gw).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gu()));
         return this.b.gu();
      }
   }

   @Override
   public boolean c() {
      return this.b.gu() && this.b.gy();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gv();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gz();
      }
   }
}
