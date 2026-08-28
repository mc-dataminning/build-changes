import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class az extends dv<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(ari $$0, alb<deg> $$1, alb<deg> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<alb<deg>> c, Optional<alb<deg>> d) implements dv.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(az.a::a),
                  alb.a(lv.bb).optionalFieldOf("from").forGetter(az.a::c),
                  alb.a(lv.bb).optionalFieldOf("to").forGetter(az.a::d)
               )
               .apply($$0, az.a::new)
      );

      public static ao<az.a> b() {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<az.a> a(alb<deg> $$0, alb<deg> $$1) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ao<az.a> a(alb<deg> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ao<az.a> b(alb<deg> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(alb<deg> $$0, alb<deg> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
