import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egx(afw b) implements egv {
   public static final Codec<egx> a = RecordCodecBuilder.create($$0 -> $$0.group(afw.a.fieldOf("source").forGetter(egx::c)).apply($$0, egx::new));

   @Override
   public egu a() {
      return egw.b;
   }

   @Nullable
   @Override
   public sn a(edi $$0) {
      return $$0.d().n().aG().a(this.b);
   }

   @Override
   public Set<efq<?>> b() {
      return ImmutableSet.of();
   }

   public afw c() {
      return this.b;
   }
}
