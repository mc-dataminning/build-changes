import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cw extends dl<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(asc $$0, alq<fay> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bj> b, alq<fay> c) implements dl.a {
      public static final Codec<cw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(cw.a::a), fay.a.fieldOf("loot_table").forGetter(cw.a::b)).apply($$0, cw.a::new)
      );

      public static ar<cw.a> a(alq<fay> $$0) {
         return aq.Q.a(new cw.a(Optional.empty(), $$0));
      }

      public boolean b(alq<fay> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public alq<fay> b() {
         return this.c;
      }
   }
}
