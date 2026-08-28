import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cza implements cyy {
   final cyd a;
   final cyd b;
   final cyd c;
   final cua d;

   public cza(cyd $$0, cyd $$1, cyd $$2, cua $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public boolean a(cyz $$0, dcd $$1) {
      return this.a.a($$0.c()) && this.b.a($$0.d()) && this.c.a($$0.e());
   }

   public cua a(cyz $$0, jl.a $$1) {
      cua $$2 = $$0.d().a(this.d.g(), this.d.H());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cua a(jl.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cua $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cua $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cua $$0) {
      return this.c.a($$0);
   }

   @Override
   public cyl<?> ap_() {
      return cyl.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyd::c);
   }

   public static class a implements cyl<cza> {
      private static final MapCodec<cza> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyd.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyd.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyd.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cua.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cza::new)
      );
      public static final ys<wf, cza> x = ys.a(cza.a::a, cza.a::a);

      @Override
      public MapCodec<cza> a() {
         return y;
      }

      @Override
      public ys<wf, cza> b() {
         return x;
      }

      private static cza a(wf $$0) {
         cyd $$1 = cyd.b.decode($$0);
         cyd $$2 = cyd.b.decode($$0);
         cyd $$3 = cyd.b.decode($$0);
         cua $$4 = cua.i.decode($$0);
         return new cza($$1, $$2, $$3, $$4);
      }

      private static void a(wf $$0, cza $$1) {
         cyd.b.encode($$0, $$1.a);
         cyd.b.encode($$0, $$1.b);
         cyd.b.encode($$0, $$1.c);
         cua.i.encode($$0, $$1.d);
      }
   }
}
