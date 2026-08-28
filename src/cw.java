import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cw extends dv<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(aqv $$0, jd $$1, cuq $$2) {
      aqu $$3 = $$0.A();
      dtc $$4 = $$3.a_($$1);
      ers $$5 = new ers.a($$3).a(eul.f, $$1.b()).a(eul.a, $$0).a(eul.g, $$4).a(eul.i, $$2).a(euk.o);
      erp $$6 = new erp.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dv.a {
      public static final Codec<cw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(cw.a::a), bg.a.optionalFieldOf("location").forGetter(cw.a::b)).apply($$0, cw.a::new)
      );

      public static ao<cw.a> a(dfy $$0) {
         bg $$1 = bg.a(euz.a($$0).build());
         return an.z.a(new cw.a(Optional.empty(), Optional.of($$1)));
      }

      public static ao<cw.a> a(eva.a... $$0) {
         bg $$1 = bg.a(Arrays.stream($$0).map(eva.a::build).toArray(eva[]::new));
         return an.z.a(new cw.a(Optional.empty(), Optional.of($$1)));
      }

      private static cw.a c(df.a $$0, cs.a $$1) {
         bg $$2 = bg.a(euy.a($$0).build(), evh.a($$1).build());
         return new cw.a(Optional.empty(), Optional.of($$2));
      }

      public static ao<cw.a> a(df.a $$0, cs.a $$1) {
         return an.N.a(c($$0, $$1));
      }

      public static ao<cw.a> b(df.a $$0, cs.a $$1) {
         return an.aa.a(c($$0, $$1));
      }

      public boolean a(erp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, euk.o, ".location"));
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
