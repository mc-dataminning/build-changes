import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cx extends dd<cx.a> {
   @Override
   public Codec<cx.a> a() {
      return cx.a.a;
   }

   public void a(aqf $$0, csd $$1, bql $$2) {
      eoa $$3 = br.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bc> b, Optional<cg> c, Optional<bc> d) implements dd.a {
      public static final Codec<cx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(cx.a::a), axe.a(cg.a, "item").forGetter(cx.a::b), axe.a(br.b, "entity").forGetter(cx.a::c))
               .apply($$0, cx.a::new)
      );

      public static an<cx.a> a(Optional<bc> $$0, cg.a $$1, Optional<bc> $$2) {
         return am.T.a(new cx.a($$0, Optional.of($$1.b()), $$2));
      }

      public static an<cx.a> a(cg.a $$0, Optional<bc> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(csd $$0, eoa $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cg> b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
