import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaf {
   public static final eaf a = new eaf(false, dfj.gz.o(), dfj.pL.o(), dfj.ej.o(), dfj.aQ.o());
   public static final Codec<eaf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(eaf::a),
               dsk.b.optionalFieldOf("air_state", a.b()).forGetter(eaf::b),
               dsk.b.optionalFieldOf("water_state", a.b()).forGetter(eaf::c),
               dsk.b.optionalFieldOf("lava_state", a.b()).forGetter(eaf::d),
               dsk.b.optionalFieldOf("barrier_state", a.b()).forGetter(eaf::e)
            )
            .apply($$0, eaf::new)
   );
   private final boolean c;
   private final dsk d;
   private final dsk e;
   private final dsk f;
   private final dsk g;

   public static eaf a(boolean $$0, dsk $$1, dsk $$2, dsk $$3, dsk $$4) {
      return new eaf($$0, $$1, $$2, $$3, $$4);
   }

   public static eaf a(dsk $$0, dsk $$1, dsk $$2, dsk $$3) {
      return new eaf(false, $$0, $$1, $$2, $$3);
   }

   public static eaf a(boolean $$0, dsk $$1) {
      return new eaf($$0, $$1, a.c(), a.d(), a.e());
   }

   private eaf(boolean $$0, dsk $$1, dsk $$2, dsk $$3, dsk $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dsk b() {
      return this.d;
   }

   public dsk c() {
      return this.e;
   }

   public dsk d() {
      return this.f;
   }

   public dsk e() {
      return this.g;
   }
}
