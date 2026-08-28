import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class cai extends cam {
   private static final int a = 200;
   private final cfd b;
   private int c;
   private int d;

   public cai(cfd $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cfd $$0) {
      return b(200 + $$0.el().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gw()) {
         return false;
      } else if (this.b.gt()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cfd> $$0 = $$0x -> $$0x.gv() || !$$0x.gt();
         List<? extends cfd> $$1 = this.b.dP().a((Class<? extends cfd>)this.b.getClass(), this.b.cK().c(8.0, 8.0, 8.0), $$0);
         cfd $$2 = (cfd)DataFixUtils.orElse($$1.stream().filter(cfd::gv).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gt()));
         return this.b.gt();
      }
   }

   @Override
   public boolean b() {
      return this.b.gt() && this.b.gx();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gu();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gy();
      }
   }
}
