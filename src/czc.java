import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czc implements cza {
   final cyf a;
   final cyf b;
   final cyf c;
   final cuc d;

   public czc(cyf $$0, cyf $$1, cyf $$2, cuc $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public boolean a(czb $$0, dcf $$1) {
      return this.a.a($$0.c()) && this.b.a($$0.d()) && this.c.a($$0.e());
   }

   public cuc a(czb $$0, jl.a $$1) {
      cuc $$2 = $$0.d().a(this.d.g(), this.d.H());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cuc a(jl.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cuc $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuc $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuc $$0) {
      return this.c.a($$0);
   }

   @Override
   public cyn<?> ap_() {
      return cyn.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyf::c);
   }

   public static class a implements cyn<czc> {
      private static final MapCodec<czc> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyf.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyf.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyf.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cuc.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czc::new)
      );
      public static final ys<wf, czc> x = ys.a(czc.a::a, czc.a::a);

      @Override
      public MapCodec<czc> a() {
         return y;
      }

      @Override
      public ys<wf, czc> b() {
         return x;
      }

      private static czc a(wf $$0) {
         cyf $$1 = cyf.b.decode($$0);
         cyf $$2 = cyf.b.decode($$0);
         cyf $$3 = cyf.b.decode($$0);
         cuc $$4 = cuc.i.decode($$0);
         return new czc($$1, $$2, $$3, $$4);
      }

      private static void a(wf $$0, czc $$1) {
         cyf.b.encode($$0, $$1.a);
         cyf.b.encode($$0, $$1.b);
         cyf.b.encode($$0, $$1.c);
         cuc.i.encode($$0, $$1.d);
      }
   }
}
