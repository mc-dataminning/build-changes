import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record aw(Optional<jt<dhy>> c, Optional<ed> d, Optional<dl> e) {
   public static final Codec<aw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ke.a(ly.f).optionalFieldOf("blocks").forGetter(aw::b),
               ed.a.optionalFieldOf("state").forGetter(aw::c),
               dl.a.optionalFieldOf("nbt").forGetter(aw::d)
            )
            .apply($$0, aw::new)
   );
   public static final zf<ws, aw> b = zf.a(zd.a(zd.c(ly.f)), aw::b, zd.a(ed.b), aw::c, zd.a(dl.b), aw::d, aw::new);

   public boolean a(arm $$0, jg $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dvh $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dvd $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dey $$0, @Nullable dsg $$1, dl $$2) {
      return $$1 != null && $$2.a($$1.b($$0.H_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<jt<dhy>> b() {
      return this.c;
   }

   public Optional<ed> c() {
      return this.d;
   }

   public Optional<dl> d() {
      return this.e;
   }

   public static class a {
      private Optional<jt<dhy>> a = Optional.empty();
      private Optional<ed> b = Optional.empty();
      private Optional<dl> c = Optional.empty();

      private a() {
      }

      public static aw.a a() {
         return new aw.a();
      }

      public aw.a a(jq<dhy> $$0, dhy... $$1) {
         return this.a($$0, Arrays.asList($$1));
      }

      public aw.a a(jq<dhy> $$0, Collection<dhy> $$1) {
         this.a = Optional.of(jt.a(dhy::p, $$1));
         return this;
      }

      public aw.a a(jq<dhy> $$0, axp<dhy> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public aw.a a(uj $$0) {
         this.c = Optional.of(new dl($$0));
         return this;
      }

      public aw.a a(ed.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public aw b() {
         return new aw(this.a, this.b, this.c);
      }
   }
}
