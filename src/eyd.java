import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eyd(eyu b) implements exy {
   public static final MapCodec<eyd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eyv.a.fieldOf("chance").forGetter(eyd::c)).apply($$0, eyd::new));

   @Override
   public exz b() {
      return eya.d;
   }

   public boolean a(eun $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static exy.a a(float $$0) {
      return () -> new eyd(eyr.a($$0));
   }

   public static exy.a a(eyu $$0) {
      return () -> new eyd($$0);
   }

   public eyu c() {
      return this.b;
   }
}
