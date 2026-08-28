import java.util.List;
import javax.annotation.Nullable;

public class cqx {
   private final cqw<je<cyo>> a = new cqw<>();

   public void a(cys $$0) {
      if (cqr.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cys $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cys $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public boolean a(ddj<?> $$0, @Nullable cqw.b<je<cyo>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(ddj<?> $$0, int $$1, @Nullable cqw.b<je<cyo>> $$2) {
      ddi $$3 = $$0.ak_();
      return $$3.c() ? false : this.a($$3.b(), $$1, $$2);
   }

   public boolean a(List<? extends cqw.a<je<cyo>>> $$0, @Nullable cqw.b<je<cyo>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<? extends cqw.a<je<cyo>>> $$0, int $$1, @Nullable cqw.b<je<cyo>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(ddj<?> $$0, @Nullable cqw.b<je<cyo>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(ddj<?> $$0, int $$1, @Nullable cqw.b<je<cyo>> $$2) {
      return this.a.b($$0.ak_().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
