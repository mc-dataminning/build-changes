import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dbu implements dbt {
   private final dbr c;

   public dbu(dbr $$0) {
      this.c = $$0;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dbr c() {
      return this.c;
   }

   @Override
   public dcd ap_() {
      return dcd.a;
   }

   @Override
   public abstract dco<? extends dbu> a();

   public static class a<T extends dbt> implements dco<T> {
      private final MapCodec<T> w;
      private final zt<xg, T> x;

      public a(dbu.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dbr.e.fieldOf("category").orElse(dbr.d).forGetter(dbt::c)).apply($$1, $$0::create));
         this.x = zt.a(dbr.g, dbt::c, $$0::create);
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
      public interface a<T extends dbt> {
         T create(dbr var1);
      }
   }
}
