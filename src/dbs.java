import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dbs implements dar {
   final String c;
   final dap d;
   final cwn e;
   final List<day> f;
   @Nullable
   private dbb g;

   public dbs(String $$0, dap $$1, cwn $$2, List<day> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public dbm<dbs> a() {
      return dbm.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dap c() {
      return this.d;
   }

   @Override
   public dbb ao_() {
      if (this.g == null) {
         this.g = dbb.b(this.f);
      }

      return this.g;
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cwn a(daq $$0, jt.a $$1) {
      return this.e.v();
   }

   @Override
   public List<dch> g() {
      return List.of(new dcm(this.f.stream().map(day::c).toList(), new dcn.f(this.e), new dcn.d(cwr.fc)));
   }

   public static class a implements dbm<dbs> {
      private static final MapCodec<dbs> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dap.e.fieldOf("category").orElse(dap.d).forGetter($$0x -> $$0x.d),
                  cwn.c.fieldOf("result").forGetter($$0x -> $$0x.e),
                  day.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dbs::new)
      );
      public static final ym<vz, dbs> w = ym.a(yk.o, $$0 -> $$0.c, dap.g, $$0 -> $$0.d, cwn.h, $$0 -> $$0.e, day.a.a(yk.a()), $$0 -> $$0.f, dbs::new);

      @Override
      public MapCodec<dbs> a() {
         return x;
      }

      @Override
      public ym<vz, dbs> b() {
         return w;
      }
   }
}
