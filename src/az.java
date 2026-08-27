import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class az extends cv<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(ane $$0, int $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, ck.d c) implements cv.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atw.a(bp.b, "player").forGetter(az.a::a), atw.a(ck.d.d, "level", ck.d.c).forGetter(az.a::c)).apply($$0, az.a::new)
      );

      public static an<az.a> b() {
         return am.m.a(new az.a(Optional.empty(), ck.d.c));
      }

      public static an<az.a> a(ck.d $$0) {
         return am.m.a(new az.a(Optional.empty(), $$0));
      }

      public boolean a(int $$0) {
         return this.c.d($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
