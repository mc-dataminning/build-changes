import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czo implements czm {
   final cyt a;
   final cyt b;
   final cyt c;

   public czo(cyt $$0, cyt $$1, cyt $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bqo $$0, dbz $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cuq a(bqo $$0, jk.a $$1) {
      cuq $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ji.c<cwv>> $$3 = cww.a($$1, $$0.a(2));
         Optional<ji.c<cwx>> $$4 = cwy.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cwu $$5 = $$2.a(km.K);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cuq.l;
            }

            cuq $$6 = $$2.c(1);
            $$6.b(km.K, new cwu($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cuq.l;
   }

   @Override
   public cuq a(jk.a $$0) {
      cuq $$1 = new cuq(cut.pH);
      Optional<ji.c<cwx>> $$2 = $$0.b(lq.aP).b().findFirst();
      Optional<ji.c<cwv>> $$3 = $$0.b(lq.aO).a(cww.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(km.K, new cwu($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cuq $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuq $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuq $$0) {
      return this.c.a($$0);
   }

   @Override
   public cza<?> ao_() {
      return cza.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyt::c);
   }

   public static class a implements cza<czo> {
      private static final MapCodec<czo> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyt.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyt.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyt.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czo::new)
      );
      public static final zn<xa, czo> x = zn.a(czo.a::a, czo.a::a);

      @Override
      public MapCodec<czo> a() {
         return y;
      }

      @Override
      public zn<xa, czo> b() {
         return x;
      }

      private static czo a(xa $$0) {
         cyt $$1 = cyt.b.decode($$0);
         cyt $$2 = cyt.b.decode($$0);
         cyt $$3 = cyt.b.decode($$0);
         return new czo($$1, $$2, $$3);
      }

      private static void a(xa $$0, czo $$1) {
         cyt.b.encode($$0, $$1.a);
         cyt.b.encode($$0, $$1.b);
         cyt.b.encode($$0, $$1.c);
      }
   }
}
