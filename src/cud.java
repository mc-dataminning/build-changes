import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cud implements ctp<bmw> {
   protected final ctm a;
   protected final cqm b;
   private final ctu<?> d;
   private final ctt<?> e;
   protected final String c;

   public cud(ctu<?> $$0, ctt<?> $$1, String $$2, ctm $$3, cqm $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public ctu<?> e() {
      return this.d;
   }

   @Override
   public ctt<?> ar_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cqm a(iz $$0) {
      return this.b;
   }

   @Override
   public iu<ctm> a() {
      iu<ctm> $$0 = iu.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cqm a(bmw $$0, iz $$1) {
      return this.b.q();
   }

   public interface a<T extends cud> {
      T create(String var1, ctm var2, cqm var3);
   }

   public static class b<T extends cud> implements ctt<T> {
      final cud.a<T> x;
      private final Codec<T> y;
      private final xs<vf, T> z;

      protected b(cud.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     awe.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     ctm.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cqm.e.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = xs.a(xq.i, $$0x -> $$0x.c, ctm.b, $$0x -> $$0x.a, cqm.f, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      @Override
      public xs<vf, T> b() {
         return this.z;
      }
   }
}
