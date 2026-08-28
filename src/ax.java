import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ax extends dl<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(arv $$0, iw $$1, daa $$2) {
      aru $$3 = $$0.y();
      ebg $$4 = $$3.a_($$1);
      fam $$5 = new fam.a($$3).a(fdd.f, $$1.b()).a(fdd.a, $$0).a(fdd.g, $$4).a(fdd.i, $$2).a(fdc.o);
      faj $$6 = new faj.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dl.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(ax.a::a), bj.a.optionalFieldOf("location").forGetter(ax.a::b)).apply($$0, ax.a::new)
      );

      public boolean a(faj $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fdc.o, ".location"));
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
