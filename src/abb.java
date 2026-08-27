import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class abb implements xd<yx> {
   private final EnumSet<abb.a> a;
   private final List<abb.b> b;

   public abb(EnumSet<abb.a> $$0, Collection<ana> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(abb.b::new).toList();
   }

   public abb(abb.a $$0, ana $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new abb.b($$1));
   }

   public static abb a(Collection<ana> $$0) {
      EnumSet<abb.a> $$1 = EnumSet.of(abb.a.a, abb.a.b, abb.a.c, abb.a.d, abb.a.e, abb.a.f);
      return new abb($$1, $$0);
   }

   public abb(ug $$0) {
      this.a = $$0.a(abb.a.class);
      this.b = $$0.a((ug.a<abb.b>)($$0x -> {
         abb.c $$1 = new abb.c($$0x.p());

         for (abb.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a, abb.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (abb.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public EnumSet<abb.a> a() {
      return this.a;
   }

   public List<abb.b> d() {
      return this.b;
   }

   public List<abb.b> e() {
      return this.a.contains(abb.a.a) ? this.b : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.a).add("entries", this.b).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll($$1.B());
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         $$0.a($$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(vu.a::a), ($$0, $$1) -> $$0.a($$1.g, vu.a::a)),
      c(($$0, $$1) -> $$0.e = ctf.a($$1.n()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.n(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(ug::m), ($$0, $$1) -> $$0.a($$1.f(), ug::a));

      final abb.a.a g;
      final abb.a.b h;

      private a(abb.a.a $$0, abb.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(abb.c var1, ug var2);
      }

      public interface b {
         void write(ug var1, abb.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, ctf e, @Nullable vd f, @Nullable vu.a g) {

      b(ana $$0) {
         this($$0.cw(), $$0.fR(), true, $$0.c.l(), $$0.e.b(), $$0.N(), x.a($$0.ab(), vu::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      ctf e;
      @Nullable
      vd f;
      @Nullable
      vu.a g;

      c(UUID $$0) {
         this.e = ctf.e;
         this.a = $$0;
      }

      abb.b a() {
         return new abb.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
