import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record erq(esc b, enz c) implements erh {
   public static final Codec<erq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esd.a.fieldOf("value").forGetter(erq::c), enz.a.fieldOf("range").forGetter(erq::d)).apply($$0, erq::new)
   );

   @Override
   public eri b() {
      return erj.s;
   }

   @Override
   public Set<eqq<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eoa $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static erh.a a(esc $$0, enz $$1) {
      return () -> new erq($$0, $$1);
   }

   public esc c() {
      return this.b;
   }

   public enz d() {
      return this.c;
   }
}
