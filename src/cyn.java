import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cyn implements cym {
   final cxt a;
   final cxt b;
   final cxt c;
   final ctq d;

   public cyn(cxt $$0, cxt $$1, cxt $$2, ctq $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bpp $$0, daz $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public ctq a(bpp $$0, iz.a $$1) {
      ctq $$2 = $$0.a(1).a(this.d.g(), this.d.I());
      $$2.a(this.d.d());
      return $$2;
   }

   @Override
   public ctq a(iz.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(ctq $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(ctq $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(ctq $$0) {
      return this.c.a($$0);
   }

   @Override
   public cya<?> ap_() {
      return cya.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cxt::c);
   }

   public static class a implements cya<cyn> {
      private static final MapCodec<cyn> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cxt.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cxt.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cxt.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  ctq.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cyn::new)
      );
      public static final yv<wi, cyn> x = yv.a(cyn.a::a, cyn.a::a);

      @Override
      public MapCodec<cyn> a() {
         return y;
      }

      @Override
      public yv<wi, cyn> b() {
         return x;
      }

      private static cyn a(wi $$0) {
         cxt $$1 = cxt.b.decode($$0);
         cxt $$2 = cxt.b.decode($$0);
         cxt $$3 = cxt.b.decode($$0);
         ctq $$4 = ctq.f.decode($$0);
         return new cyn($$1, $$2, $$3, $$4);
      }

      private static void a(wi $$0, cyn $$1) {
         cxt.b.encode($$0, $$1.a);
         cxt.b.encode($$0, $$1.b);
         cxt.b.encode($$0, $$1.c);
         ctq.f.encode($$0, $$1.d);
      }
   }
}
