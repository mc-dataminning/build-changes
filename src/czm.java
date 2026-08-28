import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czm implements czk {
   final cyr a;
   final cyr b;
   final cyr c;

   public czm(cyr $$0, cyr $$1, cyr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bqm $$0, dbx $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cuo a(bqm $$0, jk.a $$1) {
      cuo $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ji.c<cwt>> $$3 = cwu.a($$1, $$0.a(2));
         Optional<ji.c<cwv>> $$4 = cww.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cws $$5 = $$2.a(km.K);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cuo.l;
            }

            cuo $$6 = $$2.c(1);
            $$6.b(km.K, new cws($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cuo.l;
   }

   @Override
   public cuo a(jk.a $$0) {
      cuo $$1 = new cuo(cur.pH);
      Optional<ji.c<cwv>> $$2 = $$0.b(lq.aP).b().findFirst();
      Optional<ji.c<cwt>> $$3 = $$0.b(lq.aO).a(cwu.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(km.K, new cws($$3.get(), $$2.get()));
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
   public cyy<?> ao_() {
      return cyy.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyr::c);
   }

   public static class a implements cyy<czm> {
      private static final MapCodec<czm> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyr.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyr.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyr.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czm::new)
      );
      public static final zm<wz, czm> x = zm.a(czm.a::a, czm.a::a);

      @Override
      public MapCodec<czm> a() {
         return y;
      }

      @Override
      public zm<wz, czm> b() {
         return x;
      }

      private static czm a(wz $$0) {
         cyr $$1 = cyr.b.decode($$0);
         cyr $$2 = cyr.b.decode($$0);
         cyr $$3 = cyr.b.decode($$0);
         return new czm($$1, $$2, $$3);
      }

      private static void a(wz $$0, czm $$1) {
         cyr.b.encode($$0, $$1.a);
         cyr.b.encode($$0, $$1.b);
         cyr.b.encode($$0, $$1.c);
      }
   }
}
