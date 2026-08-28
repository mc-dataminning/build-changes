import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aeh implements zl<aca> {
   public static final zc<wp, aeh> a = zl.a(aeh::a, aeh::new);
   private final EnumSet<aeh.a> b;
   private final List<aeh.b> c;

   public aeh(EnumSet<aeh.a> $$0, Collection<ark> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aeh.b::new).toList();
   }

   public aeh(aeh.a $$0, ark $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aeh.b($$1));
   }

   public static aeh a(Collection<ark> $$0) {
      EnumSet<aeh.a> $$1 = EnumSet.of(aeh.a.a, aeh.a.b, aeh.a.c, aeh.a.d, aeh.a.e, aeh.a.f, aeh.a.g);
      return new aeh($$1, $$0);
   }

   private aeh(wp $$0) {
      this.b = $$0.a(aeh.a.class);
      this.c = $$0.a($$0x -> {
         aeh.c $$1 = new aeh.c($$0x.n());

         for (aeh.a $$2 : this.b) {
            $$2.h.read($$1, (wp)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wp $$0) {
      $$0.a(this.b, aeh.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aeh.a $$2 : this.b) {
            $$2.i.write((wp)$$0x, $$1);
         }
      });
   }

   @Override
   public zn<aeh> a() {
      return agp.ag;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public EnumSet<aeh.a> b() {
      return this.b;
   }

   public List<aeh.b> e() {
      return this.c;
   }

   public List<aeh.b> f() {
      return this.b.contains(aeh.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)za.v.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         za.v.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.h = $$1.c(xv.a::a), ($$0, $$1) -> $$0.a($$1.h, xv.a::a)),
      c(($$0, $$1) -> $$0.e = deg.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = wb.a($$1, xg.d), ($$0, $$1) -> wb.a($$0, $$1.f(), xg.d)),
      g(($$0, $$1) -> $$0.g = $$1.l(), ($$0, $$1) -> $$0.c($$1.g));

      final aeh.a.a h;
      final aeh.a.b i;

      private a(final aeh.a.a $$0, final aeh.a.b $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public interface a {
         void read(aeh.c var1, wp var2);
      }

      public interface b {
         void write(wp var1, aeh.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, deg e, @Nullable xe f, int g, @Nullable xv.a h) {

      b(ark $$0) {
         this($$0.cD(), $$0.gc(), true, $$0.c.k(), $$0.e.b(), $$0.P(), $$0.Q(), x.a($$0.ae(), xv::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      deg e;
      @Nullable
      xe f;
      int g;
      @Nullable
      xv.a h;

      c(UUID $$0) {
         this.e = deg.e;
         this.a = $$0;
      }

      aeh.b a() {
         return new aeh.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
