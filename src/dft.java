import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dft implements dfb<dfu> {
   private final dex d;
   private final dak e;
   private final String f;
   @Nullable
   private dfa g;

   public dft(String $$0, dex $$1, dak $$2) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public abstract dfl<? extends dft> a();

   @Override
   public abstract dfm<? extends dft> b();

   public boolean a(dfu $$0, dkj $$1) {
      return this.d.a($$0.c());
   }

   @Override
   public String j() {
      return this.f;
   }

   public dex k() {
      return this.d;
   }

   protected dak l() {
      return this.e;
   }

   @Override
   public dfa al_() {
      if (this.g == null) {
         this.g = dfa.a(this.d);
      }

      return this.g;
   }

   public dak a(dfu $$0, ji.a $$1) {
      return this.e.v();
   }

   @FunctionalInterface
   public interface a<T extends dft> {
      T create(String var1, dex var2, dak var3);
   }

   public static class b<T extends dft> implements dfl<T> {
      private final MapCodec<T> w;
      private final ze<wp, T> x;

      protected b(dft.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dft::j),
                     dex.d.fieldOf("ingredient").forGetter(dft::k),
                     dak.d.fieldOf("result").forGetter(dft::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = ze.a(zc.p, dft::j, dex.a, dft::k, dak.j, dft::l, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public ze<wp, T> b() {
         return this.x;
      }
   }
}
