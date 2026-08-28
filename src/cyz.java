import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cyz(int f) implements cyi, cze {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<cyz> d = ayt.a(0, 4).xmap(cyz::new, cyz::a);
   public static final zg<wt, cyz> e = zg.a(ze.h, cyz::a, cyz::new);

   @Override
   public void a(dfb $$0, bva $$1, cwb $$2, cyh $$3) {
      $$1.a(new btj(btl.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cvx.b $$0, Consumer<xi> $$1, cxt $$2) {
      List<btj> $$3 = List.of(new btj(btl.E, 120000, this.f, false, false, true));
      cya.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
