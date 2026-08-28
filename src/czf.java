import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czf implements cyn {
   final String a;
   final cym b;
   final cuq c;
   final jr<cyt> d;

   public czf(String $$0, cym $$1, cuq $$2, jr<cyt> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cza<?> ao_() {
      return cza.b;
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
   public cuq a(jk.a $$0) {
      return this.c;
   }

   @Override
   public jr<cyt> a() {
      return this.d;
   }

   public boolean a(cql $$0, dbz $$1) {
      cnc $$2 = new cnc();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cuq a(cql $$0, jk.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cza<czf> {
      private static final MapCodec<czf> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cym.e.fieldOf("category").orElse(cym.d).forGetter($$0x -> $$0x.b),
                  cuq.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyt.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyt[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyt[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jr.a(cyt.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czf::new)
      );
      public static final zn<xa, czf> x = zn.a(czf.a::a, czf.a::a);

      @Override
      public MapCodec<czf> a() {
         return y;
      }

      @Override
      public zn<xa, czf> b() {
         return x;
      }

      private static czf a(xa $$0) {
         String $$1 = $$0.p();
         cym $$2 = $$0.b(cym.class);
         int $$3 = $$0.l();
         jr<cyt> $$4 = jr.a($$3, cyt.a);
         $$4.replaceAll($$1x -> cyt.b.decode($$0));
         cuq $$5 = cuq.i.decode($$0);
         return new czf($$1, $$2, $$5, $$4);
      }

      private static void a(xa $$0, czf $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyt $$2 : $$1.d) {
            cyt.b.encode($$0, $$2);
         }

         cuq.i.encode($$0, $$1.c);
      }
   }
}
