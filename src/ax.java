import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ax extends cv<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(ane $$0, ahf<ctp> $$1, ahf<ctp> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bb> b, Optional<ahf<ctp>> c, Optional<ahf<ctp>> d) implements cv.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atw.a(bp.b, "player").forGetter(ax.a::a), atw.a(ahf.a(ke.aM), "from").forGetter(ax.a::c), atw.a(ahf.a(ke.aM), "to").forGetter(ax.a::d)
               )
               .apply($$0, ax.a::new)
      );

      public static an<ax.a> b() {
         return am.w.a(new ax.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<ax.a> a(ahf<ctp> $$0, ahf<ctp> $$1) {
         return am.w.a(new ax.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static an<ax.a> a(ahf<ctp> $$0) {
         return am.w.a(new ax.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static an<ax.a> b(ahf<ctp> $$0) {
         return am.w.a(new ax.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(ahf<ctp> $$0, ahf<ctp> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
