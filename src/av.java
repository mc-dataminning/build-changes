import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record av(Optional<ip<dby>> c, Optional<db> d, Optional<co> e) {
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.a(ja.a(ks.f), "blocks").forGetter(av::b), aws.a(db.a, "state").forGetter(av::c), aws.a(co.a, "nbt").forGetter(av::d))
            .apply($$0, av::new)
   );
   public static final ye<vr, av> b = ye.a(yc.a(yc.c(ks.f)), av::b, yc.a(db.b), av::c, yc.a(co.b), av::d, av::new);

   public boolean a(aps $$0, ib $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dpd $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(doz $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(cza $$0, @Nullable dmf $$1, co $$2) {
      return $$1 != null && $$2.a($$1.b($$0.H_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<ip<dby>> b() {
      return this.c;
   }

   public Optional<db> c() {
      return this.d;
   }

   public Optional<co> d() {
      return this.e;
   }

   public static class a {
      private Optional<ip<dby>> a = Optional.empty();
      private Optional<db> b = Optional.empty();
      private Optional<co> c = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(dby... $$0) {
         this.a = Optional.of(ip.a(dby::r, $$0));
         return this;
      }

      public av.a a(Collection<dby> $$0) {
         this.a = Optional.of(ip.a(dby::r, $$0));
         return this;
      }

      public av.a a(avr<dby> $$0) {
         this.a = Optional.of(kr.e.a($$0));
         return this;
      }

      public av.a a(tm $$0) {
         this.c = Optional.of(new co($$0));
         return this;
      }

      public av.a a(db.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public av b() {
         return new av(this.a, this.b, this.c);
      }
   }
}
