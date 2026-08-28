import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dbq(int f) implements day, dbx {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dbq> d = ays.a(0, 4).xmap(dbq::new, dbq::a);
   public static final yu<wh, dbq> e = yu.a(ys.h, dbq::a, dbq::new);

   @Override
   public void a(dip $$0, bwz $$1, cys $$2, dax $$3) {
      $$1.a(new bve(bvg.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      List<bve> $$4 = List.of(new bve(bvg.E, 120000, this.f, false, false, true));
      dao.a($$4, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
