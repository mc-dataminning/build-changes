import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bo extends dk<bo.a> {
   @Override
   public Codec<bo.a> a() {
      return bo.a.a;
   }

   public void a(art $$0, iv $$1) {
      ars $$2 = $$0.y();
      ebe $$3 = $$2.a_($$1);
      fak $$4 = new fak.a($$2).a(fdb.f, $$1.b()).a(fdb.a, $$0).a(fdb.g, $$3).a(fda.p);
      fah $$5 = new fah.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dk.a {
      public static final Codec<bo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(bo.a::a), bj.a.optionalFieldOf("location").forGetter(bo.a::b)).apply($$0, bo.a::new)
      );

      public boolean a(fah $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fda.p, ".location"));
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
