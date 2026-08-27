import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class ads implements zb<abm> {
   public static final ys<wf, ads> a = zb.a(ads::a, ads::new);
   private final EnumSet<ads.a> b;
   private final List<ads.b> c;

   public ads(EnumSet<ads.a> $$0, Collection<aqi> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(ads.b::new).toList();
   }

   public ads(ads.a $$0, aqi $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new ads.b($$1));
   }

   public static ads a(Collection<aqi> $$0) {
      EnumSet<ads.a> $$1 = EnumSet.of(ads.a.a, ads.a.b, ads.a.c, ads.a.d, ads.a.e, ads.a.f);
      return new ads($$1, $$0);
   }

   private ads(wf $$0) {
      this.b = $$0.a(ads.a.class);
      this.c = $$0.a($$0x -> {
         ads.c $$1 = new ads.c($$0x.n());

         for (ads.a $$2 : this.b) {
            $$2.g.read($$1, (wf)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wf $$0) {
      $$0.a(this.b, ads.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (ads.a $$2 : this.b) {
            $$2.h.write((wf)$$0x, $$1);
         }
      });
   }

   @Override
   public zd<ads> a() {
      return afx.af;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public EnumSet<ads.a> b() {
      return this.b;
   }

   public List<ads.b> e() {
      return this.c;
   }

   public List<ads.b> f() {
      return this.b.contains(ads.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yq.s.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yq.s.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(xl.a::a), ($$0, $$1) -> $$0.a($$1.g, xl.a::a)),
      c(($$0, $$1) -> $$0.e = daa.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vu.a($$1, ww.d), ($$0, $$1) -> vu.a($$0, $$1.f(), ww.d));

      final ads.a.a g;
      final ads.a.b h;

      private a(ads.a.a $$0, ads.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(ads.c var1, wf var2);
      }

      public interface b {
         void write(wf var1, ads.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, daa e, @Nullable wu f, @Nullable xl.a g) {

      b(aqi $$0) {
         this($$0.cx(), $$0.fZ(), true, $$0.d.l(), $$0.f.b(), $$0.N(), x.a($$0.ab(), xl::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      daa e;
      @Nullable
      wu f;
      @Nullable
      xl.a g;

      c(UUID $$0) {
         this.e = daa.e;
         this.a = $$0;
      }

      ads.b a() {
         return new ads.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
