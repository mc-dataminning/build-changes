import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czd implements czb {
   final cyg a;
   final cyg b;
   final cyg c;
   final cud d;

   public czd(cyg $$0, cyg $$1, cyg $$2, cud $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public boolean a(czc $$0, dcg $$1) {
      return this.a.a($$0.c()) && this.b.a($$0.d()) && this.c.a($$0.e());
   }

   public cud a(czc $$0, jl.a $$1) {
      cud $$2 = $$0.d().a(this.d.g(), this.d.H());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cud a(jl.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cud $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cud $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cud $$0) {
      return this.c.a($$0);
   }

   @Override
   public cyo<?> ap_() {
      return cyo.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyg::c);
   }

   public static class a implements cyo<czd> {
      private static final MapCodec<czd> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyg.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyg.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyg.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cud.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czd::new)
      );
      public static final ys<wf, czd> x = ys.a(czd.a::a, czd.a::a);

      @Override
      public MapCodec<czd> a() {
         return y;
      }

      @Override
      public ys<wf, czd> b() {
         return x;
      }

      private static czd a(wf $$0) {
         cyg $$1 = cyg.b.decode($$0);
         cyg $$2 = cyg.b.decode($$0);
         cyg $$3 = cyg.b.decode($$0);
         cud $$4 = cud.i.decode($$0);
         return new czd($$1, $$2, $$3, $$4);
      }

      private static void a(wf $$0, czd $$1) {
         cyg.b.encode($$0, $$1.a);
         cyg.b.encode($$0, $$1.b);
         cyg.b.encode($$0, $$1.c);
         cud.i.encode($$0, $$1.d);
      }
   }
}
