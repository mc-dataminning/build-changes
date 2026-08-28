import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class cbd extends cbh {
   private static final int a = 200;
   private final cfy b;
   private int c;
   private int d;

   public cbd(cfy $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cfy $$0) {
      return b(200 + $$0.dV().a(200) % 20);
   }

   @Override
   public boolean b() {
      if (this.b.gv()) {
         return false;
      } else if (this.b.gs()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cfy> $$0 = $$0x -> $$0x.gu() || !$$0x.gs();
         List<? extends cfy> $$1 = this.b.dS().a((Class<? extends cfy>)this.b.getClass(), this.b.cO().c(8.0, 8.0, 8.0), $$0);
         cfy $$2 = (cfy)DataFixUtils.orElse($$1.stream().filter(cfy::gu).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gs()));
         return this.b.gs();
      }
   }

   @Override
   public boolean c() {
      return this.b.gs() && this.b.gw();
   }

   @Override
   public void d() {
      this.c = 0;
   }

   @Override
   public void e() {
      this.b.gt();
   }

   @Override
   public void a() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gx();
      }
   }
}
