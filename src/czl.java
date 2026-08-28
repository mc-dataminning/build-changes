import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record czl(int f) implements cyu, czq {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<czl> d = ayh.a(0, 4).xmap(czl::new, czl::a);
   public static final ym<vz, czl> e = ym.a(yk.h, czl::a, czl::new);

   @Override
   public void a(dgg $$0, bvf $$1, cwn $$2, cyt $$3) {
      $$1.a(new bto(btq.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cwj.b $$0, Consumer<wo> $$1, cyf $$2) {
      List<bto> $$3 = List.of(new bto(btq.E, 120000, this.f, false, false, true));
      cym.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
