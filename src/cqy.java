import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cqy implements cqk<bjv> {
   protected final cqh a;
   protected final cng b;
   private final cqp<?> d;
   private final cqo<?> e;
   protected final String c;

   public cqy(cqp<?> $$0, cqo<?> $$1, String $$2, cqh $$3, cng $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cqp<?> e() {
      return this.d;
   }

   @Override
   public cqo<?> at_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cng a(iu $$0) {
      return this.b;
   }

   @Override
   public iq<cqh> a() {
      iq<cqh> $$0 = iq.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cng a(bjv $$0, iu $$1) {
      return this.b.p();
   }

   public interface a<T extends cqy> {
      T create(String var1, cqh var2, cng var3);
   }

   public static class b<T extends cqy> implements cqo<T> {
      final cqy.a<T> x;
      private final Codec<T> y;

      protected b(cqy.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     atx.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cqh.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cng.e.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      public T b(uj $$0) {
         String $$1 = $$0.s();
         cqh $$2 = cqh.b($$0);
         cng $$3 = $$0.r();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(uj $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }
   }
}
