import java.util.List;
import javax.annotation.Nullable;

public class crs {
   private final crr<jf<czj>> a = new crr<>();

   public void a(czn $$0) {
      if (crl.e($$0)) {
         this.b($$0);
      }
   }

   public void b(czn $$0) {
      this.a($$0, $$0.k());
   }

   public void a(czn $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public boolean a(dee<?> $$0, @Nullable crr.b<jf<czj>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dee<?> $$0, int $$1, @Nullable crr.b<jf<czj>> $$2) {
      ded $$3 = $$0.al_();
      return $$3.c() ? false : this.a($$3.b(), $$1, $$2);
   }

   public boolean a(List<? extends crr.a<jf<czj>>> $$0, @Nullable crr.b<jf<czj>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<? extends crr.a<jf<czj>>> $$0, int $$1, @Nullable crr.b<jf<czj>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(dee<?> $$0, @Nullable crr.b<jf<czj>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dee<?> $$0, int $$1, @Nullable crr.b<jf<czj>> $$2) {
      return this.a.b($$0.al_().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
