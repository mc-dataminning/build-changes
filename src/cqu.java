import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cqu implements cqs {
   final cpz a;
   final cpz b;
   final cpz c;

   public cqu(cpz $$0, cpz $$1, cpz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bju $$0, ctp $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cmy a(bju $$0, iu $$1) {
      cmy $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ih.c<cpc>> $$3 = cpd.a($$1, $$0.a(2));
         Optional<ih.c<cpe>> $$4 = cpf.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cpb> $$5 = cpb.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cmy.f;
            }

            cmy $$6 = $$2.p();
            $$6.f(1);
            cpb $$7 = new cpb($$3.get(), $$4.get());
            if (cpb.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cmy.f;
   }

   @Override
   public cmy a(iu $$0) {
      cmy $$1 = new cmy(cnb.pE);
      Optional<ih.c<cpe>> $$2 = $$0.d(ke.aJ).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ih.c<cpc>> $$3 = $$0.d(ke.aI).b(cpd.d);
         if ($$3.isPresent()) {
            cpb $$4 = new cpb($$3.get(), $$2.get());
            cpb.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cmy $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cmy $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cmy $$0) {
      return this.c.a($$0);
   }

   @Override
   public cqg<?> ar_() {
      return cqg.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cpz::c);
   }

   public static class a implements cqg<cqu> {
      private static final Codec<cqu> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cpz.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cpz.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cpz.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cqu::new)
      );

      @Override
      public Codec<cqu> a() {
         return x;
      }

      public cqu b(ui $$0) {
         cpz $$1 = cpz.b($$0);
         cpz $$2 = cpz.b($$0);
         cpz $$3 = cpz.b($$0);
         return new cqu($$1, $$2, $$3);
      }

      public void a(ui $$0, cqu $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
