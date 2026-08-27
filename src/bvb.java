import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bvb extends bvf {
   private static final int a = 200;
   private final bzw b;
   private int c;
   private int d;

   public bvb(bzw $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(bzw $$0) {
      return b(200 + $$0.eh().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gm()) {
         return false;
      } else if (this.b.gj()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<bzw> $$0 = $$0x -> $$0x.gl() || !$$0x.gj();
         List<? extends bzw> $$1 = this.b.dM().a((Class<? extends bzw>)this.b.getClass(), this.b.cH().c(8.0, 8.0, 8.0), $$0);
         bzw $$2 = (bzw)DataFixUtils.orElse($$1.stream().filter(bzw::gl).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gj()));
         return this.b.gj();
      }
   }

   @Override
   public boolean b() {
      return this.b.gj() && this.b.gn();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gk();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.go();
      }
   }
}
