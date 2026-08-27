import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eob(Optional<Long> b, ekt c) implements ent {
   public static final Codec<eob> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.a(Codec.LONG, "period").forGetter(eob::c), ekt.a.fieldOf("value").forGetter(eob::d)).apply($$0, eob::new)
   );

   @Override
   public enu b() {
      return env.r;
   }

   @Override
   public Set<enc<?>> a() {
      return this.c.a();
   }

   public boolean a(eku $$0) {
      apf $$1 = $$0.d();
      long $$2 = $$1.Y();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eob.a a(ekt $$0) {
      return new eob.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ekt d() {
      return this.c;
   }

   public static class a implements ent.a {
      private Optional<Long> a = Optional.empty();
      private final ekt b;

      public a(ekt $$0) {
         this.b = $$0;
      }

      public eob.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eob a() {
         return new eob(this.a, this.b);
      }
   }
}
