import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dw extends dz<dw.a> {
   @Override
   public Codec<dw.a> a() {
      return dw.a.a;
   }

   public void a(are $$0, dca<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static aq<dw.a> a(akt<dbv<?>> $$0) {
      return ap.g.a(new dw.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bi> b, akt<dbv<?>> c) implements dz.a {
      public static final Codec<dw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dw.a::a), akt.a(mc.bm).fieldOf("recipe").forGetter(dw.a::b)).apply($$0, dw.a::new)
      );

      public boolean a(dca<?> $$0) {
         return this.c == $$0.a();
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public akt<dbv<?>> b() {
         return this.c;
      }
   }
}
