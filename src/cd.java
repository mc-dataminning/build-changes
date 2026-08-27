import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cd extends cx<cd.a> {
   @Override
   public Codec<cd.a> a() {
      return cd.a.a;
   }

   public void a(aow $$0, hz $$1, coz $$2) {
      aov $$3 = $$0.z();
      dlf $$4 = $$3.a_($$1);
      ejb $$5 = new ejb.a($$3).a(elg.f, $$1.b()).a(elg.a, $$0).a(elg.g, $$4).a(elg.i, $$2).a(elf.m);
      eiv $$6 = new eiv.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<cd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avp.a(br.b, "player").forGetter(cd.a::a), avp.a(bc.a, "location").forGetter(cd.a::b)).apply($$0, cd.a::new)
      );

      public static an<cd.a> a(cyo $$0) {
         bc $$1 = bc.a(elt.a($$0).build());
         return am.z.a(new cd.a(Optional.empty(), Optional.of($$1)));
      }

      public static an<cd.a> a(elu.a... $$0) {
         bc $$1 = bc.a(Arrays.stream($$0).map(elu.a::build).toArray(elu[]::new));
         return am.z.a(new cd.a(Optional.empty(), Optional.of($$1)));
      }

      private static cd.a c(ck.a $$0, cc.a $$1) {
         bc $$2 = bc.a(els.a($$0).build(), emb.a($$1).build());
         return new cd.a(Optional.empty(), Optional.of($$2));
      }

      public static an<cd.a> a(ck.a $$0, cc.a $$1) {
         return am.N.a(c($$0, $$1));
      }

      public static an<cd.a> b(ck.a $$0, cc.a $$1) {
         return am.aa.a(c($$0, $$1));
      }

      public boolean a(eiv $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, elf.m, ".location"));
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
