import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cot implements cof<bij> {
   protected final coc a;
   protected final clb b;
   private final cok<?> d;
   private final coj<?> e;
   protected final String c;

   public cot(cok<?> $$0, coj<?> $$1, String $$2, coc $$3, clb $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cok<?> e() {
      return this.d;
   }

   @Override
   public coj<?> aq_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public clb a(ip $$0) {
      return this.b;
   }

   @Override
   public il<coc> a() {
      il<coc> $$0 = il.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public clb a(bij $$0, ip $$1) {
      return this.b.p();
   }

   public static class a<T extends cot> implements coj<T> {
      private static final MapCodec<clb> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(jy.i.q().fieldOf("result").forGetter(clb::d), Codec.INT.fieldOf("count").forGetter(clb::L)).apply($$0, clb::new)
      );
      final cot.a.a<T> x;
      private final Codec<T> z;

      protected a(cot.a.a<T> $$0) {
         this.x = $$0;
         this.z = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     asq.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     coc.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     y.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.z;
      }

      public T b(tu $$0) {
         String $$1 = $$0.s();
         coc $$2 = coc.b($$0);
         clb $$3 = $$0.r();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(tu $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cot> {
         T create(String var1, coc var2, clb var3);
      }
   }
}
