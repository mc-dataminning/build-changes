import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends dk<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(art $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, cw.d c) implements dk.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(bh.a::a), cw.d.d.optionalFieldOf("level", cw.d.c).forGetter(bh.a::c)).apply($$0, bh.a::new)
      );

      public static ar<bh.a> b() {
         return aq.m.a(new bh.a(Optional.empty(), cw.d.c));
      }

      public static ar<bh.a> a(cw.d $$0) {
         return aq.m.a(new bh.a(Optional.empty(), $$0));
      }

      public boolean a(int $$0) {
         return this.c.d($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
