import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czj implements cyp {
   final String a;
   final cyo b;
   final cuh c;
   final jj<cyv> d;

   public czj(String $$0, cyo $$1, cuh $$2, jj<cyv> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cze<?> ao_() {
      return cze.c;
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
   public cuh a(jc.a $$0) {
      return this.c;
   }

   @Override
   public jj<cyv> a() {
      return this.d;
   }

   public boolean a(cpw $$0, dca $$1) {
      cmc $$2 = new cmc();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cuh a(cpw $$0, jc.a $$1) {
      return this.c.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cze<czj> {
      private static final Codec<czj> A = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cyo.e.fieldOf("category").orElse(cyo.d).forGetter($$0x -> $$0x.b),
                  cuh.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyv.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyv[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyv[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jj.a(cyv.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czj::new)
      );
      public static final zc<wp, czj> a = zc.a(czj.a::a, czj.a::a);

      @Override
      public Codec<czj> a() {
         return A;
      }

      @Override
      public zc<wp, czj> b() {
         return a;
      }

      private static czj a(wp $$0) {
         String $$1 = $$0.p();
         cyo $$2 = $$0.b(cyo.class);
         int $$3 = $$0.l();
         jj<cyv> $$4 = jj.a($$3, cyv.a);
         $$4.replaceAll($$1x -> cyv.b.decode($$0));
         cuh $$5 = cuh.f.decode($$0);
         return new czj($$1, $$2, $$5, $$4);
      }

      private static void a(wp $$0, czj $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyv $$2 : $$1.d) {
            cyv.b.encode($$0, $$2);
         }

         cuh.f.encode($$0, $$1.c);
      }
   }
}
