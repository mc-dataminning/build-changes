import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cx extends dx<cx.a> {
   @Override
   public Codec<cx.a> a() {
      return cx.a.a;
   }

   public void a(arn $$0, jg $$1, cvx $$2) {
      arm $$3 = $$0.B();
      dvd $$4 = $$3.a_($$1);
      etz $$5 = new etz.a($$3).a(ews.f, $$1.b()).a(ews.a, $$0).a(ews.g, $$4).a(ews.i, $$2).a(ewr.o);
      etw $$6 = new etw.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dx.a {
      public static final Codec<cx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(cx.a::a), bg.a.optionalFieldOf("location").forGetter(cx.a::b)).apply($$0, cx.a::new)
      );

      public static ao<cx.a> a(dhy $$0) {
         bg $$1 = bg.a(exg.a($$0).build());
         return an.z.a(new cx.a(Optional.empty(), Optional.of($$1)));
      }

      public static ao<cx.a> a(exh.a... $$0) {
         bg $$1 = bg.a(Arrays.stream($$0).map(exh.a::build).toArray(exh[]::new));
         return an.z.a(new cx.a(Optional.empty(), Optional.of($$1)));
      }

      private static cx.a c(dg.a $$0, ct.a $$1) {
         bg $$2 = bg.a(exf.a($$0).build(), exo.a($$1).build());
         return new cx.a(Optional.empty(), Optional.of($$2));
      }

      public static ao<cx.a> a(dg.a $$0, ct.a $$1) {
         return an.N.a(c($$0, $$1));
      }

      public static ao<cx.a> b(dg.a $$0, ct.a $$1) {
         return an.aa.a(c($$0, $$1));
      }

      public boolean a(etw $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ewr.o, ".location"));
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
