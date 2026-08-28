import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class der implements deq {
   private final deo d;

   public der(deo $$0) {
      this.d = $$0;
   }

   @Override
   public boolean am_() {
      return true;
   }

   @Override
   public deo c() {
      return this.d;
   }

   @Override
   public dfa al_() {
      return dfa.b;
   }

   @Override
   public abstract dfl<? extends der> a();

   public static class a<T extends deq> implements dfl<T> {
      private final MapCodec<T> w;
      private final ze<wp, T> x;

      public a(der.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(deo.e.fieldOf("category").orElse(deo.d).forGetter(deq::c)).apply($$1, $$0::create));
         this.x = ze.a(deo.g, deq::c, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public ze<wp, T> b() {
         return this.x;
      }

      @FunctionalInterface
      public interface a<T extends deq> {
         T create(deo var1);
      }
   }
}
