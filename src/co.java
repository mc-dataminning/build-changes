import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class co extends dl<co.a> {
   @Override
   public Codec<co.a> a() {
      return co.a.a;
   }

   public void a(asc $$0, iw $$1, dak $$2) {
      asb $$3 = $$0.y();
      ebq $$4 = $$3.a_($$1);
      faw $$5 = new faw.a($$3).a(fdn.f, $$1.b()).a(fdn.a, $$0).a(fdn.g, $$4).a(fdn.i, $$2).a(fdm.o);
      fat $$6 = new fat.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bj> b, Optional<bj> c) implements dl.a {
      public static final Codec<co.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(co.a::a), bj.a.optionalFieldOf("location").forGetter(co.a::b)).apply($$0, co.a::new)
      );

      public static ar<co.a> a(dno $$0) {
         bj $$1 = bj.a(feb.a($$0).build());
         return aq.z.a(new co.a(Optional.empty(), Optional.of($$1)));
      }

      public static ar<co.a> a(fec.a... $$0) {
         bj $$1 = bj.a(Arrays.stream($$0).map(fec.a::build).toArray(fec[]::new));
         return aq.z.a(new co.a(Optional.empty(), Optional.of($$1)));
      }

      private static co.a c(cv.a $$0, cn.a $$1) {
         bj $$2 = bj.a(fea.a($$0).build(), fej.a($$1).build());
         return new co.a(Optional.empty(), Optional.of($$2));
      }

      public static ar<co.a> a(cv.a $$0, cn.a $$1) {
         return aq.N.a(c($$0, $$1));
      }

      public static ar<co.a> b(cv.a $$0, cn.a $$1) {
         return aq.aa.a(c($$0, $$1));
      }

      public boolean a(fat $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fdm.o, ".location"));
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
