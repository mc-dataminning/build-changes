import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record feb(jg<dno> b, Optional<ds> c) implements fec {
   public static final MapCodec<feb> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mh.e.r().fieldOf("block").forGetter(feb::c), ds.a.optionalFieldOf("properties").forGetter(feb::d)).apply($$0, feb::new)
      )
      .validate(feb::a);

   private static DataResult<feb> a(feb $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public fed b() {
      return fee.i;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.g);
   }

   public boolean a(fat $$0) {
      ebq $$1 = $$0.c(fdn.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static feb.a a(dno $$0) {
      return new feb.a($$0);
   }

   public jg<dno> c() {
      return this.b;
   }

   public Optional<ds> d() {
      return this.c;
   }

   public static class a implements fec.a {
      private final jg<dno> a;
      private Optional<ds> b = Optional.empty();

      public a(dno $$0) {
         this.a = $$0.p();
      }

      public feb.a a(ds.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public fec build() {
         return new feb(this.a, this.b);
      }
   }
}
