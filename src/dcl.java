import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dcl(int f) implements dbt, dcs {
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;
   public static final Codec<dcl> d = ayu.a(0, 4).xmap(dcl::new, dcl::a);
   public static final yw<wj, dcl> e = yw.a(yu.h, dcl::a, dcl::new);

   @Override
   public void a(djm $$0, bxj $$1, czn $$2, dbs $$3) {
      $$1.a(new bvm(bvo.E, 120000, this.f, false, false, true));
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      List<bvm> $$4 = List.of(new bvm(bvo.E, 120000, this.f, false, false, true));
      dbj.a($$4, $$1, 1.0F, $$0.b());
   }

   public int a() {
      return this.f;
   }
}
