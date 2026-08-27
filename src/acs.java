import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class acs implements yb<aam> {
   public static final xs<vf, acs> a = yb.a(acs::a, acs::new);
   private final EnumSet<acs.a> b;
   private final List<acs.b> c;

   public acs(EnumSet<acs.a> $$0, Collection<apg> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(acs.b::new).toList();
   }

   public acs(acs.a $$0, apg $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new acs.b($$1));
   }

   public static acs a(Collection<apg> $$0) {
      EnumSet<acs.a> $$1 = EnumSet.of(acs.a.a, acs.a.b, acs.a.c, acs.a.d, acs.a.e, acs.a.f);
      return new acs($$1, $$0);
   }

   private acs(vf $$0) {
      this.b = $$0.a(acs.a.class);
      this.c = $$0.a($$0x -> {
         acs.c $$1 = new acs.c($$0x.n());

         for (acs.a $$2 : this.b) {
            $$2.g.read($$1, (vf)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(vf $$0) {
      $$0.a(this.b, acs.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (acs.a $$2 : this.b) {
            $$2.h.write((vf)$$0x, $$1);
         }
      });
   }

   @Override
   public yd<acs> a() {
      return aex.af;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public EnumSet<acs.a> b() {
      return this.b;
   }

   public List<acs.b> e() {
      return this.c;
   }

   public List<acs.b> f() {
      return this.b.contains(acs.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll($$1.y());
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         $$0.a($$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(wl.a::a), ($$0, $$1) -> $$0.a($$1.g, wl.a::a)),
      c(($$0, $$1) -> $$0.e = cwy.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = uu.a($$1, vw.b), ($$0, $$1) -> uu.a($$0, $$1.f(), vw.b));

      final acs.a.a g;
      final acs.a.b h;

      private a(acs.a.a $$0, acs.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(acs.c var1, vf var2);
      }

      public interface b {
         void write(vf var1, acs.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cwy e, @Nullable vu f, @Nullable wl.a g) {

      b(apg $$0) {
         this($$0.cw(), $$0.fY(), true, $$0.d.l(), $$0.f.b(), $$0.N(), x.a($$0.ab(), wl::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cwy e;
      @Nullable
      vu f;
      @Nullable
      wl.a g;

      c(UUID $$0) {
         this.e = cwy.e;
         this.a = $$0;
      }

      acs.b a() {
         return new acs.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
