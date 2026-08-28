import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyg(Optional<Long> b, eum c) implements exy {
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(eyg::c), eum.a.fieldOf("value").forGetter(eyg::d)).apply($$0, eyg::new)
   );

   @Override
   public exz b() {
      return eya.q;
   }

   @Override
   public Set<exg<?>> a() {
      return this.c.a();
   }

   public boolean a(eun $$0) {
      arp $$1 = $$0.d();
      long $$2 = $$1.ac();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eyg.a a(eum $$0) {
      return new eyg.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eum d() {
      return this.c;
   }

   public static class a implements exy.a {
      private Optional<Long> a = Optional.empty();
      private final eum b;

      public a(eum $$0) {
         this.b = $$0;
      }

      public eyg.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eyg a() {
         return new eyg(this.a, this.b);
      }
   }
}
