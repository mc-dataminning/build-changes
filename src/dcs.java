import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcs implements dcq {
   final Optional<dbr> c;
   final Optional<dbr> d;
   final Optional<dbr> e;
   final dcy f;
   @Nullable
   private dbu g;

   public dcs(Optional<dbr> $$0, Optional<dbr> $$1, Optional<dbr> $$2, dcy $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cxh a(dcr $$0, jt.a $$1) {
      return this.f.a($$0.d());
   }

   @Override
   public Optional<dbr> c() {
      return this.c;
   }

   @Override
   public Optional<dbr> f() {
      return this.d;
   }

   @Override
   public Optional<dbr> k() {
      return this.e;
   }

   @Override
   public dcf<dcs> a() {
      return dcf.t;
   }

   @Override
   public dbu ao_() {
      if (this.g == null) {
         this.g = dbu.a(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<ddb> g() {
      return List.of(new ddk(dbr.a(this.c), dbr.a(this.d), dbr.a(this.e), this.f.a(), new ddh.d(cxl.xs)));
   }

   public static class a implements dcf<dcs> {
      private static final MapCodec<dcs> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dbr.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dbr.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dbr.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  dcy.a.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dcs::new)
      );
      public static final yn<wa, dcs> w = yn.a(dbr.b, $$0 -> $$0.c, dbr.b, $$0 -> $$0.d, dbr.b, $$0 -> $$0.e, dcy.b, $$0 -> $$0.f, dcs::new);

      @Override
      public MapCodec<dcs> a() {
         return x;
      }

      @Override
      public yn<wa, dcs> b() {
         return w;
      }
   }
}
