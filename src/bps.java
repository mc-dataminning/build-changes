import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class bps extends bpw {
   private static final int a = 200;
   private final bul b;
   private int c;
   private int d;

   public bps(bul $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(bul $$0) {
      return b(200 + $$0.ee().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gg()) {
         return false;
      } else if (this.b.gd()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<bul> $$0 = $$0x -> $$0x.gf() || !$$0x.gd();
         List<? extends bul> $$1 = this.b.dK().a((Class<? extends bul>)this.b.getClass(), this.b.cG().c(8.0, 8.0, 8.0), $$0);
         bul $$2 = (bul)DataFixUtils.orElse($$1.stream().filter(bul::gf).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gd()));
         return this.b.gd();
      }
   }

   @Override
   public boolean b() {
      return this.b.gd() && this.b.gh();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.ge();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gi();
      }
   }
}
