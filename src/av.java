import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record av(Optional<jm<dfb>> c, Optional<dx> d, Optional<dg> e) {
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jx.a(lq.f).optionalFieldOf("blocks").forGetter(av::b),
               dx.a.optionalFieldOf("state").forGetter(av::c),
               dg.a.optionalFieldOf("nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );
   public static final zn<xa, av> b = zn.a(zl.a(zl.c(lq.f)), av::b, zl.a(dx.b), av::c, zl.a(dg.b), av::d, av::new);

   public boolean a(arf $$0, iz $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dsi $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dse $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dcd $$0, @Nullable dpj $$1, dg $$2) {
      return $$1 != null && $$2.a($$1.b($$0.H_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<jm<dfb>> b() {
      return this.c;
   }

   public Optional<dx> c() {
      return this.d;
   }

   public Optional<dg> d() {
      return this.e;
   }

   public static class a {
      private Optional<jm<dfb>> a = Optional.empty();
      private Optional<dx> b = Optional.empty();
      private Optional<dg> c = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(dfb... $$0) {
         this.a = Optional.of(jm.a(dfb::s, $$0));
         return this;
      }

      public av.a a(Collection<dfb> $$0) {
         this.a = Optional.of(jm.a(dfb::s, $$0));
         return this;
      }

      public av.a a(axf<dfb> $$0) {
         this.a = Optional.of(lp.e.a($$0));
         return this;
      }

      public av.a a(us $$0) {
         this.c = Optional.of(new dg($$0));
         return this;
      }

      public av.a a(dx.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public av b() {
         return new av(this.a, this.b, this.c);
      }
   }
}
