import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cub implements ctn<bmv> {
   protected final ctk a;
   protected final cqk b;
   private final cts<?> d;
   private final ctr<?> e;
   protected final String c;

   public cub(cts<?> $$0, ctr<?> $$1, String $$2, ctk $$3, cqk $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cts<?> e() {
      return this.d;
   }

   @Override
   public ctr<?> ar_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cqk a(iz $$0) {
      return this.b;
   }

   @Override
   public iu<ctk> a() {
      iu<ctk> $$0 = iu.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cqk a(bmv $$0, iz $$1) {
      return this.b.q();
   }

   public interface a<T extends cub> {
      T create(String var1, ctk var2, cqk var3);
   }

   public static class b<T extends cub> implements ctr<T> {
      final cub.a<T> x;
      private final Codec<T> y;
      private final xs<vf, T> z;

      protected b(cub.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     awe.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     ctk.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cqk.e.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = xs.a(xq.i, $$0x -> $$0x.c, ctk.b, $$0x -> $$0x.a, cqk.f, $$0x -> $$0x.b, $$0::create);
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
