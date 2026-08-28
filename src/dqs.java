import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dqs extends dsl implements dnh {
   public static final MapCodec<dqs> a = b(dqs::new);
   private final dsm e = new dsm(this);

   @Override
   public MapCodec<dqs> a() {
      return a;
   }

   public dqs(ebf.d $$0) {
      super($$0);
   }

   public static ToIntFunction<ebg> b(int $$0) {
      return $$1 -> dsk.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return jc.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(ebg $$0) {
      return $$0.y().c();
   }

   @Override
   public dsm c() {
      return this.e;
   }
}
