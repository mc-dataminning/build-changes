import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dbt implements das {
   final String c;
   final daq d;
   final cwo e;
   final List<daz> f;
   @Nullable
   private dbc g;

   public dbt(String $$0, daq $$1, cwo $$2, List<daz> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public dbn<dbt> a() {
      return dbn.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public daq c() {
      return this.d;
   }

   @Override
   public dbc ao_() {
      if (this.g == null) {
         this.g = dbc.b(this.f);
      }

      return this.g;
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cwo a(dar $$0, jt.a $$1) {
      return this.e.v();
   }

   @Override
   public List<dci> g() {
      return List.of(new dcn(this.f.stream().map(daz::c).toList(), new dco.f(this.e), new dco.d(cws.fc)));
   }

   public static class a implements dbn<dbt> {
      private static final MapCodec<dbt> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  daq.e.fieldOf("category").orElse(daq.d).forGetter($$0x -> $$0x.d),
                  cwo.c.fieldOf("result").forGetter($$0x -> $$0x.e),
                  daz.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dbt::new)
      );
      public static final yn<wa, dbt> w = yn.a(yl.o, $$0 -> $$0.c, daq.g, $$0 -> $$0.d, cwo.h, $$0 -> $$0.e, daz.a.a(yl.a()), $$0 -> $$0.f, dbt::new);

      @Override
      public MapCodec<dbt> a() {
         return x;
      }

      @Override
      public yn<wa, dbt> b() {
         return w;
      }
   }
}
