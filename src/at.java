import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends cx<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(apb $$0, ib $$1, cpq $$2) {
      apa $$3 = $$0.z();
      dme $$4 = $$3.a_($$1);
      eke $$5 = new eke.a($$3).a(emj.f, $$1.b()).a(emj.a, $$0).a(emj.g, $$4).a(emj.i, $$2).a(emi.n);
      ejy $$6 = new ejy.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avu.a(br.b, "player").forGetter(at.a::a), avu.a(bc.a, "location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(ejy $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, emi.n, ".location"));
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
