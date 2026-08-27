import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class byt extends byx {
   private static final int a = 200;
   private final cdo b;
   private int c;
   private int d;

   public byt(cdo $$0) {
      this.b = $$0;
      this.d = this.a($$0);
   }

   protected int a(cdo $$0) {
      return b(200 + $$0.ej().a(200) % 20);
   }

   @Override
   public boolean a() {
      if (this.b.gv()) {
         return false;
      } else if (this.b.gs()) {
         return true;
      } else if (this.d > 0) {
         this.d--;
         return false;
      } else {
         this.d = this.a(this.b);
         Predicate<cdo> $$0 = $$0x -> $$0x.gu() || !$$0x.gs();
         List<? extends cdo> $$1 = this.b.dN().a((Class<? extends cdo>)this.b.getClass(), this.b.cI().c(8.0, 8.0, 8.0), $$0);
         cdo $$2 = (cdo)DataFixUtils.orElse($$1.stream().filter(cdo::gu).findAny(), this.b);
         $$2.a($$1.stream().filter($$0x -> !$$0x.gs()));
         return this.b.gs();
      }
   }

   @Override
   public boolean b() {
      return this.b.gs() && this.b.gw();
   }

   @Override
   public void c() {
      this.c = 0;
   }

   @Override
   public void d() {
      this.b.gt();
   }

   @Override
   public void e() {
      if (--this.c <= 0) {
         this.c = this.a(10);
         this.b.gx();
      }
   }
}
