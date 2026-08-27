import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bf(cm.c b, cm.c c, Optional<br> d, Optional<Boolean> e, Optional<bg> f) {
   public static final Codec<bf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.a(cm.c.d, "dealt", cm.c.c).forGetter(bf::a),
               avu.a(cm.c.d, "taken", cm.c.c).forGetter(bf::b),
               avu.a(br.a, "source_entity").forGetter(bf::c),
               avu.a(Codec.BOOL, "blocked").forGetter(bf::d),
               avu.a(bg.a, "type").forGetter(bf::e)
            )
            .apply($$0, bf::new)
   );

   public boolean a(apb $$0, bne $$1, float $$2, float $$3, boolean $$4) {
      if (!this.b.d((double)$$2)) {
         return false;
      } else if (!this.c.d((double)$$3)) {
         return false;
      } else if (this.d.isPresent() && !this.d.get().a($$0, $$1.d())) {
         return false;
      } else {
         return this.e.isPresent() && this.e.get() != $$4 ? false : !this.f.isPresent() || this.f.get().a($$0, $$1);
      }
   }

   public cm.c a() {
      return this.b;
   }

   public cm.c b() {
      return this.c;
   }

   public Optional<br> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<bg> e() {
      return this.f;
   }

   public static class a {
      private cm.c a = cm.c.c;
      private cm.c b = cm.c.c;
      private Optional<br> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bg> e = Optional.empty();

      public static bf.a a() {
         return new bf.a();
      }

      public bf.a a(cm.c $$0) {
         this.a = $$0;
         return this;
      }

      public bf.a b(cm.c $$0) {
         this.b = $$0;
         return this;
      }

      public bf.a a(br $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bf.a a(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bf.a a(bg $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bf.a a(bg.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bf b() {
         return new bf(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
