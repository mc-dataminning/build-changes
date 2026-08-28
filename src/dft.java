import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dft(dfq f, dfq g, dfq h, dfq i, dfq j) implements dfk {
   public static final MapCodec<dft> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfq.a.fieldOf("template").forGetter(dft::b),
               dfq.a.fieldOf("base").forGetter(dft::c),
               dfq.a.fieldOf("addition").forGetter(dft::f),
               dfq.a.fieldOf("result").forGetter(dft::d),
               dfq.a.fieldOf("crafting_station").forGetter(dft::e)
            )
            .apply($$0, dft::new)
   );
   public static final yw<wj, dft> b = yw.a(dfq.b, dft::b, dfq.b, dft::c, dfq.b, dft::f, dfq.b, dft::d, dfq.b, dft::e, dft::new);
   public static final dfk.a<dft> c = new dfk.a<>(a, b);

   @Override
   public dfk.a<dft> a() {
      return c;
   }

   public dfq b() {
      return this.f;
   }

   public dfq c() {
      return this.g;
   }

   public dfq f() {
      return this.h;
   }

   @Override
   public dfq d() {
      return this.i;
   }

   @Override
   public dfq e() {
      return this.j;
   }
}
