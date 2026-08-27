import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cpb implements coi {
   final String a;
   final coh b;
   final clo c;
   final ip<coq> d;

   public cpb(String $$0, coh $$1, clo $$2, ip<coq> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cox<?> as_() {
      return cox.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public coh d() {
      return this.b;
   }

   @Override
   public clo a(it $$0) {
      return this.c;
   }

   @Override
   public ip<coq> a() {
      return this.d;
   }

   public boolean a(chh $$0, csf $$1) {
      ced $$2 = new ced();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public clo a(chh $$0, it $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cox<cpb> {
      private static final Codec<cpb> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  asy.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  coh.e.fieldOf("category").orElse(coh.d).forGetter($$0x -> $$0x.b),
                  coj.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  coq.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     coq[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(coq[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(ip.a(coq.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cpb::new)
      );

      @Override
      public Codec<cpb> a() {
         return x;
      }

      public cpb b(ty $$0) {
         String $$1 = $$0.s();
         coh $$2 = $$0.b(coh.class);
         int $$3 = $$0.n();
         ip<coq> $$4 = ip.a($$3, coq.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, coq.b($$0));
         }

         clo $$6 = $$0.r();
         return new cpb($$1, $$2, $$6, $$4);
      }

      public void a(ty $$0, cpb $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (coq $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
