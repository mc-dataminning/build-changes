import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cqn implements cql {
   final cps a;
   final cps b;
   final cps c;

   public cqn(cps $$0, cps $$1, cps $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bjo $$0, cti $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cmr a(bjo $$0, iu $$1) {
      cmr $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ih.c<cov>> $$3 = cow.a($$1, $$0.a(2));
         Optional<ih.c<cox>> $$4 = coy.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cou> $$5 = cou.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cmr.f;
            }

            cmr $$6 = $$2.p();
            $$6.f(1);
            cou $$7 = new cou($$3.get(), $$4.get());
            if (cou.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cmr.f;
   }

   @Override
   public cmr a(iu $$0) {
      cmr $$1 = new cmr(cmu.pE);
      Optional<ih.c<cox>> $$2 = $$0.d(ke.aJ).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ih.c<cov>> $$3 = $$0.d(ke.aI).b(cow.d);
         if ($$3.isPresent()) {
            cou $$4 = new cou($$3.get(), $$2.get());
            cou.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cmr $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cmr $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cmr $$0) {
      return this.c.a($$0);
   }

   @Override
   public cpz<?> ar_() {
      return cpz.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cps::c);
   }

   public static class a implements cpz<cqn> {
      private static final Codec<cqn> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cps.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cps.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cps.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cqn::new)
      );

      @Override
      public Codec<cqn> a() {
         return x;
      }

      public cqn b(ug $$0) {
         cps $$1 = cps.b($$0);
         cps $$2 = cps.b($$0);
         cps $$3 = cps.b($$0);
         return new cqn($$1, $$2, $$3);
      }

      public void a(ug $$0, cqn $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
