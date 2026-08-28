import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class db extends dr<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(arf $$0, btn $$1, List<bst> $$2) {
      List<eqh> $$3 = $$2.stream().map($$1x -> bu.b($$0, $$1x)).collect(Collectors.toList());
      eqh $$4 = bu.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bf> b, Optional<bf> c, Optional<bf> d) implements dr.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(db.a::a),
                  bu.b.optionalFieldOf("lightning").forGetter(db.a::b),
                  bu.b.optionalFieldOf("bystander").forGetter(db.a::c)
               )
               .apply($$0, db.a::new)
      );

      public static an<db.a> a(Optional<bu> $$0, Optional<bu> $$1) {
         return am.V.a(new db.a(Optional.empty(), bu.a($$0), bu.a($$1)));
      }

      public boolean a(eqh $$0, List<eqh> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         $$0.a(this.c, ".lightning");
         $$0.a(this.d, ".bystander");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<bf> b() {
         return this.c;
      }

      public Optional<bf> c() {
         return this.d;
      }
   }
}
