import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dn extends de<dn.a> {
   @Override
   public Codec<dn.a> a() {
      return dn.a.a;
   }

   public void a(aqi $$0, cdp $$1) {
      eol $$2 = br.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements de.a {
      public static final Codec<dn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(dn.a::a), axh.a(br.b, "entity").forGetter(dn.a::c)).apply($$0, dn.a::new)
      );

      public static an<dn.a> b() {
         return am.y.a(new dn.a(Optional.empty(), Optional.empty()));
      }

      public static an<dn.a> a(br.a $$0) {
         return am.y.a(new dn.a(Optional.empty(), Optional.of(br.a($$0))));
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
   }
}
