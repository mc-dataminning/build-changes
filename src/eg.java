import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eg extends dv<eg.a> {
   @Override
   public Codec<eg.a> a() {
      return eg.a.a;
   }

   public void a(aqv $$0, cmf $$1, cuq $$2) {
      err $$3 = bv.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c, Optional<cs> d) implements dv.a {
      public static final Codec<eg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(eg.a::a),
                  bv.b.optionalFieldOf("villager").forGetter(eg.a::c),
                  cs.a.optionalFieldOf("item").forGetter(eg.a::d)
               )
               .apply($$0, eg.a::new)
      );

      public static ao<eg.a> b() {
         return an.t.a(new eg.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<eg.a> a(bv.a $$0) {
         return an.t.a(new eg.a(Optional.of(bv.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(err $$0, cuq $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
