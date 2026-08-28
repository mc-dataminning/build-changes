import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dbw(List<wy> e, List<wy> f) implements dci {
   public static final dbw a = new dbw(List.of());
   public static final int b = 256;
   private static final xv g = xv.a.a(n.f).b(true);
   public static final Codec<dbw> c = xa.a.sizeLimitedListOf(256).xmap(dbw::new, dbw::a);
   public static final yw<wj, dbw> d = xa.b.a(yu.c(256)).a(dbw::new, dbw::a);

   public dbw(List<wy> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xb.a($$0x.f(), g)));
   }

   public dbw(List<wy> e, List<wy> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dbw a(wy $$0) {
      return new dbw(af.a(this.e, $$0));
   }

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      this.f.forEach($$1);
   }

   public List<wy> a() {
      return this.e;
   }

   public List<wy> b() {
      return this.f;
   }
}
