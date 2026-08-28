import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebw {
   public static final ebw a = new ebw(false, dgx.gz.o(), dgx.pL.o(), dgx.ej.o(), dgx.aQ.o());
   public static final Codec<ebw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(ebw::a),
               dua.a.optionalFieldOf("air_state", a.b()).forGetter(ebw::b),
               dua.a.optionalFieldOf("water_state", a.b()).forGetter(ebw::c),
               dua.a.optionalFieldOf("lava_state", a.b()).forGetter(ebw::d),
               dua.a.optionalFieldOf("barrier_state", a.b()).forGetter(ebw::e)
            )
            .apply($$0, ebw::new)
   );
   private final boolean c;
   private final dua d;
   private final dua e;
   private final dua f;
   private final dua g;

   public static ebw a(boolean $$0, dua $$1, dua $$2, dua $$3, dua $$4) {
      return new ebw($$0, $$1, $$2, $$3, $$4);
   }

   public static ebw a(dua $$0, dua $$1, dua $$2, dua $$3) {
      return new ebw(false, $$0, $$1, $$2, $$3);
   }

   public static ebw a(boolean $$0, dua $$1) {
      return new ebw($$0, $$1, a.c(), a.d(), a.e());
   }

   private ebw(boolean $$0, dua $$1, dua $$2, dua $$3, dua $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dua b() {
      return this.d;
   }

   public dua c() {
      return this.e;
   }

   public dua d() {
      return this.f;
   }

   public dua e() {
      return this.g;
   }
}
