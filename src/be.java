import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class be extends dv<be.a> {
   @Override
   public Codec<be.a> a() {
      return be.a.a;
   }

   public void a(arh $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, dh.d c) implements dv.a {
      public static final Codec<be.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(be.a::a), dh.d.d.optionalFieldOf("level", dh.d.c).forGetter(be.a::c)).apply($$0, be.a::new)
      );

      public static ao<be.a> b() {
         return an.m.a(new be.a(Optional.empty(), dh.d.c));
      }

      public static ao<be.a> a(dh.d $$0) {
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
