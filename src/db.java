import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class db extends dl<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(asc $$0, dak $$1, @Nullable bxe $$2) {
      fat $$3 = bz.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bj> b, Optional<cn> c, Optional<bj> d) implements dl.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(db.a::a),
                  cn.a.optionalFieldOf("item").forGetter(db.a::b),
                  bz.b.optionalFieldOf("entity").forGetter(db.a::c)
               )
               .apply($$0, db.a::new)
      );

      public static ar<db.a> a(bj $$0, Optional<cn> $$1, Optional<bj> $$2) {
         return aq.R.a(new db.a(Optional.of($$0), $$1, $$2));
      }

      public static ar<db.a> a(Optional<bj> $$0, Optional<cn> $$1, Optional<bj> $$2) {
         return aq.S.a(new db.a($$0, $$1, $$2));
      }

      public boolean a(asc $$0, dak $$1, fat $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cn> b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }
   }
}
