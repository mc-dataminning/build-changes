import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekd(ekp b, egu c) implements eju {
   public static final Codec<ekd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekq.a.fieldOf("value").forGetter(ekd::c), egu.a.fieldOf("range").forGetter(ekd::d)).apply($$0, ekd::new)
   );

   @Override
   public ejv b() {
      return ejw.s;
   }

   @Override
   public Set<ejd<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(egv $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eju.a a(ekp $$0, egu $$1) {
      return () -> new ekd($$0, $$1);
   }

   public ekp c() {
      return this.b;
   }

   public egu d() {
      return this.c;
   }
}
