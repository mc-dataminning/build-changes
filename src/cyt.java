import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cyt(int f) implements cye, cyy {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<cyt> d = ays.a(0, 4).xmap(cyt::new, cyt::a);
   public static final zf<ws, cyt> e = zf.a(zd.h, cyt::a, cyt::new);

   @Override
   public void a(dev $$0, buv $$1, cvx $$2, cyd $$3) {
      $$1.a(new bte(btg.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cvt.b $$0, Consumer<xh> $$1, cxp $$2) {
      List<bte> $$3 = List.of(new bte(btg.E, 120000, this.f, false, false, true));
      cxw.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
