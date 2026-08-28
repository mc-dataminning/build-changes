import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dat(int f) implements dac, day {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dat> d = ays.a(0, 4).xmap(dat::new, dat::a);
   public static final yt<wg, dat> e = yt.a(yr.h, dat::a, dat::new);

   @Override
   public void a(dhp $$0, bwr $$1, cxy $$2, dab $$3) {
      $$1.a(new buw(buy.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cxu.b $$0, Consumer<wv> $$1, czn $$2) {
      List<buw> $$3 = List.of(new buw(buy.E, 120000, this.f, false, false, true));
      czu.a($$3, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
