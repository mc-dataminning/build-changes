import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dc extends cx<dc.a> {
   @Override
   public Codec<dc.a> a() {
      return dc.a.a;
   }

   public void a(aow $$0, bno $$1) {
      eiv $$2 = br.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<dc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avp.a(br.b, "player").forGetter(dc.a::a), avp.a(br.b, "entity").forGetter(dc.a::b)).apply($$0, dc.a::new)
      );

      public static an<dc.a> a(br.a $$0) {
         return am.o.a(new dc.a(Optional.empty(), Optional.of(br.a($$0))));
      }

      public boolean a(eiv $$0) {
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

      public Optional<bc> b() {
         return this.c;
      }
   }
}
