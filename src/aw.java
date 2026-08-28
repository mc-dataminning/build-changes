import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record aw(Optional<js<dhm>> c, Optional<ec> d, Optional<dk> e) {
   public static final Codec<aw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.a(lw.f).optionalFieldOf("blocks").forGetter(aw::b),
               ec.a.optionalFieldOf("state").forGetter(aw::c),
               dk.a.optionalFieldOf("nbt").forGetter(aw::d)
            )
            .apply($$0, aw::new)
   );
   public static final zc<wp, aw> b = zc.a(za.a(za.c(lw.f)), aw::b, za.a(ec.b), aw::c, za.a(dk.b), aw::d, aw::new);

   public boolean a(arj $$0, jf $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(duw $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dus $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dem $$0, @Nullable drv $$1, dk $$2) {
      return $$1 != null && $$2.a($$1.b($$0.G_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<js<dhm>> b() {
      return this.c;
   }

   public Optional<ec> c() {
      return this.d;
   }

   public Optional<dk> d() {
      return this.e;
   }

   public static class a {
      private Optional<js<dhm>> a = Optional.empty();
      private Optional<ec> b = Optional.empty();
      private Optional<dk> c = Optional.empty();

      private a() {
      }

      public static aw.a a() {
         return new aw.a();
      }

      public aw.a a(jp<dhm> $$0, dhm... $$1) {
         return this.a($$0, Arrays.asList($$1));
      }

      public aw.a a(jp<dhm> $$0, Collection<dhm> $$1) {
         this.a = Optional.of(js.a(dhm::r, $$1));
         return this;
      }

      public aw.a a(jp<dhm> $$0, axl<dhm> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public aw.a a(ug $$0) {
         this.c = Optional.of(new dk($$0));
         return this;
      }

      public aw.a a(ec.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public aw b() {
         return new aw(this.a, this.b, this.c);
      }
   }
}
