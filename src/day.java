import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class day implements coz.a<jr<cwj>>, Predicate<cwn> {
   public static final ym<vz, day> a = yk.c(mc.K).a(day::new, $$0 -> $$0.e);
   public static final ym<vz, Optional<day>> b = yk.c(mc.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new day((jv<cwj>)$$0)), $$0 -> $$0.<jv.a<cwj>>map($$0x -> $$0x.e).orElse(jv.a()));
   public static final Codec<jv<cwj>> c = ako.a(mc.K, cwj.e, false);
   public static final Codec<day> d = ayh.c(c).xmap(day::new, $$0 -> $$0.e);
   private final jv<cwj> e;

   private day(jv<cwj> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cwr.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<day> $$0, cwn $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<jr<cwj>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(cwn $$0) {
      return $$0.a(this.e);
   }

   public boolean a(jr<cwj> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof day $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static day a(dgf $$0) {
      return new day(jv.a($$0.j().f()));
   }

   public static day a(dgf... $$0) {
      return a(Arrays.stream($$0));
   }

   public static day a(Stream<? extends dgf> $$0) {
      return new day(jv.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static day a(jv<cwj> $$0) {
      return new day($$0);
   }

   public dcn c() {
      return (dcn)this.e.d().map(dcn.h::new, $$0 -> new dcn.b($$0.stream().map(day::b).toList()));
   }

   public static dcn a(Optional<day> $$0) {
      return $$0.<dcn>map(day::c).orElse(dcn.c.c);
   }

   private static dcn b(jr<cwj> $$0) {
      dcn $$1 = new dcn.d($$0);
      cwn $$2 = $$0.a().k();
      if (!$$2.f()) {
         dcn $$3 = new dcn.f($$2);
         return new dcn.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
