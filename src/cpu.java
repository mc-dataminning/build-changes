import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cpu implements cpc {
   final String a;
   final cpb b;
   final cmh c;
   final io<cpi> d;

   public cpu(String $$0, cpb $$1, cmh $$2, io<cpi> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cpp<?> ar_() {
      return cpp.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cpb d() {
      return this.b;
   }

   @Override
   public cmh a(is $$0) {
      return this.c;
   }

   @Override
   public io<cpi> a() {
      return this.d;
   }

   public boolean a(cia $$0, csy $$1) {
      cev $$2 = new cev();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cmh a(cia $$0, is $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cpp<cpu> {
      private static final Codec<cpu> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atg.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cpb.e.fieldOf("category").orElse(cpb.d).forGetter($$0x -> $$0x.b),
                  cmh.c.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cpi.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cpi[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cpi[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(io.a(cpi.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cpu::new)
      );

      @Override
      public Codec<cpu> a() {
         return x;
      }

      public cpu b(ue $$0) {
         String $$1 = $$0.s();
         cpb $$2 = $$0.b(cpb.class);
         int $$3 = $$0.n();
         io<cpi> $$4 = io.a($$3, cpi.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cpi.b($$0));
         }

         cmh $$6 = $$0.r();
         return new cpu($$1, $$2, $$6, $$4);
      }

      public void a(ue $$0, cpu $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cpi $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
