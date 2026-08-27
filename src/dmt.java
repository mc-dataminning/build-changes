import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmt {
   public static final dmt a = new dmt(false, csy.gz.n(), csy.pL.n(), csy.ek.n(), csy.aQ.n());
   public static final Codec<dmt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dmt::a),
               dfl.b.optionalFieldOf("air_state", a.b()).forGetter(dmt::b),
               dfl.b.optionalFieldOf("water_state", a.b()).forGetter(dmt::c),
               dfl.b.optionalFieldOf("lava_state", a.b()).forGetter(dmt::d),
               dfl.b.optionalFieldOf("barrier_state", a.b()).forGetter(dmt::e)
            )
            .apply($$0, dmt::new)
   );
   private final boolean c;
   private final dfl d;
   private final dfl e;
   private final dfl f;
   private final dfl g;

   public static dmt a(boolean $$0, dfl $$1, dfl $$2, dfl $$3, dfl $$4) {
      return new dmt($$0, $$1, $$2, $$3, $$4);
   }

   public static dmt a(dfl $$0, dfl $$1, dfl $$2, dfl $$3) {
      return new dmt(false, $$0, $$1, $$2, $$3);
   }

   public static dmt a(boolean $$0, dfl $$1) {
      return new dmt($$0, $$1, a.c(), a.d(), a.e());
   }

   private dmt(boolean $$0, dfl $$1, dfl $$2, dfl $$3, dfl $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dfl b() {
      return this.d;
   }

   public dfl c() {
      return this.e;
   }

   public dfl d() {
      return this.f;
   }

   public dfl e() {
      return this.g;
   }
}
