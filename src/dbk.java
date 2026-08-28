import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dbk implements daq {
   final String a;
   final dao b;
   final cwm c;
   final List<daw> d;
   @Nullable
   private daz e;

   public dbk(String $$0, dao $$1, cwm $$2, List<daw> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public dbf<?> ap_() {
      return dbf.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public dao d() {
      return this.b;
   }

   @Override
   public cwm a(js.a $$0) {
      return this.c;
   }

   @Override
   public daz a() {
      if (this.e == null) {
         this.e = daz.b(this.d);
      }

      return this.e;
   }

   public boolean a(dap $$0, dfm $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cwm a(dap $$0, js.a $$1) {
      return this.c.v();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements dbf<dbk> {
      private static final MapCodec<dbk> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  dao.e.fieldOf("category").orElse(dao.d).forGetter($$0x -> $$0x.b),
                  cwm.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  daw.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dbk::new)
      );
      public static final zh<wu, dbk> w = zh.a(zf.n, $$0 -> $$0.a, dao.g, $$0 -> $$0.b, cwm.i, $$0 -> $$0.c, daw.a.a(zf.a()), $$0 -> $$0.d, dbk::new);

      @Override
      public MapCodec<dbk> a() {
         return x;
      }

      @Override
      public zh<wu, dbk> b() {
         return w;
      }
   }
}
