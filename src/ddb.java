import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class ddb implements dca {
   final String c;
   final dby d;
   final cxy e;
   final List<dch> f;
   @Nullable
   private dck g;

   public ddb(String $$0, dby $$1, cxy $$2, List<dch> $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public dcv<ddb> a() {
      return dcv.b;
   }

   @Override
   public String j() {
      return this.c;
   }

   @Override
   public dby c() {
      return this.d;
   }

   @Override
   public dck ak_() {
      if (this.g == null) {
         this.g = dck.b(this.f);
      }

      return this.g;
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.e() != this.f.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.f.size() == 1 ? this.f.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cxy a(dbz $$0, ju.a $$1) {
      return this.e.v();
   }

   @Override
   public List<ddr> g() {
      return List.of(new ddw(this.f.stream().map(dch::c).toList(), new ddx.f(this.e), new ddx.d(cyc.fe)));
   }

   public static class a implements dcv<ddb> {
      private static final MapCodec<ddb> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.c),
                  dby.e.fieldOf("category").orElse(dby.d).forGetter($$0x -> $$0x.d),
                  cxy.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  dch.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, ddb::new)
      );
      public static final yt<wg, ddb> w = yt.a(yr.o, $$0 -> $$0.c, dby.g, $$0 -> $$0.d, cxy.i, $$0 -> $$0.e, dch.a.a(yr.a()), $$0 -> $$0.f, ddb::new);

      @Override
      public MapCodec<ddb> a() {
         return x;
      }

      @Override
      public yt<wg, ddb> b() {
         return w;
      }
   }
}
