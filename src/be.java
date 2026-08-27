import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class be extends cx<be.a> {
   @Override
   public Codec<be.a> a() {
      return be.a.a;
   }

   public void a(aow $$0, cfg $$1, cgu $$2) {
      eiv $$3 = br.b($$0, $$1);
      eiv $$4 = br.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<bc> d) implements cx.a {
      public static final Codec<be.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avp.a(br.b, "player").forGetter(be.a::a), avp.a(br.b, "zombie").forGetter(be.a::c), avp.a(br.b, "villager").forGetter(be.a::d))
               .apply($$0, be.a::new)
      );

      public static an<be.a> b() {
         return am.s.a(new be.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(eiv $$0, eiv $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.c, ".zombie");
         $$0.a(this.d, ".villager");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
