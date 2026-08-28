import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzr {
   public static final dzr a = new dzr(false, dez.gz.o(), dez.pL.o(), dez.ej.o(), dez.aQ.o());
   public static final Codec<dzr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dzr::a),
               dsa.b.optionalFieldOf("air_state", a.b()).forGetter(dzr::b),
               dsa.b.optionalFieldOf("water_state", a.b()).forGetter(dzr::c),
               dsa.b.optionalFieldOf("lava_state", a.b()).forGetter(dzr::d),
               dsa.b.optionalFieldOf("barrier_state", a.b()).forGetter(dzr::e)
            )
            .apply($$0, dzr::new)
   );
   private final boolean c;
   private final dsa d;
   private final dsa e;
   private final dsa f;
   private final dsa g;

   public static dzr a(boolean $$0, dsa $$1, dsa $$2, dsa $$3, dsa $$4) {
      return new dzr($$0, $$1, $$2, $$3, $$4);
   }

   public static dzr a(dsa $$0, dsa $$1, dsa $$2, dsa $$3) {
      return new dzr(false, $$0, $$1, $$2, $$3);
   }

   public static dzr a(boolean $$0, dsa $$1) {
      return new dzr($$0, $$1, a.c(), a.d(), a.e());
   }

   private dzr(boolean $$0, dsa $$1, dsa $$2, dsa $$3, dsa $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dsa b() {
      return this.d;
   }

   public dsa c() {
      return this.e;
   }

   public dsa d() {
      return this.f;
   }

   public dsa e() {
      return this.g;
   }
}
