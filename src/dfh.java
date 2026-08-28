import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dfh implements deg {
   final String d;
   final dee e;
   final daa f;
   final List<den> g;
   @Nullable
   private deq h;

   public dfh(String $$0, dee $$1, daa $$2, List<den> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public dfb<dfh> a() {
      return dfb.b;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public dee c() {
      return this.e;
   }

   @Override
   public deq ap_() {
      if (this.h == null) {
         this.h = deq.b(this.g);
      }

      return this.h;
   }

   public boolean a(def $$0, djz $$1) {
      if ($$0.e() != this.g.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.g.size() == 1 ? this.g.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public daa a(def $$0, ji.a $$1) {
      return this.f.v();
   }

   @Override
   public List<dfx> g() {
      return List.of(new dgc(this.g.stream().map(den::c).toList(), new dgd.f(this.f), new dgd.d(dae.fi)));
   }

   public static class a implements dfb<dfh> {
      private static final MapCodec<dfh> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
                  dee.e.fieldOf("category").orElse(dee.d).forGetter($$0x -> $$0x.e),
                  daa.d.fieldOf("result").forGetter($$0x -> $$0x.f),
                  den.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dfh::new)
      );
      public static final za<wn, dfh> w = za.a(yy.p, $$0 -> $$0.d, dee.g, $$0 -> $$0.e, daa.i, $$0 -> $$0.f, den.a.a(yy.a()), $$0 -> $$0.g, dfh::new);

      @Override
      public MapCodec<dfh> a() {
         return x;
      }

      @Override
      public za<wn, dfh> b() {
         return w;
      }
   }
}
