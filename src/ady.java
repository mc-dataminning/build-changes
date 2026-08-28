import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class ady implements zc<abr> {
   public static final yt<wg, ady> a = zc.a(ady::a, ady::new);
   private final EnumSet<ady.a> b;
   private final List<ady.b> c;

   public ady(EnumSet<ady.a> $$0, Collection<aro> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(ady.b::new).toList();
   }

   public ady(ady.a $$0, aro $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new ady.b($$1));
   }

   public static ady a(Collection<aro> $$0) {
      EnumSet<ady.a> $$1 = EnumSet.of(ady.a.a, ady.a.b, ady.a.c, ady.a.d, ady.a.e, ady.a.f, ady.a.h, ady.a.g);
      return new ady($$1, $$0);
   }

   private ady(wg $$0) {
      this.b = $$0.a(ady.a.class);
      this.c = $$0.a($$0x -> {
         ady.c $$1 = new ady.c($$0x.n());

         for (ady.a $$2 : this.b) {
            $$2.i.read($$1, (wg)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wg $$0) {
      $$0.a(this.b, ady.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (ady.a $$2 : this.b) {
            $$2.j.write((wg)$$0x, $$1);
         }
      });
   }

   @Override
   public ze<ady> a() {
      return agk.ag;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public EnumSet<ady.a> b() {
      return this.b;
   }

   public List<ady.b> e() {
      return this.c;
   }

   public List<ady.b> f() {
      return this.b.contains(ady.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yr.x.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yr.x.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.i = $$1.c(xm.a::a), ($$0, $$1) -> $$0.a($$1.i, xm.a::a)),
      c(($$0, $$1) -> $$0.e = dhm.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vr.a($$1, wx.d), ($$0, $$1) -> vr.a($$0, $$1.f(), wx.d)),
      g(($$0, $$1) -> $$0.h = $$1.l(), ($$0, $$1) -> $$0.c($$1.h)),
      h(($$0, $$1) -> $$0.g = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.g));

      final ady.a.a i;
      final ady.a.b j;

      private a(final ady.a.a $$0, final ady.a.b $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public interface a {
         void read(ady.c var1, wg var2);
      }

      public interface b {
         void write(wg var1, ady.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dhm e, @Nullable wv f, boolean g, int h, @Nullable xm.a i) {

      b(aro $$0) {
         this($$0.cG(), $$0.gh(), true, $$0.f.k(), $$0.h.b(), $$0.O(), $$0.a(cqj.g), $$0.P(), x.a($$0.ad(), xm::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dhm e;
      @Nullable
      wv f;
      boolean g;
      int h;
      @Nullable
      xm.a i;

      c(UUID $$0) {
         this.e = dhm.e;
         this.a = $$0;
      }

      ady.b a() {
         return new ady.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
