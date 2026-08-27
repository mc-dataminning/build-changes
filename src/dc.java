import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dc extends de<dc.a> {
   @Override
   public Codec<dc.a> a() {
      return dc.a.a;
   }

   public void a(aqi $$0, cxf<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static an<dc.a> a(akh $$0) {
      return am.g.a(new dc.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bc> b, akh c) implements de.a {
      public static final Codec<dc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(dc.a::a), akh.a.fieldOf("recipe").forGetter(dc.a::b)).apply($$0, dc.a::new)
      );

      public boolean a(cxf<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public akh b() {
         return this.c;
      }
   }
}
