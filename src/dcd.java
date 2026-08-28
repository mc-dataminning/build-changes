import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcd implements dca {
   final Optional<dbb> c;
   final Optional<dbb> d;
   final Optional<dbb> e;
   @Nullable
   private dbe f;

   public dcd(Optional<dbb> $$0, Optional<dbb> $$1, Optional<dbb> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public cwq a(dcb $$0, jt.a $$1) {
      return a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public static cwq a(jt.a $$0, cwq $$1, cwq $$2, cwq $$3) {
      Optional<jr.c<dey>> $$4 = dez.a($$0, $$2);
      Optional<jr.c<dfa>> $$5 = dfb.a($$0, $$3);
      if ($$4.isPresent() && $$5.isPresent()) {
         dex $$6 = $$1.a(kv.U);
         if ($$6 != null && $$6.a($$5.get(), $$4.get())) {
            return cwq.j;
         } else {
            cwq $$7 = $$1.c(1);
            $$7.b(kv.U, new dex($$4.get(), $$5.get()));
            return $$7;
         }
      } else {
         return cwq.j;
      }
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
   public dbp<dcd> a() {
      return dbp.u;
   }

   @Override
   public dbe ao_() {
      if (this.f == null) {
         this.f = dbe.a(List.of(this.c, this.d, this.e));
      }

      return this.f;
   }

   @Override
   public List<dck> g() {
      dcq $$0 = dbb.a(this.d);
      dcq $$1 = dbb.a(this.e);
      dcq $$2 = dbb.a(this.c);
      return List.of(new dct($$2, $$0, $$1, new dcq.g($$0, $$1, $$2), new dcq.d(cwu.xq)));
   }

   public static class a implements dbp<dcd> {
      private static final MapCodec<dcd> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dbb.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dbb.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dbb.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dcd::new)
      );
      public static final yn<wa, dcd> w = yn.a(dbb.b, $$0 -> $$0.c, dbb.b, $$0 -> $$0.d, dbb.b, $$0 -> $$0.e, dcd::new);

      @Override
      public MapCodec<dcd> a() {
         return x;
      }

      @Override
      public yn<wa, dcd> b() {
         return w;
      }
   }
}
