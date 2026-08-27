import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ejt(agt b) implements ejr {
   public static final Codec<ejt> a = RecordCodecBuilder.create($$0 -> $$0.group(agt.a.fieldOf("source").forGetter(ejt::c)).apply($$0, ejt::new));

   @Override
   public ejq a() {
      return ejs.b;
   }

   @Nullable
   @Override
   public tg a(ege $$0) {
      return $$0.d().n().aI().a(this.b);
   }

   @Override
   public Set<eim<?>> b() {
      return ImmutableSet.of();
   }

   public agt c() {
      return this.b;
   }
}
