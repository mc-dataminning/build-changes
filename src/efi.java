import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efi {
   public static final efi a = new efi(false, dkg.gO.m(), dkg.qg.m(), dkg.ew.m(), dkg.aX.m());
   public static final Codec<efi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(efi::a),
               dxn.a.optionalFieldOf("air_state", a.b()).forGetter(efi::b),
               dxn.a.optionalFieldOf("water_state", a.b()).forGetter(efi::c),
               dxn.a.optionalFieldOf("lava_state", a.b()).forGetter(efi::d),
               dxn.a.optionalFieldOf("barrier_state", a.b()).forGetter(efi::e)
            )
            .apply($$0, efi::new)
   );
   private final boolean c;
   private final dxn d;
   private final dxn e;
   private final dxn f;
   private final dxn g;

   public static efi a(boolean $$0, dxn $$1, dxn $$2, dxn $$3, dxn $$4) {
      return new efi($$0, $$1, $$2, $$3, $$4);
   }

   public static efi a(dxn $$0, dxn $$1, dxn $$2, dxn $$3) {
      return new efi(false, $$0, $$1, $$2, $$3);
   }

   public static efi a(boolean $$0, dxn $$1) {
      return new efi($$0, $$1, a.c(), a.d(), a.e());
   }

   private efi(boolean $$0, dxn $$1, dxn $$2, dxn $$3, dxn $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a() {
      return this.c;
   }

   public dxn b() {
      return this.d;
   }

   public dxn c() {
      return this.e;
   }

   public dxn d() {
      return this.f;
   }

   public dxn e() {
      return this.g;
   }
}
