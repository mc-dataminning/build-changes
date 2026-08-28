import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class cda extends cde {
   private static final int a = 200;
   private final chv b;
   private int c;
   private int d;

   public cda(chv $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(chv $$0) {
      return b(200 + $$0.dZ().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gt()) {
         return false;
      } else if (this.b.gq()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<chv> $$0 = $$0x -> $$0x.gs() || !$$0x.gq();
         List<? extends chv> $$1 = this.b.dW().a((Class<? extends chv>)this.b.getClass(), this.b.cR().c(8.0, 8.0, 8.0), $$0);
         chv $$2 = (chv)DataFixUtils.orElse($$1.stream().filter(chv::gs).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gq()));
         return this.b.gq();
      }
   }

   @Override
   public boolean c() {
      return this.b.gq() && this.b.gu();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gr();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gv();
      }
   }
}
