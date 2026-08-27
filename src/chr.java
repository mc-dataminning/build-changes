import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chr {
   private static final Logger a = LogUtils.getLogger();
   private final cha b;
   private final chk[] c = new chk[chq.c()];
   @Nullable
   private chk d;

   public chr(cha $$0) {
      this.b = $$0;
      this.a(chq.k);
   }

   public void a(chq<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((chq<chk>)$$0);
         if (!this.b.dU().C) {
            this.b.ap().a(cha.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dU().C ? "client" : "server");
         this.d.d();
      }
   }

   public chk a() {
      return this.d;
   }

   public <T extends chk> T b(chq<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
