import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dmw extends doo implements djo {
   public static final MapCodec<dmw> a = b(dmw::new);
   private final dop e = new dop(this);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(dwv.d $$0) {
      super($$0);
   }

   public static ToIntFunction<dww> b(int $$0) {
      return $$1 -> don.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return jn.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(dww $$0) {
      return $$0.y().c();
   }

   @Override
   public dop c() {
      return this.e;
   }
}
