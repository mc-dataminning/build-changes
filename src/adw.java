import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class adw implements ze<abq> {
   public static final yv<wi, adw> a = ze.a(adw::a, adw::new);
   private final EnumSet<adw.a> b;
   private final List<adw.b> c;

   public adw(EnumSet<adw.a> $$0, Collection<aqo> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(adw.b::new).toList();
   }

   public adw(adw.a $$0, aqo $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new adw.b($$1));
   }

   public static adw a(Collection<aqo> $$0) {
      EnumSet<adw.a> $$1 = EnumSet.of(adw.a.a, adw.a.b, adw.a.c, adw.a.d, adw.a.e, adw.a.f);
      return new adw($$1, $$0);
   }

   private adw(wi $$0) {
      this.b = $$0.a(adw.a.class);
      this.c = $$0.a($$0x -> {
         adw.c $$1 = new adw.c($$0x.n());

         for (adw.a $$2 : this.b) {
            $$2.g.read($$1, (wi)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wi $$0) {
      $$0.a(this.b, adw.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (adw.a $$2 : this.b) {
            $$2.h.write((wi)$$0x, $$1);
         }
      });
   }

   @Override
   public zg<adw> a() {
      return agc.af;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public EnumSet<adw.a> b() {
      return this.b;
   }

   public List<adw.b> e() {
      return this.c;
   }

   public List<adw.b> f() {
      return this.b.contains(adw.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yt.s.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yt.s.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(xo.a::a), ($$0, $$1) -> $$0.a($$1.g, xo.a::a)),
      c(($$0, $$1) -> $$0.e = daw.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vx.a($$1, wz.d), ($$0, $$1) -> vx.a($$0, $$1.f(), wz.d));

      final adw.a.a g;
      final adw.a.b h;

      private a(adw.a.a $$0, adw.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(adw.c var1, wi var2);
      }

      public interface b {
         void write(wi var1, adw.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, daw e, @Nullable wx f, @Nullable xo.a g) {

      b(aqo $$0) {
         this($$0.cz(), $$0.gb(), true, $$0.c.l(), $$0.e.b(), $$0.N(), x.a($$0.ab(), xo::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      daw e;
      @Nullable
      wx f;
      @Nullable
      xo.a g;

      c(UUID $$0) {
         this.e = daw.e;
         this.a = $$0;
      }

      adw.b a() {
         return new adw.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
