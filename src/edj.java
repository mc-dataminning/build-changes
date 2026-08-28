import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edj {
   public static final edj a = new edj(false, dil.gz.m(), dil.pL.m(), dil.ej.m(), dil.aQ.m());
   public static final Codec<edj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(edj::a),
               dvo.a.optionalFieldOf("air_state", a.b()).forGetter(edj::b),
               dvo.a.optionalFieldOf("water_state", a.b()).forGetter(edj::c),
               dvo.a.optionalFieldOf("lava_state", a.b()).forGetter(edj::d),
               dvo.a.optionalFieldOf("barrier_state", a.b()).forGetter(edj::e)
            )
            .apply($$0, edj::new)
   );
   private final boolean c;
   private final dvo d;
   private final dvo e;
   private final dvo f;
   private final dvo g;

   public static edj a(boolean $$0, dvo $$1, dvo $$2, dvo $$3, dvo $$4) {
      return new edj($$0, $$1, $$2, $$3, $$4);
   }

   public static edj a(dvo $$0, dvo $$1, dvo $$2, dvo $$3) {
      return new edj(false, $$0, $$1, $$2, $$3);
   }

   public static edj a(boolean $$0, dvo $$1) {
      return new edj($$0, $$1, a.c(), a.d(), a.e());
   }

   private edj(boolean $$0, dvo $$1, dvo $$2, dvo $$3, dvo $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dvo b() {
      return this.d;
   }

   public dvo c() {
      return this.e;
   }

   public dvo d() {
      return this.f;
   }

   public dvo e() {
      return this.g;
   }
}
