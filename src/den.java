import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class den implements cse.a<jg<czw>>, Predicate<daa> {
   public static final za<wn, den> a = yy.c(mi.K).a(den::new, $$0 -> $$0.e);
   public static final za<wn, Optional<den>> b = yy.c(mi.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new den((jk<czw>)$$0)), $$0 -> $$0.<jk.a<czw>>map($$0x -> $$0x.e).orElse(jk.a()));
   public static final Codec<jk<czw>> c = ale.a(mi.K, czw.e, false);
   public static final Codec<den> d = ayy.c(c).xmap(den::new, $$0 -> $$0.e);
   private final jk<czw> e;

   private den(jk<czw> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(dae.a.e())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<den> $$0, daa $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<jg<czw>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(daa $$0) {
      return $$0.a(this.e);
   }

   public boolean a(jg<czw> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof den $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static den a(djy $$0) {
      return new den(jk.a($$0.h().e()));
   }

   public static den a(djy... $$0) {
      return a(Arrays.stream($$0));
   }

   public static den a(Stream<? extends djy> $$0) {
      return new den(jk.a($$0.map($$0x -> $$0x.h().e()).toList()));
   }

   public static den a(jk<czw> $$0) {
      return new den($$0);
   }

   public dgd c() {
      return (dgd)this.e.d().map(dgd.h::new, $$0 -> new dgd.b($$0.stream().map(den::b).toList()));
   }

   public static dgd a(Optional<den> $$0) {
      return $$0.<dgd>map(den::c).orElse(dgd.c.c);
   }

   private static dgd b(jg<czw> $$0) {
      dgd $$1 = new dgd.d($$0);
      daa $$2 = $$0.a().i();
      if (!$$2.f()) {
         dgd $$3 = new dgd.f($$2);
         return new dgd.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
