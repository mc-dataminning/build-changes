import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class czr implements czp {
   final cyu a;
   final cyu b;
   final cyu c;
   final cuo d;

   public czr(cyu $$0, cyu $$1, cyu $$2, cuo $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public boolean a(czq $$0, dcu $$1) {
      return this.a.a($$0.c()) && this.b.a($$0.d()) && this.c.a($$0.e());
   }

   public cuo a(czq $$0, jo.a $$1) {
      cuo $$2 = $$0.d().a(this.d.g(), this.d.H());
      $$2.b(this.d.d());
      return $$2;
   }

   @Override
   public cuo a(jo.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cuo $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cuo $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cuo $$0) {
      return this.c.a($$0);
   }

   @Override
   public czc<?> ap_() {
      return czc.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cyu::c);
   }

   public static class a implements czc<czr> {
      private static final MapCodec<czr> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  cyu.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cyu.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cyu.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cuo.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czr::new)
      );
      public static final yw<wj, czr> x = yw.a(czr.a::a, czr.a::a);

      @Override
      public MapCodec<czr> a() {
         return y;
      }

      @Override
      public yw<wj, czr> b() {
         return x;
      }

      private static czr a(wj $$0) {
         cyu $$1 = cyu.b.decode($$0);
         cyu $$2 = cyu.b.decode($$0);
         cyu $$3 = cyu.b.decode($$0);
         cuo $$4 = cuo.i.decode($$0);
         return new czr($$1, $$2, $$3, $$4);
      }

      private static void a(wj $$0, czr $$1) {
         cyu.b.encode($$0, $$1.a);
         cyu.b.encode($$0, $$1.b);
         cyu.b.encode($$0, $$1.c);
         cuo.i.encode($$0, $$1.d);
      }
   }
}
