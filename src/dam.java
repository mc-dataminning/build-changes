import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dam(int f) implements czv, dar {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dam> d = azn.a(0, 4).xmap(dam::new, dam::a);
   public static final zt<xg, dam> e = zt.a(zr.h, dam::a, dam::new);

   @Override
   public void a(dhh $$0, bwf $$1, cxo $$2, czu $$3) {
      $$1.a(new buo(buq.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cxk.b $$0, Consumer<xv> $$1, czg $$2) {
      List<buo> $$3 = List.of(new buo(buq.E, 120000, this.f, false, false, true));
      czn.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
