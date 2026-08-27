import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eqw extends epw {
   private static final Map<jz<?>, eqw.a<?>> b = Stream.of(
         new eqw.a<>(ka.I, cvb::a),
         new eqw.a<>(ka.x, cvp::a),
         new eqw.a<>(ka.i, cyl::a),
         new eqw.a<>(ka.w, cyl::a),
         new eqw.a<>(ka.e, cwe::a),
         new eqw.a<>(ka.k, cql::a),
         new eqw.a<>(ka.j, cql::a),
         new eqw.a<>(ka.l, cvs::a)
      )
      .collect(Collectors.toMap(eqw.a::a, $$0 -> (eqw.a<?>)$$0));
   private static final Codec<eqw.a<?>> c = ld.as.q().comapFlatMap($$0 -> {
      eqw.a<?> $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Can't toggle tooltip visiblity for " + ld.as.b($$0));
   }, eqw.a::a);
   public static final Codec<eqw> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(Codec.unboundedMap(c, Codec.BOOL).fieldOf("toggles").forGetter($$0x -> $$0x.d)).apply($$0, eqw::new)
   );
   private final Map<eqw.a<?>, Boolean> d;

   private eqw(List<erq> $$0, Map<eqw.a<?>, Boolean> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected csz a(csz $$0, eol $$1) {
      this.d.forEach(($$1x, $$2) -> $$1x.a($$0, $$2));
      return $$0;
   }

   @Override
   public epy b() {
      return epz.M;
   }

   static record a<T>(jz<T> a, eqw.b<T> b) {
      public void a(csz $$0, boolean $$1) {
         T $$2 = $$0.a(this.a);
         if ($$2 != null) {
            $$0.b(this.a, this.b.withTooltip($$2, $$1));
         }
      }
   }

   @FunctionalInterface
   interface b<T> {
      T withTooltip(T var1, boolean var2);
   }
}
