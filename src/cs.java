import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cs extends df<cs.a> {
   @Override
   public Codec<cs.a> a() {
      return cs.a.a;
   }

   public void a(aqn $$0, akl<epk> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bc> b, akl<epk> c) implements df.a {
      public static final Codec<cs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(cs.a::a), akl.a(lf.aU).fieldOf("loot_table").forGetter(cs.a::b)).apply($$0, cs.a::new)
      );

      public static an<cs.a> a(akl<epk> $$0) {
         return am.Q.a(new cs.a(Optional.empty(), $$0));
      }

      public boolean b(akl<epk> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public akl<epk> b() {
         return this.c;
      }
   }
}
