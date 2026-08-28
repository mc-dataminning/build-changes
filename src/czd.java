import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czd(int f) implements cym, czi {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<czd> d = ayw.a(0, 4).xmap(czd::new, czd::a);
   public static final zj<ww, czd> e = zj.a(zh.h, czd::a, czd::new);

   @Override
   public void a(dff $$0, bve $$1, cwf $$2, cyl $$3) {
      $$1.a(new btn(btp.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cwb.b $$0, Consumer<xl> $$1, cxx $$2) {
      List<btn> $$3 = List.of(new btn(btp.E, 120000, this.f, false, false, true));
      cye.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
