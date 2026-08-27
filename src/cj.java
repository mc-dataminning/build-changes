import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cj extends dd<cj.a> {
   @Override
   public Codec<cj.a> a() {
      return cj.a.a;
   }

   public void a(aqf $$0, im $$1, csd $$2) {
      aqe $$3 = $$0.z();
      dpy $$4 = $$3.a_($$1);
      eog $$5 = new eog.a($$3).a(eqt.f, $$1.b()).a(eqt.a, $$0).a(eqt.g, $$4).a(eqt.i, $$2).a(eqs.n);
      eoa $$6 = new eoa.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements dd.a {
      public static final Codec<cj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(cj.a::a), axe.a(bc.a, "location").forGetter(cj.a::b)).apply($$0, cj.a::new)
      );

      public static an<cj.a> a(dcv $$0) {
         bc $$1 = bc.a(erg.a($$0).build());
         return am.z.a(new cj.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<cj.a> a(erh.a... $$0) {
         bc $$1 = bc.a(Arrays.stream($$0).map(erh.a::build).toArray(erh[]::new));
         return am.z.a(new cj.a(Optional.empty(), Optional.of($$1)));
      }

      private static cj.a c(cq.a $$0, cg.a $$1) {
         bc $$2 = bc.a(erf.a($$0).build(), ero.a($$1).build());
         return new cj.a(Optional.empty(), Optional.of($$2));
      }

      public static an<cj.a> a(cq.a $$0, cg.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<cj.a> b(cq.a $$0, cg.a $$1) {
         return am.aa.a(c($$0, $$1));
      }

      public boolean a(eoa $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eqs.n, ".location"));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bc> b() {
         return this.c;
      }
   }
}
