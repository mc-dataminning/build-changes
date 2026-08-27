import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cqq implements cqc<bju> {
   protected final cpz a;
   protected final cmy b;
   private final cqh<?> d;
   private final cqg<?> e;
   protected final String c;

   public cqq(cqh<?> $$0, cqg<?> $$1, String $$2, cpz $$3, cmy $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cqh<?> e() {
      return this.d;
   }

   @Override
   public cqg<?> ar_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cmy a(iu $$0) {
      return this.b;
   }

   @Override
   public iq<cpz> a() {
      iq<cpz> $$0 = iq.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cmy a(bju $$0, iu $$1) {
      return this.b.p();
   }

   public interface a<T extends cqq> {
      T create(String var1, cpz var2, cmy var3);
   }

   public static class b<T extends cqq> implements cqg<T> {
      final cqq.a<T> x;
      private final Codec<T> y;

      protected b(cqq.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     atw.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cpz.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cmy.e.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      public T b(ui $$0) {
         String $$1 = $$0.s();
         cpz $$2 = cpz.b($$0);
         cmy $$3 = $$0.r();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(ui $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }
   }
}
