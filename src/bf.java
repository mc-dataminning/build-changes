import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bf(List<db<bkf>> b, Optional<bp> c, Optional<bp> d) {
   public static final Codec<bf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.a(db.a(kc.r).listOf(), "tags", List.of()).forGetter(bf::a),
               atg.a(bp.a, "direct_entity").forGetter(bf::b),
               atg.a(bp.a, "source_entity").forGetter(bf::c)
            )
            .apply($$0, bf::new)
   );

   public boolean a(amq $$0, bkd $$1) {
      return this.a($$0.z(), $$0.dk(), $$1);
   }

   public boolean a(amp $$0, elb $$1, bkd $$2) {
      for (db<bkf> $$3 : this.b) {
         if (!$$3.a($$2.k())) {
            return false;
         }
      }

      return this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c()) ? false : !this.d.isPresent() || this.d.get().a($$0, $$1, $$2.d());
   }

   public List<db<bkf>> a() {
      return this.b;
   }

   public Optional<bp> b() {
      return this.c;
   }

   public Optional<bp> c() {
      return this.d;
   }

   public static class a {
      private final Builder<db<bkf>> a = ImmutableList.builder();
      private Optional<bp> b = Optional.empty();
      private Optional<bp> c = Optional.empty();

      public static bf.a a() {
         return new bf.a();
      }

      public bf.a a(db<bkf> $$0) {
         this.a.add($$0);
         return this;
      }

      public bf.a a(bp.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bf.a b(bp.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bf b() {
         return new bf(this.a.build(), this.b, this.c);
      }
   }
}
