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
      eat $$3 = $$2.a_($$1);
      ezw $$4 = new ezw.a($$2).a(fcn.f, $$1.b()).a(fcn.a, $$0).a(fcn.g, $$3).a(fcm.p);
      ezt $$5 = new ezt.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dk.a {
      public static final Codec<bo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(bo.a::a), bj.a.optionalFieldOf("location").forGetter(bo.a::b)).apply($$0, bo.a::new)
      );

      public boolean a(ezt $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fcm.p, ".location"));
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
