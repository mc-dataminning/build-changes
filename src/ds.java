import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ds extends de<ds.a> {
   @Override
   public Codec<ds.a> a() {
      return ds.a.a;
   }

   public void a(aqi $$0, csz $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ch> c) implements de.a {
      public static final Codec<ds.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(ds.a::a), axh.a(ch.a, "item").forGetter(ds.a::b)).apply($$0, ds.a::new)
      );

      public static an<ds.a> a(ch $$0) {
         return am.C.a(new ds.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<ds.a> a(dac $$0) {
         return am.C.a(new ds.a(Optional.empty(), Optional.of(ch.a.a().a($$0).b())));
      }

      public boolean a(csz $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<ch> b() {
         return this.c;
      }
   }
}
