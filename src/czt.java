import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czt implements czr {
   final cyw a;
   final cyw b;
   final cyw c;
   final cuq d;

   public czt(cyw $$0, cyw $$1, cyw $$2, cuq $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public boolean a(czs $$0, dcw $$1) {
      return this.a.a($$0.c()) && this.b.a($$0.d()) && this.c.a($$0.e());
   }

   public cuq a(czs $$0, jo.a $$1) {
      cuq $$2 = $$0.d().a(this.d.g(), this.d.H());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cuq a(jo.a $$0) {
      return this.d;
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
   public cze<?> at_() {
      return cze.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyw::c);
   }

   public static class a implements cze<czt> {
      private static final MapCodec<czt> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyw.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyw.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyw.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cuq.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czt::new)
      );
      public static final yx<wk, czt> x = yx.a(czt.a::a, czt.a::a);

      @Override
      public MapCodec<czt> a() {
         return y;
      }

      @Override
      public yx<wk, czt> b() {
         return x;
      }

      private static czt a(wk $$0) {
         cyw $$1 = cyw.b.decode($$0);
         cyw $$2 = cyw.b.decode($$0);
         cyw $$3 = cyw.b.decode($$0);
         cuq $$4 = cuq.i.decode($$0);
         return new czt($$1, $$2, $$3, $$4);
      }

      private static void a(wk $$0, czt $$1) {
         cyw.b.encode($$0, $$1.a);
         cyw.b.encode($$0, $$1.b);
         cyw.b.encode($$0, $$1.c);
         cuq.i.encode($$0, $$1.d);
      }
   }
}
