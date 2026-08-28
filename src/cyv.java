import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cyv implements cyg<cyw> {
   protected final cyd a;
   protected final cua b;
   private final cym<?> d;
   private final cyl<?> e;
   protected final String c;

   public cyv(cym<?> $$0, cyl<?> $$1, String $$2, cyd $$3, cua $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cym<?> e() {
      return this.d;
   }

   @Override
   public cyl<?> ap_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cua a(jl.a $$0) {
      return this.b;
   }

   @Override
   public js<cyd> a() {
      js<cyd> $$0 = js.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cua a(cyw $$0, jl.a $$1) {
      return this.b.s();
   }

   public interface a<T extends cyv> {
      T create(String var1, cyd var2, cua var3);
   }

   public static class b<T extends cyv> implements cyl<T> {
      final cyv.a<T> x;
      private final MapCodec<T> y;
      private final ys<wf, T> z;

      protected b(cyv.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cyd.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cua.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = ys.a(yq.l, $$0x -> $$0x.c, cyd.b, $$0x -> $$0x.a, cua.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.y;
      }

      @Override
      public ys<wf, T> b() {
         return this.z;
      }
   }
}
