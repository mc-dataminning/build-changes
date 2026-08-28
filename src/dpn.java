import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dpn extends drg implements dmd {
   public static final MapCodec<dpn> a = b(dpn::new);
   private final drh e = new drh(this);

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   public dpn(dzy.d $$0) {
      super($$0);
   }

   public static ToIntFunction<dzz> b(int $$0) {
      return $$1 -> drf.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return ja.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(dzz $$0) {
      return $$0.y().c();
   }

   @Override
   public drh c() {
      return this.e;
   }
}
