import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cpb implements coo<biq> {
   protected final cok a;
   protected final clj b;
   private final cot<?> d;
   private final cos<?> e;
   protected final String c;

   public cpb(cot<?> $$0, cos<?> $$1, String $$2, cok $$3, clj $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cot<?> e() {
      return this.d;
   }

   @Override
   public cos<?> aq_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public clj a(ip $$0) {
      return this.b;
   }

   @Override
   public il<cok> a() {
      il<cok> $$0 = il.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public clj a(biq $$0, ip $$1) {
      return this.b.p();
   }

   public static class a<T extends cpb> implements cos<T> {
      private static final MapCodec<clj> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(jy.i.q().fieldOf("result").forGetter(clj::d), Codec.INT.fieldOf("count").forGetter(clj::L)).apply($$0, clj::new)
      );
      final cpb.a.a<T> x;
      private final Codec<T> z;

      protected a(cpb.a.a<T> $$0) {
         this.x = $$0;
         this.z = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     asu.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cok.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
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
         cok $$2 = cok.b($$0);
         clj $$3 = $$0.r();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(tu $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cpb> {
         T create(String var1, cok var2, clj var3);
      }
   }
}
