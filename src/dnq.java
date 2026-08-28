import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dnq extends dpj implements dkh {
   public static final MapCodec<dnq> a = b(dnq::new);
   private final dpk e = new dpk(this);

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dxp.d $$0) {
      super($$0);
   }

   public static ToIntFunction<dxq> b(int $$0) {
      return $$1 -> dpi.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return jn.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(dxq $$0) {
      return $$0.y().c();
   }

   @Override
   public dpk c() {
      return this.e;
   }
}
