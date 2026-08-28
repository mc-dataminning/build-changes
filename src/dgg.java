import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgg(dgd f, dgd g, dgd h, dgd i, dgd j) implements dfx {
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgd.a.fieldOf("template").forGetter(dgg::b),
               dgd.a.fieldOf("base").forGetter(dgg::c),
               dgd.a.fieldOf("addition").forGetter(dgg::f),
               dgd.a.fieldOf("result").forGetter(dgg::d),
               dgd.a.fieldOf("crafting_station").forGetter(dgg::e)
            )
            .apply($$0, dgg::new)
   );
   public static final za<wn, dgg> b = za.a(dgd.b, dgg::b, dgd.b, dgg::c, dgd.b, dgg::f, dgd.b, dgg::d, dgd.b, dgg::e, dgg::new);
   public static final dfx.a<dgg> c = new dfx.a<>(a, b);

   @Override
   public dfx.a<dgg> a() {
      return c;
   }

   public dgd b() {
      return this.f;
   }

   public dgd c() {
      return this.g;
   }

   public dgd f() {
      return this.h;
   }

   @Override
   public dgd d() {
      return this.i;
   }

   @Override
   public dgd e() {
      return this.j;
   }
}
