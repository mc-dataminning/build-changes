import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcb implements dby {
   final Optional<daz> c;
   final Optional<daz> d;
   final Optional<daz> e;
   @Nullable
   private dbc f;

   public dcb(Optional<daz> $$0, Optional<daz> $$1, Optional<daz> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public cwo a(dbz $$0, jt.a $$1) {
      return a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public static cwo a(jt.a $$0, cwo $$1, cwo $$2, cwo $$3) {
      Optional<jr.c<dew>> $$4 = dex.a($$0, $$2);
      Optional<jr.c<dey>> $$5 = dez.a($$0, $$3);
      if ($$4.isPresent() && $$5.isPresent()) {
         dev $$6 = $$1.a(kv.U);
         if ($$6 != null && $$6.a($$5.get(), $$4.get())) {
            return cwo.j;
         } else {
            cwo $$7 = $$1.c(1);
            $$7.b(kv.U, new dev($$4.get(), $$5.get()));
            return $$7;
         }
      } else {
         return cwo.j;
      }
   }

   @Override
   public Optional<daz> c() {
      return this.c;
   }

   @Override
   public Optional<daz> f() {
      return this.d;
   }

   @Override
   public Optional<daz> k() {
      return this.e;
   }

   @Override
   public dbn<dcb> a() {
      return dbn.u;
   }

   @Override
   public dbc ao_() {
      if (this.f == null) {
         this.f = dbc.a(List.of(this.c, this.d, this.e));
      }

      return this.f;
   }

   @Override
   public List<dci> g() {
      dco $$0 = daz.a(this.d);
      dco $$1 = daz.a(this.e);
      dco $$2 = daz.a(this.c);
      return List.of(new dcr($$2, $$0, $$1, new dco.g($$0, $$1, $$2), new dco.d(cws.xq)));
   }

   public static class a implements dbn<dcb> {
      private static final MapCodec<dcb> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  daz.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  daz.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  daz.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dcb::new)
      );
      public static final yn<wa, dcb> w = yn.a(daz.b, $$0 -> $$0.c, daz.b, $$0 -> $$0.d, daz.b, $$0 -> $$0.e, dcb::new);

      @Override
      public MapCodec<dcb> a() {
         return x;
      }

      @Override
      public yn<wa, dcb> b() {
         return w;
      }
   }
}
