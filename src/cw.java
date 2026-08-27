import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cw extends dd<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(aqf $$0, bql $$1, bpj $$2, float $$3, float $$4, boolean $$5) {
      eoa $$6 = br.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bc> b, Optional<bf> c, Optional<bc> d) implements dd.a {
      public static final Codec<cw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(cw.a::a), axe.a(bf.a, "damage").forGetter(cw.a::c), axe.a(br.b, "entity").forGetter(cw.a::d))
               .apply($$0, cw.a::new)
      );

      public static an<cw.a> b() {
         return am.h.a(new cw.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cw.a> a(Optional<bf> $$0) {
         return am.h.a(new cw.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static an<cw.a> a(bf.a $$0) {
         return am.h.a(new cw.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static an<cw.a> b(Optional<br> $$0) {
         return am.h.a(new cw.a(Optional.empty(), Optional.empty(), br.a($$0)));
      }

      public static an<cw.a> a(Optional<bf> $$0, Optional<br> $$1) {
         return am.h.a(new cw.a(Optional.empty(), $$0, br.a($$1)));
      }

      public static an<cw.a> a(bf.a $$0, Optional<br> $$1) {
         return am.h.a(new cw.a(Optional.empty(), Optional.of($$0.b()), br.a($$1)));
      }

      public boolean a(aqf $$0, eoa $$1, bpj $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
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
   }
}
