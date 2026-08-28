import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class ct extends ds<ct.a> {
   @Override
   public Codec<ct.a> a() {
      return ct.a.a;
   }

   public void a(aql $$0, ja $$1, cua $$2) {
      aqk $$3 = $$0.z();
      dsh $$4 = $$3.a_($$1);
      eqr $$5 = new eqr.a($$3).a(etk.f, $$1.b()).a(etk.a, $$0).a(etk.g, $$4).a(etk.i, $$2).a(etj.o);
      eqo $$6 = new eqo.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements ds.a {
      public static final Codec<ct.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(ct.a::a), bf.a.optionalFieldOf("location").forGetter(ct.a::b)).apply($$0, ct.a::new)
      );

      public static an<ct.a> a(dff $$0) {
         bf $$1 = bf.a(ety.a($$0).build());
         return am.z.a(new ct.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<ct.a> a(etz.a... $$0) {
         bf $$1 = bf.a(Arrays.stream($$0).map(etz.a::build).toArray(etz[]::new));
         return am.z.a(new ct.a(Optional.empty(), Optional.of($$1)));
      }

      private static ct.a c(dc.a $$0, cp.a $$1) {
         bf $$2 = bf.a(etx.a($$0).build(), eug.a($$1).build());
         return new ct.a(Optional.empty(), Optional.of($$2));
      }

      public static an<ct.a> a(dc.a $$0, cp.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<ct.a> b(dc.a $$0, cp.a $$1) {
         return am.aa.a(c($$0, $$1));
      }

      public boolean a(eqo $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, etj.o, ".location"));
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<bf> b() {
         return this.c;
      }
   }
}
