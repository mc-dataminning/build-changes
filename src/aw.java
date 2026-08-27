import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record aw(Optional<je<dfc>> c, Optional<dn> d, Optional<cw> e) {
   public static final Codec<aw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.a(jp.a(li.f), "blocks").forGetter(aw::b), axu.a(dn.a, "state").forGetter(aw::c), axu.a(cw.c, "nbt").forGetter(aw::d))
            .apply($$0, aw::new)
   );
   public static final zc<wp, aw> b = zc.a(za.a(za.c(li.f)), aw::b, za.a(dn.b), aw::c, za.a(cw.d), aw::d, aw::new);

   public boolean a(aqt $$0, ir $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dtg $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dtc $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dcd $$0, @Nullable dqc $$1, cw $$2) {
      return $$1 != null && $$2.a($$1.b($$0.I_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<je<dfc>> b() {
      return this.c;
   }

   public Optional<dn> c() {
      return this.d;
   }

   public Optional<cw> d() {
      return this.e;
   }

   public static class a {
      private Optional<je<dfc>> a = Optional.empty();
      private Optional<dn> b = Optional.empty();
      private Optional<cw> c = Optional.empty();

      private a() {
      }

      public static aw.a a() {
         return new aw.a();
      }

      public aw.a a(dfc... $$0) {
         this.a = Optional.of(je.a(dfc::r, $$0));
         return this;
      }

      public aw.a a(Collection<dfc> $$0) {
         this.a = Optional.of(je.a(dfc::r, $$0));
         return this;
      }

      public aw.a a(awt<dfc> $$0) {
         this.a = Optional.of(lh.e.a($$0));
         return this;
      }

      public aw.a a(uk $$0) {
         this.c = Optional.of(new cw($$0));
         return this;
      }

      public aw.a a(dn.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public aw b() {
         return new aw(this.a, this.b, this.c);
      }
   }
}
