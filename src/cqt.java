import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cqt implements cqr {
   final cpy a;
   final cpy b;
   final cpy c;

   public cqt(cpy $$0, cpy $$1, cpy $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bjt $$0, cto $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cmx a(bjt $$0, iu $$1) {
      cmx $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ih.c<cpb>> $$3 = cpc.a($$1, $$0.a(2));
         Optional<ih.c<cpd>> $$4 = cpe.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cpa> $$5 = cpa.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cmx.f;
            }

            cmx $$6 = $$2.p();
            $$6.f(1);
            cpa $$7 = new cpa($$3.get(), $$4.get());
            if (cpa.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cmx.f;
   }

   @Override
   public cmx a(iu $$0) {
      cmx $$1 = new cmx(cna.pE);
      Optional<ih.c<cpd>> $$2 = $$0.d(ke.aJ).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ih.c<cpb>> $$3 = $$0.d(ke.aI).b(cpc.d);
         if ($$3.isPresent()) {
            cpa $$4 = new cpa($$3.get(), $$2.get());
            cpa.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cmx $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cmx $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cmx $$0) {
      return this.c.a($$0);
   }

   @Override
   public cqf<?> ar_() {
      return cqf.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cpy::c);
   }

   public static class a implements cqf<cqt> {
      private static final Codec<cqt> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cpy.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cpy.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cpy.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cqt::new)
      );

      @Override
      public Codec<cqt> a() {
         return x;
      }

      public cqt b(ui $$0) {
         cpy $$1 = cpy.b($$0);
         cpy $$2 = cpy.b($$0);
         cpy $$3 = cpy.b($$0);
         return new cqt($$1, $$2, $$3);
      }

      public void a(ui $$0, cqt $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
