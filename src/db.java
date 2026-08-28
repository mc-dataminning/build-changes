import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class db extends dj<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(arr $$0, cyy $$1, bwd $$2) {
      eyz $$3 = bx.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bi> b, Optional<cl> c, Optional<bi> d) implements dj.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(db.a::a),
                  cl.a.optionalFieldOf("item").forGetter(db.a::b),
                  bx.b.optionalFieldOf("entity").forGetter(db.a::c)
               )
               .apply($$0, db.a::new)
      );

      public static aq<db.a> a(Optional<bi> $$0, cl.a $$1, Optional<bi> $$2) {
         return ap.T.a(new db.a($$0, Optional.of($$1.b()), $$2));
      }

      public static aq<db.a> a(cl.a $$0, Optional<bi> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cyy $$0, eyz $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<cl> b() {
         return this.c;
      }

      public Optional<bi> c() {
         return this.d;
      }
   }
}
