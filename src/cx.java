import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cx extends de<cx.a> {
   @Override
   public Codec<cx.a> a() {
      return cx.a.a;
   }

   public void a(aqi $$0, brh $$1, bqf $$2, float $$3, float $$4, boolean $$5) {
      eol $$6 = br.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bc> b, Optional<bf> c, Optional<bc> d) implements de.a {
      public static final Codec<cx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(cx.a::a), axh.a(bf.a, "damage").forGetter(cx.a::c), axh.a(br.b, "entity").forGetter(cx.a::d))
               .apply($$0, cx.a::new)
      );

      public static an<cx.a> b() {
         return am.h.a(new cx.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cx.a> a(Optional<bf> $$0) {
         return am.h.a(new cx.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static an<cx.a> a(bf.a $$0) {
         return am.h.a(new cx.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static an<cx.a> b(Optional<br> $$0) {
         return am.h.a(new cx.a(Optional.empty(), Optional.empty(), br.a($$0)));
      }

      public static an<cx.a> a(Optional<bf> $$0, Optional<br> $$1) {
         return am.h.a(new cx.a(Optional.empty(), $$0, br.a($$1)));
      }

      public static an<cx.a> a(bf.a $$0, Optional<br> $$1) {
         return am.h.a(new cx.a(Optional.empty(), Optional.of($$0.b()), br.a($$1)));
      }

      public boolean a(aqi $$0, eol $$1, bqf $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
