import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record dbr(List<wy> e, List<wy> f) implements dcd {
   public static final dbr a = new dbr(List.of());
   public static final int b = 256;
   private static final xv g = xv.a.a(n.f).b(true);
   public static final Codec<dbr> c = xa.a.sizeLimitedListOf(256).xmap(dbr::new, dbr::a);
   public static final yw<wj, dbr> d = xa.b.a(yu.c(256)).a(dbr::new, dbr::a);

   public dbr(List<wy> $$0) {
      this($$0, Lists.transform($$0, $$0x -> xb.a($$0x.f(), g)));
   }

   public dbr(List<wy> e, List<wy> f) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " lines, but maximum is 256");
      } else {
         this.e = e;
         this.f = f;
      }
   }

   public dbr a(wy $$0) {
      return new dbr(af.a(this.e, $$0));
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      this.f.forEach($$1);
   }

   public List<wy> a() {
      return this.e;
   }

   public List<wy> b() {
      return this.f;
   }
}
