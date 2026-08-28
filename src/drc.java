import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class drc extends dsv implements dnr {
   public static final MapCodec<drc> a = b(drc::new);
   private final dsw e = new dsw(this);

   @Override
   public MapCodec<drc> a() {
      return a;
   }

   public drc(ebp.d $$0) {
      super($$0);
   }

   public static ToIntFunction<ebq> b(int $$0) {
      return $$1 -> dsu.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return jc.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(ebq $$0) {
      return $$0.y().c();
   }

   @Override
   public dsw c() {
      return this.e;
   }
}
