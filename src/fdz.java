import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdz(fem b, fag c) implements fdq {
   public static final MapCodec<fdz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fen.a.fieldOf("value").forGetter(fdz::c), fag.a.fieldOf("range").forGetter(fdz::d)).apply($$0, fdz::new)
   );

   @Override
   public fdr b() {
      return fds.r;
   }

   @Override
   public Set<baz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(fah $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static fdq.a a(fem $$0, fag $$1) {
      return () -> new fdz($$0, $$1);
   }

   public fem c() {
      return this.b;
   }

   public fag d() {
      return this.c;
   }
}
