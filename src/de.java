import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class de extends cx<de.a> {
   @Override
   public Codec<de.a> a() {
      return de.a.a;
   }

   public void a(apb $$0, cam $$1) {
      ejy $$2 = br.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<de.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avu.a(br.b, "player").forGetter(de.a::a), avu.a(br.b, "entity").forGetter(de.a::c)).apply($$0, de.a::new)
      );

      public static an<de.a> b() {
         return am.y.a(new de.a(Optional.empty(), Optional.empty()));
      }

      public static an<de.a> a(br.a $$0) {
         return am.y.a(new de.a(Optional.empty(), Optional.of(br.a($$0))));
      }

      public boolean a(ejy $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
