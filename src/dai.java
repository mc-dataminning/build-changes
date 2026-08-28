import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dai(int f) implements czr, dan {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dai> d = azn.a(0, 4).xmap(dai::new, dai::a);
   public static final zt<xg, dai> e = zt.a(zr.h, dai::a, dai::new);

   @Override
   public void a(dha $$0, bwb $$1, cxk $$2, czq $$3) {
      $$1.a(new buk(bum.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cxg.b $$0, Consumer<xv> $$1, czc $$2) {
      List<buk> $$3 = List.of(new buk(bum.E, 120000, this.f, false, false, true));
      czj.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
