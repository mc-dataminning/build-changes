import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cq extends dl<cq.a> {
   @Override
   public Codec<cq.a> a() {
      return cq.a.a;
   }

   public void a(asc $$0, bxe $$1, bvt $$2) {
      fat $$3 = bz.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bj> b, Optional<bj> c, Optional<bn> d) implements dl.a {
      public static final Codec<cq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(cq.a::a),
                  bz.b.optionalFieldOf("entity").forGetter(cq.a::e),
                  bn.a.optionalFieldOf("killing_blow").forGetter(cq.a::f)
               )
               .apply($$0, cq.a::new)
      );

      public static ar<cq.a> a(Optional<bz> $$0) {
         return aq.c.a(new cq.a(Optional.empty(), bz.a($$0), Optional.empty()));
      }

      public static ar<cq.a> a(bz.a $$0) {
         return aq.c.a(new cq.a(Optional.empty(), Optional.of(bz.a($$0)), Optional.empty()));
      }

      public static ar<cq.a> b() {
         return aq.c.a(new cq.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<cq.a> a(Optional<bz> $$0, Optional<bn> $$1) {
         return aq.c.a(new cq.a(Optional.empty(), bz.a($$0), $$1));
      }

      public static ar<cq.a> a(bz.a $$0, Optional<bn> $$1) {
         return aq.c.a(new cq.a(Optional.empty(), Optional.of(bz.a($$0)), $$1));
      }

      public static ar<cq.a> a(Optional<bz> $$0, bn.a $$1) {
         return aq.c.a(new cq.a(Optional.empty(), bz.a($$0), Optional.of($$1.b())));
      }

      public static ar<cq.a> a(bz.a $$0, bn.a $$1) {
         return aq.c.a(new cq.a(Optional.empty(), Optional.of(bz.a($$0)), Optional.of($$1.b())));
      }

      public static ar<cq.a> c() {
         return aq.Z.a(new cq.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<cq.a> b(Optional<bz> $$0) {
         return aq.d.a(new cq.a(Optional.empty(), bz.a($$0), Optional.empty()));
      }

      public static ar<cq.a> b(bz.a $$0) {
         return aq.d.a(new cq.a(Optional.empty(), Optional.of(bz.a($$0)), Optional.empty()));
      }

      public static ar<cq.a> d() {
         return aq.d.a(new cq.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<cq.a> b(Optional<bz> $$0, Optional<bn> $$1) {
         return aq.d.a(new cq.a(Optional.empty(), bz.a($$0), $$1));
      }

      public static ar<cq.a> b(bz.a $$0, Optional<bn> $$1) {
         return aq.d.a(new cq.a(Optional.empty(), Optional.of(bz.a($$0)), $$1));
      }

      public static ar<cq.a> b(Optional<bz> $$0, bn.a $$1) {
         return aq.d.a(new cq.a(Optional.empty(), bz.a($$0), Optional.of($$1.b())));
      }

      public static ar<cq.a> b(bz.a $$0, bn.a $$1) {
         return aq.d.a(new cq.a(Optional.empty(), Optional.of(bz.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(asc $$0, fat $$1, bvt $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<bj> e() {
         return this.c;
      }

      public Optional<bn> f() {
         return this.d;
      }
   }
}
