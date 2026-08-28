import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class db extends dk<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(art $$0, bwt $$1, bvi $$2, float $$3, float $$4, boolean $$5) {
      fah $$6 = by.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bj> b, Optional<bm> c, Optional<bj> d) implements dk.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(db.a::a),
                  bm.a.optionalFieldOf("damage").forGetter(db.a::c),
                  by.b.optionalFieldOf("entity").forGetter(db.a::d)
               )
               .apply($$0, db.a::new)
      );

      public static ar<db.a> b() {
         return aq.h.a(new db.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<db.a> a(Optional<bm> $$0) {
         return aq.h.a(new db.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static ar<db.a> a(bm.a $$0) {
         return aq.h.a(new db.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static ar<db.a> b(Optional<by> $$0) {
         return aq.h.a(new db.a(Optional.empty(), Optional.empty(), by.a($$0)));
      }

      public static ar<db.a> a(Optional<bm> $$0, Optional<by> $$1) {
         return aq.h.a(new db.a(Optional.empty(), $$0, by.a($$1)));
      }

      public static ar<db.a> a(bm.a $$0, Optional<by> $$1) {
         return aq.h.a(new db.a(Optional.empty(), Optional.of($$0.b()), by.a($$1)));
      }

      public boolean a(art $$0, fah $$1, bvi $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
