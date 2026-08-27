import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aal implements wo<yh> {
   private final EnumSet<aal.a> a;
   private final List<aal.b> b;

   public aal(EnumSet<aal.a> $$0, Collection<amj> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(aal.b::new).toList();
   }

   public aal(aal.a $$0, amj $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new aal.b($$1));
   }

   public static aal a(Collection<amj> $$0) {
      EnumSet<aal.a> $$1 = EnumSet.of(aal.a.a, aal.a.b, aal.a.c, aal.a.d, aal.a.e, aal.a.f);
      return new aal($$1, $$0);
   }

   public aal(ty $$0) {
      this.a = $$0.a(aal.a.class);
      this.b = $$0.a((ty.a<aal.b>)($$0x -> {
         aal.c $$1 = new aal.c($$0x.p());

         for (aal.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a, aal.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aal.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public EnumSet<aal.a> a() {
      return this.a;
   }

   public List<aal.b> d() {
      return this.b;
   }

   public List<aal.b> e() {
      return this.a.contains(aal.a.a) ? this.b : List.of();
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
      b(($$0, $$1) -> $$0.g = $$1.c(vm.a::a), ($$0, $$1) -> $$0.a($$1.g, vm.a::a)),
      c(($$0, $$1) -> $$0.e = csc.a($$1.n()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.n(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(ty::m), ($$0, $$1) -> $$0.a($$1.f(), ty::a));

      final aal.a.a g;
      final aal.a.b h;

      private a(aal.a.a $$0, aal.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(aal.c var1, ty var2);
      }

      public interface b {
         void write(ty var1, aal.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, csc e, @Nullable uv f, @Nullable vm.a g) {

      b(amj $$0) {
         this($$0.cw(), $$0.fS(), true, $$0.c.l(), $$0.e.b(), $$0.N(), x.a($$0.ab(), vm::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      csc e;
      @Nullable
      uv f;
      @Nullable
      vm.a g;

      c(UUID $$0) {
         this.e = csc.e;
         this.a = $$0;
      }

      aal.b a() {
         return new aal.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
