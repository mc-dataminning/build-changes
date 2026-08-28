import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbj(js<awj> c) implements dbi {
   public static final MapCodec<dbj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awj.b.fieldOf("sound").forGetter(dbj::b)).apply($$0, dbj::new));
   public static final yt<wg, dbj> b = yt.a(awj.d, dbj::b, dbj::new);

   @Override
   public dbi.a<dbj> a() {
      return dbi.a.e;
   }

   @Override
   public boolean a(dhp $$0, cxy $$1, bwr $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public js<awj> b() {
      return this.c;
   }
}
