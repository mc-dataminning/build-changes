import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejd {
   public static final ejd a = new ejd(false, dne.gZ.m(), dne.qt.m(), dne.eA.m(), dne.aX.m());
   public static final Codec<ejd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(ejd::a),
               ebe.a.optionalFieldOf("air_state", a.b()).forGetter(ejd::b),
               ebe.a.optionalFieldOf("water_state", a.b()).forGetter(ejd::c),
               ebe.a.optionalFieldOf("lava_state", a.b()).forGetter(ejd::d),
               ebe.a.optionalFieldOf("barrier_state", a.b()).forGetter(ejd::e)
            )
            .apply($$0, ejd::new)
   );
   private final boolean c;
   private final ebe d;
   private final ebe e;
   private final ebe f;
   private final ebe g;

   public static ejd a(boolean $$0, ebe $$1, ebe $$2, ebe $$3, ebe $$4) {
      return new ejd($$0, $$1, $$2, $$3, $$4);
   }

   public static ejd a(ebe $$0, ebe $$1, ebe $$2, ebe $$3) {
      return new ejd(false, $$0, $$1, $$2, $$3);
   }

   public static ejd a(boolean $$0, ebe $$1) {
      return new ejd($$0, $$1, a.c(), a.d(), a.e());
   }

   private ejd(boolean $$0, ebe $$1, ebe $$2, ebe $$3, ebe $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public ebe b() {
      return this.d;
   }

   public ebe c() {
      return this.e;
   }

   public ebe d() {
      return this.f;
   }

   public ebe e() {
      return this.g;
   }
}
