import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ctb implements csj {
   final String a;
   final csi b;
   final cpq c;
   final iu<csp> d;

   public ctb(String $$0, csi $$1, cpq $$2, iu<csp> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public csw<?> as_() {
      return csw.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public csi d() {
      return this.b;
   }

   @Override
   public cpq a(iy $$0) {
      return this.c;
   }

   @Override
   public iu<csp> a() {
      return this.d;
   }

   public boolean a(clk $$0, cwe $$1) {
      cie $$2 = new cie();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cpq a(clk $$0, iy $$1) {
      return this.c.q();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements csw<ctb> {
      private static final Codec<ctb> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avu.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  csi.e.fieldOf("category").orElse(csi.d).forGetter($$0x -> $$0x.b),
                  cpq.c.fieldOf("result").forGetter($$0x -> $$0x.c),
                  csp.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     csp[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(csp[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(iu.a(csp.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, ctb::new)
      );
      public static final xq<vd, ctb> x = xq.a(ctb.a::a, ctb.a::a);

      @Override
      public Codec<ctb> a() {
         return y;
      }

      @Override
      public xq<vd, ctb> b() {
         return x;
      }

      private static ctb a(vd $$0) {
         String $$1 = $$0.p();
         csi $$2 = $$0.b(csi.class);
         int $$3 = $$0.l();
         iu<csp> $$4 = iu.a($$3, csp.a);
         $$4.replaceAll($$1x -> csp.b.decode($$0));
         cpq $$5 = cpq.f.decode($$0);
         return new ctb($$1, $$2, $$5, $$4);
      }

      private static void a(vd $$0, ctb $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (csp $$2 : $$1.d) {
            csp.b.encode($$0, $$2);
         }

         cpq.f.encode($$0, $$1.c);
      }
   }
}
