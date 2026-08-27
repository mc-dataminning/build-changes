import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egp(ecq.b c) implements egs {
   public static final Codec<egp> a = RecordCodecBuilder.create($$0 -> $$0.group(ecq.b.e.fieldOf("target").forGetter(egp::c)).apply($$0, egp::new));
   public static final Codec<egp> b = ecq.b.e.xmap(egp::new, egp::c);

   public static egs a(ecq.b $$0) {
      return new egp($$0);
   }

   @Override
   public egr a() {
      return egt.c;
   }

   @Nullable
   @Override
   public String a(ecq $$0) {
      biq $$1 = $$0.c(this.c.a());
      return $$1 != null ? $$1.cx() : null;
   }

   @Override
   public Set<eey<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
