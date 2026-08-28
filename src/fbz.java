import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fbz(Optional<bx> b, eyn.b c) implements fbw {
   public static final MapCodec<fbz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bx.a.optionalFieldOf("predicate").forGetter(fbz::c), eyn.b.e.fieldOf("entity").forGetter(fbz::d)).apply($$0, fbz::new)
   );

   @Override
   public fbx b() {
      return fby.f;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.f, this.c.a());
   }

   public boolean a(eyn $$0) {
      bwa $$1 = $$0.c(this.c.a());
      fdw $$2 = $$0.c(fbh.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static fbw.a a(eyn.b $$0) {
      return a($$0, bx.a.a());
   }

   public static fbw.a a(eyn.b $$0, bx.a $$1) {
      return () -> new fbz(Optional.of($$1.b()), $$0);
   }

   public static fbw.a a(eyn.b $$0, bx $$1) {
      return () -> new fbz(Optional.of($$1), $$0);
   }

   public Optional<bx> c() {
      return this.b;
   }

   public eyn.b d() {
      return this.c;
   }
}
