import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzz {
   public static final dzz a = new dzz(false, dfh.gz.o(), dfh.pL.o(), dfh.ej.o(), dfh.aQ.o());
   public static final Codec<dzz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(dzz::a),
               dsh.b.optionalFieldOf("air_state", a.b()).forGetter(dzz::b),
               dsh.b.optionalFieldOf("water_state", a.b()).forGetter(dzz::c),
               dsh.b.optionalFieldOf("lava_state", a.b()).forGetter(dzz::d),
               dsh.b.optionalFieldOf("barrier_state", a.b()).forGetter(dzz::e)
            )
            .apply($$0, dzz::new)
   );
   private final boolean c;
   private final dsh d;
   private final dsh e;
   private final dsh f;
   private final dsh g;

   public static dzz a(boolean $$0, dsh $$1, dsh $$2, dsh $$3, dsh $$4) {
      return new dzz($$0, $$1, $$2, $$3, $$4);
   }

   public static dzz a(dsh $$0, dsh $$1, dsh $$2, dsh $$3) {
      return new dzz(false, $$0, $$1, $$2, $$3);
   }

   public static dzz a(boolean $$0, dsh $$1) {
      return new dzz($$0, $$1, a.c(), a.d(), a.e());
   }

   private dzz(boolean $$0, dsh $$1, dsh $$2, dsh $$3, dsh $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dsh b() {
      return this.d;
   }

   public dsh c() {
      return this.e;
   }

   public dsh d() {
      return this.f;
   }

   public dsh e() {
      return this.g;
   }
}
