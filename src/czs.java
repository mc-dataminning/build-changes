import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czs implements czq {
   final cyv a;
   final cyv b;
   final cyv c;

   public czs(cyv $$0, cyv $$1, cyv $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bpt $$0, dca $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cuh a(bpt $$0, jc.a $$1) {
      cuh $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ja.c<cwv>> $$3 = cww.a($$1, $$0.a(2));
         Optional<ja.c<cwx>> $$4 = cwy.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cwu $$5 = $$2.a(ke.I);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cuh.i;
            }

            cuh $$6 = $$2.c(1);
            $$6.b(ke.I, new cwu($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cuh.i;
   }

   @Override
   public cuh a(jc.a $$0) {
      cuh $$1 = new cuh(cuk.ra);
      Optional<ja.c<cwx>> $$2 = $$0.b(li.aP).b().findFirst();
      Optional<ja.c<cwv>> $$3 = $$0.b(li.aO).a(cww.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(ke.I, new cwu($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cuh $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuh $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuh $$0) {
      return this.c.a($$0);
   }

   @Override
   public cze<?> ao_() {
      return cze.x;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyv::c);
   }

   public static class a implements cze<czs> {
      private static final Codec<czs> A = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyv.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyv.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyv.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czs::new)
      );
      public static final zc<wp, czs> a = zc.a(czs.a::a, czs.a::a);

      @Override
      public Codec<czs> a() {
         return A;
      }

      @Override
      public zc<wp, czs> b() {
         return a;
      }

      private static czs a(wp $$0) {
         cyv $$1 = cyv.b.decode($$0);
         cyv $$2 = cyv.b.decode($$0);
         cyv $$3 = cyv.b.decode($$0);
         return new czs($$1, $$2, $$3);
      }

      private static void a(wp $$0, czs $$1) {
         cyv.b.encode($$0, $$1.a);
         cyv.b.encode($$0, $$1.b);
         cyv.b.encode($$0, $$1.c);
      }
   }
}
