import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends cx<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(aow $$0, hz $$1) {
      aov $$2 = $$0.z();
      dlf $$3 = $$2.a_($$1);
      ejb $$4 = new ejb.a($$2).a(elg.f, $$1.b()).a(elg.a, $$0).a(elg.g, $$3).a(elf.n);
      eiv $$5 = new eiv.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avp.a(br.b, "player").forGetter(bh.a::a), avp.a(bc.a, "location").forGetter(bh.a::b)).apply($$0, bh.a::new)
      );

      public boolean a(eiv $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, elf.n, ".location"));
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
