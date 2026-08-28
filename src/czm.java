import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czm(int f) implements cyv, czr {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<czm> d = ayi.a(0, 4).xmap(czm::new, czm::a);
   public static final yn<wa, czm> e = yn.a(yl.h, czm::a, czm::new);

   @Override
   public void a(dgh $$0, bvg $$1, cwo $$2, cyu $$3) {
      $$1.a(new btp(btr.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cwk.b $$0, Consumer<wp> $$1, cyg $$2) {
      List<btp> $$3 = List.of(new btp(btr.E, 120000, this.f, false, false, true));
      cyn.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
