import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class csx implements csv {
   final csc a;
   final csc b;
   final csc c;

   public csx(csc $$0, csc $$1, csc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(blp $$0, cvr $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cpd a(blp $$0, iw $$1) {
      cpd $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ij.c<crf>> $$3 = crg.a($$1, $$0.a(2));
         Optional<ij.c<crh>> $$4 = cri.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cre> $$5 = cre.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cpd.h;
            }

            cpd $$6 = $$2.q();
            $$6.f(1);
            cre $$7 = new cre($$3.get(), $$4.get());
            if (cre.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cpd.h;
   }

   @Override
   public cpd a(iw $$0) {
      cpd $$1 = new cpd(cpg.pG);
      Optional<ij.c<crh>> $$2 = $$0.d(kg.aJ).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ij.c<crf>> $$3 = $$0.d(kg.aI).b(crg.d);
         if ($$3.isPresent()) {
            cre $$4 = new cre($$3.get(), $$2.get());
            cre.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cpd $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cpd $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cpd $$0) {
      return this.c.a($$0);
   }

   @Override
   public csj<?> at_() {
      return csj.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(csc::c);
   }

   public static class a implements csj<csx> {
      private static final Codec<csx> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  csc.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  csc.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  csc.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, csx::new)
      );
      public static final xo<vb, csx> x = xo.a(csx.a::a, csx.a::a);

      @Override
      public Codec<csx> a() {
         return y;
      }

      @Override
      public xo<vb, csx> b() {
         return x;
      }

      private static csx a(vb $$0) {
         csc $$1 = csc.b.decode($$0);
         csc $$2 = csc.b.decode($$0);
         csc $$3 = csc.b.decode($$0);
         return new csx($$1, $$2, $$3);
      }

      private static void a(vb $$0, csx $$1) {
         csc.b.encode($$0, $$1.a);
         csc.b.encode($$0, $$1.b);
         csc.b.encode($$0, $$1.c);
      }
   }
}
