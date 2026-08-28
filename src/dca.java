import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dca implements dbx {
   final Optional<day> c;
   final Optional<day> d;
   final Optional<day> e;
   @Nullable
   private dbb f;

   public dca(Optional<day> $$0, Optional<day> $$1, Optional<day> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public cwn a(dby $$0, jt.a $$1) {
      return a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public static cwn a(jt.a $$0, cwn $$1, cwn $$2, cwn $$3) {
      Optional<jr.c<dev>> $$4 = dew.a($$0, $$2);
      Optional<jr.c<dex>> $$5 = dey.a($$0, $$3);
      if ($$4.isPresent() && $$5.isPresent()) {
         deu $$6 = $$1.a(kv.U);
         if ($$6 != null && $$6.a($$5.get(), $$4.get())) {
            return cwn.j;
         } else {
            cwn $$7 = $$1.c(1);
            $$7.b(kv.U, new deu($$4.get(), $$5.get()));
            return $$7;
         }
      } else {
         return cwn.j;
      }
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
   public dbm<dca> a() {
      return dbm.u;
   }

   @Override
   public dbb ao_() {
      if (this.f == null) {
         this.f = dbb.a(List.of(this.c, this.d, this.e));
      }

      return this.f;
   }

   @Override
   public List<dch> g() {
      dcn $$0 = day.a(this.d);
      dcn $$1 = day.a(this.e);
      dcn $$2 = day.a(this.c);
      return List.of(new dcq($$2, $$0, $$1, new dcn.g($$0, $$1, $$2), new dcn.d(cwr.xq)));
   }

   public static class a implements dbm<dca> {
      private static final MapCodec<dca> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  day.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  day.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  day.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dca::new)
      );
      public static final ym<vz, dca> w = ym.a(day.b, $$0 -> $$0.c, day.b, $$0 -> $$0.d, day.b, $$0 -> $$0.e, dca::new);

      @Override
      public MapCodec<dca> a() {
         return x;
      }

      @Override
      public ym<vz, dca> b() {
         return w;
      }
   }
}
