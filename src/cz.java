import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record cz(cm.d c) implements bs {
   public static final MapCodec<cz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aws.a(cm.d.d, "size", cm.d.c).forGetter(cz::b)).apply($$0, cz::new));

   public static cz a(cm.d $$0) {
      return new cz($$0);
   }

   @Override
   public boolean a(bpv $$0, aps $$1, @Nullable esa $$2) {
      return $$0 instanceof chi $$3 ? this.c.d($$3.go()) : false;
   }

   @Override
   public bs.a a() {
      return bs.b.e;
   }

   public cm.d b() {
      return this.c;
   }
}
