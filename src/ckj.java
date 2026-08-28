import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckj {
   private static final Logger a = LogUtils.getLogger();
   private final cjs b;
   private final ckc[] c = new ckc[cki.c()];
   @Nullable
   private ckc d;

   public ckj(cjs $$0) {
      this.b = $$0;
      this.a(cki.k);
   }

   public void a(cki<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((cki<ckc>)$$0);
         if (!this.b.dY().C) {
            this.b.aw().a(cjs.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dY().C ? "client" : "server");
         this.d.d();
      }
   }

   public ckc a() {
      return this.d;
   }

   public <T extends ckc> T b(cki<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
