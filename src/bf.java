import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bf(cs.c b, cs.c c, Optional<br> d, Optional<Boolean> e, Optional<bg> f) {
   public static final Codec<bf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(cs.c.d, "dealt", cs.c.c).forGetter(bf::a),
               axe.a(cs.c.d, "taken", cs.c.c).forGetter(bf::b),
               axe.a(br.a, "source_entity").forGetter(bf::c),
               axe.a(Codec.BOOL, "blocked").forGetter(bf::d),
               axe.a(bg.a, "type").forGetter(bf::e)
            )
            .apply($$0, bf::new)
   );

   public boolean a(aqf $$0, bpj $$1, float $$2, float $$3, boolean $$4) {
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

   public cs.c a() {
      return this.b;
   }

   public cs.c b() {
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
      private cs.c a = cs.c.c;
      private cs.c b = cs.c.c;
      private Optional<br> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bg> e = Optional.empty();

      public static bf.a a() {
         return new bf.a();
      }

      public bf.a a(cs.c $$0) {
         this.a = $$0;
         return this;
      }

      public bf.a b(cs.c $$0) {
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
