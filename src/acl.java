import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class acl implements xx<aag> {
   public static final xo<uq, acl> a = xx.a(acl::a, acl::new);
   private final EnumSet<acl.a> b;
   private final List<acl.b> c;

   public acl(EnumSet<acl.a> $$0, Collection<aox> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(acl.b::new).toList();
   }

   public acl(acl.a $$0, aox $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new acl.b($$1));
   }

   public static acl a(Collection<aox> $$0) {
      EnumSet<acl.a> $$1 = EnumSet.of(acl.a.a, acl.a.b, acl.a.c, acl.a.d, acl.a.e, acl.a.f);
      return new acl($$1, $$0);
   }

   private acl(uq $$0) {
      this.b = $$0.a(acl.a.class);
      this.c = $$0.a((xp<? super uq, acl.b>)($$0x -> {
         acl.c $$1 = new acl.c($$0x.p());

         for (acl.a $$2 : this.b) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   private void a(uq $$0) {
      $$0.a(this.b, acl.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (acl.a $$2 : this.b) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   @Override
   public xz<acl> a() {
      return aeq.ae;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public EnumSet<acl.a> b() {
      return this.b;
   }

   public List<acl.b> e() {
      return this.c;
   }

   public List<acl.b> f() {
      return this.b.contains(acl.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll($$1.A());
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         $$0.a($$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(wh.a::a), ($$0, $$1) -> $$0.a($$1.g, wh.a::a)),
      c(($$0, $$1) -> $$0.e = cvo.a($$1.n()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.n(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(uq::m), ($$0, $$1) -> $$0.a($$1.f(), uq::a));

      final acl.a.a g;
      final acl.a.b h;

      private a(acl.a.a $$0, acl.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(acl.c var1, uq var2);
      }

      public interface b {
         void write(uq var1, acl.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cvo e, @Nullable vq f, @Nullable wh.a g) {

      b(aox $$0) {
         this($$0.cw(), $$0.fS(), true, $$0.d.l(), $$0.f.b(), $$0.N(), x.a($$0.ab(), wh::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cvo e;
      @Nullable
      vq f;
      @Nullable
      wh.a g;

      c(UUID $$0) {
         this.e = cvo.e;
         this.a = $$0;
      }

      acl.b a() {
         return new acl.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
