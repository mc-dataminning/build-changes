import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cd extends cx<cd.a> {
   @Override
   public Codec<cd.a> a() {
      return cd.a.a;
   }

   public void a(apt $$0, ib $$1, crj $$2) {
      aps $$3 = $$0.z();
      doz $$4 = $$3.a_($$1);
      enh $$5 = new enh.a($$3).a(epo.f, $$1.b()).a(epo.a, $$0).a(epo.g, $$4).a(epo.i, $$2).a(epn.n);
      enb $$6 = new enb.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<cd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aws.a(br.b, "player").forGetter(cd.a::a), aws.a(bc.a, "location").forGetter(cd.a::b)).apply($$0, cd.a::new)
      );

      public static an<cd.a> a(dby $$0) {
         bc $$1 = bc.a(eqb.a($$0).build());
         return am.z.a(new cd.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<cd.a> a(eqc.a... $$0) {
         bc $$1 = bc.a(Arrays.stream($$0).map(eqc.a::build).toArray(eqc[]::new));
         return am.z.a(new cd.a(Optional.empty(), Optional.of($$1)));
      }

      private static cd.a c(ck.a $$0, cc.a $$1) {
         bc $$2 = bc.a(eqa.a($$0).build(), eqj.a($$1).build());
         return new cd.a(Optional.empty(), Optional.of($$2));
      }

      public static an<cd.a> a(ck.a $$0, cc.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<cd.a> b(ck.a $$0, cc.a $$1) {
         return am.aa.a(c($$0, $$1));
      }

      public boolean a(enb $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, epn.n, ".location"));
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
