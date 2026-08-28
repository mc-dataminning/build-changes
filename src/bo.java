import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bo extends dk<bo.a> {
   @Override
   public Codec<bo.a> a() {
      return bo.a.a;
   }

   public void a(arr $$0, iv $$1) {
      arq $$2 = $$0.y();
      eao $$3 = $$2.a_($$1);
      ezr $$4 = new ezr.a($$2).a(fci.f, $$1.b()).a(fci.a, $$0).a(fci.g, $$3).a(fch.p);
      ezo $$5 = new ezo.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dk.a {
      public static final Codec<bo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(bo.a::a), bj.a.optionalFieldOf("location").forGetter(bo.a::b)).apply($$0, bo.a::new)
      );

      public boolean a(ezo $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fch.p, ".location"));
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
