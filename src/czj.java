import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czj implements cyq {
   final String a;
   final cyo b;
   final cuq c;
   final jv<cyw> d;

   public czj(String $$0, cyo $$1, cuq $$2, jv<cyw> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cze<?> at_() {
      return cze.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cyo d() {
      return this.b;
   }

   @Override
   public cuq a(jo.a $$0) {
      return this.c;
   }

   @Override
   public jv<cyw> a() {
      return this.d;
   }

   public boolean a(cyp $$0, dcw $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cuq a(cyp $$0, jo.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cze<czj> {
      private static final MapCodec<czj> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cyo.e.fieldOf("category").orElse(cyo.d).forGetter($$0x -> $$0x.b),
                  cuq.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyw.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyw[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyw[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jv.a(cyw.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czj::new)
      );
      public static final yx<wk, czj> x = yx.a(czj.a::a, czj.a::a);

      @Override
      public MapCodec<czj> a() {
         return y;
      }

      @Override
      public yx<wk, czj> b() {
         return x;
      }

      private static czj a(wk $$0) {
         String $$1 = $$0.p();
         cyo $$2 = $$0.b(cyo.class);
         int $$3 = $$0.l();
         jv<cyw> $$4 = jv.a($$3, cyw.a);
         $$4.replaceAll($$1x -> cyw.b.decode($$0));
         cuq $$5 = cuq.i.decode($$0);
         return new czj($$1, $$2, $$5, $$4);
      }

      private static void a(wk $$0, czj $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyw $$2 : $$1.d) {
            cyw.b.encode($$0, $$2);
         }

         cuq.i.encode($$0, $$1.c);
      }
   }
}
