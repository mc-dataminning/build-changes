import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsn {
   public static final dsn a = new dsn(false, cyq.gz.o(), cyq.pL.o(), cyq.ej.o(), cyq.aQ.o());
   public static final Codec<dsn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dsn::a),
               dlf.b.optionalFieldOf("air_state", a.b()).forGetter(dsn::b),
               dlf.b.optionalFieldOf("water_state", a.b()).forGetter(dsn::c),
               dlf.b.optionalFieldOf("lava_state", a.b()).forGetter(dsn::d),
               dlf.b.optionalFieldOf("barrier_state", a.b()).forGetter(dsn::e)
            )
            .apply($$0, dsn::new)
   );
   private final boolean c;
   private final dlf d;
   private final dlf e;
   private final dlf f;
   private final dlf g;

   public static dsn a(boolean $$0, dlf $$1, dlf $$2, dlf $$3, dlf $$4) {
      return new dsn($$0, $$1, $$2, $$3, $$4);
   }

   public static dsn a(dlf $$0, dlf $$1, dlf $$2, dlf $$3) {
      return new dsn(false, $$0, $$1, $$2, $$3);
   }

   public static dsn a(boolean $$0, dlf $$1) {
      return new dsn($$0, $$1, a.c(), a.d(), a.e());
   }

   private dsn(boolean $$0, dlf $$1, dlf $$2, dlf $$3, dlf $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dlf b() {
      return this.d;
   }

   public dlf c() {
      return this.e;
   }

   public dlf d() {
      return this.f;
   }

   public dlf e() {
      return this.g;
   }
}
