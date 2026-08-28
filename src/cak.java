import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class cak extends cao {
   private static final int a = 200;
   private final cff b;
   private int c;
   private int d;

   public cak(cff $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cff $$0) {
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
         Predicate<cff> $$0 = $$0x -> $$0x.gv() || !$$0x.gt();
         List<? extends cff> $$1 = this.b.dP().a((Class<? extends cff>)this.b.getClass(), this.b.cK().c(8.0, 8.0, 8.0), $$0);
         cff $$2 = (cff)DataFixUtils.orElse($$1.stream().filter(cff::gv).findAny(), this.b);
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
