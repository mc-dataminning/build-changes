import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cw extends dw<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(ark $$0, jf $$1, cvs $$2) {
      arj $$3 = $$0.B();
      dus $$4 = $$3.a_($$1);
      eto $$5 = new eto.a($$3).a(ewh.f, $$1.b()).a(ewh.a, $$0).a(ewh.g, $$4).a(ewh.i, $$2).a(ewg.o);
      etl $$6 = new etl.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dw.a {
      public static final Codec<cw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(cw.a::a), bg.a.optionalFieldOf("location").forGetter(cw.a::b)).apply($$0, cw.a::new)
      );

      public static ao<cw.a> a(dhm $$0) {
         bg $$1 = bg.a(ewv.a($$0).build());
         return an.z.a(new cw.a(Optional.empty(), Optional.of($$1)));
      }

      public static ao<cw.a> a(eww.a... $$0) {
         bg $$1 = bg.a(Arrays.stream($$0).map(eww.a::build).toArray(eww[]::new));
         return an.z.a(new cw.a(Optional.empty(), Optional.of($$1)));
      }

      private static cw.a c(df.a $$0, cs.a $$1) {
         bg $$2 = bg.a(ewu.a($$0).build(), exd.a($$1).build());
         return new cw.a(Optional.empty(), Optional.of($$2));
      }

      public static ao<cw.a> a(df.a $$0, cs.a $$1) {
         return an.N.a(c($$0, $$1));
      }

      public static ao<cw.a> b(df.a $$0, cs.a $$1) {
         return an.aa.a(c($$0, $$1));
      }

      public boolean a(etl $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dw.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ewg.o, ".location"));
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<bg> b() {
         return this.c;
      }
   }
}
