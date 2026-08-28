import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bn extends dj<bn.a> {
   @Override
   public Codec<bn.a> a() {
      return bn.a.a;
   }

   public void a(arr $$0, iu $$1) {
      arq $$2 = $$0.y();
      eah $$3 = $$2.a_($$1);
      ezk $$4 = new ezk.a($$2).a(fcb.f, $$1.b()).a(fcb.a, $$0).a(fcb.g, $$3).a(fca.p);
      ezh $$5 = new ezh.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dj.a {
      public static final Codec<bn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(bn.a::a), bi.a.optionalFieldOf("location").forGetter(bn.a::b)).apply($$0, bn.a::new)
      );

      public boolean a(ezh $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fca.p, ".location"));
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
