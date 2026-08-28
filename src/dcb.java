import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dcb(int f) implements dbj, dci {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dcb> d = ayu.a(0, 4).xmap(dcb::new, dcb::a);
   public static final yw<wj, dcb> e = yw.a(yu.h, dcb::a, dcb::new);

   @Override
   public void a(dja $$0, bxe $$1, czd $$2, dbi $$3) {
      $$1.a(new bvj(bvl.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      List<bvj> $$4 = List.of(new bvj(bvl.E, 120000, this.f, false, false, true));
      daz.a($$4, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
