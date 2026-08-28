import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class ct extends ds<ct.a> {
   @Override
   public Codec<ct.a> a() {
      return ct.a.a;
   }

   public void a(aqn $$0, ja $$1, cud $$2) {
      aqm $$3 = $$0.A();
      dsl $$4 = $$3.a_($$1);
      eqz $$5 = new eqz.a($$3).a(ets.f, $$1.b()).a(ets.a, $$0).a(ets.g, $$4).a(ets.i, $$2).a(etr.o);
      eqw $$6 = new eqw.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements ds.a {
      public static final Codec<ct.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(ct.a::a), bf.a.optionalFieldOf("location").forGetter(ct.a::b)).apply($$0, ct.a::new)
      );

      public static an<ct.a> a(dfi $$0) {
         bf $$1 = bf.a(eug.a($$0).build());
         return am.z.a(new ct.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<ct.a> a(euh.a... $$0) {
         bf $$1 = bf.a(Arrays.stream($$0).map(euh.a::build).toArray(euh[]::new));
         return am.z.a(new ct.a(Optional.empty(), Optional.of($$1)));
      }

      private static ct.a c(dc.a $$0, cp.a $$1) {
         bf $$2 = bf.a(euf.a($$0).build(), euo.a($$1).build());
         return new ct.a(Optional.empty(), Optional.of($$2));
      }

      public static an<ct.a> a(dc.a $$0, cp.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<ct.a> b(dc.a $$0, cp.a $$1) {
         return am.aa.a(c($$0, $$1));
      }

      public boolean a(eqw $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, etr.o, ".location"));
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
