import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends cx<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(apg $$0, ib $$1, cqk $$2) {
      apf $$3 = $$0.z();
      dmz $$4 = $$3.a_($$1);
      ela $$5 = new ela.a($$3).a(enf.f, $$1.b()).a(enf.a, $$0).a(enf.g, $$4).a(enf.i, $$2).a(ene.n);
      eku $$6 = new eku.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.a(br.b, "player").forGetter(at.a::a), awe.a(bc.a, "location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(eku $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ene.n, ".location"));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bc> b() {
         return this.c;
      }
   }
}
