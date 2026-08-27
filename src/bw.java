import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bw extends de<bw.a> {
   @Override
   public Codec<bw.a> a() {
      return bw.a.a;
   }

   public void a(aqi $$0, csz $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ch> c) implements de.a {
      public static final Codec<bw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(bw.a::a), axh.a(ch.a, "item").forGetter(bw.a::b)).apply($$0, bw.a::new)
      );

      public static an<bw.a> a(ch.a $$0) {
         return am.k.a(new bw.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(csz $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
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
