import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record egp(Optional<Long> b, edh c) implements egh {
   public static final Codec<egp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asg.a(Codec.LONG, "period").forGetter(egp::c), edh.a.fieldOf("value").forGetter(egp::d)).apply($$0, egp::new)
   );

   @Override
   public egi b() {
      return egj.r;
   }

   @Override
   public Set<efq<?>> a() {
      return this.c.a();
   }

   public boolean a(edi $$0) {
      alq $$1 = $$0.d();
      long $$2 = $$1.W();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static egp.a a(edh $$0) {
      return new egp.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public edh d() {
      return this.c;
   }

   public static class a implements egh.a {
      private Optional<Long> a = Optional.empty();
      private final edh b;

      public a(edh $$0) {
         this.b = $$0;
      }

      public egp.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public egp a() {
         return new egp(this.a, this.b);
      }
   }
}
