import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class ads implements yv<abk> {
   public static final ym<vz, ads> a = yv.a(ads::a, ads::new);
   private final EnumSet<ads.a> b;
   private final List<ads.b> c;

   public ads(EnumSet<ads.a> $$0, Collection<ard> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(ads.b::new).toList();
   }

   public ads(ads.a $$0, ard $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new ads.b($$1));
   }

   public static ads a(Collection<ard> $$0) {
      EnumSet<ads.a> $$1 = EnumSet.of(ads.a.a, ads.a.b, ads.a.c, ads.a.d, ads.a.e, ads.a.f, ads.a.h, ads.a.g);
      return new ads($$1, $$0);
   }

   private ads(vz $$0) {
      this.b = $$0.a(ads.a.class);
      this.c = $$0.a($$0x -> {
         ads.c $$1 = new ads.c($$0x.n());

         for (ads.a $$2 : this.b) {
            $$2.i.read($$1, (vz)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(vz $$0) {
      $$0.a(this.b, ads.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (ads.a $$2 : this.b) {
            $$2.j.write((vz)$$0x, $$1);
         }
      });
   }

   @Override
   public yx<ads> a() {
      return agd.ag;
   }

   public void a(abk $$0) {
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
         $$2.getProperties().putAll((Multimap)yk.x.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yk.x.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.i = $$1.c(xf.a::a), ($$0, $$1) -> $$0.a($$1.i, xf.a::a)),
      c(($$0, $$1) -> $$0.e = dgd.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vl.a($$1, wq.d), ($$0, $$1) -> vl.a($$0, $$1.f(), wq.d)),
      g(($$0, $$1) -> $$0.h = $$1.l(), ($$0, $$1) -> $$0.c($$1.h)),
      h(($$0, $$1) -> $$0.g = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.g));

      final ads.a.a i;
      final ads.a.b j;

      private a(final ads.a.a $$0, final ads.a.b $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public interface a {
         void read(ads.c var1, vz var2);
      }

      public interface b {
         void write(vz var1, ads.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dgd e, @Nullable wo f, boolean g, int h, @Nullable xf.a i) {

      b(ard $$0) {
         this($$0.cG(), $$0.gh(), true, $$0.f.k(), $$0.h.b(), $$0.O(), $$0.a(cow.g), $$0.P(), x.a($$0.ad(), xf::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dgd e;
      @Nullable
      wo f;
      boolean g;
      int h;
      @Nullable
      xf.a i;

      c(UUID $$0) {
         this.e = dgd.e;
         this.a = $$0;
      }

      ads.b a() {
         return new ads.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
