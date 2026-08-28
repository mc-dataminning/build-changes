import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fel(fey b, fas c) implements fec {
   public static final MapCodec<fel> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fez.a.fieldOf("value").forGetter(fel::c), fas.a.fieldOf("range").forGetter(fel::d)).apply($$0, fel::new)
   );

   @Override
   public fed b() {
      return fee.r;
   }

   @Override
   public Set<bbk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(fat $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static fec.a a(fey $$0, fas $$1) {
      return () -> new fel($$0, $$1);
   }

   public fey c() {
      return this.b;
   }

   public fas d() {
      return this.c;
   }
}
