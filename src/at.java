import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends cx<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(apg $$0, ib $$1, cqm $$2) {
      apf $$3 = $$0.z();
      dnb $$4 = $$3.a_($$1);
      elc $$5 = new elc.a($$3).a(enh.f, $$1.b()).a(enh.a, $$0).a(enh.g, $$4).a(enh.i, $$2).a(eng.n);
      ekw $$6 = new ekw.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.a(br.b, "player").forGetter(at.a::a), awe.a(bc.a, "location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(ekw $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, eng.n, ".location"));
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
