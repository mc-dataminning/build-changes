import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dbw(int f) implements dbe, dcd {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dbw> d = ayu.a(0, 4).xmap(dbw::new, dbw::a);
   public static final yw<wj, dbw> e = yw.a(yu.h, dbw::a, dbw::new);

   @Override
   public void a(div $$0, bxc $$1, cyy $$2, dbd $$3) {
      $$1.a(new bvh(bvj.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      List<bvh> $$4 = List.of(new bvh(bvj.E, 120000, this.f, false, false, true));
      dau.a($$4, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
