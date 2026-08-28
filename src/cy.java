import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cy extends dy<cy.a> {
   @Override
   public Codec<cy.a> a() {
      return cy.a.a;
   }

   public void a(asi $$0, jh $$1, cxp $$2) {
      ash $$3 = $$0.y();
      dxv $$4 = $$3.a_($$1);
      ews $$5 = new ews.a($$3).a(ezj.f, $$1.b()).a(ezj.a, $$0).a(ezj.g, $$4).a(ezj.i, $$2).a(ezi.o);
      ewp $$6 = new ewp.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<cy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(cy.a::a), bh.a.optionalFieldOf("location").forGetter(cy.a::b)).apply($$0, cy.a::new)
      );

      public static ap<cy.a> a(dkm $$0) {
         bh $$1 = bh.a(ezx.a($$0).build());
         return ao.z.a(new cy.a(Optional.empty(), Optional.of($$1)));
      }

      public static ap<cy.a> a(ezy.a... $$0) {
         bh $$1 = bh.a(Arrays.stream($$0).map(ezy.a::build).toArray(ezy[]::new));
         return ao.z.a(new cy.a(Optional.empty(), Optional.of($$1)));
      }

      private static cy.a c(dh.a $$0, cu.a $$1) {
         bh $$2 = bh.a(ezw.a($$0).build(), faf.a($$1).build());
         return new cy.a(Optional.empty(), Optional.of($$2));
      }

      public static ap<cy.a> a(dh.a $$0, cu.a $$1) {
         return ao.N.a(c($$0, $$1));
      }

      public static ap<cy.a> b(dh.a $$0, cu.a $$1) {
         return ao.aa.a(c($$0, $$1));
      }

      public boolean a(ewp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ezi.o, ".location"));
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<bh> b() {
         return this.c;
      }
   }
}
