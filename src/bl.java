import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bl extends dv<bl.a> {
   @Override
   public Codec<bl.a> a() {
      return bl.a.a;
   }

   public void a(aqv $$0, jd $$1) {
      aqu $$2 = $$0.A();
      dtc $$3 = $$2.a_($$1);
      eru $$4 = new eru.a($$2).a(eun.f, $$1.b()).a(eun.a, $$0).a(eun.g, $$3).a(eum.p);
      err $$5 = new err.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dv.a {
      public static final Codec<bl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(bl.a::a), bg.a.optionalFieldOf("location").forGetter(bl.a::b)).apply($$0, bl.a::new)
      );

      public boolean a(err $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eum.p, ".location"));
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
