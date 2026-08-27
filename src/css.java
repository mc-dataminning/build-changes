import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class css implements csr {
   final cry a;
   final cry b;
   final cry c;
   final coz d;

   public css(cry $$0, cry $$1, cry $$2, coz $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bln $$0, cvn $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public coz a(bln $$0, iw $$1) {
      coz $$2 = this.d.q();
      sw $$3 = $$0.a(1).w();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public coz a(iw $$0) {
      return this.d;
   }

   @Override
   public boolean a(coz $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(coz $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(coz $$0) {
      return this.c.a($$0);
   }

   @Override
   public csf<?> at_() {
      return csf.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cry::c);
   }

   public static class a implements csf<css> {
      private static final Codec<css> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cry.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cry.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cry.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  coz.c.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, css::new)
      );
      public static final xo<vb, css> x = xo.a(css.a::a, css.a::a);

      @Override
      public Codec<css> a() {
         return y;
      }

      @Override
      public xo<vb, css> b() {
         return x;
      }

      private static css a(vb $$0) {
         cry $$1 = cry.b.decode($$0);
         cry $$2 = cry.b.decode($$0);
         cry $$3 = cry.b.decode($$0);
         coz $$4 = coz.f.decode($$0);
         return new css($$1, $$2, $$3, $$4);
      }

      private static void a(vb $$0, css $$1) {
         cry.b.encode($$0, $$1.a);
         cry.b.encode($$0, $$1.b);
         cry.b.encode($$0, $$1.c);
         coz.f.encode($$0, $$1.d);
      }
   }
}
