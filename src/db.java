import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record db(Optional<bf<arv<wp>, db.a>> c, Optional<String> d, Optional<String> e, dk.d f, Optional<Boolean> g) implements ea<czw> {
   public static final Codec<db> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               bf.a(db.a.a).optionalFieldOf("pages").forGetter(db::b),
               Codec.STRING.optionalFieldOf("author").forGetter(db::c),
               Codec.STRING.optionalFieldOf("title").forGetter(db::d),
               dk.d.d.optionalFieldOf("generation", dk.d.c).forGetter(db::e),
               Codec.BOOL.optionalFieldOf("resolved").forGetter(db::f)
            )
            .apply($$0, db::new)
   );

   @Override
   public ku<czw> a() {
      return kv.T;
   }

   public boolean a(cwo $$0, czw $$1) {
      if (this.d.isPresent() && !this.d.get().equals($$1.e())) {
         return false;
      } else if (this.e.isPresent() && !this.e.get().equals($$1.d().a())) {
         return false;
      } else if (!this.f.d($$1.f())) {
         return false;
      } else {
         return this.g.isPresent() && this.g.get() != $$1.g() ? false : !this.c.isPresent() || this.c.get().a($$1.a());
      }
   }

   public Optional<bf<arv<wp>, db.a>> b() {
      return this.c;
   }

   public Optional<String> c() {
      return this.d;
   }

   public Optional<String> d() {
      return this.e;
   }

   public dk.d e() {
      return this.f;
   }

   public Optional<Boolean> f() {
      return this.g;
   }

   public static record a(wp b) implements Predicate<arv<wp>> {
      public static final Codec<db.a> a = wr.a.xmap(db.a::new, db.a::a);

      public boolean a(arv<wp> $$0) {
         return $$0.a().equals(this.b);
      }

      public wp a() {
         return this.b;
      }
   }
}
