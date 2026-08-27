import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bra extends bre {
   private static final int a = 200;
   private final bvt b;
   private int c;
   private int d;

   public bra(bvt $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(bvt $$0) {
      return b(200 + $$0.ef().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gk()) {
         return false;
      } else if (this.b.gh()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<bvt> $$0 = $$0x -> $$0x.gj() || !$$0x.gh();
         List<? extends bvt> $$1 = this.b.dL().a((Class<? extends bvt>)this.b.getClass(), this.b.cG().c(8.0, 8.0, 8.0), $$0);
         bvt $$2 = (bvt)DataFixUtils.orElse($$1.stream().filter(bvt::gj).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gh()));
         return this.b.gh();
      }
   }

   @Override
   public boolean b() {
      return this.b.gh() && this.b.gl();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gi();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gm();
      }
   }
}
