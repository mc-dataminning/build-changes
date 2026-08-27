import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cpz implements cpl<bje> {
   protected final cpi a;
   protected final cmh b;
   private final cpq<?> d;
   private final cpp<?> e;
   protected final String c;

   public cpz(cpq<?> $$0, cpp<?> $$1, String $$2, cpi $$3, cmh $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cpq<?> e() {
      return this.d;
   }

   @Override
   public cpp<?> ar_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cmh a(is $$0) {
      return this.b;
   }

   @Override
   public io<cpi> a() {
      io<cpi> $$0 = io.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cmh a(bje $$0, is $$1) {
      return this.b.p();
   }

   public interface a<T extends cpz> {
      T create(String var1, cpi var2, cmh var3);
   }

   public static class b<T extends cpz> implements cpp<T> {
      final cpz.a<T> x;
      private final Codec<T> y;

      protected b(cpz.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     atg.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cpi.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cmh.e.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      public T b(ue $$0) {
         String $$1 = $$0.s();
         cpi $$2 = cpi.b($$0);
         cmh $$3 = $$0.r();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(ue $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }
   }
}
