import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cqp implements cqb<bjt> {
   protected final cpy a;
   protected final cmx b;
   private final cqg<?> d;
   private final cqf<?> e;
   protected final String c;

   public cqp(cqg<?> $$0, cqf<?> $$1, String $$2, cpy $$3, cmx $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cqg<?> e() {
      return this.d;
   }

   @Override
   public cqf<?> ar_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cmx a(iu $$0) {
      return this.b;
   }

   @Override
   public iq<cpy> a() {
      iq<cpy> $$0 = iq.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cmx a(bjt $$0, iu $$1) {
      return this.b.p();
   }

   public interface a<T extends cqp> {
      T create(String var1, cpy var2, cmx var3);
   }

   public static class b<T extends cqp> implements cqf<T> {
      final cqp.a<T> x;
      private final Codec<T> y;

      protected b(cqp.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     atv.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cpy.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cmx.e.forGetter($$0xx -> $$0xx.b)
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
         cpy $$2 = cpy.b($$0);
         cmx $$3 = $$0.r();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(ui $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }
   }
}
