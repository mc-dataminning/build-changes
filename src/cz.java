import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cz extends dz<cz.a> {
   @Override
   public Codec<cz.a> a() {
      return cz.a.a;
   }

   public void a(ard $$0, ji $$1, cwn $$2) {
      arc $$3 = $$0.y();
      dwv $$4 = $$3.a_($$1);
      evs $$5 = new evs.a($$3).a(eyj.f, $$1.b()).a(eyj.a, $$0).a(eyj.g, $$4).a(eyj.i, $$2).a(eyi.o);
      evp $$6 = new evp.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dz.a {
      public static final Codec<cz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(cz.a::a), bi.a.optionalFieldOf("location").forGetter(cz.a::b)).apply($$0, cz.a::new)
      );

      public static aq<cz.a> a(djk $$0) {
         bi $$1 = bi.a(eyx.a($$0).build());
         return ap.z.a(new cz.a(Optional.empty(), Optional.of($$1)));
      }

      public static aq<cz.a> a(eyy.a... $$0) {
         bi $$1 = bi.a(Arrays.stream($$0).map(eyy.a::build).toArray(eyy[]::new));
         return ap.z.a(new cz.a(Optional.empty(), Optional.of($$1)));
      }

      private static cz.a c(di.a $$0, cv.a $$1) {
         bi $$2 = bi.a(eyw.a($$0).build(), ezf.a($$1).build());
         return new cz.a(Optional.empty(), Optional.of($$2));
      }

      public static aq<cz.a> a(di.a $$0, cv.a $$1) {
         return ap.N.a(c($$0, $$1));
      }

      public static aq<cz.a> b(di.a $$0, cv.a $$1) {
         return ap.aa.a(c($$0, $$1));
      }

      public boolean a(evp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eyi.o, ".location"));
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<bi> b() {
         return this.c;
      }
   }
}
