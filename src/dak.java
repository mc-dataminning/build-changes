import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dak extends dbw {
   private final daq c;
   private final float d;
   private final int e;

   public dak(String $$0, daq $$1, dba $$2, cwp $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract dbo<? extends dak> a();

   @Override
   public abstract dbp<? extends dak> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public daq e() {
      return this.c;
   }

   protected abstract cwl f();

   @Override
   public List<dcj> g() {
      return List.of(new dci(this.k().b(), dcp.a.c, new dcp.f(this.l()), new dcp.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dak> {
      T create(String var1, daq var2, dba var3, cwp var4, float var5, int var6);
   }

   public static class b<T extends dak> implements dbo<T> {
      private final MapCodec<T> w;
      private final ym<vz, T> x;

      public b(dak.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dbw::j),
                     daq.d.fieldOf("category").orElse(daq.c).forGetter(dak::e),
                     dba.d.fieldOf("ingredient").forGetter(dbw::k),
                     cwp.d.fieldOf("result").forGetter(dbw::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dak::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dak::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = ym.a(yk.o, dbw::j, daq.e, dak::e, dba.a, dbw::k, cwp.h, dbw::l, yk.l, dak::c, yk.g, dak::d, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public ym<vz, T> b() {
         return this.x;
      }
   }
}
