import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcw(fcs b, fcs c) implements fcs {
   public static final MapCodec<fcw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fct.a.fieldOf("min").forGetter(fcw::c), fct.a.fieldOf("max").forGetter(fcw::d)).apply($$0, fcw::new)
   );

   @Override
   public fcr b() {
      return fct.c;
   }

   public static fcw a(float $$0, float $$1) {
      return new fcw(fcp.a($$0), fcp.a($$1));
   }

   @Override
   public int a(eyn $$0) {
      return azk.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eyn $$0) {
      return azk.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bav<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fcs c() {
      return this.b;
   }

   public fcs d() {
      return this.c;
   }
}
