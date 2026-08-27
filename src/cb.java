import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cb extends cv<cb.a> {
   @Override
   public Codec<cb.a> a() {
      return cb.a.a;
   }

   public void a(anf $$0, hx $$1, cng $$2) {
      ane $$3 = $$0.z();
      djp $$4 = $$3.a_($$1);
      ehl $$5 = new ehl.a($$3).a(ejq.f, $$1.b()).a(ejq.a, $$0).a(ejq.g, $$4).a(ejq.i, $$2).a(ejp.m);
      ehf $$6 = new ehf.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bb> b, Optional<bb> c) implements cv.a {
      public static final Codec<cb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atx.a(bp.b, "player").forGetter(cb.a::a), atx.a(bb.a, "location").forGetter(cb.a::b)).apply($$0, cb.a::new)
      );

      public static an<cb.a> a(cwy $$0) {
         bb $$1 = bb.a(ekd.a($$0).build());
         return am.z.a(new cb.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<cb.a> a(eke.a... $$0) {
         bb $$1 = bb.a(Arrays.stream($$0).map(eke.a::build).toArray(eke[]::new));
         return am.z.a(new cb.a(Optional.empty(), Optional.of($$1)));
      }

      private static cb.a c(ci.a $$0, ca.a $$1) {
         bb $$2 = bb.a(ekc.a($$0).build(), ekl.a($$1).build());
         return new cb.a(Optional.empty(), Optional.of($$2));
      }

      public static an<cb.a> a(ci.a $$0, ca.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<cb.a> b(ci.a $$0, ca.a $$1) {
         return am.Y.a(c($$0, $$1));
      }

      public boolean a(ehf $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ejp.m, ".location"));
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
