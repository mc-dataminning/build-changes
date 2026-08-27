import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dq extends de<dq.a> {
   @Override
   public Codec<dq.a> a() {
      return dq.a.a;
   }

   public void a(aqi $$0, ckp $$1, csz $$2) {
      eol $$3 = br.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<ch> d) implements de.a {
      public static final Codec<dq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(dq.a::a), axh.a(br.b, "villager").forGetter(dq.a::c), axh.a(ch.a, "item").forGetter(dq.a::d))
               .apply($$0, dq.a::new)
      );

      public static an<dq.a> b() {
         return am.t.a(new dq.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<dq.a> a(br.a $$0) {
         return am.t.a(new dq.a(Optional.of(br.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(eol $$0, csz $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
