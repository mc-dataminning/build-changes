import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyd implements cxl {
   final String a;
   final cxk b;
   final cto c;
   final jg<cxr> d;

   public cyd(String $$0, cxk $$1, cto $$2, jg<cxr> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cxk d() {
      return this.b;
   }

   @Override
   public cto a(iz.a $$0) {
      return this.c;
   }

   @Override
   public jg<cxr> a() {
      return this.d;
   }

   public boolean a(cpj $$0, dax $$1) {
      cma $$2 = new cma();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cto a(cpj $$0, iz.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cxy<cyd> {
      private static final MapCodec<cyd> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cxk.e.fieldOf("category").orElse(cxk.d).forGetter($$0x -> $$0x.b),
                  cto.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cxr.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cxr[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cxr[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jg.a(cxr.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cyd::new)
      );
      public static final yv<wi, cyd> x = yv.a(cyd.a::a, cyd.a::a);

      @Override
      public MapCodec<cyd> a() {
         return y;
      }

      @Override
      public yv<wi, cyd> b() {
         return x;
      }

      private static cyd a(wi $$0) {
         String $$1 = $$0.p();
         cxk $$2 = $$0.b(cxk.class);
         int $$3 = $$0.l();
         jg<cxr> $$4 = jg.a($$3, cxr.a);
         $$4.replaceAll($$1x -> cxr.b.decode($$0));
         cto $$5 = cto.f.decode($$0);
         return new cyd($$1, $$2, $$5, $$4);
      }

      private static void a(wi $$0, cyd $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cxr $$2 : $$1.d) {
            cxr.b.encode($$0, $$2);
         }

         cto.f.encode($$0, $$1.c);
      }
   }
}
