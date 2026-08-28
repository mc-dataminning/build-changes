import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewc(evy b, evy c) implements evy {
   public static final MapCodec<ewc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evz.a.fieldOf("min").forGetter(ewc::c), evz.a.fieldOf("max").forGetter(ewc::d)).apply($$0, ewc::new)
   );

   @Override
   public evx b() {
      return evz.c;
   }

   public static ewc a(float $$0, float $$1) {
      return new ewc(evv.a($$0), evv.a($$1));
   }

   @Override
   public int a(err $$0) {
      return ayo.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(err $$0) {
      return ayo.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<euk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public evy c() {
      return this.b;
   }

   public evy d() {
      return this.c;
   }
}
