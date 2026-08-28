import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czk implements czj {
   final cyq a;
   final cyq b;
   final cyq c;
   final cun d;

   public czk(cyq $$0, cyq $$1, cyq $$2, cun $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bql $$0, dbw $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cun a(bql $$0, jk.a $$1) {
      cun $$2 = $$0.a(1).a(this.d.g(), this.d.I());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cun a(jk.a $$0) {
      return this.d;
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
      return cyx.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyq::c);
   }

   public static class a implements cyx<czk> {
      private static final MapCodec<czk> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyq.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyq.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyq.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cun.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czk::new)
      );
      public static final zm<wz, czk> x = zm.a(czk.a::a, czk.a::a);

      @Override
      public MapCodec<czk> a() {
         return y;
      }

      @Override
      public zm<wz, czk> b() {
         return x;
      }

      private static czk a(wz $$0) {
         cyq $$1 = cyq.b.decode($$0);
         cyq $$2 = cyq.b.decode($$0);
         cyq $$3 = cyq.b.decode($$0);
         cun $$4 = cun.i.decode($$0);
         return new czk($$1, $$2, $$3, $$4);
      }

      private static void a(wz $$0, czk $$1) {
         cyq.b.encode($$0, $$1.a);
         cyq.b.encode($$0, $$1.b);
         cyq.b.encode($$0, $$1.c);
         cun.i.encode($$0, $$1.d);
      }
   }
}
