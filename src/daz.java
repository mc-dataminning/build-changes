import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class daz implements cpa.a<jr<cwk>>, Predicate<cwo> {
   public static final yn<wa, daz> a = yl.c(mc.K).a(daz::new, $$0 -> $$0.e);
   public static final yn<wa, Optional<daz>> b = yl.c(mc.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new daz((jv<cwk>)$$0)), $$0 -> $$0.<jv.a<cwk>>map($$0x -> $$0x.e).orElse(jv.a()));
   public static final Codec<jv<cwk>> c = akp.a(mc.K, cwk.e, false);
   public static final Codec<daz> d = ayi.c(c).xmap(daz::new, $$0 -> $$0.e);
   private final jv<cwk> e;

   private daz(jv<cwk> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cws.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<daz> $$0, cwo $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<jr<cwk>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(cwo $$0) {
      return $$0.a(this.e);
   }

   public boolean a(jr<cwk> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof daz $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static daz a(dgg $$0) {
      return new daz(jv.a($$0.j().f()));
   }

   public static daz a(dgg... $$0) {
      return a(Arrays.stream($$0));
   }

   public static daz a(Stream<? extends dgg> $$0) {
      return new daz(jv.a($$0.map($$0x -> $$0x.j().f()).toList()));
   }

   public static daz a(jv<cwk> $$0) {
      return new daz($$0);
   }

   public dco c() {
      return (dco)this.e.d().map(dco.h::new, $$0 -> new dco.b($$0.stream().map(daz::b).toList()));
   }

   public static dco a(Optional<daz> $$0) {
      return $$0.<dco>map(daz::c).orElse(dco.c.c);
   }

   private static dco b(jr<cwk> $$0) {
      dco $$1 = new dco.d($$0);
      cwo $$2 = $$0.a().k();
      if (!$$2.f()) {
         dco $$3 = new dco.f($$2);
         return new dco.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
