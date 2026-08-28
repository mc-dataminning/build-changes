import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czh implements cyo {
   final String a;
   final cym b;
   final cuo c;
   final jv<cyu> d;

   public czh(String $$0, cym $$1, cuo $$2, jv<cyu> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public czc<?> ap_() {
      return czc.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cym d() {
      return this.b;
   }

   @Override
   public cuo a(jo.a $$0) {
      return this.c;
   }

   @Override
   public jv<cyu> a() {
      return this.d;
   }

   public boolean a(cyn $$0, dcu $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cuo a(cyn $$0, jo.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements czc<czh> {
      private static final MapCodec<czh> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cym.e.fieldOf("category").orElse(cym.d).forGetter($$0x -> $$0x.b),
                  cuo.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyu.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyu[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyu[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jv.a(cyu.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czh::new)
      );
      public static final yw<wj, czh> x = yw.a(czh.a::a, czh.a::a);

      @Override
      public MapCodec<czh> a() {
         return y;
      }

      @Override
      public yw<wj, czh> b() {
         return x;
      }

      private static czh a(wj $$0) {
         String $$1 = $$0.p();
         cym $$2 = $$0.b(cym.class);
         int $$3 = $$0.l();
         jv<cyu> $$4 = jv.a($$3, cyu.a);
         $$4.replaceAll($$1x -> cyu.b.decode($$0));
         cuo $$5 = cuo.i.decode($$0);
         return new czh($$1, $$2, $$5, $$4);
      }

      private static void a(wj $$0, czh $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyu $$2 : $$1.d) {
            cyu.b.encode($$0, $$2);
         }

         cuo.i.encode($$0, $$1.c);
      }
   }
}
