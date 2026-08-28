import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eh extends dw<eh.a> {
   @Override
   public Codec<eh.a> a() {
      return eh.a.a;
   }

   public void a(ark $$0, cnf $$1, cvs $$2) {
      etl $$3 = bv.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c, Optional<cs> d) implements dw.a {
      public static final Codec<eh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(eh.a::a),
                  bv.b.optionalFieldOf("villager").forGetter(eh.a::c),
                  cs.a.optionalFieldOf("item").forGetter(eh.a::d)
               )
               .apply($$0, eh.a::new)
      );

      public static ao<eh.a> b() {
         return an.t.a(new eh.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<eh.a> a(bv.a $$0) {
         return an.t.a(new eh.a(Optional.of(bv.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(etl $$0, cvs $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dw.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
