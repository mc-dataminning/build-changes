import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ax extends dk<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(arr $$0, iv $$1, czn $$2) {
      arq $$3 = $$0.y();
      eat $$4 = $$3.a_($$1);
      ezw $$5 = new ezw.a($$3).a(fcn.f, $$1.b()).a(fcn.a, $$0).a(fcn.g, $$4).a(fcn.i, $$2).a(fcm.o);
      ezt $$6 = new ezt.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dk.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(ax.a::a), bj.a.optionalFieldOf("location").forGetter(ax.a::b)).apply($$0, ax.a::new)
      );

      public boolean a(ezt $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fcm.o, ".location"));
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
