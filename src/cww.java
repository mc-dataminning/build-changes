import java.util.Optional;
import javax.annotation.Nullable;

public class cww extends cwz {
   private final int b;
   private final int c;
   private final int d;
   private final Optional<avt<bqg<?>>> e;

   public cww(cwz.a $$0, int $$1, int $$2, int $$3, Optional<avt<bqg<?>>> $$4, bqh... $$5) {
      super($$0, avm.bh, $$5);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   public int a(int $$0) {
      return this.b + ($$0 - 1) * this.c;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + this.d;
   }

   @Override
   public int a() {
      return 5;
   }

   @Override
   public float a(int $$0, @Nullable bqg<?> $$1) {
      if (this.e.isEmpty()) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else {
         return $$1 != null && $$1.a(this.e.get()) ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(cwz $$0) {
      return !($$0 instanceof cww);
   }

   @Override
   public void a(bqt $$0, bqa $$1, int $$2) {
      if (this.e.isPresent() && $$1 instanceof bqt $$3 && this.e.get() == avh.v && $$2 > 0 && $$3.ai().a(this.e.get())) {
         int $$4 = 20 + $$0.ei().a(10 * $$2);
         $$3.b(new bpm(bpo.b, $$4, 3));
      }
   }
}
