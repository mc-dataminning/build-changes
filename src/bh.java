import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends cx<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(apb $$0, ib $$1) {
      apa $$2 = $$0.z();
      dme $$3 = $$2.a_($$1);
      eke $$4 = new eke.a($$2).a(emj.f, $$1.b()).a(emj.a, $$0).a(emj.g, $$3).a(emi.o);
      ejy $$5 = new ejy.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements cx.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avu.a(br.b, "player").forGetter(bh.a::a), avu.a(bc.a, "location").forGetter(bh.a::b)).apply($$0, bh.a::new)
      );

      public boolean a(ejy $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, emi.o, ".location"));
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
