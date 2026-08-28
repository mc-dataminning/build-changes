import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class dex implements csn.a<jg<dag>>, Predicate<dak> {
   public static final ze<wp, dex> a = zc.c(mi.K).a(dex::new, $$0 -> $$0.e);
   public static final ze<wp, Optional<dex>> b = zc.c(mi.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dex((jk<dag>)$$0)), $$0 -> $$0.<jk.a<dag>>map($$0x -> $$0x.e).orElse(jk.a()));
   public static final Codec<jk<dag>> c = all.a(mi.K, dag.e, false);
   public static final Codec<dex> d = azg.c(c).xmap(dex::new, $$0 -> $$0.e);
   private final jk<dag> e;

   private dex(jk<dag> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(dao.a.e())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dex> $$0, dak $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<jg<dag>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(dak $$0) {
      return $$0.a(this.e);
   }

   public boolean a(jg<dag> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dex $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dex a(dki $$0) {
      return new dex(jk.a($$0.h().e()));
   }

   public static dex a(dki... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dex a(Stream<? extends dki> $$0) {
      return new dex(jk.a($$0.map($$0x -> $$0x.h().e()).toList()));
   }

   public static dex a(jk<dag> $$0) {
      return new dex($$0);
   }

   public dgn c() {
      return (dgn)this.e.d().map(dgn.h::new, $$0 -> new dgn.b($$0.stream().map(dex::b).toList()));
   }

   public static dgn a(Optional<dex> $$0) {
      return $$0.<dgn>map(dex::c).orElse(dgn.c.c);
   }

   private static dgn b(jg<dag> $$0) {
      dgn $$1 = new dgn.d($$0);
      dak $$2 = $$0.a().i();
      if (!$$2.f()) {
         dgn $$3 = new dgn.f($$2);
         return new dgn.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
