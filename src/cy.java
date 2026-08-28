import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cy extends dy<cy.a> {
   @Override
   public Codec<cy.a> a() {
      return cy.a.a;
   }

   public void a(arq $$0, jh $$1, cwm $$2) {
      arp $$3 = $$0.y();
      dvv $$4 = $$3.a_($$1);
      euq $$5 = new euq.a($$3).a(exj.f, $$1.b()).a(exj.a, $$0).a(exj.g, $$4).a(exj.i, $$2).a(exi.o);
      eun $$6 = new eun.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<cy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(cy.a::a), bh.a.optionalFieldOf("location").forGetter(cy.a::b)).apply($$0, cy.a::new)
      );

      public static ap<cy.a> a(diq $$0) {
         bh $$1 = bh.a(exx.a($$0).build());
         return ao.z.a(new cy.a(Optional.empty(), Optional.of($$1)));
      }

      public static ap<cy.a> a(exy.a... $$0) {
         bh $$1 = bh.a(Arrays.stream($$0).map(exy.a::build).toArray(exy[]::new));
         return ao.z.a(new cy.a(Optional.empty(), Optional.of($$1)));
      }

      private static cy.a c(dh.a $$0, cu.a $$1) {
         bh $$2 = bh.a(exw.a($$0).build(), eyf.a($$1).build());
         return new cy.a(Optional.empty(), Optional.of($$2));
      }

      public static ap<cy.a> a(dh.a $$0, cu.a $$1) {
         return ao.N.a(c($$0, $$1));
      }

      public static ap<cy.a> b(dh.a $$0, cu.a $$1) {
         return ao.aa.a(c($$0, $$1));
      }

      public boolean a(eun $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, exi.o, ".location"));
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
