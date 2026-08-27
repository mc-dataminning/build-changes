import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bxy {
   private static final Logger a = LogUtils.getLogger();
   private final bxh b;
   private final bxr[] c = new bxr[bxx.c()];
   @Nullable
   private bxr d;

   public bxy(bxh $$0) {
      this.b = $$0;
      this.a(bxx.k);
   }

   public void a(bxx<?> $$0) {
      if (this.d == null || $$0 != this.d.i()) {
         if (this.d != null) {
            this.d.e();
         }

         this.d = this.b((bxx<bxr>)$$0);
         if (!this.b.dL().B) {
            this.b.am().b(bxh.b, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dL().B ? "client" : "server");
         this.d.d();
      }
   }

   public bxr a() {
      return this.d;
   }

   public <T extends bxr> T b(bxx<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
