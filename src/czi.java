import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czi implements czg {
   final cyn a;
   final cyn b;
   final cyn c;

   public czi(cyn $$0, cyn $$1, cyn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bqi $$0, dbt $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cuk a(bqi $$0, jk.a $$1) {
      cuk $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ji.c<cwp>> $$3 = cwq.a($$1, $$0.a(2));
         Optional<ji.c<cwr>> $$4 = cws.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cwo $$5 = $$2.a(km.J);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cuk.l;
            }

            cuk $$6 = $$2.c(1);
            $$6.b(km.J, new cwo($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cuk.l;
   }

   @Override
   public cuk a(jk.a $$0) {
      cuk $$1 = new cuk(cun.pH);
      Optional<ji.c<cwr>> $$2 = $$0.b(lq.aP).b().findFirst();
      Optional<ji.c<cwp>> $$3 = $$0.b(lq.aO).a(cwq.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(km.J, new cwo($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cuk $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuk $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuk $$0) {
      return this.c.a($$0);
   }

   @Override
   public cyu<?> ap_() {
      return cyu.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyn::c);
   }

   public static class a implements cyu<czi> {
      private static final MapCodec<czi> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyn.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyn.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyn.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czi::new)
      );
      public static final zj<ww, czi> x = zj.a(czi.a::a, czi.a::a);

      @Override
      public MapCodec<czi> a() {
         return y;
      }

      @Override
      public zj<ww, czi> b() {
         return x;
      }

      private static czi a(ww $$0) {
         cyn $$1 = cyn.b.decode($$0);
         cyn $$2 = cyn.b.decode($$0);
         cyn $$3 = cyn.b.decode($$0);
         return new czi($$1, $$2, $$3);
      }

      private static void a(ww $$0, czi $$1) {
         cyn.b.encode($$0, $$1.a);
         cyn.b.encode($$0, $$1.b);
         cyn.b.encode($$0, $$1.c);
      }
   }
}
