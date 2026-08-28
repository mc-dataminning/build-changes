import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcc implements dca {
   final Optional<dbb> c;
   final Optional<dbb> d;
   final Optional<dbb> e;
   final cwq f;
   @Nullable
   private dbe g;

   public dcc(Optional<dbb> $$0, Optional<dbb> $$1, Optional<dbb> $$2, cwq $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cwq a(dcb $$0, jt.a $$1) {
      cwq $$2 = $$0.d().a(this.f.h(), this.f.M());
      $$2.b(this.f.d());
      return $$2;
   }

   @Override
   public Optional<dbb> c() {
      return this.c;
   }

   @Override
   public Optional<dbb> f() {
      return this.d;
   }

   @Override
   public Optional<dbb> k() {
      return this.e;
   }

   @Override
   public dbp<dcc> a() {
      return dbp.t;
   }

   @Override
   public dbe ao_() {
      if (this.g == null) {
         this.g = dbe.a(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<dck> g() {
      return List.of(new dct(dbb.a(this.c), dbb.a(this.d), dbb.a(this.e), new dcq.f(this.f), new dcq.d(cwu.xq)));
   }

   public static class a implements dbp<dcc> {
      private static final MapCodec<dcc> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dbb.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dbb.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dbb.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  cwq.c.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dcc::new)
      );
      public static final yn<wa, dcc> w = yn.a(dbb.b, $$0 -> $$0.c, dbb.b, $$0 -> $$0.d, dbb.b, $$0 -> $$0.e, cwq.h, $$0 -> $$0.f, dcc::new);

      @Override
      public MapCodec<dcc> a() {
         return x;
      }

      @Override
      public yn<wa, dcc> b() {
         return w;
      }
   }
}
