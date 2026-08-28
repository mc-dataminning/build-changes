import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record far(fan b, fan c) implements fan {
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fao.a.fieldOf("min").forGetter(far::c), fao.a.fieldOf("max").forGetter(far::d)).apply($$0, far::new)
   );

   @Override
   public fam b() {
      return fao.c;
   }

   public static far a(float $$0, float $$1) {
      return new far(fak.a($$0), fak.a($$1));
   }

   @Override
   public int a(ewi $$0) {
      return azu.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ewi $$0) {
      return azu.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bbd<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fan c() {
      return this.b;
   }

   public fan d() {
      return this.c;
   }
}
