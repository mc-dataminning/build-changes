import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dh extends cx<dh.a> {
   @Override
   public Codec<dh.a> a() {
      return dh.a.a;
   }

   public void a(apv $$0, cji $$1, crs $$2) {
      enk $$3 = br.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<cc> d) implements cx.a {
      public static final Codec<dh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.a(br.b, "player").forGetter(dh.a::a), awu.a(br.b, "villager").forGetter(dh.a::c), awu.a(cc.a, "item").forGetter(dh.a::d))
               .apply($$0, dh.a::new)
      );

      public static an<dh.a> b() {
         return am.t.a(new dh.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<dh.a> a(br.a $$0) {
         return am.t.a(new dh.a(Optional.of(br.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(enk $$0, crs $$1) {
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
