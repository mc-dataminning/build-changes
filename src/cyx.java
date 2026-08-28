import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cyx implements cyi<cyy> {
   protected final cyf a;
   protected final cuc b;
   private final cyo<?> d;
   private final cyn<?> e;
   protected final String c;

   public cyx(cyo<?> $$0, cyn<?> $$1, String $$2, cyf $$3, cuc $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cyo<?> e() {
      return this.d;
   }

   @Override
   public cyn<?> ap_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cuc a(jl.a $$0) {
      return this.b;
   }

   @Override
   public js<cyf> a() {
      js<cyf> $$0 = js.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cuc a(cyy $$0, jl.a $$1) {
      return this.b.s();
   }

   public interface a<T extends cyx> {
      T create(String var1, cyf var2, cuc var3);
   }

   public static class b<T extends cyx> implements cyn<T> {
      final cyx.a<T> x;
      private final MapCodec<T> y;
      private final ys<wf, T> z;

      protected b(cyx.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cyf.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cuc.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = ys.a(yq.l, $$0x -> $$0x.c, cyf.b, $$0x -> $$0x.a, cuc.i, $$0x -> $$0x.b, $$0::create);
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
