import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cb extends cv<cb.a> {
   @Override
   public Codec<cb.a> a() {
      return cb.a.a;
   }

   public void a(amq $$0, hv $$1, cmh $$2) {
      amp $$3 = $$0.z();
      dip $$4 = $$3.a_($$1);
      egk $$5 = new egk.a($$3).a(eip.f, $$1.b()).a(eip.a, $$0).a(eip.g, $$4).a(eip.i, $$2).a(eio.m);
      ege $$6 = new ege.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bb> b, Optional<bb> c) implements cv.a {
      public static final Codec<cb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atg.a(bp.b, "player").forGetter(cb.a::a), atg.a(bb.a, "location").forGetter(cb.a::b)).apply($$0, cb.a::new)
      );

      public static an<cb.a> a(cvz $$0) {
         bb $$1 = bb.a(ejc.a($$0).build());
         return am.z.a(new cb.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<cb.a> a(ejd.a... $$0) {
         bb $$1 = bb.a(Arrays.stream($$0).map(ejd.a::build).toArray(ejd[]::new));
         return am.z.a(new cb.a(Optional.empty(), Optional.of($$1)));
      }

      private static cb.a c(ci.a $$0, ca.a $$1) {
         bb $$2 = bb.a(ejb.a($$0).build(), ejk.a($$1).build());
         return new cb.a(Optional.empty(), Optional.of($$2));
      }

      public static an<cb.a> a(ci.a $$0, ca.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<cb.a> b(ci.a $$0, ca.a $$1) {
         return am.Y.a(c($$0, $$1));
      }

      public boolean a(ege $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eio.m, ".location"));
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<bb> b() {
         return this.c;
      }
   }
}
