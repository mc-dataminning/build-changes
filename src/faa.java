import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record faa(fan b, ewh c) implements ezr {
   public static final MapCodec<faa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fao.a.fieldOf("value").forGetter(faa::c), ewh.a.fieldOf("range").forGetter(faa::d)).apply($$0, faa::new)
   );

   @Override
   public ezs b() {
      return ezt.r;
   }

   @Override
   public Set<bbd<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ewi $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ezr.a a(fan $$0, ewh $$1) {
      return () -> new faa($$0, $$1);
   }

   public fan c() {
      return this.b;
   }

   public ewh d() {
      return this.c;
   }
}
