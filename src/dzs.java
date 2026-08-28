import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzs {
   public static final dzs a = new dzs(false, dfa.gz.o(), dfa.pL.o(), dfa.ej.o(), dfa.aQ.o());
   public static final Codec<dzs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dzs::a),
               dsb.b.optionalFieldOf("air_state", a.b()).forGetter(dzs::b),
               dsb.b.optionalFieldOf("water_state", a.b()).forGetter(dzs::c),
               dsb.b.optionalFieldOf("lava_state", a.b()).forGetter(dzs::d),
               dsb.b.optionalFieldOf("barrier_state", a.b()).forGetter(dzs::e)
            )
            .apply($$0, dzs::new)
   );
   private final boolean c;
   private final dsb d;
   private final dsb e;
   private final dsb f;
   private final dsb g;

   public static dzs a(boolean $$0, dsb $$1, dsb $$2, dsb $$3, dsb $$4) {
      return new dzs($$0, $$1, $$2, $$3, $$4);
   }

   public static dzs a(dsb $$0, dsb $$1, dsb $$2, dsb $$3) {
      return new dzs(false, $$0, $$1, $$2, $$3);
   }

   public static dzs a(boolean $$0, dsb $$1) {
      return new dzs($$0, $$1, a.c(), a.d(), a.e());
   }

   private dzs(boolean $$0, dsb $$1, dsb $$2, dsb $$3, dsb $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dsb b() {
      return this.d;
   }

   public dsb c() {
      return this.e;
   }

   public dsb d() {
      return this.f;
   }

   public dsb e() {
      return this.g;
   }
}
