import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dh extends dx<dh.a> {
   @Override
   public Codec<dh.a> a() {
      return dh.a.a;
   }

   public void a(arn $$0, alg<eub> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bg> b, alg<eub> c) implements dx.a {
      public static final Codec<dh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(dh.a::a), alg.a(ly.bd).fieldOf("loot_table").forGetter(dh.a::b)).apply($$0, dh.a::new)
      );

      public static ao<dh.a> a(alg<eub> $$0) {
         return an.Q.a(new dh.a(Optional.empty(), $$0));
      }

      public boolean b(alg<eub> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public alg<eub> b() {
         return this.c;
      }
   }
}
