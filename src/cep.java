import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cep {
   private static final Logger a = LogUtils.getLogger();
   private final cdy b;
   private final cei[] c = new cei[ceo.c()];
   @Nullable
   private cei d;

   public cep(cdy $$0) {
      this.b = $$0;
      this.a(ceo.k);
   }

   public void a(ceo<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((ceo<cei>)$$0);
         if (!this.b.dM().B) {
            this.b.an().a(cdy.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dM().B ? "client" : "server");
         this.d.d();
      }
   }

   public cei a() {
      return this.d;
   }

   public <T extends cei> T b(ceo<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
