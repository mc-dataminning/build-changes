import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class db extends dw<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(ark $$0, eyw $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<bm> c, dh.d d) implements dw.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(db.a::a),
                  bm.a.optionalFieldOf("distance").forGetter(db.a::b),
                  dh.d.d.optionalFieldOf("duration", dh.d.c).forGetter(db.a::c)
               )
               .apply($$0, db.a::new)
      );

      public static ao<db.a> a(bm $$0) {
         return an.v.a(new db.a(Optional.empty(), Optional.of($$0), dh.d.c));
      }

      public boolean a(ark $$0, eyw $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.d, $$1.e, $$1.f, $$0.dx(), $$0.dz(), $$0.dD()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<bm> b() {
         return this.c;
      }

      public dh.d c() {
         return this.d;
      }
   }
}
