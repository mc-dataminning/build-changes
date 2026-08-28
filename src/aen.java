import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aen implements zv<ach> {
   public static final zm<wz, aen> a = zv.a(aen::a, aen::new);
   private final EnumSet<aen.a> b;
   private final List<aen.b> c;

   public aen(EnumSet<aen.a> $$0, Collection<arf> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aen.b::new).toList();
   }

   public aen(aen.a $$0, arf $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aen.b($$1));
   }

   public static aen a(Collection<arf> $$0) {
      EnumSet<aen.a> $$1 = EnumSet.of(aen.a.a, aen.a.b, aen.a.c, aen.a.d, aen.a.e, aen.a.f);
      return new aen($$1, $$0);
   }

   private aen(wz $$0) {
      this.b = $$0.a(aen.a.class);
      this.c = $$0.a($$0x -> {
         aen.c $$1 = new aen.c($$0x.n());

         for (aen.a $$2 : this.b) {
            $$2.g.read($$1, (wz)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wz $$0) {
      $$0.a(this.b, aen.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aen.a $$2 : this.b) {
            $$2.h.write((wz)$$0x, $$1);
         }
      });
   }

   @Override
   public zx<aen> a() {
      return agt.af;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public EnumSet<aen.a> b() {
      return this.b;
   }

   public List<aen.b> e() {
      return this.c;
   }

   public List<aen.b> f() {
      return this.b.contains(aen.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)zk.t.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         zk.t.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(yf.a::a), ($$0, $$1) -> $$0.a($$1.g, yf.a::a)),
      c(($$0, $$1) -> $$0.e = dbu.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = wl.a($$1, xq.d), ($$0, $$1) -> wl.a($$0, $$1.f(), xq.d));

      final aen.a.a g;
      final aen.a.b h;

      private a(final aen.a.a $$0, final aen.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(aen.c var1, wz var2);
      }

      public interface b {
         void write(wz var1, aen.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dbu e, @Nullable xo f, @Nullable yf.a g) {

      b(arf $$0) {
         this($$0.cz(), $$0.gb(), true, $$0.c.k(), $$0.e.b(), $$0.N(), x.a($$0.ab(), yf::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dbu e;
      @Nullable
      xo f;
      @Nullable
      yf.a g;

      c(UUID $$0) {
         this.e = dbu.e;
         this.a = $$0;
      }

      aen.b a() {
         return new aen.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
