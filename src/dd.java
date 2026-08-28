import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dd extends dz<dd.a> {
   @Override
   public Codec<dd.a> a() {
      return dd.a.a;
   }

   public void a(ard $$0, buk $$1, bta $$2) {
      evr $$3 = bx.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bi> b, Optional<bi> c, Optional<bm> d) implements dz.a {
      public static final Codec<dd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(dd.a::a),
                  bx.b.optionalFieldOf("entity").forGetter(dd.a::e),
                  bm.a.optionalFieldOf("killing_blow").forGetter(dd.a::f)
               )
               .apply($$0, dd.a::new)
      );

      public static aq<dd.a> a(Optional<bx> $$0) {
         return ap.c.a(new dd.a(Optional.empty(), bx.a($$0), Optional.empty()));
      }

      public static aq<dd.a> a(bx.a $$0) {
         return ap.c.a(new dd.a(Optional.empty(), Optional.of(bx.a($$0)), Optional.empty()));
      }

      public static aq<dd.a> b() {
         return ap.c.a(new dd.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<dd.a> a(Optional<bx> $$0, Optional<bm> $$1) {
         return ap.c.a(new dd.a(Optional.empty(), bx.a($$0), $$1));
      }

      public static aq<dd.a> a(bx.a $$0, Optional<bm> $$1) {
         return ap.c.a(new dd.a(Optional.empty(), Optional.of(bx.a($$0)), $$1));
      }

      public static aq<dd.a> a(Optional<bx> $$0, bm.a $$1) {
         return ap.c.a(new dd.a(Optional.empty(), bx.a($$0), Optional.of($$1.b())));
      }

      public static aq<dd.a> a(bx.a $$0, bm.a $$1) {
         return ap.c.a(new dd.a(Optional.empty(), Optional.of(bx.a($$0)), Optional.of($$1.b())));
      }

      public static aq<dd.a> c() {
         return ap.Z.a(new dd.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<dd.a> b(Optional<bx> $$0) {
         return ap.d.a(new dd.a(Optional.empty(), bx.a($$0), Optional.empty()));
      }

      public static aq<dd.a> b(bx.a $$0) {
         return ap.d.a(new dd.a(Optional.empty(), Optional.of(bx.a($$0)), Optional.empty()));
      }

      public static aq<dd.a> d() {
         return ap.d.a(new dd.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<dd.a> b(Optional<bx> $$0, Optional<bm> $$1) {
         return ap.d.a(new dd.a(Optional.empty(), bx.a($$0), $$1));
      }

      public static aq<dd.a> b(bx.a $$0, Optional<bm> $$1) {
         return ap.d.a(new dd.a(Optional.empty(), Optional.of(bx.a($$0)), $$1));
      }

      public static aq<dd.a> b(Optional<bx> $$0, bm.a $$1) {
         return ap.d.a(new dd.a(Optional.empty(), bx.a($$0), Optional.of($$1.b())));
      }

      public static aq<dd.a> b(bx.a $$0, bm.a $$1) {
         return ap.d.a(new dd.a(Optional.empty(), Optional.of(bx.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(ard $$0, evr $$1, bta $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
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
