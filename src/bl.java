import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bl extends dv<bl.a> {
   @Override
   public Codec<bl.a> a() {
      return bl.a.a;
   }

   public void a(ari $$0, je $$1) {
      arh $$2 = $$0.B();
      duo $$3 = $$2.a_($$1);
      etk $$4 = new etk.a($$2).a(ewd.f, $$1.b()).a(ewd.a, $$0).a(ewd.g, $$3).a(ewc.p);
      eth $$5 = new eth.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dv.a {
      public static final Codec<bl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(bl.a::a), bg.a.optionalFieldOf("location").forGetter(bl.a::b)).apply($$0, bl.a::new)
      );

      public boolean a(eth $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ewc.p, ".location"));
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<bg> b() {
         return this.c;
      }
   }
}
