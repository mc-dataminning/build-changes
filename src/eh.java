import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eh extends dx<eh.a> {
   @Override
   public Codec<eh.a> a() {
      return eh.a.a;
   }

   public void a(arn $$0, btz $$1, ezh $$2, int $$3) {
      etw $$4 = bv.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bg> b, di.d c, Optional<bg> d) implements dx.a {
      public static final Codec<eh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(eh.a::a),
                  di.d.d.optionalFieldOf("signal_strength", di.d.c).forGetter(eh.a::b),
                  bv.b.optionalFieldOf("projectile").forGetter(eh.a::c)
               )
               .apply($$0, eh.a::new)
      );

      public static ao<eh.a> a(di.d $$0, Optional<bg> $$1) {
         return an.M.a(new eh.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(etw $$0, ezh $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public di.d b() {
         return this.c;
      }

      public Optional<bg> c() {
         return this.d;
      }
   }
}
