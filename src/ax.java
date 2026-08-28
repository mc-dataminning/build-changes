import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ax extends dk<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(art $$0, iv $$1, czy $$2) {
      ars $$3 = $$0.y();
      ebe $$4 = $$3.a_($$1);
      fak $$5 = new fak.a($$3).a(fdb.f, $$1.b()).a(fdb.a, $$0).a(fdb.g, $$4).a(fdb.i, $$2).a(fda.o);
      fah $$6 = new fah.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dk.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(ax.a::a), bj.a.optionalFieldOf("location").forGetter(ax.a::b)).apply($$0, ax.a::new)
      );

      public boolean a(fah $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fda.o, ".location"));
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
