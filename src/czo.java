import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class czo implements cza<bpt> {
   protected final cyv a;
   protected final cuh b;
   private final czf<?> d;
   private final cze<?> e;
   protected final String c;

   public czo(czf<?> $$0, cze<?> $$1, String $$2, cyv $$3, cuh $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public czf<?> e() {
      return this.d;
   }

   @Override
   public cze<?> ao_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cuh a(jc.a $$0) {
      return this.b;
   }

   @Override
   public jj<cyv> a() {
      jj<cyv> $$0 = jj.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cuh a(bpt $$0, jc.a $$1) {
      return this.b.r();
   }

   public interface a<T extends czo> {
      T create(String var1, cyv var2, cuh var3);
   }

   public static class b<T extends czo> implements cze<T> {
      final czo.a<T> a;
      private final Codec<T> A;
      private final zc<wp, T> B;

      protected b(czo.a<T> $$0) {
         this.a = $$0;
         this.A = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     axu.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cyv.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cuh.a.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.B = zc.a(za.l, $$0x -> $$0x.c, cyv.b, $$0x -> $$0x.a, cuh.f, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public Codec<T> a() {
         return this.A;
      }

      @Override
      public zc<wp, T> b() {
         return this.B;
      }
   }
}
