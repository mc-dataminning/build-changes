import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record cyr(int f) implements cyc, cyw {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<cyr> d = aym.a(0, 4).xmap(cyr::new, cyr::a);
   public static final zb<wo, cyr> e = zb.a(yz.g, cyr::a, cyr::new);

   @Override
   public void a(deg $$0, buk $$1, cvp $$2, cyb $$3) {
      $$1.a(new bsv(bsx.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cvk.b $$0, Consumer<xd> $$1, cxh $$2) {
      List<bsv> $$3 = List.of(new bsv(bsx.E, 120000, this.f, false, false, true));
      cxo.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
