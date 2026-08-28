import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czs implements czp {
   final cyu a;
   final cyu b;
   final cyu c;

   public czs(cyu $$0, cyu $$1, cyu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(czq $$0, dcu $$1) {
      return this.a.a($$0.c()) && this.b.a($$0.d()) && this.c.a($$0.e());
   }

   public cuo a(czq $$0, jo.a $$1) {
      cuo $$2 = $$0.d();
      if (this.b.a($$2)) {
         Optional<jm.c<cww>> $$3 = cwx.a($$1, $$0.e());
         Optional<jm.c<cwy>> $$4 = cwz.a($$1, $$0.c());
         if ($$3.isPresent() && $$4.isPresent()) {
            cwv $$5 = $$2.a(kq.K);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cuo.l;
            }

            cuo $$6 = $$2.c(1);
            $$6.b(kq.K, new cwv($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cuo.l;
   }

   @Override
   public cuo a(jo.a $$0) {
      cuo $$1 = new cuo(cur.pH);
      Optional<jm.c<cwy>> $$2 = $$0.b(lu.aX).b().findFirst();
      Optional<jm.c<cww>> $$3 = $$0.b(lu.aW).a(cwx.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(kq.K, new cwv($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cuo $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuo $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuo $$0) {
      return this.c.a($$0);
   }

   @Override
   public czc<?> ap_() {
      return czc.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyu::c);
   }

   public static class a implements czc<czs> {
      private static final MapCodec<czs> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyu.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyu.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyu.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czs::new)
      );
      public static final yw<wj, czs> x = yw.a(czs.a::a, czs.a::a);

      @Override
      public MapCodec<czs> a() {
         return y;
      }

      @Override
      public yw<wj, czs> b() {
         return x;
      }

      private static czs a(wj $$0) {
         cyu $$1 = cyu.b.decode($$0);
         cyu $$2 = cyu.b.decode($$0);
         cyu $$3 = cyu.b.decode($$0);
         return new czs($$1, $$2, $$3);
      }

      private static void a(wj $$0, czs $$1) {
         cyu.b.encode($$0, $$1.a);
         cyu.b.encode($$0, $$1.b);
         cyu.b.encode($$0, $$1.c);
      }
   }
}
