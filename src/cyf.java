import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyf implements cxn {
   final String a;
   final cxm b;
   final ctq c;
   final jg<cxt> d;

   public cyf(String $$0, cxm $$1, ctq $$2, jg<cxt> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cya<?> ap_() {
      return cya.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cxm d() {
      return this.b;
   }

   @Override
   public ctq a(iz.a $$0) {
      return this.c;
   }

   @Override
   public jg<cxt> a() {
      return this.d;
   }

   public boolean a(cpl $$0, daz $$1) {
      cmc $$2 = new cmc();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public ctq a(cpl $$0, iz.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cya<cyf> {
      private static final MapCodec<cyf> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cxm.e.fieldOf("category").orElse(cxm.d).forGetter($$0x -> $$0x.b),
                  ctq.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cxt.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cxt[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cxt[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jg.a(cxt.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cyf::new)
      );
      public static final yv<wi, cyf> x = yv.a(cyf.a::a, cyf.a::a);

      @Override
      public MapCodec<cyf> a() {
         return y;
      }

      @Override
      public yv<wi, cyf> b() {
         return x;
      }

      private static cyf a(wi $$0) {
         String $$1 = $$0.p();
         cxm $$2 = $$0.b(cxm.class);
         int $$3 = $$0.l();
         jg<cxt> $$4 = jg.a($$3, cxt.a);
         $$4.replaceAll($$1x -> cxt.b.decode($$0));
         ctq $$5 = ctq.f.decode($$0);
         return new cyf($$1, $$2, $$5, $$4);
      }

      private static void a(wi $$0, cyf $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cxt $$2 : $$1.d) {
            cxt.b.encode($$0, $$2);
         }

         ctq.f.encode($$0, $$1.c);
      }
   }
}
