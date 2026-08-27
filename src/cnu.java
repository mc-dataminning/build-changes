import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cnu implements cnd {
   final String a;
   final cnc b;
   final ckj c;
   final il<cnk> d;

   public cnu(String $$0, cnc $$1, ckj $$2, il<cnk> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cnc d() {
      return this.b;
   }

   @Override
   public ckj a(ip $$0) {
      return this.c;
   }

   @Override
   public il<cnk> a() {
      return this.d;
   }

   public boolean a(cgd $$0, cqz $$1) {
      cdb $$2 = new cdb();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public ckj a(cgd $$0, ip $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cnq<cnu> {
      private static final Codec<cnu> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  asg.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cnc.e.fieldOf("category").orElse(cnc.d).forGetter($$0x -> $$0x.b),
                  cne.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cnk.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cnk[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cnk[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(il.a(cnk.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cnu::new)
      );

      @Override
      public Codec<cnu> a() {
         return x;
      }

      public cnu b(tl $$0) {
         String $$1 = $$0.s();
         cnc $$2 = $$0.b(cnc.class);
         int $$3 = $$0.n();
         il<cnk> $$4 = il.a($$3, cnk.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cnk.b($$0));
         }

         ckj $$6 = $$0.r();
         return new cnu($$1, $$2, $$6, $$4);
      }

      public void a(tl $$0, cnu $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cnk $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
