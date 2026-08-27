import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cmz implements cmx {
   final cmg a;
   final cmg b;
   final cmg c;

   cmz(cmg $$0, cmg $$1, cmg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bgr $$0, cpv $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cjf a(bgr $$0, hr $$1) {
      cjf $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<he.c<cli>> $$3 = clj.a($$1, $$0.a(2));
         Optional<he.c<clk>> $$4 = cll.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<clh> $$5 = clh.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cjf.b;
            }

            cjf $$6 = $$2.p();
            $$6.f(1);
            clh $$7 = new clh($$3.get(), $$4.get());
            if (clh.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cjf.b;
   }

   @Override
   public cjf a(hr $$0) {
      cjf $$1 = new cjf(cji.oT);
      Optional<he.c<clk>> $$2 = $$0.d(jc.aE).h().findFirst();
      if ($$2.isPresent()) {
         Optional<he.c<cli>> $$3 = $$0.d(jc.aD).b(clj.d);
         if ($$3.isPresent()) {
            clh $$4 = new clh($$3.get(), $$2.get());
            clh.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cjf $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cjf $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cjf $$0) {
      return this.c.a($$0);
   }

   @Override
   public cmm<?> an_() {
      return cmm.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cmg::c);
   }

   public static class a implements cmm<cmz> {
      private static final Codec<cmz> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cmg.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cmg.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cmg.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cmz::new)
      );

      @Override
      public Codec<cmz> a() {
         return x;
      }

      public cmz b(so $$0) {
         cmg $$1 = cmg.b($$0);
         cmg $$2 = cmg.b($$0);
         cmg $$3 = cmg.b($$0);
         return new cmz($$1, $$2, $$3);
      }

      public void a(so $$0, cmz $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
