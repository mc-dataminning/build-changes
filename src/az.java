import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record az(Optional<jj<dmr>> c, Optional<dr> d, Optional<cz> e) {
   public static final Codec<az> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ju.a(mh.i).optionalFieldOf("blocks").forGetter(az::b),
               dr.a.optionalFieldOf("state").forGetter(az::c),
               cz.a.optionalFieldOf("nbt").forGetter(az::d)
            )
            .apply($$0, az::new)
   );
   public static final yw<wj, az> b = yw.a(yu.a(yu.c(mh.i)), az::b, yu.a(dr.b), az::c, yu.a(cz.b), az::d, az::new);

   public boolean a(arq $$0, iv $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(eax $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(eat $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(djp $$0, @Nullable dxr $$1, cz $$2) {
      return $$1 != null && $$2.a($$1.b($$0.F_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<jj<dmr>> b() {
      return this.c;
   }

   public Optional<dr> c() {
      return this.d;
   }

   public Optional<cz> d() {
      return this.e;
   }

   public static class a {
      private Optional<jj<dmr>> a = Optional.empty();
      private Optional<dr> b = Optional.empty();
      private Optional<cz> c = Optional.empty();

      private a() {
      }

      public static az.a a() {
         return new az.a();
      }

      public az.a a(jg<dmr> $$0, dmr... $$1) {
         return this.a($$0, Arrays.asList($$1));
      }

      public az.a a(jg<dmr> $$0, Collection<dmr> $$1) {
         this.a = Optional.of(jj.a(dmr::p, $$1));
         return this;
      }

      public az.a a(jg<dmr> $$0, axr<dmr> $$1) {
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
