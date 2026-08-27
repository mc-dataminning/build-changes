import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmg {
   public static final dmg a = new dmg(false, csl.gz.n(), csl.pL.n(), csl.ek.n(), csl.aQ.n());
   public static final Codec<dmg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dmg::a),
               dey.b.optionalFieldOf("air_state", a.b()).forGetter(dmg::b),
               dey.b.optionalFieldOf("water_state", a.b()).forGetter(dmg::c),
               dey.b.optionalFieldOf("lava_state", a.b()).forGetter(dmg::d),
               dey.b.optionalFieldOf("barrier_state", a.b()).forGetter(dmg::e)
            )
            .apply($$0, dmg::new)
   );
   private final boolean c;
   private final dey d;
   private final dey e;
   private final dey f;
   private final dey g;

   public static dmg a(boolean $$0, dey $$1, dey $$2, dey $$3, dey $$4) {
      return new dmg($$0, $$1, $$2, $$3, $$4);
   }

   public static dmg a(dey $$0, dey $$1, dey $$2, dey $$3) {
      return new dmg(false, $$0, $$1, $$2, $$3);
   }

   public static dmg a(boolean $$0, dey $$1) {
      return new dmg($$0, $$1, a.c(), a.d(), a.e());
   }

   private dmg(boolean $$0, dey $$1, dey $$2, dey $$3, dey $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dey b() {
      return this.d;
   }

   public dey c() {
      return this.e;
   }

   public dey d() {
      return this.f;
   }

   public dey e() {
      return this.g;
   }
}
