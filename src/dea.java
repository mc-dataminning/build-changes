import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class dea implements crr.a<jf<czj>>, Predicate<czn> {
   public static final yw<wj, dea> a = yu.c(mh.K).a(dea::new, $$0 -> $$0.e);
   public static final yw<wj, Optional<dea>> b = yu.c(mh.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dea((jj<czj>)$$0)), $$0 -> $$0.<jj.a<czj>>map($$0x -> $$0x.e).orElse(jj.a()));
   public static final Codec<jj<czj>> c = ala.a(mh.K, czj.e, false);
   public static final Codec<dea> d = ayu.c(c).xmap(dea::new, $$0 -> $$0.e);
   private final jj<czj> e;

   private dea(jj<czj> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(czr.a.e())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dea> $$0, czn $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<jf<czj>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(czn $$0) {
      return $$0.a(this.e);
   }

   public boolean a(jf<czj> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dea $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dea a(djl $$0) {
      return new dea(jj.a($$0.h().e()));
   }

   public static dea a(djl... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dea a(Stream<? extends djl> $$0) {
      return new dea(jj.a($$0.map($$0x -> $$0x.h().e()).toList()));
   }

   public static dea a(jj<czj> $$0) {
      return new dea($$0);
   }

   public dfq c() {
      return (dfq)this.e.d().map(dfq.h::new, $$0 -> new dfq.b($$0.stream().map(dea::b).toList()));
   }

   public static dfq a(Optional<dea> $$0) {
      return $$0.<dfq>map(dea::c).orElse(dfq.c.c);
   }

   private static dfq b(jf<czj> $$0) {
      dfq $$1 = new dfq.d($$0);
      czn $$2 = $$0.a().i();
      if (!$$2.f()) {
         dfq $$3 = new dfq.f($$2);
         return new dfq.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
