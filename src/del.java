import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class del implements csc.a<jf<czu>>, Predicate<czy> {
   public static final yy<wl, del> a = yw.c(mh.K).a(del::new, $$0 -> $$0.e);
   public static final yy<wl, Optional<del>> b = yw.c(mh.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new del((jj<czu>)$$0)), $$0 -> $$0.<jj.a<czu>>map($$0x -> $$0x.e).orElse(jj.a()));
   public static final Codec<jj<czu>> c = alc.a(mh.K, czu.e, false);
   public static final Codec<del> d = ayw.c(c).xmap(del::new, $$0 -> $$0.e);
   private final jj<czu> e;

   private del(jj<czu> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(dac.a.e())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<del> $$0, czy $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<jf<czu>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(czy $$0) {
      return $$0.a(this.e);
   }

   public boolean a(jf<czu> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof del $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static del a(djw $$0) {
      return new del(jj.a($$0.h().e()));
   }

   public static del a(djw... $$0) {
      return a(Arrays.stream($$0));
   }

   public static del a(Stream<? extends djw> $$0) {
      return new del(jj.a($$0.map($$0x -> $$0x.h().e()).toList()));
   }

   public static del a(jj<czu> $$0) {
      return new del($$0);
   }

   public dgb c() {
      return (dgb)this.e.d().map(dgb.h::new, $$0 -> new dgb.b($$0.stream().map(del::b).toList()));
   }

   public static dgb a(Optional<del> $$0) {
      return $$0.<dgb>map(del::c).orElse(dgb.c.c);
   }

   private static dgb b(jf<czu> $$0) {
      dgb $$1 = new dgb.d($$0);
      czy $$2 = $$0.a().i();
      if (!$$2.f()) {
         dgb $$3 = new dgb.f($$2);
         return new dgb.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
