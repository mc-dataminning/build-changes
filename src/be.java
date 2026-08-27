import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record be(ck.c b, ck.c c, Optional<bp> d, Optional<Boolean> e, Optional<bf> f) {
   public static final Codec<be> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.a(ck.c.d, "dealt", ck.c.c).forGetter(be::a),
               atg.a(ck.c.d, "taken", ck.c.c).forGetter(be::b),
               atg.a(bp.a, "source_entity").forGetter(be::c),
               atg.a(Codec.BOOL, "blocked").forGetter(be::d),
               atg.a(bf.a, "type").forGetter(be::e)
            )
            .apply($$0, be::new)
   );

   public boolean a(amq $$0, bkd $$1, float $$2, float $$3, boolean $$4) {
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

   public ck.c a() {
      return this.b;
   }

   public ck.c b() {
      return this.c;
   }

   public Optional<bp> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<bf> e() {
      return this.f;
   }

   public static class a {
      private ck.c a = ck.c.c;
      private ck.c b = ck.c.c;
      private Optional<bp> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bf> e = Optional.empty();

      public static be.a a() {
         return new be.a();
      }

      public be.a a(ck.c $$0) {
         this.a = $$0;
         return this;
      }

      public be.a b(ck.c $$0) {
         this.b = $$0;
         return this;
      }

      public be.a a(bp $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public be.a a(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public be.a a(bf $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public be.a a(bf.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public be b() {
         return new be(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
