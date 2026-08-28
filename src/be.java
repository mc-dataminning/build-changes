import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class be extends dx<be.a> {
   @Override
   public Codec<be.a> a() {
      return be.a.a;
   }

   public void a(arn $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, di.d c) implements dx.a {
      public static final Codec<be.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(be.a::a), di.d.d.optionalFieldOf("level", di.d.c).forGetter(be.a::c)).apply($$0, be.a::new)
      );

      public static ao<be.a> b() {
         return an.m.a(new be.a(Optional.empty(), di.d.c));
      }

      public static ao<be.a> a(di.d $$0) {
         return an.m.a(new be.a(Optional.empty(), $$0));
      }

      public boolean a(int $$0) {
         return this.c.d($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
