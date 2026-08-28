import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dan(int f) implements czw, das {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dan> d = azn.a(0, 4).xmap(dan::new, dan::a);
   public static final zt<xg, dan> e = zt.a(zr.h, dan::a, dan::new);

   @Override
   public void a(dhi $$0, bwg $$1, cxp $$2, czv $$3) {
      $$1.a(new bup(bur.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cxl.b $$0, Consumer<xv> $$1, czh $$2) {
      List<bup> $$3 = List.of(new bup(bur.E, 120000, this.f, false, false, true));
      czo.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
