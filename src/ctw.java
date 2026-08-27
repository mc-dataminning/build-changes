import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ctw implements cte {
   final String a;
   final ctd b;
   final cqk c;
   final iu<ctk> d;

   public ctw(String $$0, ctd $$1, cqk $$2, iu<ctk> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public ctd d() {
      return this.b;
   }

   @Override
   public cqk a(iz $$0) {
      return this.c;
   }

   @Override
   public iu<ctk> a() {
      return this.d;
   }

   public boolean a(cme $$0, cwz $$1) {
      ciw $$2 = new ciw();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cqk a(cme $$0, iz $$1) {
      return this.c.q();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements ctr<ctw> {
      private static final Codec<ctw> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awe.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  ctd.e.fieldOf("category").orElse(ctd.d).forGetter($$0x -> $$0x.b),
                  cqk.c.fieldOf("result").forGetter($$0x -> $$0x.c),
                  ctk.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     ctk[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(ctk[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(iu.a(ctk.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, ctw::new)
      );
      public static final xs<vf, ctw> x = xs.a(ctw.a::a, ctw.a::a);

      @Override
      public Codec<ctw> a() {
         return y;
      }

      @Override
      public xs<vf, ctw> b() {
         return x;
      }

      private static ctw a(vf $$0) {
         String $$1 = $$0.p();
         ctd $$2 = $$0.b(ctd.class);
         int $$3 = $$0.l();
         iu<ctk> $$4 = iu.a($$3, ctk.a);
         $$4.replaceAll($$1x -> ctk.b.decode($$0));
         cqk $$5 = cqk.f.decode($$0);
         return new ctw($$1, $$2, $$5, $$4);
      }

      private static void a(vf $$0, ctw $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (ctk $$2 : $$1.d) {
            ctk.b.encode($$0, $$2);
         }

         cqk.f.encode($$0, $$1.c);
      }
   }
}
