import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwz {
   public static final dwz a = new dwz(false, dcj.gz.n(), dcj.pL.n(), dcj.ej.n(), dcj.aQ.n());
   public static final Codec<dwz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dwz::a),
               dpi.b.optionalFieldOf("air_state", a.b()).forGetter(dwz::b),
               dpi.b.optionalFieldOf("water_state", a.b()).forGetter(dwz::c),
               dpi.b.optionalFieldOf("lava_state", a.b()).forGetter(dwz::d),
               dpi.b.optionalFieldOf("barrier_state", a.b()).forGetter(dwz::e)
            )
            .apply($$0, dwz::new)
   );
   private final boolean c;
   private final dpi d;
   private final dpi e;
   private final dpi f;
   private final dpi g;

   public static dwz a(boolean $$0, dpi $$1, dpi $$2, dpi $$3, dpi $$4) {
      return new dwz($$0, $$1, $$2, $$3, $$4);
   }

   public static dwz a(dpi $$0, dpi $$1, dpi $$2, dpi $$3) {
      return new dwz(false, $$0, $$1, $$2, $$3);
   }

   public static dwz a(boolean $$0, dpi $$1) {
      return new dwz($$0, $$1, a.c(), a.d(), a.e());
   }

   private dwz(boolean $$0, dpi $$1, dpi $$2, dpi $$3, dpi $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dpi b() {
      return this.d;
   }

   public dpi c() {
      return this.e;
   }

   public dpi d() {
      return this.f;
   }

   public dpi e() {
      return this.g;
   }
}
