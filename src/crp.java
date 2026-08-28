import java.util.List;
import javax.annotation.Nullable;

public class crp {
   private final cro<jf<czg>> a = new cro<>();

   public void a(czk $$0) {
      if (cri.e($$0)) {
         this.b($$0);
      }
   }

   public void b(czk $$0) {
      this.a($$0, $$0.k());
   }

   public void a(czk $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public boolean a(deb<?> $$0, @Nullable cro.b<jf<czg>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(deb<?> $$0, int $$1, @Nullable cro.b<jf<czg>> $$2) {
      dea $$3 = $$0.al_();
      return $$3.c() ? false : this.a($$3.b(), $$1, $$2);
   }

   public boolean a(List<? extends cro.a<jf<czg>>> $$0, @Nullable cro.b<jf<czg>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<? extends cro.a<jf<czg>>> $$0, int $$1, @Nullable cro.b<jf<czg>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(deb<?> $$0, @Nullable cro.b<jf<czg>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(deb<?> $$0, int $$1, @Nullable cro.b<jf<czg>> $$2) {
      return this.a.b($$0.al_().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
