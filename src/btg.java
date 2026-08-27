import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class btg extends btk {
   private static final int a = 200;
   private final byb b;
   private int c;
   private int d;

   public btg(byb $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(byb $$0) {
      return b(200 + $$0.eg().a(200) % 20);
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
         Predicate<byb> $$0 = $$0x -> $$0x.gk() || !$$0x.gi();
         List<? extends byb> $$1 = this.b.dL().a((Class<? extends byb>)this.b.getClass(), this.b.cH().c(8.0, 8.0, 8.0), $$0);
         byb $$2 = (byb)DataFixUtils.orElse($$1.stream().filter(byb::gk).findAny(), this.b);
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
