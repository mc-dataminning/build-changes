import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aed implements zh<abw> {
   public static final yy<wl, aed> a = zh.a(aed::a, aed::new);
   private final EnumSet<aed.a> b;
   private final List<aed.b> c;

   public aed(EnumSet<aed.a> $$0, Collection<art> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aed.b::new).toList();
   }

   public aed(aed.a $$0, art $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aed.b($$1));
   }

   public static aed a(Collection<art> $$0) {
      EnumSet<aed.a> $$1 = EnumSet.of(aed.a.a, aed.a.b, aed.a.c, aed.a.d, aed.a.e, aed.a.f, aed.a.h, aed.a.g);
      return new aed($$1, $$0);
   }

   private aed(wl $$0) {
      this.b = $$0.a(aed.a.class);
      this.c = $$0.a($$0x -> {
         aed.c $$1 = new aed.c($$0x.n());

         for (aed.a $$2 : this.b) {
            $$2.i.read($$1, (wl)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wl $$0) {
      $$0.a(this.b, aed.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aed.a $$2 : this.b) {
            $$2.j.write((wl)$$0x, $$1);
         }
      });
   }

   @Override
   public zj<aed> a() {
      return agp.ag;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public EnumSet<aed.a> b() {
      return this.b;
   }

   public List<aed.b> e() {
      return this.c;
   }

   public List<aed.b> f() {
      return this.b.contains(aed.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yw.y.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yw.y.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.i = $$1.c(xr.a::a), ($$0, $$1) -> $$0.a($$1.i, xr.a::a)),
      c(($$0, $$1) -> $$0.e = dju.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vw.a($$1, xc.d), ($$0, $$1) -> vw.a($$0, $$1.f(), xc.d)),
      g(($$0, $$1) -> $$0.h = $$1.l(), ($$0, $$1) -> $$0.c($$1.h)),
      h(($$0, $$1) -> $$0.g = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.g));

      final aed.a.a i;
      final aed.a.b j;

      private a(final aed.a.a $$0, final aed.a.b $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public interface a {
         void read(aed.c var1, wl var2);
      }

      public interface b {
         void write(wl var1, aed.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dju e, @Nullable xa f, boolean g, int h, @Nullable xr.a i) {

      b(art $$0) {
         this($$0.cG(), $$0.gi(), true, $$0.f.k(), $$0.h.b(), $$0.O(), $$0.a(crz.g), $$0.P(), y.a($$0.aa(), xr::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dju e;
      @Nullable
      xa f;
      boolean g;
      int h;
      @Nullable
      xr.a i;

      c(UUID $$0) {
         this.e = dju.e;
         this.a = $$0;
      }

      aed.b a() {
         return new aed.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
