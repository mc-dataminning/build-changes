import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dby implements daq {
   final String a;
   final dao b;
   final daw c;
   final daw d;
   final jq<cwi> e;
   @Nullable
   private daz f;

   public dby(String $$0, dao $$1, daw $$2, daw $$3, jq<cwi> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public boolean a(dap $$0, dfm $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (!$$2 && this.c.a($$5)) {
               $$2 = true;
            } else {
               if ($$3 || !this.d.a($$5)) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$2 && $$3;
   }

   public cwm a(dap $$0, js.a $$1) {
      cwm $$2 = cwm.k;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cwm $$4 = $$0.a($$3);
         if (!$$4.f() && this.c.a($$4)) {
            $$2 = $$4;
         }
      }

      return $$2.a(this.e.a(), 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwm a(js.a $$0) {
      return new cwm(this.e);
   }

   @Override
   public dbf<?> ap_() {
      return dbf.m;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public daz a() {
      if (this.f == null) {
         this.f = daz.b(List.of(this.c, this.d));
      }

      return this.f;
   }

   @Override
   public dao d() {
      return this.b;
   }

   public static class a implements dbf<dby> {
      private static final MapCodec<dby> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  dao.e.fieldOf("category").orElse(dao.d).forGetter($$0x -> $$0x.b),
                  daw.d.fieldOf("input").forGetter($$0x -> $$0x.c),
                  daw.d.fieldOf("material").forGetter($$0x -> $$0x.d),
                  alg.a(ma.K).fieldOf("result").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dby::new)
      );
      public static final zh<wu, dby> w = zh.a(
         zf.n, $$0 -> $$0.a, dao.g, $$0 -> $$0.b, daw.a, $$0 -> $$0.c, daw.a, $$0 -> $$0.d, zf.b(ma.K), $$0 -> $$0.e, dby::new
      );

      @Override
      public MapCodec<dby> a() {
         return x;
      }

      @Override
      public zh<wu, dby> b() {
         return w;
      }
   }
}
