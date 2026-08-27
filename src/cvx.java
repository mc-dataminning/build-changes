import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cvx implements cvj<bnt> {
   protected final cvg a;
   protected final crj b;
   private final cvo<?> d;
   private final cvn<?> e;
   protected final String c;

   public cvx(cvo<?> $$0, cvn<?> $$1, String $$2, cvg $$3, crj $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cvo<?> e() {
      return this.d;
   }

   @Override
   public cvn<?> ap_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public crj a(iz $$0) {
      return this.b;
   }

   @Override
   public iu<cvg> a() {
      iu<cvg> $$0 = iu.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public crj a(bnt $$0, iz $$1) {
      return this.b.r();
   }

   public interface a<T extends cvx> {
      T create(String var1, cvg var2, crj var3);
   }

   public static class b<T extends cvx> implements cvn<T> {
      final cvx.a<T> x;
      private final Codec<T> y;
      private final ye<vr, T> z;

      protected b(cvx.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     aws.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cvg.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     crj.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = ye.a(yc.k, $$0x -> $$0x.c, cvg.b, $$0x -> $$0x.a, crj.f, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      @Override
      public ye<vr, T> b() {
         return this.z;
      }
   }
}
