import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cy extends dy<cy.a> {
   @Override
   public Codec<cy.a> a() {
      return cy.a.a;
   }

   public void a(aro $$0, jh $$1, cwb $$2) {
      arn $$3 = $$0.B();
      dvj $$4 = $$3.a_($$1);
      euf $$5 = new euf.a($$3).a(ewy.f, $$1.b()).a(ewy.a, $$0).a(ewy.g, $$4).a(ewy.i, $$2).a(ewx.o);
      euc $$6 = new euc.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<cy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(cy.a::a), bh.a.optionalFieldOf("location").forGetter(cy.a::b)).apply($$0, cy.a::new)
      );

      public static ap<cy.a> a(die $$0) {
         bh $$1 = bh.a(exm.a($$0).build());
         return ao.z.a(new cy.a(Optional.empty(), Optional.of($$1)));
      }

      public static ap<cy.a> a(exn.a... $$0) {
         bh $$1 = bh.a(Arrays.stream($$0).map(exn.a::build).toArray(exn[]::new));
         return ao.z.a(new cy.a(Optional.empty(), Optional.of($$1)));
      }

      private static cy.a c(dh.a $$0, cu.a $$1) {
         bh $$2 = bh.a(exl.a($$0).build(), exu.a($$1).build());
         return new cy.a(Optional.empty(), Optional.of($$2));
      }

      public static ap<cy.a> a(dh.a $$0, cu.a $$1) {
         return ao.N.a(c($$0, $$1));
      }

      public static ap<cy.a> b(dh.a $$0, cu.a $$1) {
         return ao.aa.a(c($$0, $$1));
      }

      public boolean a(euc $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ewx.o, ".location"));
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
