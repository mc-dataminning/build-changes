import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends cx<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(aow $$0, hz $$1, coz $$2) {
      aov $$3 = $$0.z();
      dlf $$4 = $$3.a_($$1);
      ejb $$5 = new ejb.a($$3).a(elg.f, $$1.b()).a(elg.a, $$0).a(elg.g, $$4).a(elg.i, $$2).a(elf.m);
      eiv $$6 = new eiv.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avp.a(br.b, "player").forGetter(at.a::a), avp.a(bc.a, "location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(eiv $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, elf.m, ".location"));
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
