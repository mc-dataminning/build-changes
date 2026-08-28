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
      return b(200 + $$0.dR().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gq()) {
         return false;
      } else if (this.b.gn()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cfd> $$0 = $$0x -> $$0x.gp() || !$$0x.gn();
         List<? extends cfd> $$1 = this.b.dO().a((Class<? extends cfd>)this.b.getClass(), this.b.cK().c(8.0, 8.0, 8.0), $$0);
         cfd $$2 = (cfd)DataFixUtils.orElse($$1.stream().filter(cfd::gp).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gn()));
         return this.b.gn();
      }
   }

   @Override
   public boolean c() {
      return this.b.gn() && this.b.gr();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.go();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gs();
      }
   }
}
