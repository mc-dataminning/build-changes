import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ciq {
   private static final Logger a = LogUtils.getLogger();
   private final chz b;
   private final cij[] c = new cij[cip.c()];
   @Nullable
   private cij d;

   public ciq(chz $$0) {
      this.b = $$0;
      this.a(cip.k);
   }

   public void a(cip<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cip<cij>)$$0);
         if (!this.b.dP().B) {
            this.b.ap().a(chz.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dP().B ? "client" : "server");
         this.d.d();
      }
   }

   public cij a() {
      return this.d;
   }

   public <T extends cij> T b(cip<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
