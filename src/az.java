import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record az(Optional<jj<dnc>> c, Optional<dr> d, Optional<cz> e) {
   public static final Codec<az> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ju.a(mh.i).optionalFieldOf("blocks").forGetter(az::b),
               dr.a.optionalFieldOf("state").forGetter(az::c),
               cz.a.optionalFieldOf("nbt").forGetter(az::d)
            )
            .apply($$0, az::new)
   );
   public static final yy<wl, az> b = yy.a(yw.a(yw.c(mh.i)), az::b, yw.a(dr.b), az::c, yw.a(cz.b), az::d, az::new);

   public boolean a(ars $$0, iv $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(ebi $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(ebe $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dka $$0, @Nullable dyc $$1, cz $$2) {
      return $$1 != null && $$2.a($$1.b($$0.J_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<jj<dnc>> b() {
      return this.c;
   }

   public Optional<dr> c() {
      return this.d;
   }

   public Optional<cz> d() {
      return this.e;
   }

   public static class a {
      private Optional<jj<dnc>> a = Optional.empty();
      private Optional<dr> b = Optional.empty();
      private Optional<cz> c = Optional.empty();

      private a() {
      }

      public static az.a a() {
         return new az.a();
      }

      public az.a a(jg<dnc> $$0, dnc... $$1) {
         return this.a($$0, Arrays.asList($$1));
      }

      public az.a a(jg<dnc> $$0, Collection<dnc> $$1) {
         this.a = Optional.of(jj.a(dnc::p, $$1));
         return this;
      }

      public az.a a(jg<dnc> $$0, axt<dnc> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public az.a a(tz $$0) {
         this.c = Optional.of(new cz($$0));
         return this;
      }

      public az.a a(dr.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public az b() {
         return new az(this.a, this.b, this.c);
      }
   }
}
