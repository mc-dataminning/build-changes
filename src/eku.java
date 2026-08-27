import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eku(egv.b c) implements ekx {
   public static final Codec<eku> a = RecordCodecBuilder.create($$0 -> $$0.group(egv.b.e.fieldOf("target").forGetter(eku::c)).apply($$0, eku::new));
   public static final Codec<eku> b = egv.b.e.xmap(eku::new, eku::c);

   public static ekx a(egv.b $$0) {
      return new eku($$0);
   }

   @Override
   public ekw a() {
      return eky.c;
   }

   @Nullable
   @Override
   public emv a(egv $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<ejd<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
