import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cd extends cx<cd.a> {
   @Override
   public Codec<cd.a> a() {
      return cd.a.a;
   }

   public void a(apg $$0, ib $$1, cqm $$2) {
      apf $$3 = $$0.z();
      dnb $$4 = $$3.a_($$1);
      elc $$5 = new elc.a($$3).a(enh.f, $$1.b()).a(enh.a, $$0).a(enh.g, $$4).a(enh.i, $$2).a(eng.n);
      ekw $$6 = new ekw.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<cd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.a(br.b, "player").forGetter(cd.a::a), awe.a(bc.a, "location").forGetter(cd.a::b)).apply($$0, cd.a::new)
      );

      public static an<cd.a> a(dac $$0) {
         bc $$1 = bc.a(enu.a($$0).build());
         return am.z.a(new cd.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<cd.a> a(env.a... $$0) {
         bc $$1 = bc.a(Arrays.stream($$0).map(env.a::build).toArray(env[]::new));
         return am.z.a(new cd.a(Optional.empty(), Optional.of($$1)));
      }

      private static cd.a c(ck.a $$0, cc.a $$1) {
         bc $$2 = bc.a(ent.a($$0).build(), eoc.a($$1).build());
         return new cd.a(Optional.empty(), Optional.of($$2));
      }

      public static an<cd.a> a(ck.a $$0, cc.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<cd.a> b(ck.a $$0, cc.a $$1) {
         return am.aa.a(c($$0, $$1));
      }

      public boolean a(ekw $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eng.n, ".location"));
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
