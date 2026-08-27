import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ce extends cv<ce.a> {
   @Override
   public Codec<ce.a> a() {
      return ce.a.a;
   }

   public void a(ane $$0, els $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bb> b, Optional<bg> c, ck.d d) implements cv.a {
      public static final Codec<ce.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atv.a(bp.b, "player").forGetter(ce.a::a), atv.a(bg.a, "distance").forGetter(ce.a::b), atv.a(ck.d.d, "duration", ck.d.c).forGetter(ce.a::c)
               )
               .apply($$0, ce.a::new)
      );

      public static an<ce.a> a(bg $$0) {
         return am.v.a(new ce.a(Optional.empty(), Optional.of($$0), ck.d.c));
      }

      public boolean a(ane $$0, els $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.c, $$1.d, $$1.e, $$0.dr(), $$0.dt(), $$0.dx()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<bg> b() {
         return this.c;
      }

      public ck.d c() {
         return this.d;
      }
   }
}
