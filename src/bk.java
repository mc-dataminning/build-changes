import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bk extends dj<bk.a> {
   @Override
   public Codec<bk.a> a() {
      return bk.a.a;
   }

   public void a(arr $$0, cot $$1, cqk $$2) {
      eyz $$3 = bx.b($$0, $$1);
      eyz $$4 = bx.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static record a(Optional<bi> b, Optional<bi> c, Optional<bi> d) implements dj.a {
      public static final Codec<bk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(bk.a::a),
                  bx.b.optionalFieldOf("zombie").forGetter(bk.a::c),
                  bx.b.optionalFieldOf("villager").forGetter(bk.a::d)
               )
               .apply($$0, bk.a::new)
      );

      public static aq<bk.a> b() {
         return ap.s.a(new bk.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(eyz $$0, eyz $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         $$0.a(this.c, ".zombie");
         $$0.a(this.d, ".villager");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
