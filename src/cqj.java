import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cqj implements cpv<bjo> {
   protected final cps a;
   protected final cmr b;
   private final cqa<?> d;
   private final cpz<?> e;
   protected final String c;

   public cqj(cqa<?> $$0, cpz<?> $$1, String $$2, cps $$3, cmr $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cqa<?> e() {
      return this.d;
   }

   @Override
   public cpz<?> ar_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cmr a(iu $$0) {
      return this.b;
   }

   @Override
   public iq<cps> a() {
      iq<cps> $$0 = iq.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cmr a(bjo $$0, iu $$1) {
      return this.b.p();
   }

   public interface a<T extends cqj> {
      T create(String var1, cps var2, cmr var3);
   }

   public static class b<T extends cqj> implements cpz<T> {
      final cqj.a<T> x;
      private final Codec<T> y;

      protected b(cqj.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     atq.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cps.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cmr.e.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      public T b(ug $$0) {
         String $$1 = $$0.s();
         cps $$2 = cps.b($$0);
         cmr $$3 = $$0.r();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(ug $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }
   }
}
