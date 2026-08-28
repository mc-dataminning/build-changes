import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dmy extends doq implements djq {
   public static final MapCodec<dmy> a = b(dmy::new);
   private final dor e = new dor(this);

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   public dmy(dwx.d $$0) {
      super($$0);
   }

   public static ToIntFunction<dwy> b(int $$0) {
      return $$1 -> dop.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return jn.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(dwy $$0) {
      return $$0.y().c();
   }

   @Override
   public dor c() {
      return this.e;
   }
}
