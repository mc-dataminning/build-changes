import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class def implements dee {
   private final dec d;

   public def(dec $$0) {
      this.d = $$0;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dec c() {
      return this.d;
   }

   @Override
   public deo ap_() {
      return deo.b;
   }

   @Override
   public abstract dez<? extends def> a();

   public static class a<T extends dee> implements dez<T> {
      private final MapCodec<T> w;
      private final yy<wl, T> x;

      public a(def.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dec.e.fieldOf("category").orElse(dec.d).forGetter(dee::c)).apply($$1, $$0::create));
         this.x = yy.a(dec.g, dee::c, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yy<wl, T> b() {
         return this.x;
      }

      @FunctionalInterface
      public interface a<T extends dee> {
         T create(dec var1);
      }
   }
}
