import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czm implements czl {
   final cys a;
   final cys b;
   final cys c;
   final cup d;

   public czm(cys $$0, cys $$1, cys $$2, cup $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bqn $$0, dby $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cup a(bqn $$0, jk.a $$1) {
      cup $$2 = $$0.a(1).a(this.d.g(), this.d.I());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cup a(jk.a $$0) {
      return this.d;
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
      return cyz.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cys::c);
   }

   public static class a implements cyz<czm> {
      private static final MapCodec<czm> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cys.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cys.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cys.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cup.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czm::new)
      );
      public static final zn<xa, czm> x = zn.a(czm.a::a, czm.a::a);

      @Override
      public MapCodec<czm> a() {
         return y;
      }

      @Override
      public zn<xa, czm> b() {
         return x;
      }

      private static czm a(xa $$0) {
         cys $$1 = cys.b.decode($$0);
         cys $$2 = cys.b.decode($$0);
         cys $$3 = cys.b.decode($$0);
         cup $$4 = cup.i.decode($$0);
         return new czm($$1, $$2, $$3, $$4);
      }

      private static void a(xa $$0, czm $$1) {
         cys.b.encode($$0, $$1.a);
         cys.b.encode($$0, $$1.b);
         cys.b.encode($$0, $$1.c);
         cup.i.encode($$0, $$1.d);
      }
   }
}
