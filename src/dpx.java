import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpx {
   public static final dpx a = new dpx(false, cwb.gz.o(), cwb.pL.o(), cwb.ej.o(), cwb.aQ.o());
   public static final Codec<dpx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dpx::a),
               dip.b.optionalFieldOf("air_state", a.b()).forGetter(dpx::b),
               dip.b.optionalFieldOf("water_state", a.b()).forGetter(dpx::c),
               dip.b.optionalFieldOf("lava_state", a.b()).forGetter(dpx::d),
               dip.b.optionalFieldOf("barrier_state", a.b()).forGetter(dpx::e)
            )
            .apply($$0, dpx::new)
   );
   private final boolean c;
   private final dip d;
   private final dip e;
   private final dip f;
   private final dip g;

   public static dpx a(boolean $$0, dip $$1, dip $$2, dip $$3, dip $$4) {
      return new dpx($$0, $$1, $$2, $$3, $$4);
   }

   public static dpx a(dip $$0, dip $$1, dip $$2, dip $$3) {
      return new dpx(false, $$0, $$1, $$2, $$3);
   }

   public static dpx a(boolean $$0, dip $$1) {
      return new dpx($$0, $$1, a.c(), a.d(), a.e());
   }

   private dpx(boolean $$0, dip $$1, dip $$2, dip $$3, dip $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dip b() {
      return this.d;
   }

   public dip c() {
      return this.e;
   }

   public dip d() {
      return this.f;
   }

   public dip e() {
      return this.g;
   }
}
