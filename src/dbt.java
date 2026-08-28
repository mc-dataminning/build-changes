import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dbt implements dbs {
   private final dbq c;

   public dbt(dbq $$0) {
      this.c = $$0;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dbq c() {
      return this.c;
   }

   @Override
   public dcc ap_() {
      return dcc.a;
   }

   @Override
   public abstract dcn<? extends dbt> a();

   public static class a<T extends dbs> implements dcn<T> {
      private final MapCodec<T> w;
      private final zt<xg, T> x;

      public a(dbt.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dbq.e.fieldOf("category").orElse(dbq.d).forGetter(dbs::c)).apply($$1, $$0::create));
         this.x = zt.a(dbq.g, dbs::c, $$0::create);
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
      public interface a<T extends dbs> {
         T create(dbq var1);
      }
   }
}
