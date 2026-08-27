import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cyl implements cyk {
   final cxr a;
   final cxr b;
   final cxr c;
   final cto d;

   public cyl(cxr $$0, cxr $$1, cxr $$2, cto $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bpn $$0, dax $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cto a(bpn $$0, iz.a $$1) {
      cto $$2 = $$0.a(1).a(this.d.g(), this.d.I());
      $$2.a(this.d.d());
      return $$2;
   }

   @Override
   public cto a(iz.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cto $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cto $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cto $$0) {
      return this.c.a($$0);
   }

   @Override
   public cxy<?> ao_() {
      return cxy.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cxr::c);
   }

   public static class a implements cxy<cyl> {
      private static final MapCodec<cyl> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cxr.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cxr.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cxr.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cto.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cyl::new)
      );
      public static final yv<wi, cyl> x = yv.a(cyl.a::a, cyl.a::a);

      @Override
      public MapCodec<cyl> a() {
         return y;
      }

      @Override
      public yv<wi, cyl> b() {
         return x;
      }

      private static cyl a(wi $$0) {
         cxr $$1 = cxr.b.decode($$0);
         cxr $$2 = cxr.b.decode($$0);
         cxr $$3 = cxr.b.decode($$0);
         cto $$4 = cto.f.decode($$0);
         return new cyl($$1, $$2, $$3, $$4);
      }

      private static void a(wi $$0, cyl $$1) {
         cxr.b.encode($$0, $$1.a);
         cxr.b.encode($$0, $$1.b);
         cxr.b.encode($$0, $$1.c);
         cto.f.encode($$0, $$1.d);
      }
   }
}
