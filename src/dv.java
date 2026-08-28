import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dv extends dj<dv.a> {
   @Override
   public Codec<dv.a> a() {
      return dv.a.a;
   }

   public void a(arr $$0, cqj $$1, czd $$2) {
      ezh $$3 = bx.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bi> b, Optional<bi> c, Optional<cl> d) implements dj.a {
      public static final Codec<dv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(dv.a::a),
                  bx.b.optionalFieldOf("villager").forGetter(dv.a::c),
                  cl.a.optionalFieldOf("item").forGetter(dv.a::d)
               )
               .apply($$0, dv.a::new)
      );

      public static aq<dv.a> b() {
         return ap.t.a(new dv.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<dv.a> a(bx.a $$0) {
         return ap.t.a(new dv.a(Optional.of(bx.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(ezh $$0, czd $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
