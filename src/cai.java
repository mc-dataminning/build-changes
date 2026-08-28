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
      return b(200 + $$0.dS().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gr()) {
         return false;
      } else if (this.b.go()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cfd> $$0 = $$0x -> $$0x.gq() || !$$0x.go();
         List<? extends cfd> $$1 = this.b.dP().a((Class<? extends cfd>)this.b.getClass(), this.b.cL().c(8.0, 8.0, 8.0), $$0);
         cfd $$2 = (cfd)DataFixUtils.orElse($$1.stream().filter(cfd::gq).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.go()));
         return this.b.go();
      }
   }

   @Override
   public boolean c() {
      return this.b.go() && this.b.gs();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gp();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gt();
      }
   }
}
