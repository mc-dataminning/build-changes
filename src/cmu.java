import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cmu implements cms {
   final cmb a;
   final cmb b;
   final cmb c;

   cmu(cmb $$0, cmb $$1, cmb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bgm $$0, cpq $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cja a(bgm $$0, hu $$1) {
      cja $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<hg.c<cld>> $$3 = cle.a($$1, $$0.a(2));
         Optional<hg.c<clf>> $$4 = clg.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<clc> $$5 = clc.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cja.b;
            }

            cja $$6 = $$2.p();
            $$6.f(1);
            clc $$7 = new clc($$3.get(), $$4.get());
            if (clc.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cja.b;
   }

   @Override
   public cja a(hu $$0) {
      cja $$1 = new cja(cjd.oT);
      Optional<hg.c<clf>> $$2 = $$0.d(je.aE).h().findFirst();
      if ($$2.isPresent()) {
         Optional<hg.c<cld>> $$3 = $$0.d(je.aD).b(cle.d);
         if ($$3.isPresent()) {
            clc $$4 = new clc($$3.get(), $$2.get());
            clc.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cja $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cja $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cja $$0) {
      return this.c.a($$0);
   }

   @Override
   public cmh<?> ai_() {
      return cmh.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cmb::c);
   }

   public static class a implements cmh<cmu> {
      private static final Codec<cmu> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cmb.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cmb.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cmb.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cmu::new)
      );

      @Override
      public Codec<cmu> a() {
         return x;
      }

      public cmu b(sl $$0) {
         cmb $$1 = cmb.b($$0);
         cmb $$2 = cmb.b($$0);
         cmb $$3 = cmb.b($$0);
         return new cmu($$1, $$2, $$3);
      }

      public void a(sl $$0, cmu $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
