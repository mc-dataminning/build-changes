import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efi(he<ctc> b, Optional<da> c) implements efj {
   public static final Codec<efi> a = arj.a(
      RecordCodecBuilder.create($$0 -> $$0.group(jb.f.r().fieldOf("block").forGetter(efi::c), arj.a(da.a, "properties").forGetter(efi::d)).apply($$0, efi::new)),
      efi::a
   );

   private static DataResult<efi> a(efi $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public efk b() {
      return efl.j;
   }

   @Override
   public Set<ees<?>> a() {
      return Set.of(eev.g);
   }

   public boolean a(eck $$0) {
      dfd $$1 = $$0.c(eev.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static efi.a a(ctc $$0) {
      return new efi.a($$0);
   }

   public he<ctc> c() {
      return this.b;
   }

   public Optional<da> d() {
      return this.c;
   }

   public static class a implements efj.a {
      private final he<ctc> a;
      private Optional<da> b = Optional.empty();

      public a(ctc $$0) {
         this.a = $$0.r();
      }

      public efi.a a(da.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public efj build() {
         return new efi(this.a, this.b);
      }
   }
}
