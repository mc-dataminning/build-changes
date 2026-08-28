import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class daz implements daf {
   final String a;
   final dad b;
   final cwb c;
   final List<dal> d;
   @Nullable
   private dao e;

   public daz(String $$0, dad $$1, cwb $$2, List<dal> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public dau<?> aq_() {
      return dau.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public dad d() {
      return this.b;
   }

   @Override
   public cwb a(js.a $$0) {
      return this.c;
   }

   @Override
   public dao a() {
      if (this.e == null) {
         this.e = dao.b(this.d);
      }

      return this.e;
   }

   public boolean a(dae $$0, dfb $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cwb a(dae $$0, js.a $$1) {
      return this.c.v();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements dau<daz> {
      private static final MapCodec<daz> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  dad.e.fieldOf("category").orElse(dad.d).forGetter($$0x -> $$0x.b),
                  cwb.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  dal.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, daz::new)
      );
      public static final zg<wt, daz> w = zg.a(ze.m, $$0 -> $$0.a, dad.g, $$0 -> $$0.b, cwb.i, $$0 -> $$0.c, dal.a.a(ze.a()), $$0 -> $$0.d, daz::new);

      @Override
      public MapCodec<daz> a() {
         return x;
      }

      @Override
      public zg<wt, daz> b() {
         return w;
      }
   }
}
