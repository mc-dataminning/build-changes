import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class adz implements zd<abs> {
   public static final yu<wh, adz> a = zd.a(adz::a, adz::new);
   private final EnumSet<adz.a> b;
   private final List<adz.b> c;

   public adz(EnumSet<adz.a> $$0, Collection<arp> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(adz.b::new).toList();
   }

   public adz(adz.a $$0, arp $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new adz.b($$1));
   }

   public static adz a(Collection<arp> $$0) {
      EnumSet<adz.a> $$1 = EnumSet.of(adz.a.a, adz.a.b, adz.a.c, adz.a.d, adz.a.e, adz.a.f, adz.a.h, adz.a.g);
      return new adz($$1, $$0);
   }

   private adz(wh $$0) {
      this.b = $$0.a(adz.a.class);
      this.c = $$0.a($$0x -> {
         adz.c $$1 = new adz.c($$0x.n());

         for (adz.a $$2 : this.b) {
            $$2.i.read($$1, (wh)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wh $$0) {
      $$0.a(this.b, adz.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (adz.a $$2 : this.b) {
            $$2.j.write((wh)$$0x, $$1);
         }
      });
   }

   @Override
   public zf<adz> a() {
      return agl.ag;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public EnumSet<adz.a> b() {
      return this.b;
   }

   public List<adz.b> e() {
      return this.c;
   }

   public List<adz.b> f() {
      return this.b.contains(adz.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)ys.x.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         ys.x.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.i = $$1.c(xn.a::a), ($$0, $$1) -> $$0.a($$1.i, xn.a::a)),
      c(($$0, $$1) -> $$0.e = dim.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vs.a($$1, wy.d), ($$0, $$1) -> vs.a($$0, $$1.f(), wy.d)),
      g(($$0, $$1) -> $$0.h = $$1.l(), ($$0, $$1) -> $$0.c($$1.h)),
      h(($$0, $$1) -> $$0.g = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.g));

      final adz.a.a i;
      final adz.a.b j;

      private a(final adz.a.a $$0, final adz.a.b $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public interface a {
         void read(adz.c var1, wh var2);
      }

      public interface b {
         void write(wh var1, adz.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dim e, @Nullable ww f, boolean g, int h, @Nullable xn.a i) {

      b(arp $$0) {
         this($$0.cG(), $$0.gh(), true, $$0.f.k(), $$0.h.b(), $$0.O(), $$0.a(cqt.g), $$0.P(), x.a($$0.ad(), xn::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dim e;
      @Nullable
      ww f;
      boolean g;
      int h;
      @Nullable
      xn.a i;

      c(UUID $$0) {
         this.e = dim.e;
         this.a = $$0;
      }

      adz.b a() {
         return new adz.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
