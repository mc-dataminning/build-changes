import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dge(dgb f, dgb g, dgb h, dgb i, dgb j) implements dfv {
   public static final MapCodec<dge> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgb.a.fieldOf("template").forGetter(dge::b),
               dgb.a.fieldOf("base").forGetter(dge::c),
               dgb.a.fieldOf("addition").forGetter(dge::f),
               dgb.a.fieldOf("result").forGetter(dge::d),
               dgb.a.fieldOf("crafting_station").forGetter(dge::e)
            )
            .apply($$0, dge::new)
   );
   public static final yy<wl, dge> b = yy.a(dgb.b, dge::b, dgb.b, dge::c, dgb.b, dge::f, dgb.b, dge::d, dgb.b, dge::e, dge::new);
   public static final dfv.a<dge> c = new dfv.a<>(a, b);

   @Override
   public dfv.a<dge> a() {
      return c;
   }

   public dgb b() {
      return this.f;
   }

   public dgb c() {
      return this.g;
   }

   public dgb f() {
      return this.h;
   }

   @Override
   public dgb d() {
      return this.i;
   }

   @Override
   public dgb e() {
      return this.j;
   }
}
