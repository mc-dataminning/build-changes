import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bz(Optional<jb<emv>> b, Optional<dl> c) {
   public static final Codec<bz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jm.a(lf.z).optionalFieldOf("fluids").forGetter(bz::a), dl.a.optionalFieldOf("state").forGetter(bz::b)).apply($$0, bz::new)
   );

   public boolean a(aqn $$0, io $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         emw $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<jb<emv>> a() {
      return this.b;
   }

   public Optional<dl> b() {
      return this.c;
   }

   public static class a {
      private Optional<jb<emv>> a = Optional.empty();
      private Optional<dl> b = Optional.empty();

      private a() {
      }

      public static bz.a a() {
         return new bz.a();
      }

      public bz.a a(emv $$0) {
         this.a = Optional.of(jb.a($$0.k()));
         return this;
      }

      public bz.a a(jb<emv> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bz.a a(dl $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bz b() {
         return new bz(this.a, this.b);
      }
   }
}
