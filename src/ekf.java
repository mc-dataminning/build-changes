import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ekf(Optional<Boolean> b, Optional<Boolean> c) implements ejv {
   public static final Codec<ekf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atw.a(Codec.BOOL, "raining").forGetter(ekf::d), atw.a(Codec.BOOL, "thundering").forGetter(ekf::e)).apply($$0, ekf::new)
   );

   @Override
   public ejw b() {
      return ejx.p;
   }

   public boolean a(egw $$0) {
      and $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ab() ? false : !this.c.isPresent() || this.c.get() == $$1.aa();
   }

   public static ekf.a c() {
      return new ekf.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ejv.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public ekf.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ekf.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ekf a() {
         return new ekf(this.a, this.b);
      }
   }
}
