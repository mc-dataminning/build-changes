import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aeo implements zs<ach> {
   public static final zj<ww, aeo> a = zs.a(aeo::a, aeo::new);
   private final EnumSet<aeo.a> b;
   private final List<aeo.b> c;

   public aeo(EnumSet<aeo.a> $$0, Collection<arr> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aeo.b::new).toList();
   }

   public aeo(aeo.a $$0, arr $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aeo.b($$1));
   }

   public static aeo a(Collection<arr> $$0) {
      EnumSet<aeo.a> $$1 = EnumSet.of(aeo.a.a, aeo.a.b, aeo.a.c, aeo.a.d, aeo.a.e, aeo.a.f, aeo.a.g);
      return new aeo($$1, $$0);
   }

   private aeo(ww $$0) {
      this.b = $$0.a(aeo.a.class);
      this.c = $$0.a($$0x -> {
         aeo.c $$1 = new aeo.c($$0x.n());

         for (aeo.a $$2 : this.b) {
            $$2.h.read($$1, (ww)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(ww $$0) {
      $$0.a(this.b, aeo.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aeo.a $$2 : this.b) {
            $$2.i.write((ww)$$0x, $$1);
         }
      });
   }

   @Override
   public zu<aeo> a() {
      return agw.ag;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public EnumSet<aeo.a> b() {
      return this.b;
   }

   public List<aeo.b> e() {
      return this.c;
   }

   public List<aeo.b> f() {
      return this.b.contains(aeo.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)zh.v.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         zh.v.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.h = $$1.c(yc.a::a), ($$0, $$1) -> $$0.a($$1.h, yc.a::a)),
      c(($$0, $$1) -> $$0.e = dfc.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = wi.a($$1, xn.d), ($$0, $$1) -> wi.a($$0, $$1.f(), xn.d)),
      g(($$0, $$1) -> $$0.g = $$1.l(), ($$0, $$1) -> $$0.c($$1.g));

      final aeo.a.a h;
      final aeo.a.b i;

      private a(final aeo.a.a $$0, final aeo.a.b $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public interface a {
         void read(aeo.c var1, ww var2);
      }

      public interface b {
         void write(ww var1, aeo.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dfc e, @Nullable xl f, int g, @Nullable yc.a h) {

      b(arr $$0) {
         this($$0.cI(), $$0.gk(), true, $$0.g.k(), $$0.i.b(), $$0.P(), $$0.Q(), x.a($$0.ae(), yc::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dfc e;
      @Nullable
      xl f;
      int g;
      @Nullable
      yc.a h;

      c(UUID $$0) {
         this.e = dfc.e;
         this.a = $$0;
      }

      aeo.b a() {
         return new aeo.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
