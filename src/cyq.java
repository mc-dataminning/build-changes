import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyq implements cxx {
   final String a;
   final cxv b;
   final cua c;
   final js<cyd> d;

   public cyq(String $$0, cxv $$1, cua $$2, js<cyd> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cxv d() {
      return this.b;
   }

   @Override
   public cua a(jl.a $$0) {
      return this.c;
   }

   @Override
   public js<cyd> a() {
      return this.d;
   }

   public boolean a(cxw $$0, dcd $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cua a(cxw $$0, jl.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cyl<cyq> {
      private static final MapCodec<cyq> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cxv.e.fieldOf("category").orElse(cxv.d).forGetter($$0x -> $$0x.b),
                  cua.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyd.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyd[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyd[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(js.a(cyd.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cyq::new)
      );
      public static final ys<wf, cyq> x = ys.a(cyq.a::a, cyq.a::a);

      @Override
      public MapCodec<cyq> a() {
         return y;
      }

      @Override
      public ys<wf, cyq> b() {
         return x;
      }

      private static cyq a(wf $$0) {
         String $$1 = $$0.p();
         cxv $$2 = $$0.b(cxv.class);
         int $$3 = $$0.l();
         js<cyd> $$4 = js.a($$3, cyd.a);
         $$4.replaceAll($$1x -> cyd.b.decode($$0));
         cua $$5 = cua.i.decode($$0);
         return new cyq($$1, $$2, $$5, $$4);
      }

      private static void a(wf $$0, cyq $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyd $$2 : $$1.d) {
            cyd.b.encode($$0, $$2);
         }

         cua.i.encode($$0, $$1.c);
      }
   }
}
