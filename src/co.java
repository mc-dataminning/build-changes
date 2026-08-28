import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class co extends dj<co.a> {
   @Override
   public Codec<co.a> a() {
      return co.a.a;
   }

   public void a(arr $$0, bwd $$1, bus $$2) {
      eyz $$3 = bx.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bi> b, Optional<bi> c, Optional<bm> d) implements dj.a {
      public static final Codec<co.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(co.a::a),
                  bx.b.optionalFieldOf("entity").forGetter(co.a::e),
                  bm.a.optionalFieldOf("killing_blow").forGetter(co.a::f)
               )
               .apply($$0, co.a::new)
      );

      public static aq<co.a> a(Optional<bx> $$0) {
         return ap.c.a(new co.a(Optional.empty(), bx.a($$0), Optional.empty()));
      }

      public static aq<co.a> a(bx.a $$0) {
         return ap.c.a(new co.a(Optional.empty(), Optional.of(bx.a($$0)), Optional.empty()));
      }

      public static aq<co.a> b() {
         return ap.c.a(new co.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<co.a> a(Optional<bx> $$0, Optional<bm> $$1) {
         return ap.c.a(new co.a(Optional.empty(), bx.a($$0), $$1));
      }

      public static aq<co.a> a(bx.a $$0, Optional<bm> $$1) {
         return ap.c.a(new co.a(Optional.empty(), Optional.of(bx.a($$0)), $$1));
      }

      public static aq<co.a> a(Optional<bx> $$0, bm.a $$1) {
         return ap.c.a(new co.a(Optional.empty(), bx.a($$0), Optional.of($$1.b())));
      }

      public static aq<co.a> a(bx.a $$0, bm.a $$1) {
         return ap.c.a(new co.a(Optional.empty(), Optional.of(bx.a($$0)), Optional.of($$1.b())));
      }

      public static aq<co.a> c() {
         return ap.Z.a(new co.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<co.a> b(Optional<bx> $$0) {
         return ap.d.a(new co.a(Optional.empty(), bx.a($$0), Optional.empty()));
      }

      public static aq<co.a> b(bx.a $$0) {
         return ap.d.a(new co.a(Optional.empty(), Optional.of(bx.a($$0)), Optional.empty()));
      }

      public static aq<co.a> d() {
         return ap.d.a(new co.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<co.a> b(Optional<bx> $$0, Optional<bm> $$1) {
         return ap.d.a(new co.a(Optional.empty(), bx.a($$0), $$1));
      }

      public static aq<co.a> b(bx.a $$0, Optional<bm> $$1) {
         return ap.d.a(new co.a(Optional.empty(), Optional.of(bx.a($$0)), $$1));
      }

      public static aq<co.a> b(Optional<bx> $$0, bm.a $$1) {
         return ap.d.a(new co.a(Optional.empty(), bx.a($$0), Optional.of($$1.b())));
      }

      public static aq<co.a> b(bx.a $$0, bm.a $$1) {
         return ap.d.a(new co.a(Optional.empty(), Optional.of(bx.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(arr $$0, eyz $$1, bus $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<bi> e() {
         return this.c;
      }

      public Optional<bm> f() {
         return this.d;
      }
   }
}
