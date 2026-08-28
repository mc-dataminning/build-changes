import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czk(int f) implements cyt, czp {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<czk> d = ayv.a(0, 4).xmap(czk::new, czk::a);
   public static final zh<wu, czk> e = zh.a(zf.h, czk::a, czk::new);

   @Override
   public void a(dfm $$0, bvh $$1, cwm $$2, cys $$3) {
      $$1.a(new btq(bts.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cwi.b $$0, Consumer<xj> $$1, cye $$2) {
      List<btq> $$3 = List.of(new btq(bts.E, 120000, this.f, false, false, true));
      cyl.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
