import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bsc extends bsg {
   private static final int a = 200;
   private final bwv b;
   private int c;
   private int d;

   public bsc(bwv $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(bwv $$0) {
      return b(200 + $$0.eh().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gl()) {
         return false;
      } else if (this.b.gi()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<bwv> $$0 = $$0x -> $$0x.gk() || !$$0x.gi();
         List<? extends bwv> $$1 = this.b.dN().a((Class<? extends bwv>)this.b.getClass(), this.b.cH().c(8.0, 8.0, 8.0), $$0);
         bwv $$2 = (bwv)DataFixUtils.orElse($$1.stream().filter(bwv::gk).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gi()));
         return this.b.gi();
      }
   }

   @Override
   public boolean b() {
      return this.b.gi() && this.b.gm();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gj();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gn();
      }
   }
}
