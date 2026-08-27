import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bw extends df<bw.a> {
   @Override
   public Codec<bw.a> a() {
      return bw.a.a;
   }

   public void a(aqn $$0, cto $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ch> c) implements df.a {
      public static final Codec<bw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(bw.a::a), ch.a.optionalFieldOf("item").forGetter(bw.a::b)).apply($$0, bw.a::new)
      );

      public static an<bw.a> a(ch.a $$0) {
         return am.k.a(new bw.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cto $$0) {
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
