import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class adz implements zf<abt> {
   public static final yw<wj, adz> a = zf.a(adz::a, adz::new);
   private final EnumSet<adz.a> b;
   private final List<adz.b> c;

   public adz(EnumSet<adz.a> $$0, Collection<aqu> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(adz.b::new).toList();
   }

   public adz(adz.a $$0, aqu $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new adz.b($$1));
   }

   public static adz a(Collection<aqu> $$0) {
      EnumSet<adz.a> $$1 = EnumSet.of(adz.a.a, adz.a.b, adz.a.c, adz.a.d, adz.a.e, adz.a.f);
      return new adz($$1, $$0);
   }

   private adz(wj $$0) {
      this.b = $$0.a(adz.a.class);
      this.c = $$0.a($$0x -> {
         adz.c $$1 = new adz.c($$0x.n());

         for (adz.a $$2 : this.b) {
            $$2.g.read($$1, (wj)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wj $$0) {
      $$0.a(this.b, adz.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (adz.a $$2 : this.b) {
            $$2.h.write((wj)$$0x, $$1);
         }
      });
   }

   @Override
   public zh<adz> a() {
      return agf.af;
   }

   public void a(abt $$0) {
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
         $$2.getProperties().putAll((Multimap)yu.t.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yu.t.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(xp.a::a), ($$0, $$1) -> $$0.a($$1.g, xp.a::a)),
      c(($$0, $$1) -> $$0.e = dcr.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vv.a($$1, xa.d), ($$0, $$1) -> vv.a($$0, $$1.f(), xa.d));

      final adz.a.a g;
      final adz.a.b h;

      private a(final adz.a.a $$0, final adz.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(adz.c var1, wj var2);
      }

      public interface b {
         void write(wj var1, adz.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dcr e, @Nullable wy f, @Nullable xp.a g) {

      b(aqu $$0) {
         this($$0.cA(), $$0.fY(), true, $$0.c.k(), $$0.e.b(), $$0.O(), x.a($$0.ac(), xp::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dcr e;
      @Nullable
      wy f;
      @Nullable
      xp.a g;

      c(UUID $$0) {
         this.e = dcr.e;
         this.a = $$0;
      }

      adz.b a() {
         return new adz.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
