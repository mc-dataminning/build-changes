import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dcb implements dca {
   private final dby c;

   public dcb(dby $$0) {
      this.c = $$0;
   }

   @Override
   public boolean al_() {
      return true;
   }

   @Override
   public dby c() {
      return this.c;
   }

   @Override
   public dck ak_() {
      return dck.b;
   }

   @Override
   public abstract dcv<? extends dcb> a();

   public static class a<T extends dca> implements dcv<T> {
      private final MapCodec<T> w;
      private final yt<wg, T> x;

      public a(dcb.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dby.e.fieldOf("category").orElse(dby.d).forGetter(dca::c)).apply($$1, $$0::create));
         this.x = yt.a(dby.g, dca::c, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yt<wg, T> b() {
         return this.x;
      }

      @FunctionalInterface
      public interface a<T extends dca> {
         T create(dby var1);
      }
   }
}
