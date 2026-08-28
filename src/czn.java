import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czn(int f) implements cyw, czs {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<czn> d = ayi.a(0, 4).xmap(czn::new, czn::a);
   public static final ym<vz, czn> e = ym.a(yk.h, czn::a, czn::new);

   @Override
   public void a(dgi $$0, bvg $$1, cwp $$2, cyv $$3) {
      $$1.a(new btp(btr.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cwl.b $$0, Consumer<wo> $$1, cyh $$2) {
      List<btp> $$3 = List.of(new btp(btr.E, 120000, this.f, false, false, true));
      cyo.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
