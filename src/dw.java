import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dw extends dz<dw.a> {
   @Override
   public Codec<dw.a> a() {
      return dw.a.a;
   }

   public void a(aro $$0, dcq<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static aq<dw.a> a(alc<dcl<?>> $$0) {
      return ap.g.a(new dw.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bi> b, alc<dcl<?>> c) implements dz.a {
      public static final Codec<dw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dw.a::a), alc.a(me.br).fieldOf("recipe").forGetter(dw.a::b)).apply($$0, dw.a::new)
      );

      public boolean a(dcq<?> $$0) {
         return this.c == $$0.a();
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public alc<dcl<?>> b() {
         return this.c;
      }
   }
}
