import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bn extends dj<bn.a> {
   @Override
   public Codec<bn.a> a() {
      return bn.a.a;
   }

   public void a(arp $$0, iu $$1) {
      aro $$2 = $$0.y();
      dzo $$3 = $$2.a_($$1);
      eyq $$4 = new eyq.a($$2).a(fbh.f, $$1.b()).a(fbh.a, $$0).a(fbh.g, $$3).a(fbg.p);
      eyn $$5 = new eyn.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dj.a {
      public static final Codec<bn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(bn.a::a), bi.a.optionalFieldOf("location").forGetter(bn.a::b)).apply($$0, bn.a::new)
      );

      public boolean a(eyn $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fbg.p, ".location"));
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<bi> b() {
         return this.c;
      }
   }
}
