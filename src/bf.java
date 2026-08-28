import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bf extends dy<bf.a> {
   @Override
   public Codec<bf.a> a() {
      return bf.a.a;
   }

   public void a(arq $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bh> b, dj.d c) implements dy.a {
      public static final Codec<bf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(bf.a::a), dj.d.d.optionalFieldOf("level", dj.d.c).forGetter(bf.a::c)).apply($$0, bf.a::new)
      );

      public static ap<bf.a> b() {
         return ao.m.a(new bf.a(Optional.empty(), dj.d.c));
      }

      public static ap<bf.a> a(dj.d $$0) {
         return ao.m.a(new bf.a(Optional.empty(), $$0));
      }

      public boolean a(int $$0) {
         return this.c.d($$0);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
