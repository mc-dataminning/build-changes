import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czn implements czl {
   final cys a;
   final cys b;
   final cys c;

   public czn(cys $$0, cys $$1, cys $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bqn $$0, dby $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cup a(bqn $$0, jk.a $$1) {
      cup $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ji.c<cwu>> $$3 = cwv.a($$1, $$0.a(2));
         Optional<ji.c<cww>> $$4 = cwx.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cwt $$5 = $$2.a(km.K);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cup.l;
            }

            cup $$6 = $$2.c(1);
            $$6.b(km.K, new cwt($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cup.l;
   }

   @Override
   public cup a(jk.a $$0) {
      cup $$1 = new cup(cus.pH);
      Optional<ji.c<cww>> $$2 = $$0.b(lq.aP).b().findFirst();
      Optional<ji.c<cwu>> $$3 = $$0.b(lq.aO).a(cwv.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(km.K, new cwt($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cup $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cup $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cup $$0) {
      return this.c.a($$0);
   }

   @Override
   public cyz<?> ao_() {
      return cyz.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cys::c);
   }

   public static class a implements cyz<czn> {
      private static final MapCodec<czn> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cys.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cys.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cys.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czn::new)
      );
      public static final zn<xa, czn> x = zn.a(czn.a::a, czn.a::a);

      @Override
      public MapCodec<czn> a() {
         return y;
      }

      @Override
      public zn<xa, czn> b() {
         return x;
      }

      private static czn a(xa $$0) {
         cys $$1 = cys.b.decode($$0);
         cys $$2 = cys.b.decode($$0);
         cys $$3 = cys.b.decode($$0);
         return new czn($$1, $$2, $$3);
      }

      private static void a(xa $$0, czn $$1) {
         cys.b.encode($$0, $$1.a);
         cys.b.encode($$0, $$1.b);
         cys.b.encode($$0, $$1.c);
      }
   }
}
