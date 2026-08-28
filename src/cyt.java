import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyt implements cya {
   final String a;
   final cxy b;
   final cud c;
   final js<cyg> d;

   public cyt(String $$0, cxy $$1, cud $$2, js<cyg> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cxy d() {
      return this.b;
   }

   @Override
   public cud a(jl.a $$0) {
      return this.c;
   }

   @Override
   public js<cyg> a() {
      return this.d;
   }

   public boolean a(cxz $$0, dcg $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cud a(cxz $$0, jl.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cyo<cyt> {
      private static final MapCodec<cyt> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cxy.e.fieldOf("category").orElse(cxy.d).forGetter($$0x -> $$0x.b),
                  cud.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyg.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyg[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyg[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(js.a(cyg.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cyt::new)
      );
      public static final ys<wf, cyt> x = ys.a(cyt.a::a, cyt.a::a);

      @Override
      public MapCodec<cyt> a() {
         return y;
      }

      @Override
      public ys<wf, cyt> b() {
         return x;
      }

      private static cyt a(wf $$0) {
         String $$1 = $$0.p();
         cxy $$2 = $$0.b(cxy.class);
         int $$3 = $$0.l();
         js<cyg> $$4 = js.a($$3, cyg.a);
         $$4.replaceAll($$1x -> cyg.b.decode($$0));
         cud $$5 = cud.i.decode($$0);
         return new cyt($$1, $$2, $$5, $$4);
      }

      private static void a(wf $$0, cyt $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyg $$2 : $$1.d) {
            cyg.b.encode($$0, $$2);
         }

         cud.i.encode($$0, $$1.c);
      }
   }
}
