import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cyy implements cyj<cyz> {
   protected final cyg a;
   protected final cud b;
   private final cyp<?> d;
   private final cyo<?> e;
   protected final String c;

   public cyy(cyp<?> $$0, cyo<?> $$1, String $$2, cyg $$3, cud $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cyp<?> e() {
      return this.d;
   }

   @Override
   public cyo<?> ap_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cud a(jl.a $$0) {
      return this.b;
   }

   @Override
   public js<cyg> a() {
      js<cyg> $$0 = js.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cud a(cyz $$0, jl.a $$1) {
      return this.b.s();
   }

   public interface a<T extends cyy> {
      T create(String var1, cyg var2, cud var3);
   }

   public static class b<T extends cyy> implements cyo<T> {
      final cyy.a<T> x;
      private final MapCodec<T> y;
      private final ys<wf, T> z;

      protected b(cyy.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cyg.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cud.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = ys.a(yq.l, $$0x -> $$0x.c, cyg.b, $$0x -> $$0x.a, cud.i, $$0x -> $$0x.b, $$0::create);
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
