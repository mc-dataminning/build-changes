import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dcy(int f) implements dcg, ddf {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dcy> d = ayy.a(0, 4).xmap(dcy::new, dcy::a);
   public static final za<wn, dcy> e = za.a(yy.h, dcy::a, dcy::new);

   @Override
   public void a(djz $$0, bxw $$1, daa $$2, dcf $$3) {
      $$1.a(new bvz(bwb.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      List<bvz> $$4 = List.of(new bvz(bwb.E, 120000, this.f, false, false, true));
      dbw.a($$4, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
