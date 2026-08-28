import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends dl<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(arv $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, cx.d c) implements dl.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(bh.a::a), cx.d.d.optionalFieldOf("level", cx.d.c).forGetter(bh.a::c)).apply($$0, bh.a::new)
      );

      public static ar<bh.a> b() {
         return aq.m.a(new bh.a(Optional.empty(), cx.d.c));
      }

      public static ar<bh.a> a(cx.d $$0) {
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
