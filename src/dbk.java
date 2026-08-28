import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbk(jw<buu> c) implements dbi {
   public static final MapCodec<dbk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kh.a(me.W).fieldOf("effects").forGetter(dbk::b)).apply($$0, dbk::new));
   public static final yt<wg, dbk> b = yt.a(yr.c(me.W), dbk::b, dbk::new);

   public dbk(js<buu> $$0) {
      this(jw.a($$0));
   }

   @Override
   public dbi.a<dbk> a() {
      return dbi.a.b;
   }

   @Override
   public boolean a(dhp $$0, cxy $$1, bwr $$2) {
      boolean $$3 = false;

      for (js<buu> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jw<buu> b() {
      return this.c;
   }
}
