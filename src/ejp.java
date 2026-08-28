import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejp {
   public static final ejp a = new ejp(false, dnq.gZ.m(), dnq.qt.m(), dnq.eA.m(), dnq.aX.m());
   public static final Codec<ejp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(ejp::a),
               ebq.a.optionalFieldOf("air_state", a.b()).forGetter(ejp::b),
               ebq.a.optionalFieldOf("water_state", a.b()).forGetter(ejp::c),
               ebq.a.optionalFieldOf("lava_state", a.b()).forGetter(ejp::d),
               ebq.a.optionalFieldOf("barrier_state", a.b()).forGetter(ejp::e)
            )
            .apply($$0, ejp::new)
   );
   private final boolean c;
   private final ebq d;
   private final ebq e;
   private final ebq f;
   private final ebq g;

   public static ejp a(boolean $$0, ebq $$1, ebq $$2, ebq $$3, ebq $$4) {
      return new ejp($$0, $$1, $$2, $$3, $$4);
   }

   public static ejp a(ebq $$0, ebq $$1, ebq $$2, ebq $$3) {
      return new ejp(false, $$0, $$1, $$2, $$3);
   }

   public static ejp a(boolean $$0, ebq $$1) {
      return new ejp($$0, $$1, a.c(), a.d(), a.e());
   }

   private ejp(boolean $$0, ebq $$1, ebq $$2, ebq $$3, ebq $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public ebq b() {
      return this.d;
   }

   public ebq c() {
      return this.e;
   }

   public ebq d() {
      return this.f;
   }

   public ebq e() {
      return this.g;
   }
}
