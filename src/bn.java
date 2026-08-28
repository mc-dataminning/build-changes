import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bn extends dz<bn.a> {
   @Override
   public Codec<bn.a> a() {
      return bn.a.a;
   }

   public void a(are $$0, ji $$1) {
      ard $$2 = $$0.y();
      dxq $$3 = $$2.a_($$1);
      ewr $$4 = new ewr.a($$2).a(ezi.f, $$1.b()).a(ezi.a, $$0).a(ezi.g, $$3).a(ezh.p);
      ewo $$5 = new ewo.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bi> b, Optional<bi> c) implements dz.a {
      public static final Codec<bn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(bn.a::a), bi.a.optionalFieldOf("location").forGetter(bn.a::b)).apply($$0, bn.a::new)
      );

      public boolean a(ewo $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ezh.p, ".location"));
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
