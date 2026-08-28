import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czp implements czn {
   final cyu a;
   final cyu b;
   final cyu c;

   public czp(cyu $$0, cyu $$1, cyu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bqp $$0, dca $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cur a(bqp $$0, jk.a $$1) {
      cur $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ji.c<cww>> $$3 = cwx.a($$1, $$0.a(2));
         Optional<ji.c<cwy>> $$4 = cwz.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cwv $$5 = $$2.a(km.K);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cur.l;
            }

            cur $$6 = $$2.c(1);
            $$6.b(km.K, new cwv($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cur.l;
   }

   @Override
   public cur a(jk.a $$0) {
      cur $$1 = new cur(cuu.pH);
      Optional<ji.c<cwy>> $$2 = $$0.b(lq.aP).b().findFirst();
      Optional<ji.c<cww>> $$3 = $$0.b(lq.aO).a(cwx.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(km.K, new cwv($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cur $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cur $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cur $$0) {
      return this.c.a($$0);
   }

   @Override
   public czb<?> ao_() {
      return czb.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyu::c);
   }

   public static class a implements czb<czp> {
      private static final MapCodec<czp> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyu.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyu.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyu.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czp::new)
      );
      public static final zn<xa, czp> x = zn.a(czp.a::a, czp.a::a);

      @Override
      public MapCodec<czp> a() {
         return y;
      }

      @Override
      public zn<xa, czp> b() {
         return x;
      }

      private static czp a(xa $$0) {
         cyu $$1 = cyu.b.decode($$0);
         cyu $$2 = cyu.b.decode($$0);
         cyu $$3 = cyu.b.decode($$0);
         return new czp($$1, $$2, $$3);
      }

      private static void a(xa $$0, czp $$1) {
         cyu.b.encode($$0, $$1.a);
         cyu.b.encode($$0, $$1.b);
         cyu.b.encode($$0, $$1.c);
      }
   }
}
