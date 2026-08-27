import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmi {
   public static final dmi a = new dmi(false, csn.gz.n(), csn.pL.n(), csn.ek.n(), csn.aQ.n());
   public static final Codec<dmi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dmi::a),
               dfa.b.optionalFieldOf("air_state", a.b()).forGetter(dmi::b),
               dfa.b.optionalFieldOf("water_state", a.b()).forGetter(dmi::c),
               dfa.b.optionalFieldOf("lava_state", a.b()).forGetter(dmi::d),
               dfa.b.optionalFieldOf("barrier_state", a.b()).forGetter(dmi::e)
            )
            .apply($$0, dmi::new)
   );
   private final boolean c;
   private final dfa d;
   private final dfa e;
   private final dfa f;
   private final dfa g;

   public static dmi a(boolean $$0, dfa $$1, dfa $$2, dfa $$3, dfa $$4) {
      return new dmi($$0, $$1, $$2, $$3, $$4);
   }

   public static dmi a(dfa $$0, dfa $$1, dfa $$2, dfa $$3) {
      return new dmi(false, $$0, $$1, $$2, $$3);
   }

   public static dmi a(boolean $$0, dfa $$1) {
      return new dmi($$0, $$1, a.c(), a.d(), a.e());
   }

   private dmi(boolean $$0, dfa $$1, dfa $$2, dfa $$3, dfa $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dfa b() {
      return this.d;
   }

   public dfa c() {
      return this.e;
   }

   public dfa d() {
      return this.f;
   }

   public dfa e() {
      return this.g;
   }
}
