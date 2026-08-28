import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckl {
   private static final Logger a = LogUtils.getLogger();
   private final cju b;
   private final cke[] c = new cke[ckk.c()];
   @Nullable
   private cke d;

   public ckl(cju $$0) {
      this.b = $$0;
      this.a(ckk.k);
   }

   public void a(ckk<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((ckk<cke>)$$0);
         if (!this.b.dV().C) {
            this.b.au().a(cju.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public cke a() {
      return this.d;
   }

   public <T extends cke> T b(ckk<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
