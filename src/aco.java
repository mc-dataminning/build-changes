import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aco implements xz<aai> {
   public static final xq<vd, aco> a = xz.a(aco::a, aco::new);
   private final EnumSet<aco.a> b;
   private final List<aco.b> c;

   public aco(EnumSet<aco.a> $$0, Collection<apb> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aco.b::new).toList();
   }

   public aco(aco.a $$0, apb $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aco.b($$1));
   }

   public static aco a(Collection<apb> $$0) {
      EnumSet<aco.a> $$1 = EnumSet.of(aco.a.a, aco.a.b, aco.a.c, aco.a.d, aco.a.e, aco.a.f);
      return new aco($$1, $$0);
   }

   private aco(vd $$0) {
      this.b = $$0.a(aco.a.class);
      this.c = $$0.a($$0x -> {
         aco.c $$1 = new aco.c($$0x.n());

         for (aco.a $$2 : this.b) {
            $$2.g.read($$1, (vd)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(vd $$0) {
      $$0.a(this.b, aco.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aco.a $$2 : this.b) {
            $$2.h.write((vd)$$0x, $$1);
         }
      });
   }

   @Override
   public yb<aco> a() {
      return aet.af;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public EnumSet<aco.a> b() {
      return this.b;
   }

   public List<aco.b> e() {
      return this.c;
   }

   public List<aco.b> f() {
      return this.b.contains(aco.a.a) ? this.c : List.of();
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
      b(($$0, $$1) -> $$0.g = $$1.c(wj.a::a), ($$0, $$1) -> $$0.a($$1.g, wj.a::a)),
      c(($$0, $$1) -> $$0.e = cwb.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = us.a($$1, vu.b), ($$0, $$1) -> us.a($$0, $$1.f(), vu.b));

      final aco.a.a g;
      final aco.a.b h;

      private a(aco.a.a $$0, aco.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(aco.c var1, vd var2);
      }

      public interface b {
         void write(vd var1, aco.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cwb e, @Nullable vs f, @Nullable wj.a g) {

      b(apb $$0) {
         this($$0.ct(), $$0.fU(), true, $$0.d.l(), $$0.f.b(), $$0.N(), x.a($$0.ab(), wj::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cwb e;
      @Nullable
      vs f;
      @Nullable
      wj.a g;

      c(UUID $$0) {
         this.e = cwb.e;
         this.a = $$0;
      }

      aco.b a() {
         return new aco.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
