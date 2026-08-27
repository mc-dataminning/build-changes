import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dk(cu.d c) implements bt {
   public static final MapCodec<dk> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(axu.a(cu.d.d, "size", cu.d.c).forGetter(dk::b)).apply($$0, dk::new));

   public static dk a(cu.d $$0) {
      return new dk($$0);
   }

   @Override
   public boolean a(brv $$0, aqt $$1, @Nullable ewu $$2) {
      return $$0 instanceof cjn $$3 ? this.c.d($$3.gz()) : false;
   }

   @Override
   public MapCodec<dk> a() {
      return bu.d;
   }

   public cu.d b() {
      return this.c;
   }
}
