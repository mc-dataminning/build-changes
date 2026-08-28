import java.util.List;
import javax.annotation.Nullable;

public class csd {
   private final csc<jf<czu>> a = new csc<>();

   public void a(czy $$0) {
      if (crw.e($$0)) {
         this.b($$0);
      }
   }

   public void b(czy $$0) {
      this.a($$0, $$0.k());
   }

   public void a(czy $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public boolean a(dep<?> $$0, @Nullable csc.b<jf<czu>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(dep<?> $$0, int $$1, @Nullable csc.b<jf<czu>> $$2) {
      deo $$3 = $$0.ap_();
      return $$3.c() ? false : this.a($$3.b(), $$1, $$2);
   }

   public boolean a(List<? extends csc.a<jf<czu>>> $$0, @Nullable csc.b<jf<czu>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<? extends csc.a<jf<czu>>> $$0, int $$1, @Nullable csc.b<jf<czu>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(dep<?> $$0, @Nullable csc.b<jf<czu>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(dep<?> $$0, int $$1, @Nullable csc.b<jf<czu>> $$2) {
      return this.a.b($$0.ap_().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
