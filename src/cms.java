import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cms implements cmb {
   final String a;
   final cma b;
   final cjh c;
   final hp<cmi> d;

   public cms(String $$0, cma $$1, cjh $$2, hp<cmi> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cmo<?> an_() {
      return cmo.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cma d() {
      return this.b;
   }

   @Override
   public cjh a(hu $$0) {
      return this.c;
   }

   @Override
   public hp<cmi> a() {
      return this.d;
   }

   public boolean a(cfb $$0, cpx $$1) {
      cca $$2 = new cca();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cjh a(cfb $$0, hu $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cmo<cms> {
      private static final Codec<cms> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  arh.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cma.e.fieldOf("category").orElse(cma.d).forGetter($$0x -> $$0x.b),
                  cmc.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cmi.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cmi[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cmi[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(hp.a(cmi.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cms::new)
      );

      @Override
      public Codec<cms> a() {
         return x;
      }

      public cms b(sq $$0) {
         String $$1 = $$0.r();
         cma $$2 = $$0.b(cma.class);
         int $$3 = $$0.m();
         hp<cmi> $$4 = hp.a($$3, cmi.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cmi.b($$0));
         }

         cjh $$6 = $$0.q();
         return new cms($$1, $$2, $$6, $$4);
      }

      public void a(sq $$0, cms $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cmi $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
