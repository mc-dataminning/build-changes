import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record emd(emp b, eiu c) implements elu {
   public static final Codec<emd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emq.a.fieldOf("value").forGetter(emd::c), eiu.a.fieldOf("range").forGetter(emd::d)).apply($$0, emd::new)
   );

   @Override
   public elv b() {
      return elw.s;
   }

   @Override
   public Set<eld<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eiv $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static elu.a a(emp $$0, eiu $$1) {
      return () -> new emd($$0, $$1);
   }

   public emp c() {
      return this.b;
   }

   public eiu d() {
      return this.c;
   }
}
