import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ax extends dk<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(arr $$0, iv $$1, czk $$2) {
      arq $$3 = $$0.y();
      eao $$4 = $$3.a_($$1);
      ezr $$5 = new ezr.a($$3).a(fci.f, $$1.b()).a(fci.a, $$0).a(fci.g, $$4).a(fci.i, $$2).a(fch.o);
      ezo $$6 = new ezo.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dk.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(ax.a::a), bj.a.optionalFieldOf("location").forGetter(ax.a::b)).apply($$0, ax.a::new)
      );

      public boolean a(ezo $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fch.o, ".location"));
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
