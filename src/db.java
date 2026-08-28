import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class db extends dx<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(arn $$0, btz $$1, bsp $$2) {
      etw $$3 = bv.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c, Optional<bk> d) implements dx.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(db.a::a),
                  bv.b.optionalFieldOf("entity").forGetter(db.a::e),
                  bk.a.optionalFieldOf("killing_blow").forGetter(db.a::f)
               )
               .apply($$0, db.a::new)
      );

      public static ao<db.a> a(Optional<bv> $$0) {
         return an.c.a(new db.a(Optional.empty(), bv.a($$0), Optional.empty()));
      }

      public static ao<db.a> a(bv.a $$0) {
         return an.c.a(new db.a(Optional.empty(), Optional.of(bv.a($$0)), Optional.empty()));
      }

      public static ao<db.a> b() {
         return an.c.a(new db.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<db.a> a(Optional<bv> $$0, Optional<bk> $$1) {
         return an.c.a(new db.a(Optional.empty(), bv.a($$0), $$1));
      }

      public static ao<db.a> a(bv.a $$0, Optional<bk> $$1) {
         return an.c.a(new db.a(Optional.empty(), Optional.of(bv.a($$0)), $$1));
      }

      public static ao<db.a> a(Optional<bv> $$0, bk.a $$1) {
         return an.c.a(new db.a(Optional.empty(), bv.a($$0), Optional.of($$1.b())));
      }

      public static ao<db.a> a(bv.a $$0, bk.a $$1) {
         return an.c.a(new db.a(Optional.empty(), Optional.of(bv.a($$0)), Optional.of($$1.b())));
      }

      public static ao<db.a> c() {
         return an.Z.a(new db.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<db.a> b(Optional<bv> $$0) {
         return an.d.a(new db.a(Optional.empty(), bv.a($$0), Optional.empty()));
      }

      public static ao<db.a> b(bv.a $$0) {
         return an.d.a(new db.a(Optional.empty(), Optional.of(bv.a($$0)), Optional.empty()));
      }

      public static ao<db.a> d() {
         return an.d.a(new db.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<db.a> b(Optional<bv> $$0, Optional<bk> $$1) {
         return an.d.a(new db.a(Optional.empty(), bv.a($$0), $$1));
      }

      public static ao<db.a> b(bv.a $$0, Optional<bk> $$1) {
         return an.d.a(new db.a(Optional.empty(), Optional.of(bv.a($$0)), $$1));
      }

      public static ao<db.a> b(Optional<bv> $$0, bk.a $$1) {
         return an.d.a(new db.a(Optional.empty(), bv.a($$0), Optional.of($$1.b())));
      }

      public static ao<db.a> b(bv.a $$0, bk.a $$1) {
         return an.d.a(new db.a(Optional.empty(), Optional.of(bv.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(arn $$0, etw $$1, bsp $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
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
