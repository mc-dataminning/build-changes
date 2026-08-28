import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dae(int f) implements czn, daj {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dae> d = azd.a(0, 4).xmap(dae::new, dae::a);
   public static final zi<wv, dae> e = zi.a(zg.h, dae::a, dae::new);

   @Override
   public void a(dgz $$0, bvx $$1, cxg $$2, czm $$3) {
      $$1.a(new bug(bui.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cxc.b $$0, Consumer<xk> $$1, cyy $$2) {
      List<bug> $$3 = List.of(new bug(bui.E, 120000, this.f, false, false, true));
      czf.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
