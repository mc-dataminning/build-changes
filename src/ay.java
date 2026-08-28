import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record ay(Optional<ji<dlu>> c, Optional<dq> d, Optional<cy> e) {
   public static final Codec<ay> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jt.a(mg.i).optionalFieldOf("blocks").forGetter(ay::b),
               dq.a.optionalFieldOf("state").forGetter(ay::c),
               cy.a.optionalFieldOf("nbt").forGetter(ay::d)
            )
            .apply($$0, ay::new)
   );
   public static final yu<wh, ay> b = yu.a(ys.a(ys.c(mg.i)), ay::b, ys.a(dq.b), ay::c, ys.a(cy.b), ay::d, ay::new);

   public boolean a(aro $$0, iu $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dzs $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dzo $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dis $$0, @Nullable dwn $$1, cy $$2) {
      return $$1 != null && $$2.a($$1.b($$0.F_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<ji<dlu>> b() {
      return this.c;
   }

   public Optional<dq> c() {
      return this.d;
   }

   public Optional<cy> d() {
      return this.e;
   }

   public static class a {
      private Optional<ji<dlu>> a = Optional.empty();
      private Optional<dq> b = Optional.empty();
      private Optional<cy> c = Optional.empty();

      private a() {
      }

      public static ay.a a() {
         return new ay.a();
      }

      public ay.a a(jf<dlu> $$0, dlu... $$1) {
         return this.a($$0, Arrays.asList($$1));
      }

      public ay.a a(jf<dlu> $$0, Collection<dlu> $$1) {
         this.a = Optional.of(ji.a(dlu::p, $$1));
         return this;
      }

      public ay.a a(jf<dlu> $$0, axp<dlu> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public ay.a a(tx $$0) {
         this.c = Optional.of(new cy($$0));
         return this;
      }

      public ay.a a(dq.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public ay b() {
         return new ay(this.a, this.b, this.c);
      }
   }
}
