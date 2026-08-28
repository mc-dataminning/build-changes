import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dbd implements daj {
   final String a;
   final dah b;
   final cwf c;
   final List<dap> d;
   @Nullable
   private das e;

   public dbd(String $$0, dah $$1, cwf $$2, List<dap> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public day<?> aq_() {
      return day.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public dah d() {
      return this.b;
   }

   @Override
   public cwf a(js.a $$0) {
      return this.c;
   }

   @Override
   public das a() {
      if (this.e == null) {
         this.e = das.b(this.d);
      }

      return this.e;
   }

   public boolean a(dai $$0, dff $$1) {
      if ($$0.e() != this.d.size()) {
         return false;
      } else {
         return $$0.a() == 1 && this.d.size() == 1 ? this.d.getFirst().a($$0.a(0)) : $$0.c().a(this, null);
      }
   }

   public cwf a(dai $$0, js.a $$1) {
      return this.c.v();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements day<dbd> {
      private static final MapCodec<dbd> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  dah.e.fieldOf("category").orElse(dah.d).forGetter($$0x -> $$0x.b),
                  cwf.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  dap.d.listOf(1, 9).fieldOf("ingredients").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, dbd::new)
      );
      public static final zj<ww, dbd> w = zj.a(zh.m, $$0 -> $$0.a, dah.g, $$0 -> $$0.b, cwf.i, $$0 -> $$0.c, dap.a.a(zh.a()), $$0 -> $$0.d, dbd::new);

      @Override
      public MapCodec<dbd> a() {
         return x;
      }

      @Override
      public zj<ww, dbd> b() {
         return w;
      }
   }
}
