import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cx extends dr<cx.a> {
   @Override
   public Codec<cx.a> a() {
      return cx.a.a;
   }

   public void a(arg $$0, bsv $$1, bro $$2) {
      eqj $$3 = bu.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bf> b, Optional<bf> c, Optional<bj> d) implements dr.a {
      public static final Codec<cx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(cx.a::a),
                  bu.b.optionalFieldOf("entity").forGetter(cx.a::e),
                  bj.a.optionalFieldOf("killing_blow").forGetter(cx.a::f)
               )
               .apply($$0, cx.a::new)
      );

      public static an<cx.a> a(Optional<bu> $$0) {
         return am.c.a(new cx.a(Optional.empty(), bu.a($$0), Optional.empty()));
      }

      public static an<cx.a> a(bu.a $$0) {
         return am.c.a(new cx.a(Optional.empty(), Optional.of(bu.a($$0)), Optional.empty()));
      }

      public static an<cx.a> b() {
         return am.c.a(new cx.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cx.a> a(Optional<bu> $$0, Optional<bj> $$1) {
         return am.c.a(new cx.a(Optional.empty(), bu.a($$0), $$1));
      }

      public static an<cx.a> a(bu.a $$0, Optional<bj> $$1) {
         return am.c.a(new cx.a(Optional.empty(), Optional.of(bu.a($$0)), $$1));
      }

      public static an<cx.a> a(Optional<bu> $$0, bj.a $$1) {
         return am.c.a(new cx.a(Optional.empty(), bu.a($$0), Optional.of($$1.b())));
      }

      public static an<cx.a> a(bu.a $$0, bj.a $$1) {
         return am.c.a(new cx.a(Optional.empty(), Optional.of(bu.a($$0)), Optional.of($$1.b())));
      }

      public static an<cx.a> c() {
         return am.Z.a(new cx.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cx.a> b(Optional<bu> $$0) {
         return am.d.a(new cx.a(Optional.empty(), bu.a($$0), Optional.empty()));
      }

      public static an<cx.a> b(bu.a $$0) {
         return am.d.a(new cx.a(Optional.empty(), Optional.of(bu.a($$0)), Optional.empty()));
      }

      public static an<cx.a> d() {
         return am.d.a(new cx.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cx.a> b(Optional<bu> $$0, Optional<bj> $$1) {
         return am.d.a(new cx.a(Optional.empty(), bu.a($$0), $$1));
      }

      public static an<cx.a> b(bu.a $$0, Optional<bj> $$1) {
         return am.d.a(new cx.a(Optional.empty(), Optional.of(bu.a($$0)), $$1));
      }

      public static an<cx.a> b(Optional<bu> $$0, bj.a $$1) {
         return am.d.a(new cx.a(Optional.empty(), bu.a($$0), Optional.of($$1.b())));
      }

      public static an<cx.a> b(bu.a $$0, bj.a $$1) {
         return am.d.a(new cx.a(Optional.empty(), Optional.of(bu.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(arg $$0, eqj $$1, bro $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<bf> e() {
         return this.c;
      }

      public Optional<bj> f() {
         return this.d;
      }
   }
}
