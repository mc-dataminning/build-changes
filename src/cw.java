import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cw extends dv<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(aqu $$0, jd $$1, cuo $$2) {
      aqt $$3 = $$0.A();
      dta $$4 = $$3.a_($$1);
      ero $$5 = new ero.a($$3).a(euh.f, $$1.b()).a(euh.a, $$0).a(euh.g, $$4).a(euh.i, $$2).a(eug.o);
      erl $$6 = new erl.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dv.a {
      public static final Codec<cw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(cw.a::a), bg.a.optionalFieldOf("location").forGetter(cw.a::b)).apply($$0, cw.a::new)
      );

      public static ao<cw.a> a(dfw $$0) {
         bg $$1 = bg.a(euv.a($$0).build());
         return an.z.a(new cw.a(Optional.empty(), Optional.of($$1)));
      }

      public static ao<cw.a> a(euw.a... $$0) {
         bg $$1 = bg.a(Arrays.stream($$0).map(euw.a::build).toArray(euw[]::new));
         return an.z.a(new cw.a(Optional.empty(), Optional.of($$1)));
      }

      private static cw.a c(df.a $$0, cs.a $$1) {
         bg $$2 = bg.a(euu.a($$0).build(), evd.a($$1).build());
         return new cw.a(Optional.empty(), Optional.of($$2));
      }

      public static ao<cw.a> a(df.a $$0, cs.a $$1) {
         return an.N.a(c($$0, $$1));
      }

      public static ao<cw.a> b(df.a $$0, cs.a $$1) {
         return an.aa.a(c($$0, $$1));
      }

      public boolean a(erl $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eug.o, ".location"));
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
