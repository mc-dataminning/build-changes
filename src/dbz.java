import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbz implements dbx {
   final Optional<day> c;
   final Optional<day> d;
   final Optional<day> e;
   final cwn f;
   @Nullable
   private dbb g;

   public dbz(Optional<day> $$0, Optional<day> $$1, Optional<day> $$2, cwn $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cwn a(dby $$0, jt.a $$1) {
      cwn $$2 = $$0.d().a(this.f.h(), this.f.M());
      $$2.b(this.f.d());
      return $$2;
   }

   @Override
   public Optional<day> c() {
      return this.c;
   }

   @Override
   public Optional<day> f() {
      return this.d;
   }

   @Override
   public Optional<day> k() {
      return this.e;
   }

   @Override
   public dbm<dbz> a() {
      return dbm.t;
   }

   @Override
   public dbb ao_() {
      if (this.g == null) {
         this.g = dbb.a(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<dch> g() {
      return List.of(new dcq(day.a(this.c), day.a(this.d), day.a(this.e), new dcn.f(this.f), new dcn.d(cwr.xq)));
   }

   public static class a implements dbm<dbz> {
      private static final MapCodec<dbz> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  day.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  day.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  day.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  cwn.c.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dbz::new)
      );
      public static final ym<vz, dbz> w = ym.a(day.b, $$0 -> $$0.c, day.b, $$0 -> $$0.d, day.b, $$0 -> $$0.e, cwn.h, $$0 -> $$0.f, dbz::new);

      @Override
      public MapCodec<dbz> a() {
         return x;
      }

      @Override
      public ym<vz, dbz> b() {
         return w;
      }
   }
}
