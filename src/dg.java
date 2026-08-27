import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dg extends cx<dg.a> {
   @Override
   public Codec<dg.a> a() {
      return dg.a.a;
   }

   public void a(apg $$0, cic $$1, cqm $$2) {
      ekw $$3 = br.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<cc> d) implements cx.a {
      public static final Codec<dg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.a(br.b, "player").forGetter(dg.a::a), awe.a(br.b, "villager").forGetter(dg.a::c), awe.a(cc.a, "item").forGetter(dg.a::d))
               .apply($$0, dg.a::new)
      );

      public static an<dg.a> b() {
         return am.t.a(new dg.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<dg.a> a(br.a $$0) {
         return am.t.a(new dg.a(Optional.of(br.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(ekw $$0, cqm $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
