import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dg extends dj<dg.a> {
   @Override
   public Codec<dg.a> a() {
      return dg.a.a;
   }

   public void a(arr $$0, ddz<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static aq<dg.a> a(alf<ddu<?>> $$0) {
      return ap.g.a(new dg.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bi> b, alf<ddu<?>> c) implements dj.a {
      public static final Codec<dg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dg.a::a), alf.a(mg.bu).fieldOf("recipe").forGetter(dg.a::b)).apply($$0, dg.a::new)
      );

      public boolean a(ddz<?> $$0) {
         return this.c == $$0.a();
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public alf<ddu<?>> b() {
         return this.c;
      }
   }
}
