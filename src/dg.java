import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dg extends cv<dg.a> {
   @Override
   public Codec<dg.a> a() {
      return dg.a.a;
   }

   public void a(ane $$0, cmy $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ca> c) implements cv.a {
      public static final Codec<dg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atw.a(bp.b, "player").forGetter(dg.a::a), atw.a(ca.a, "item").forGetter(dg.a::b)).apply($$0, dg.a::new)
      );

      public static an<dg.a> a(ca $$0) {
         return am.C.a(new dg.a(Optional.empty(), Optional.of($$0)));
      }

      public static an<dg.a> a(cto $$0) {
         return am.C.a(new dg.a(Optional.empty(), Optional.of(ca.a.a().a($$0).b())));
      }

      public boolean a(cmy $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ca> b() {
         return this.c;
      }
   }
}
