import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czh implements czg {
   final cyn a;
   final cyn b;
   final cyn c;
   final cuk d;

   public czh(cyn $$0, cyn $$1, cyn $$2, cuk $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bqi $$0, dbt $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cuk a(bqi $$0, jk.a $$1) {
      cuk $$2 = $$0.a(1).a(this.d.g(), this.d.I());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cuk a(jk.a $$0) {
      return this.d;
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
      return cyu.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyn::c);
   }

   public static class a implements cyu<czh> {
      private static final MapCodec<czh> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyn.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyn.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyn.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cuk.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czh::new)
      );
      public static final zj<ww, czh> x = zj.a(czh.a::a, czh.a::a);

      @Override
      public MapCodec<czh> a() {
         return y;
      }

      @Override
      public zj<ww, czh> b() {
         return x;
      }

      private static czh a(ww $$0) {
         cyn $$1 = cyn.b.decode($$0);
         cyn $$2 = cyn.b.decode($$0);
         cyn $$3 = cyn.b.decode($$0);
         cuk $$4 = cuk.i.decode($$0);
         return new czh($$1, $$2, $$3, $$4);
      }

      private static void a(ww $$0, czh $$1) {
         cyn.b.encode($$0, $$1.a);
         cyn.b.encode($$0, $$1.b);
         cyn.b.encode($$0, $$1.c);
         cuk.i.encode($$0, $$1.d);
      }
   }
}
