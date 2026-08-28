import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dbu implements dat {
   final String c;
   final dar d;
   final cwp e;
   final List<dba> f;
   @Nullable
   private dbd g;

   public dbu(String $$0, dar $$1, cwp $$2, List<dba> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public dbo<dbu> a() {
      return dbo.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dar c() {
      return this.d;
   }

   @Override
   public dbd ao_() {
      if (this.g == null) {
         this.g = dbd.b(this.f);
      }

      return this.g;
   }

   public boolean a(das $$0, dgi $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cwp a(das $$0, jt.a $$1) {
      return this.e.v();
   }

   @Override
   public List<dcj> g() {
      return List.of(new dco(this.f.stream().map(dba::c).toList(), new dcp.f(this.e), new dcp.d(cwt.fc)));
   }

   public static class a implements dbo<dbu> {
      private static final MapCodec<dbu> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dar.e.fieldOf("category").orElse(dar.d).forGetter($$0x -> $$0x.d),
                  cwp.c.fieldOf("result").forGetter($$0x -> $$0x.e),
                  dba.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dbu::new)
      );
      public static final yn<wa, dbu> w = yn.a(yl.o, $$0 -> $$0.c, dar.g, $$0 -> $$0.d, cwp.h, $$0 -> $$0.e, dba.a.a(yl.a()), $$0 -> $$0.f, dbu::new);

      @Override
      public MapCodec<dbu> a() {
         return x;
      }

      @Override
      public yn<wa, dbu> b() {
         return w;
      }
   }
}
