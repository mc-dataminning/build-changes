import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dbq implements dbp {
   private final dbn c;

   public dbq(dbn $$0) {
      this.c = $$0;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dbn c() {
      return this.c;
   }

   @Override
   public dby ap_() {
      return dby.a;
   }

   @Override
   public abstract dci<? extends dbq> a();

   public static class a<T extends dbp> implements dci<T> {
      private final MapCodec<T> w;
      private final zt<xg, T> x;

      public a(dbq.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dbn.e.fieldOf("category").orElse(dbn.d).forGetter(dbp::c)).apply($$1, $$0::create));
         this.x = zt.a(dbn.g, dbp::c, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public zt<xg, T> b() {
         return this.x;
      }

      @FunctionalInterface
      public interface a<T extends dbp> {
         T create(dbn var1);
      }
   }
}
