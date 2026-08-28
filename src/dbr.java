import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class dbr implements cpv.a<jr<cxd>>, Predicate<cxh> {
   public static final yn<wa, dbr> a = yl.c(mc.K).a(dbr::new, $$0 -> $$0.e);
   public static final yn<wa, Optional<dbr>> b = yl.c(mc.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dbr((jv<cxd>)$$0)), $$0 -> $$0.<jv.a<cxd>>map($$0x -> $$0x.e).orElse(jv.a()));
   public static final Codec<jv<cxd>> c = ako.a(mc.K, cxd.e, false);
   public static final Codec<dbr> d = ayi.c(c).xmap(dbr::new, $$0 -> $$0.e);
   private final jv<cxd> e;

   private dbr(jv<cxd> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cxl.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dbr> $$0, cxh $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<jr<cxd>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(cxh $$0) {
      return $$0.a(this.e);
   }

   public boolean a(jr<cxd> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dbr $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dbr a(dgy $$0) {
      return new dbr(jv.a($$0.i().f()));
   }

   public static dbr a(dgy... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dbr a(Stream<? extends dgy> $$0) {
      return new dbr(jv.a($$0.map($$0x -> $$0x.i().f()).toList()));
   }

   public static dbr a(jv<cxd> $$0) {
      return new dbr($$0);
   }

   public ddh c() {
      return (ddh)this.e.d().map(ddh.h::new, $$0 -> new ddh.b($$0.stream().map(dbr::b).toList()));
   }

   public static ddh a(Optional<dbr> $$0) {
      return $$0.<ddh>map(dbr::c).orElse(ddh.c.c);
   }

   private static ddh b(jr<cxd> $$0) {
      ddh $$1 = new ddh.d($$0);
      cxh $$2 = $$0.a().j();
      if (!$$2.f()) {
         ddh $$3 = new ddh.f($$2);
         return new ddh.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
