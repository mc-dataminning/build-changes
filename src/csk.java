import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class csk implements crs {
   final String a;
   final crr b;
   final coz c;
   final is<cry> d;

   public csk(String $$0, crr $$1, coz $$2, is<cry> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public csf<?> at_() {
      return csf.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public crr d() {
      return this.b;
   }

   @Override
   public coz a(iw $$0) {
      return this.c;
   }

   @Override
   public is<cry> a() {
      return this.d;
   }

   public boolean a(ckr $$0, cvn $$1) {
      chl $$2 = new chl();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public coz a(ckr $$0, iw $$1) {
      return this.c.q();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements csf<csk> {
      private static final Codec<csk> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avp.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  crr.e.fieldOf("category").orElse(crr.d).forGetter($$0x -> $$0x.b),
                  coz.c.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cry.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cry[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cry[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(is.a(cry.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, csk::new)
      );
      public static final xo<vb, csk> x = xo.a(csk.a::a, csk.a::a);

      @Override
      public Codec<csk> a() {
         return y;
      }

      @Override
      public xo<vb, csk> b() {
         return x;
      }

      private static csk a(vb $$0) {
         String $$1 = $$0.r();
         crr $$2 = $$0.b(crr.class);
         int $$3 = $$0.n();
         is<cry> $$4 = is.a($$3, cry.a);
         $$4.replaceAll($$1x -> cry.b.decode($$0));
         coz $$5 = coz.f.decode($$0);
         return new csk($$1, $$2, $$5, $$4);
      }

      private static void a(vb $$0, csk $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cry $$2 : $$1.d) {
            cry.b.encode($$0, $$2);
         }

         coz.f.encode($$0, $$1.c);
      }
   }
}
