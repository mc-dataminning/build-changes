import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbr extends fau {
   static final MapCodec<fbr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fdn.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, fbr::new));
   private final fdm b;

   private fbr(List<fcq> $$0, fdm $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public faw<fbr> b() {
      return fax.Q;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      int $$2 = azm.a(this.b.a($$1), 0, 4);
      $$0.b(kj.ad, new dcb($$2));
      return $$0;
   }

   public fdm c() {
      return this.b;
   }

   public static fau.a<?> a(fdm $$0) {
      return a($$1 -> new fbr($$1, $$0));
   }
}
