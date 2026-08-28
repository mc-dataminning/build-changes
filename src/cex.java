import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class cex extends cfb {
   private static final int a = 200;
   private final cjt b;
   private int c;
   private int d;

   public cex(cjt $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cjt $$0) {
      return b(200 + $$0.dY().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gA()) {
         return false;
      } else if (this.b.gx()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cjt> $$0 = $$0x -> $$0x.gz() || !$$0x.gx();
         List<? extends cjt> $$1 = this.b.dV().a((Class<? extends cjt>)this.b.getClass(), this.b.cR().c(8.0, 8.0, 8.0), $$0);
         cjt $$2 = (cjt)DataFixUtils.orElse($$1.stream().filter(cjt::gz).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gx()));
         return this.b.gx();
      }
   }

   @Override
   public boolean c() {
      return this.b.gx() && this.b.gB();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gy();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gC();
      }
   }
}
