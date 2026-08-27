import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cht {
   private static final Logger a = LogUtils.getLogger();
   private final chc b;
   private final chm[] c = new chm[chs.c()];
   @Nullable
   private chm d;

   public cht(chc $$0) {
      this.b = $$0;
      this.a(chs.k);
   }

   public void a(chs<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((chs<chm>)$$0);
         if (!this.b.dP().B) {
            this.b.ap().a(chc.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dP().B ? "client" : "server");
         this.d.d();
      }
   }

   public chm a() {
      return this.d;
   }

   public <T extends chm> T b(chs<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
