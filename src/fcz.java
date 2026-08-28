import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcz(fdm b, ezg c) implements fcq {
   public static final MapCodec<fcz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdn.a.fieldOf("value").forGetter(fcz::c), ezg.a.fieldOf("range").forGetter(fcz::d)).apply($$0, fcz::new)
   );

   @Override
   public fcr b() {
      return fcs.r;
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ezh $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static fcq.a a(fdm $$0, ezg $$1) {
      return () -> new fcz($$0, $$1);
   }

   public fdm c() {
      return this.b;
   }

   public ezg d() {
      return this.c;
   }
}
