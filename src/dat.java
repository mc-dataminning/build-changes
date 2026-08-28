import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dat implements czz {
   final String a;
   final czx b;
   final cvx c;
   final List<daf> d;
   @Nullable
   private dai e;

   public dat(String $$0, czx $$1, cvx $$2, List<daf> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public dao<?> ar_() {
      return dao.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public czx d() {
      return this.b;
   }

   @Override
   public cvx a(jr.a $$0) {
      return this.c;
   }

   @Override
   public dai a() {
      if (this.e == null) {
         this.e = dai.b(this.d);
      }

      return this.e;
   }

   public boolean a(czy $$0, dev $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cvx a(czy $$0, jr.a $$1) {
      return this.c.v();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements dao<dat> {
      private static final MapCodec<dat> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  czx.e.fieldOf("category").orElse(czx.d).forGetter($$0x -> $$0x.b),
                  cvx.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  daf.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dat::new)
      );
      public static final zf<ws, dat> w = zf.a(zd.m, $$0 -> $$0.a, czx.g, $$0 -> $$0.b, cvx.i, $$0 -> $$0.c, daf.a.a(zd.a()), $$0 -> $$0.d, dat::new);

      @Override
      public MapCodec<dat> a() {
         return x;
      }

      @Override
      public zf<ws, dat> b() {
         return w;
      }
   }
}
