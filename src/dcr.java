import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcr(dco f, dco g, dco h, dco i, dco j) implements dci {
   public static final MapCodec<dcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dco.a.fieldOf("template").forGetter(dcr::b),
               dco.a.fieldOf("base").forGetter(dcr::c),
               dco.a.fieldOf("addition").forGetter(dcr::f),
               dco.a.fieldOf("result").forGetter(dcr::d),
               dco.a.fieldOf("crafting_station").forGetter(dcr::e)
            )
            .apply($$0, dcr::new)
   );
   public static final yn<wa, dcr> b = yn.a(dco.b, dcr::b, dco.b, dcr::c, dco.b, dcr::f, dco.b, dcr::d, dco.b, dcr::e, dcr::new);
   public static final dci.a<dcr> c = new dci.a<>(a, b);

   @Override
   public dci.a<dcr> a() {
      return c;
   }

   public dco b() {
      return this.f;
   }

   public dco c() {
      return this.g;
   }

   public dco f() {
      return this.h;
   }

   @Override
   public dco d() {
      return this.i;
   }

   @Override
   public dco e() {
      return this.j;
   }
}
