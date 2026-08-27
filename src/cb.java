import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cb extends cv<cb.a> {
   @Override
   public Codec<cb.a> a() {
      return cb.a.a;
   }

   public void a(ana $$0, hx $$1, cmr $$2) {
      amz $$3 = $$0.z();
      dja $$4 = $$3.a_($$1);
      egv $$5 = new egv.a($$3).a(eja.f, $$1.b()).a(eja.a, $$0).a(eja.g, $$4).a(eja.i, $$2).a(eiz.m);
      egp $$6 = new egp.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bb> b, Optional<bb> c) implements cv.a {
      public static final Codec<cb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(cb.a::a), atq.a(bb.a, "location").forGetter(cb.a::b)).apply($$0, cb.a::new)
      );

      public static an<cb.a> a(cwj $$0) {
         bb $$1 = bb.a(ejn.a($$0).build());
         return am.z.a(new cb.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<cb.a> a(ejo.a... $$0) {
         bb $$1 = bb.a(Arrays.stream($$0).map(ejo.a::build).toArray(ejo[]::new));
         return am.z.a(new cb.a(Optional.empty(), Optional.of($$1)));
      }

      private static cb.a c(ci.a $$0, ca.a $$1) {
         bb $$2 = bb.a(ejm.a($$0).build(), ejv.a($$1).build());
         return new cb.a(Optional.empty(), Optional.of($$2));
      }

      public static an<cb.a> a(ci.a $$0, ca.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<cb.a> b(ci.a $$0, ca.a $$1) {
         return am.Y.a(c($$0, $$1));
      }

      public boolean a(egp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eiz.m, ".location"));
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
