import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends ds<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(aql $$0, ckg $$1, clu $$2) {
      eqo $$3 = bu.b($$0, $$1);
      eqo $$4 = bu.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static record a(Optional<bf> b, Optional<bf> c, Optional<bf> d) implements ds.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(bh.a::a),
                  bu.b.optionalFieldOf("zombie").forGetter(bh.a::c),
                  bu.b.optionalFieldOf("villager").forGetter(bh.a::d)
               )
               .apply($$0, bh.a::new)
      );

      public static an<bh.a> b() {
         return am.s.a(new bh.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(eqo $$0, eqo $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         $$0.a(this.c, ".zombie");
         $$0.a(this.d, ".villager");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
