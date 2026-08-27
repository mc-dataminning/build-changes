import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class be extends de<be.a> {
   @Override
   public Codec<be.a> a() {
      return be.a.a;
   }

   public void a(aqi $$0, cjg $$1, cku $$2) {
      eol $$3 = br.b($$0, $$1);
      eol $$4 = br.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<bc> d) implements de.a {
      public static final Codec<be.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(be.a::a), axh.a(br.b, "zombie").forGetter(be.a::c), axh.a(br.b, "villager").forGetter(be.a::d))
               .apply($$0, be.a::new)
      );

      public static an<be.a> b() {
         return am.s.a(new be.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(eol $$0, eol $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         $$0.a(this.c, ".zombie");
         $$0.a(this.d, ".villager");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
