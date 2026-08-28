import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class czl implements czj {
   final cyq a;
   final cyq b;
   final cyq c;

   public czl(cyq $$0, cyq $$1, cyq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bql $$0, dbw $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cun a(bql $$0, jk.a $$1) {
      cun $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ji.c<cws>> $$3 = cwt.a($$1, $$0.a(2));
         Optional<ji.c<cwu>> $$4 = cwv.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cwr $$5 = $$2.a(km.J);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return cun.l;
            }

            cun $$6 = $$2.c(1);
            $$6.b(km.J, new cwr($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return cun.l;
   }

   @Override
   public cun a(jk.a $$0) {
      cun $$1 = new cun(cuq.pH);
      Optional<ji.c<cwu>> $$2 = $$0.b(lq.aP).b().findFirst();
      Optional<ji.c<cws>> $$3 = $$0.b(lq.aO).a(cwt.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(km.J, new cwr($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(cun $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cun $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cun $$0) {
      return this.c.a($$0);
   }

   @Override
   public cyx<?> ap_() {
      return cyx.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyq::c);
   }

   public static class a implements cyx<czl> {
      private static final MapCodec<czl> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyq.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyq.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyq.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, czl::new)
      );
      public static final zm<wz, czl> x = zm.a(czl.a::a, czl.a::a);

      @Override
      public MapCodec<czl> a() {
         return y;
      }

      @Override
      public zm<wz, czl> b() {
         return x;
      }

      private static czl a(wz $$0) {
         cyq $$1 = cyq.b.decode($$0);
         cyq $$2 = cyq.b.decode($$0);
         cyq $$3 = cyq.b.decode($$0);
         return new czl($$1, $$2, $$3);
      }

      private static void a(wz $$0, czl $$1) {
         cyq.b.encode($$0, $$1.a);
         cyq.b.encode($$0, $$1.b);
         cyq.b.encode($$0, $$1.c);
      }
   }
}
