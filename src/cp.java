import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cp extends dk<cp.a> {
   @Override
   public Codec<cp.a> a() {
      return cp.a.a;
   }

   public void a(art $$0, bwt $$1, bvi $$2) {
      fah $$3 = by.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bj> b, Optional<bj> c, Optional<bn> d) implements dk.a {
      public static final Codec<cp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(cp.a::a),
                  by.b.optionalFieldOf("entity").forGetter(cp.a::e),
                  bn.a.optionalFieldOf("killing_blow").forGetter(cp.a::f)
               )
               .apply($$0, cp.a::new)
      );

      public static ar<cp.a> a(Optional<by> $$0) {
         return aq.c.a(new cp.a(Optional.empty(), by.a($$0), Optional.empty()));
      }

      public static ar<cp.a> a(by.a $$0) {
         return aq.c.a(new cp.a(Optional.empty(), Optional.of(by.a($$0)), Optional.empty()));
      }

      public static ar<cp.a> b() {
         return aq.c.a(new cp.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<cp.a> a(Optional<by> $$0, Optional<bn> $$1) {
         return aq.c.a(new cp.a(Optional.empty(), by.a($$0), $$1));
      }

      public static ar<cp.a> a(by.a $$0, Optional<bn> $$1) {
         return aq.c.a(new cp.a(Optional.empty(), Optional.of(by.a($$0)), $$1));
      }

      public static ar<cp.a> a(Optional<by> $$0, bn.a $$1) {
         return aq.c.a(new cp.a(Optional.empty(), by.a($$0), Optional.of($$1.b())));
      }

      public static ar<cp.a> a(by.a $$0, bn.a $$1) {
         return aq.c.a(new cp.a(Optional.empty(), Optional.of(by.a($$0)), Optional.of($$1.b())));
      }

      public static ar<cp.a> c() {
         return aq.Z.a(new cp.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<cp.a> b(Optional<by> $$0) {
         return aq.d.a(new cp.a(Optional.empty(), by.a($$0), Optional.empty()));
      }

      public static ar<cp.a> b(by.a $$0) {
         return aq.d.a(new cp.a(Optional.empty(), Optional.of(by.a($$0)), Optional.empty()));
      }

      public static ar<cp.a> d() {
         return aq.d.a(new cp.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<cp.a> b(Optional<by> $$0, Optional<bn> $$1) {
         return aq.d.a(new cp.a(Optional.empty(), by.a($$0), $$1));
      }

      public static ar<cp.a> b(by.a $$0, Optional<bn> $$1) {
         return aq.d.a(new cp.a(Optional.empty(), Optional.of(by.a($$0)), $$1));
      }

      public static ar<cp.a> b(Optional<by> $$0, bn.a $$1) {
         return aq.d.a(new cp.a(Optional.empty(), by.a($$0), Optional.of($$1.b())));
      }

      public static ar<cp.a> b(by.a $$0, bn.a $$1) {
         return aq.d.a(new cp.a(Optional.empty(), Optional.of(by.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(art $$0, fah $$1, bvi $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
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
