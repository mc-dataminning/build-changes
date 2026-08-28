import java.util.List;
import javax.annotation.Nullable;

public class crd {
   private final crc<je<cyu>> a = new crc<>();

   public void a(cyy $$0) {
      if (cqx.d($$0)) {
         this.b($$0);
      }
   }

   public void b(cyy $$0) {
      this.a($$0, $$0.k());
   }

   public void a(cyy $$0, int $$1) {
      if (!$$0.f()) {
         int $$2 = Math.min($$1, $$0.M());
         this.a.a($$0.i(), $$2);
      }
   }

   public boolean a(ddp<?> $$0, @Nullable crc.b<je<cyu>> $$1) {
      return this.a($$0, 1, $$1);
   }

   public boolean a(ddp<?> $$0, int $$1, @Nullable crc.b<je<cyu>> $$2) {
      ddo $$3 = $$0.ak_();
      return $$3.c() ? false : this.a($$3.b(), $$1, $$2);
   }

   public boolean a(List<? extends crc.a<je<cyu>>> $$0, @Nullable crc.b<je<cyu>> $$1) {
      return this.a($$0, 1, $$1);
   }

   private boolean a(List<? extends crc.a<je<cyu>>> $$0, int $$1, @Nullable crc.b<je<cyu>> $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   public int b(ddp<?> $$0, @Nullable crc.b<je<cyu>> $$1) {
      return this.b($$0, Integer.MAX_VALUE, $$1);
   }

   public int b(ddp<?> $$0, int $$1, @Nullable crc.b<je<cyu>> $$2) {
      return this.a.b($$0.ak_().b(), $$1, $$2);
   }

   public void a() {
      this.a.a();
   }
}
