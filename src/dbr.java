import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dbr implements daj {
   final String a;
   final dah b;
   final dap c;
   final dap d;
   final jq<cwb> e;
   @Nullable
   private das f;

   public dbr(String $$0, dah $$1, dap $$2, dap $$3, jq<cwb> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   public boolean a(dai $$0, dff $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
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

   public cwf a(dai $$0, js.a $$1) {
      cwf $$2 = cwf.k;

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cwf $$4 = $$0.a($$3);
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
   public cwf a(js.a $$0) {
      return new cwf(this.e);
   }

   @Override
   public day<?> aq_() {
      return day.m;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public das a() {
      if (this.f == null) {
         this.f = das.b(List.of(this.c, this.d));
      }

      return this.f;
   }

   @Override
   public dah d() {
      return this.b;
   }

   public static class a implements day<dbr> {
      private static final MapCodec<dbr> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  dah.e.fieldOf("category").orElse(dah.d).forGetter($$0x -> $$0x.b),
                  dap.d.fieldOf("input").forGetter($$0x -> $$0x.c),
                  dap.d.fieldOf("material").forGetter($$0x -> $$0x.d),
                  ali.a(ma.K).fieldOf("result").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dbr::new)
      );
      public static final zj<ww, dbr> w = zj.a(
         zh.m, $$0 -> $$0.a, dah.g, $$0 -> $$0.b, dap.a, $$0 -> $$0.c, dap.a, $$0 -> $$0.d, zh.b(ma.K), $$0 -> $$0.e, dbr::new
      );

      @Override
      public MapCodec<dbr> a() {
         return x;
      }

      @Override
      public zj<ww, dbr> b() {
         return w;
      }
   }
}
