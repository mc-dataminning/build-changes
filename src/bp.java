import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bp extends dl<bp.a> {
   @Override
   public Codec<bp.a> a() {
      return bp.a.a;
   }

   public void a(arv $$0, iw $$1) {
      aru $$2 = $$0.y();
      ebg $$3 = $$2.a_($$1);
      fam $$4 = new fam.a($$2).a(fdd.f, $$1.b()).a(fdd.a, $$0).a(fdd.g, $$3).a(fdc.p);
      faj $$5 = new faj.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dl.a {
      public static final Codec<bp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(bp.a::a), bj.a.optionalFieldOf("location").forGetter(bp.a::b)).apply($$0, bp.a::new)
      );

      public boolean a(faj $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fdc.p, ".location"));
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<bj> b() {
         return this.c;
      }
   }
}
