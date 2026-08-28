import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cno {
   private static final Logger a = LogUtils.getLogger();
   private final cmx b;
   private final cnh[] c = new cnh[cnn.c()];
   @Nullable
   private cnh d;

   public cno(cmx $$0) {
      this.b = $$0;
      this.a(cnn.k);
   }

   public void a(cnn<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((cnn<cnh>)$$0);
         if (!this.b.dV().C) {
            this.b.ar().a(cmx.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.dV().C ? "client" : "server");
         this.d.c();
      }
   }

   public cnh a() {
      return this.d;
   }

   public <T extends cnh> T b(cnn<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
