import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbt implements dbr {
   final Optional<daw> a;
   final Optional<daw> b;
   final Optional<daw> c;
   final cwm d;
   @Nullable
   private daz e;

   public dbt(Optional<daw> $$0, Optional<daw> $$1, Optional<daw> $$2, cwm $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cwm a(dbs $$0, js.a $$1) {
      cwm $$2 = $$0.d().a(this.d.h(), this.d.L());
      $$2.b(this.d.e());
      return $$2;
   }

   @Override
   public cwm a(js.a $$0) {
      return this.d;
   }

   @Override
   public boolean a(cwm $$0) {
      return daw.a(this.a, $$0);
   }

   @Override
   public boolean b(cwm $$0) {
      return daw.a(this.b, $$0);
   }

   @Override
   public boolean c(cwm $$0) {
      return daw.a(this.c, $$0);
   }

   @Override
   public dbf<?> ap_() {
      return dbf.t;
   }

   @Override
   public daz a() {
      if (this.e == null) {
         this.e = daz.a(List.of(this.a, this.b, this.c));
      }

      return this.e;
   }

   public static class a implements dbf<dbt> {
      private static final MapCodec<dbt> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  daw.d.optionalFieldOf("template").forGetter($$0x -> $$0x.a),
                  daw.d.optionalFieldOf("base").forGetter($$0x -> $$0x.b),
                  daw.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.c),
                  cwm.d.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dbt::new)
      );
      public static final zh<wu, dbt> w = zh.a(daw.b, $$0 -> $$0.a, daw.b, $$0 -> $$0.b, daw.b, $$0 -> $$0.c, cwm.i, $$0 -> $$0.d, dbt::new);

      @Override
      public MapCodec<dbt> a() {
         return x;
      }

      @Override
      public zh<wu, dbt> b() {
         return w;
      }
   }
}
