import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class da extends dv<da.a> {
   @Override
   public Codec<da.a> a() {
      return da.a.a;
   }

   public void a(aqv $$0, bsr $$1, brk $$2) {
      err $$3 = bv.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c, Optional<bk> d) implements dv.a {
      public static final Codec<da.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(da.a::a),
                  bv.b.optionalFieldOf("entity").forGetter(da.a::e),
                  bk.a.optionalFieldOf("killing_blow").forGetter(da.a::f)
               )
               .apply($$0, da.a::new)
      );

      public static ao<da.a> a(Optional<bv> $$0) {
         return an.c.a(new da.a(Optional.empty(), bv.a($$0), Optional.empty()));
      }

      public static ao<da.a> a(bv.a $$0) {
         return an.c.a(new da.a(Optional.empty(), Optional.of(bv.a($$0)), Optional.empty()));
      }

      public static ao<da.a> b() {
         return an.c.a(new da.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<da.a> a(Optional<bv> $$0, Optional<bk> $$1) {
         return an.c.a(new da.a(Optional.empty(), bv.a($$0), $$1));
      }

      public static ao<da.a> a(bv.a $$0, Optional<bk> $$1) {
         return an.c.a(new da.a(Optional.empty(), Optional.of(bv.a($$0)), $$1));
      }

      public static ao<da.a> a(Optional<bv> $$0, bk.a $$1) {
         return an.c.a(new da.a(Optional.empty(), bv.a($$0), Optional.of($$1.b())));
      }

      public static ao<da.a> a(bv.a $$0, bk.a $$1) {
         return an.c.a(new da.a(Optional.empty(), Optional.of(bv.a($$0)), Optional.of($$1.b())));
      }

      public static ao<da.a> c() {
         return an.Z.a(new da.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<da.a> b(Optional<bv> $$0) {
         return an.d.a(new da.a(Optional.empty(), bv.a($$0), Optional.empty()));
      }

      public static ao<da.a> b(bv.a $$0) {
         return an.d.a(new da.a(Optional.empty(), Optional.of(bv.a($$0)), Optional.empty()));
      }

      public static ao<da.a> d() {
         return an.d.a(new da.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<da.a> b(Optional<bv> $$0, Optional<bk> $$1) {
         return an.d.a(new da.a(Optional.empty(), bv.a($$0), $$1));
      }

      public static ao<da.a> b(bv.a $$0, Optional<bk> $$1) {
         return an.d.a(new da.a(Optional.empty(), Optional.of(bv.a($$0)), $$1));
      }

      public static ao<da.a> b(Optional<bv> $$0, bk.a $$1) {
         return an.d.a(new da.a(Optional.empty(), bv.a($$0), Optional.of($$1.b())));
      }

      public static ao<da.a> b(bv.a $$0, bk.a $$1) {
         return an.d.a(new da.a(Optional.empty(), Optional.of(bv.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(aqv $$0, err $$1, brk $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<bg> e() {
         return this.c;
      }

      public Optional<bk> f() {
         return this.d;
      }
   }
}
