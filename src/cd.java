import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cd extends cx<cd.a> {
   @Override
   public Codec<cd.a> a() {
      return cd.a.a;
   }

   public void a(apb $$0, ib $$1, cpq $$2) {
      apa $$3 = $$0.z();
      dme $$4 = $$3.a_($$1);
      eke $$5 = new eke.a($$3).a(emj.f, $$1.b()).a(emj.a, $$0).a(emj.g, $$4).a(emj.i, $$2).a(emi.n);
      ejy $$6 = new ejy.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<cd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avu.a(br.b, "player").forGetter(cd.a::a), avu.a(bc.a, "location").forGetter(cd.a::b)).apply($$0, cd.a::new)
      );

      public static an<cd.a> a(czf $$0) {
         bc $$1 = bc.a(emw.a($$0).build());
         return am.z.a(new cd.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<cd.a> a(emx.a... $$0) {
         bc $$1 = bc.a(Arrays.stream($$0).map(emx.a::build).toArray(emx[]::new));
         return am.z.a(new cd.a(Optional.empty(), Optional.of($$1)));
      }

      private static cd.a c(ck.a $$0, cc.a $$1) {
         bc $$2 = bc.a(emv.a($$0).build(), ene.a($$1).build());
         return new cd.a(Optional.empty(), Optional.of($$2));
      }

      public static an<cd.a> a(ck.a $$0, cc.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<cd.a> b(ck.a $$0, cc.a $$1) {
         return am.aa.a(c($$0, $$1));
      }

      public boolean a(ejy $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, emi.n, ".location"));
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
