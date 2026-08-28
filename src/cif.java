import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cif {
   private static final Logger a = LogUtils.getLogger();
   private final cho b;
   private final chy[] c = new chy[cie.c()];
   @Nullable
   private chy d;

   public cif(cho $$0) {
      this.b = $$0;
      this.a(cie.k);
   }

   public void a(cie<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cie<chy>)$$0);
         if (!this.b.dR().B) {
            this.b.ar().a(cho.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dR().B ? "client" : "server");
         this.d.d();
      }
   }

   public chy a() {
      return this.d;
   }

   public <T extends chy> T b(cie<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
