import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dcw(int f) implements dce, ddd {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dcw> d = ayw.a(0, 4).xmap(dcw::new, dcw::a);
   public static final yy<wl, dcw> e = yy.a(yw.h, dcw::a, dcw::new);

   @Override
   public void a(djx $$0, bxu $$1, czy $$2, dcd $$3) {
      $$1.a(new bvx(bvz.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      List<bvx> $$4 = List.of(new bvx(bvz.E, 120000, this.f, false, false, true));
      dbu.a($$4, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
