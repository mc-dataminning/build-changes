import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcc implements dbz {
   final Optional<dba> c;
   final Optional<dba> d;
   final Optional<dba> e;
   @Nullable
   private dbd f;

   public dcc(Optional<dba> $$0, Optional<dba> $$1, Optional<dba> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public cwp a(dca $$0, jt.a $$1) {
      return a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public static cwp a(jt.a $$0, cwp $$1, cwp $$2, cwp $$3) {
      Optional<jr.c<dex>> $$4 = dey.a($$0, $$2);
      Optional<jr.c<dez>> $$5 = dfa.a($$0, $$3);
      if ($$4.isPresent() && $$5.isPresent()) {
         dew $$6 = $$1.a(kv.U);
         if ($$6 != null && $$6.a($$5.get(), $$4.get())) {
            return cwp.j;
         } else {
            cwp $$7 = $$1.c(1);
            $$7.b(kv.U, new dew($$4.get(), $$5.get()));
            return $$7;
         }
      } else {
         return cwp.j;
      }
   }

   @Override
   public Optional<dba> c() {
      return this.c;
   }

   @Override
   public Optional<dba> f() {
      return this.d;
   }

   @Override
   public Optional<dba> k() {
      return this.e;
   }

   @Override
   public dbo<dcc> a() {
      return dbo.u;
   }

   @Override
   public dbd ao_() {
      if (this.f == null) {
         this.f = dbd.a(List.of(this.c, this.d, this.e));
      }

      return this.f;
   }

   @Override
   public List<dcj> g() {
      dcp $$0 = dba.a(this.d);
      dcp $$1 = dba.a(this.e);
      dcp $$2 = dba.a(this.c);
      return List.of(new dcs($$2, $$0, $$1, new dcp.g($$0, $$1, $$2), new dcp.d(cwt.xq)));
   }

   public static class a implements dbo<dcc> {
      private static final MapCodec<dcc> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dba.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dba.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dba.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dcc::new)
      );
      public static final ym<vz, dcc> w = ym.a(dba.b, $$0 -> $$0.c, dba.b, $$0 -> $$0.d, dba.b, $$0 -> $$0.e, dcc::new);

      @Override
      public MapCodec<dcc> a() {
         return x;
      }

      @Override
      public ym<vz, dcc> b() {
         return w;
      }
   }
}
