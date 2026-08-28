import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class dch implements cqm.a<js<cxu>>, Predicate<cxy> {
   public static final yt<wg, dch> a = yr.c(me.K).a(dch::new, $$0 -> $$0.e);
   public static final yt<wg, Optional<dch>> b = yr.c(me.K)
      .a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dch((jw<cxu>)$$0)), $$0 -> $$0.<jw.a<cxu>>map($$0x -> $$0x.e).orElse(jw.a()));
   public static final Codec<jw<cxu>> c = akx.a(me.K, cxu.e, false);
   public static final Codec<dch> d = ays.c(c).xmap(dch::new, $$0 -> $$0.e);
   private final jw<cxu> e;

   private dch(jw<cxu> $$0) {
      $$0.d().ifRight($$0x -> {
         if ($$0x.isEmpty()) {
            throw new UnsupportedOperationException("Ingredients can't be empty");
         } else if ($$0x.contains(cyc.a.f())) {
            throw new UnsupportedOperationException("Ingredient can't contain air");
         }
      });
      this.e = $$0;
   }

   public static boolean a(Optional<dch> $$0, cxy $$1) {
      return $$0.<Boolean>map($$1x -> $$1x.a($$1)).orElseGet($$1::f);
   }

   @Deprecated
   public Stream<js<cxu>> a() {
      return this.e.a();
   }

   public boolean b() {
      return this.e.b() == 0;
   }

   public boolean a(cxy $$0) {
      return $$0.a(this.e);
   }

   public boolean a(js<cxu> $$0) {
      return this.e.a($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof dch $$1 ? Objects.equals(this.e, $$1.e) : false;
   }

   public static dch a(dho $$0) {
      return new dch(jw.a($$0.i().f()));
   }

   public static dch a(dho... $$0) {
      return a(Arrays.stream($$0));
   }

   public static dch a(Stream<? extends dho> $$0) {
      return new dch(jw.a($$0.map($$0x -> $$0x.i().f()).toList()));
   }

   public static dch a(jw<cxu> $$0) {
      return new dch($$0);
   }

   public ddx c() {
      return (ddx)this.e.d().map(ddx.h::new, $$0 -> new ddx.b($$0.stream().map(dch::b).toList()));
   }

   public static ddx a(Optional<dch> $$0) {
      return $$0.<ddx>map(dch::c).orElse(ddx.c.c);
   }

   private static ddx b(js<cxu> $$0) {
      ddx $$1 = new ddx.d($$0);
      cxy $$2 = $$0.a().j();
      if (!$$2.f()) {
         ddx $$3 = new ddx.f($$2);
         return new ddx.j($$1, $$3);
      } else {
         return $$1;
      }
   }
}
