import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class az extends dx<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(arn $$0, alg<dev> $$1, alg<dev> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<alg<dev>> c, Optional<alg<dev>> d) implements dx.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(az.a::a),
                  alg.a(ly.bb).optionalFieldOf("from").forGetter(az.a::c),
                  alg.a(ly.bb).optionalFieldOf("to").forGetter(az.a::d)
               )
               .apply($$0, az.a::new)
      );

      public static ao<az.a> b() {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<az.a> a(alg<dev> $$0, alg<dev> $$1) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ao<az.a> a(alg<dev> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ao<az.a> b(alg<dev> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(alg<dev> $$0, alg<dev> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
