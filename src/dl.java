import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dl extends de<dl.a> {
   @Override
   public Codec<dl.a> a() {
      return dl.a.a;
   }

   public void a(aqi $$0, brh $$1) {
      eol $$2 = br.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements de.a {
      public static final Codec<dl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(dl.a::a), axh.a(br.b, "entity").forGetter(dl.a::b)).apply($$0, dl.a::new)
      );

      public static an<dl.a> a(br.a $$0) {
         return am.o.a(new dl.a(Optional.empty(), Optional.of(br.a($$0))));
      }

      public boolean a(eol $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bc> b() {
         return this.c;
      }
   }
}
