import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehs extends ehq {
   public static final MapCodec<ehs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpy.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpy.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ehs::new)
   );
   private final bpy c;
   private final bpy d;

   public static ehs a(bpy $$0, bpy $$1) {
      return new ehs($$0, $$1);
   }

   public static ehs a(bpy $$0) {
      return new ehs(bpv.a(0), $$0);
   }

   public static ehs b(bpy $$0) {
      return new ehs($$0, bpv.a(0));
   }

   private ehs(bpy $$0, bpy $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iz> a_(eho $$0, azg $$1, iz $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iz($$3, $$4, $$5));
   }

   @Override
   public ehr<?> b() {
      return ehr.n;
   }
}
