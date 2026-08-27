import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class buf extends bud {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   @Nullable
   private eei d;
   private int e;

   public buf(bub $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.d == null) {
         b.warn("Aborting charge player as no target was set.");
         this.a.fW().a(bur.a);
      } else if (this.e > 0 && this.e++ >= 10) {
         this.a.fW().a(bur.a);
      } else {
         double $$0 = this.d.c(this.a.dn(), this.a.dp(), this.a.dt());
         if ($$0 < 100.0 || $$0 > 22500.0 || this.a.O || this.a.P) {
            this.e++;
         }
      }
   }

   @Override
   public void d() {
      this.d = null;
      this.e = 0;
   }

   public void a(eei $$0) {
      this.d = $$0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public eei g() {
      return this.d;
   }

   @Override
   public bur<buf> i() {
      return bur.i;
   }
}
