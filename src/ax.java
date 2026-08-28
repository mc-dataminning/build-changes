import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record ax(Optional<ju<dij>> c, Optional<ee> d, Optional<dm> e) {
   public static final Codec<ax> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kf.a(ma.f).optionalFieldOf("blocks").forGetter(ax::b),
               ee.a.optionalFieldOf("state").forGetter(ax::c),
               dm.a.optionalFieldOf("nbt").forGetter(ax::d)
            )
            .apply($$0, ax::new)
   );
   public static final zj<ww, ax> b = zj.a(zh.a(zh.c(ma.f)), ax::b, zh.a(ee.b), ax::c, zh.a(dm.b), ax::d, ax::new);

   public boolean a(arq $$0, jh $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dvs $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dvo $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dfi $$0, @Nullable dsr $$1, dm $$2) {
      return $$1 != null && $$2.a($$1.b($$0.H_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<ju<dij>> b() {
      return this.c;
   }

   public Optional<ee> c() {
      return this.d;
   }

   public Optional<dm> d() {
      return this.e;
   }

   public static class a {
      private Optional<ju<dij>> a = Optional.empty();
      private Optional<ee> b = Optional.empty();
      private Optional<dm> c = Optional.empty();

      private a() {
      }

      public static ax.a a() {
         return new ax.a();
      }

      public ax.a a(jr<dij> $$0, dij... $$1) {
         return this.a($$0, Arrays.asList($$1));
      }

      public ax.a a(jr<dij> $$0, Collection<dij> $$1) {
         this.a = Optional.of(ju.a(dij::p, $$1));
         return this;
      }

      public ax.a a(jr<dij> $$0, axt<dij> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public ax.a a(un $$0) {
         this.c = Optional.of(new dm($$0));
         return this;
      }

      public ax.a a(ee.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public ax b() {
         return new ax(this.a, this.b, this.c);
      }
   }
}
