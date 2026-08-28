import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcb implements dbz {
   final Optional<dba> c;
   final Optional<dba> d;
   final Optional<dba> e;
   final cwp f;
   @Nullable
   private dbd g;

   public dcb(Optional<dba> $$0, Optional<dba> $$1, Optional<dba> $$2, cwp $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public cwp a(dca $$0, jt.a $$1) {
      cwp $$2 = $$0.d().a(this.f.h(), this.f.M());
      $$2.b(this.f.d());
      return $$2;
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
   public dbo<dcb> a() {
      return dbo.t;
   }

   @Override
   public dbd ao_() {
      if (this.g == null) {
         this.g = dbd.a(List.of(this.c, this.d, this.e));
      }

      return this.g;
   }

   @Override
   public List<dcj> g() {
      return List.of(new dcs(dba.a(this.c), dba.a(this.d), dba.a(this.e), new dcp.f(this.f), new dcp.d(cwt.xq)));
   }

   public static class a implements dbo<dcb> {
      private static final MapCodec<dcb> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dba.d.optionalFieldOf("template").forGetter($$0x -> $$0x.c),
                  dba.d.optionalFieldOf("base").forGetter($$0x -> $$0x.d),
                  dba.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.e),
                  cwp.c.fieldOf("result").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dcb::new)
      );
      public static final yn<wa, dcb> w = yn.a(dba.b, $$0 -> $$0.c, dba.b, $$0 -> $$0.d, dba.b, $$0 -> $$0.e, cwp.h, $$0 -> $$0.f, dcb::new);

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
