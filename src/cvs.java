import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvs implements cva {
   final String a;
   final cuz b;
   final crj c;
   final iu<cvg> d;

   public cvs(String $$0, cuz $$1, crj $$2, iu<cvg> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cuz d() {
      return this.b;
   }

   @Override
   public crj a(iz $$0) {
      return this.c;
   }

   @Override
   public iu<cvg> a() {
      return this.d;
   }

   public boolean a(cnf $$0, cyx $$1) {
      cjx $$2 = new cjx();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public crj a(cnf $$0, iz $$1) {
      return this.c.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cvn<cvs> {
      private static final Codec<cvs> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aws.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cuz.e.fieldOf("category").orElse(cuz.d).forGetter($$0x -> $$0x.b),
                  crj.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cvg.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cvg[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cvg[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(iu.a(cvg.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cvs::new)
      );
      public static final ye<vr, cvs> x = ye.a(cvs.a::a, cvs.a::a);

      @Override
      public Codec<cvs> a() {
         return y;
      }

      @Override
      public ye<vr, cvs> b() {
         return x;
      }

      private static cvs a(vr $$0) {
         String $$1 = $$0.p();
         cuz $$2 = $$0.b(cuz.class);
         int $$3 = $$0.l();
         iu<cvg> $$4 = iu.a($$3, cvg.a);
         $$4.replaceAll($$1x -> cvg.b.decode($$0));
         crj $$5 = crj.f.decode($$0);
         return new cvs($$1, $$2, $$5, $$4);
      }

      private static void a(vr $$0, cvs $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cvg $$2 : $$1.d) {
            cvg.b.encode($$0, $$2);
         }

         crj.f.encode($$0, $$1.c);
      }
   }
}
