import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cys implements cxz {
   final String a;
   final cxx b;
   final cuc c;
   final js<cyf> d;

   public cys(String $$0, cxx $$1, cuc $$2, js<cyf> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cyn<?> ap_() {
      return cyn.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cxx d() {
      return this.b;
   }

   @Override
   public cuc a(jl.a $$0) {
      return this.c;
   }

   @Override
   public js<cyf> a() {
      return this.d;
   }

   public boolean a(cxy $$0, dcf $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cuc a(cxy $$0, jl.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cyn<cys> {
      private static final MapCodec<cys> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cxx.e.fieldOf("category").orElse(cxx.d).forGetter($$0x -> $$0x.b),
                  cuc.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyf.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyf[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyf[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(js.a(cyf.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cys::new)
      );
      public static final ys<wf, cys> x = ys.a(cys.a::a, cys.a::a);

      @Override
      public MapCodec<cys> a() {
         return y;
      }

      @Override
      public ys<wf, cys> b() {
         return x;
      }

      private static cys a(wf $$0) {
         String $$1 = $$0.p();
         cxx $$2 = $$0.b(cxx.class);
         int $$3 = $$0.l();
         js<cyf> $$4 = js.a($$3, cyf.a);
         $$4.replaceAll($$1x -> cyf.b.decode($$0));
         cuc $$5 = cuc.i.decode($$0);
         return new cys($$1, $$2, $$5, $$4);
      }

      private static void a(wf $$0, cys $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyf $$2 : $$1.d) {
            cyf.b.encode($$0, $$2);
         }

         cuc.i.encode($$0, $$1.c);
      }
   }
}
