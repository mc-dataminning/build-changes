import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dci(int f) implements dbq, dcp {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dci> d = ayu.a(0, 4).xmap(dci::new, dci::a);
   public static final yw<wj, dci> e = yw.a(yu.h, dci::a, dci::new);

   @Override
   public void a(djh $$0, bxj $$1, czk $$2, dbp $$3) {
      $$1.a(new bvm(bvo.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      List<bvm> $$4 = List.of(new bvm(bvo.E, 120000, this.f, false, false, true));
      dbg.a($$4, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
