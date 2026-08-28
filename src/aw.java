import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record aw(Optional<jq<dfw>> c, Optional<eb> d, Optional<dk> e) {
   public static final Codec<aw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kb.a(lu.f).optionalFieldOf("blocks").forGetter(aw::b),
               eb.a.optionalFieldOf("state").forGetter(aw::c),
               dk.a.optionalFieldOf("nbt").forGetter(aw::d)
            )
            .apply($$0, aw::new)
   );
   public static final yw<wj, aw> b = yw.a(yu.a(yu.c(lu.f)), aw::b, yu.a(eb.b), aw::c, yu.a(dk.b), aw::d, aw::new);

   public boolean a(aqt $$0, jd $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dte $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dta $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dcx $$0, @Nullable dqf $$1, dk $$2) {
      return $$1 != null && $$2.a($$1.b($$0.H_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<jq<dfw>> b() {
      return this.c;
   }

   public Optional<eb> c() {
      return this.d;
   }

   public Optional<dk> d() {
      return this.e;
   }

   public static class a {
      private Optional<jq<dfw>> a = Optional.empty();
      private Optional<eb> b = Optional.empty();
      private Optional<dk> c = Optional.empty();

      private a() {
      }

      public static aw.a a() {
         return new aw.a();
      }

      public aw.a a(dfw... $$0) {
         this.a = Optional.of(jq.a(dfw::s, $$0));
         return this;
      }

      public aw.a a(Collection<dfw> $$0) {
         this.a = Optional.of(jq.a(dfw::s, $$0));
         return this;
      }

      public aw.a a(awt<dfw> $$0) {
         this.a = Optional.of(lt.e.a($$0));
         return this;
      }

      public aw.a a(ua $$0) {
         this.c = Optional.of(new dk($$0));
         return this;
      }

      public aw.a a(eb.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public aw b() {
         return new aw(this.a, this.b, this.c);
      }
   }
}
