import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class ddf implements cqw.a<je<cyo>>, Predicate<cys> {
   public static final yu<wh, ddf> a = ys.c(mg.K).a(ddf::new, $$0 -> $$0.e);
   public static final yu<wh, Optional<ddf>> b = ys.c(mg.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new ddf((ji<cyo>)$$0)), $$0 -> $$0.<ji.a<cyo>>map($$0x -> $$0x.e).orElse(ji.a()));
   public static final Codec<ji<cyo>> c = aky.a(mg.K, cyo.e, false);
   public static final Codec<ddf> d = ays.c(c).xmap(ddf::new, $$0 -> $$0.e);
   private final ji<cyo> e;

   private ddf(ji<cyo> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cyw.a.e())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<ddf> $$0, cys $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<je<cyo>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(cys $$0) {
      return $$0.a(this.e);
   }

   public boolean a(je<cyo> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof ddf $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static ddf a(dio $$0) {
      return new ddf(ji.a($$0.h().e()));
   }

   public static ddf a(dio... $$0) {
      return a(Arrays.stream($$0));
   }

   public static ddf a(Stream<? extends dio> $$0) {
      return new ddf(ji.a($$0.map($$0x -> $$0x.h().e()).toList()));
   }

   public static ddf a(ji<cyo> $$0) {
      return new ddf($$0);
   }

   public dev c() {
      return (dev)this.e.d().map(dev.h::new, $$0 -> new dev.b($$0.stream().map(ddf::b).toList()));
   }

   public static dev a(Optional<ddf> $$0) {
      return $$0.<dev>map(ddf::c).orElse(dev.c.c);
   }

   private static dev b(je<cyo> $$0) {
      dev $$1 = new dev.d($$0);
      cys $$2 = $$0.a().i();
      if (!$$2.f()) {
         dev $$3 = new dev.f($$2);
         return new dev.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
