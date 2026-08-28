import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class deh implements deg {
   private final dee d;

   public deh(dee $$0) {
      this.d = $$0;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dee c() {
      return this.d;
   }

   @Override
   public deq ap_() {
      return deq.b;
   }

   @Override
   public abstract dfb<? extends deh> a();

   public static class a<T extends deg> implements dfb<T> {
      private final MapCodec<T> w;
      private final za<wn, T> x;

      public a(deh.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dee.e.fieldOf("category").orElse(dee.d).forGetter(deg::c)).apply($$1, $$0::create));
         this.x = za.a(dee.g, deg::c, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public za<wn, T> b() {
         return this.x;
      }

      @FunctionalInterface
      public interface a<T extends deg> {
         T create(dee var1);
      }
   }
}
