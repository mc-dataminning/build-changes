import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqx {
   public static final dqx a = new dqx(false, cxa.gz.o(), cxa.pL.o(), cxa.ej.o(), cxa.aQ.o());
   public static final Codec<dqx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dqx::a),
               djp.b.optionalFieldOf("air_state", a.b()).forGetter(dqx::b),
               djp.b.optionalFieldOf("water_state", a.b()).forGetter(dqx::c),
               djp.b.optionalFieldOf("lava_state", a.b()).forGetter(dqx::d),
               djp.b.optionalFieldOf("barrier_state", a.b()).forGetter(dqx::e)
            )
            .apply($$0, dqx::new)
   );
   private final boolean c;
   private final djp d;
   private final djp e;
   private final djp f;
   private final djp g;

   public static dqx a(boolean $$0, djp $$1, djp $$2, djp $$3, djp $$4) {
      return new dqx($$0, $$1, $$2, $$3, $$4);
   }

   public static dqx a(djp $$0, djp $$1, djp $$2, djp $$3) {
      return new dqx(false, $$0, $$1, $$2, $$3);
   }

   public static dqx a(boolean $$0, djp $$1) {
      return new dqx($$0, $$1, a.c(), a.d(), a.e());
   }

   private dqx(boolean $$0, djp $$1, djp $$2, djp $$3, djp $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public djp b() {
      return this.d;
   }

   public djp c() {
      return this.e;
   }

   public djp d() {
      return this.f;
   }

   public djp e() {
      return this.g;
   }
}
