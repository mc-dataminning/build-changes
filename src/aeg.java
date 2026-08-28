import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aeg implements zk<abz> {
   public static final zb<wo, aeg> a = zk.a(aeg::a, aeg::new);
   private final EnumSet<aeg.a> b;
   private final List<aeg.b> c;

   public aeg(EnumSet<aeg.a> $$0, Collection<ari> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aeg.b::new).toList();
   }

   public aeg(aeg.a $$0, ari $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aeg.b($$1));
   }

   public static aeg a(Collection<ari> $$0) {
      EnumSet<aeg.a> $$1 = EnumSet.of(aeg.a.a, aeg.a.b, aeg.a.c, aeg.a.d, aeg.a.e, aeg.a.f, aeg.a.g);
      return new aeg($$1, $$0);
   }

   private aeg(wo $$0) {
      this.b = $$0.a(aeg.a.class);
      this.c = $$0.a($$0x -> {
         aeg.c $$1 = new aeg.c($$0x.n());

         for (aeg.a $$2 : this.b) {
            $$2.h.read($$1, (wo)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wo $$0) {
      $$0.a(this.b, aeg.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aeg.a $$2 : this.b) {
            $$2.i.write((wo)$$0x, $$1);
         }
      });
   }

   @Override
   public zm<aeg> a() {
      return ago.ag;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public EnumSet<aeg.a> b() {
      return this.b;
   }

   public List<aeg.b> e() {
      return this.c;
   }

   public List<aeg.b> f() {
      return this.b.contains(aeg.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yz.u.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yz.u.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.h = $$1.c(xu.a::a), ($$0, $$1) -> $$0.a($$1.h, xu.a::a)),
      c(($$0, $$1) -> $$0.e = ded.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = wa.a($$1, xf.d), ($$0, $$1) -> wa.a($$0, $$1.f(), xf.d)),
      g(($$0, $$1) -> $$0.g = $$1.l(), ($$0, $$1) -> $$0.c($$1.g));

      final aeg.a.a h;
      final aeg.a.b i;

      private a(final aeg.a.a $$0, final aeg.a.b $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public interface a {
         void read(aeg.c var1, wo var2);
      }

      public interface b {
         void write(wo var1, aeg.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, ded e, @Nullable xd f, int g, @Nullable xu.a h) {

      b(ari $$0) {
         this($$0.cD(), $$0.gb(), true, $$0.c.k(), $$0.e.b(), $$0.P(), $$0.Q(), x.a($$0.ae(), xu::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      ded e;
      @Nullable
      xd f;
      int g;
      @Nullable
      xu.a h;

      c(UUID $$0) {
         this.e = ded.e;
         this.a = $$0;
      }

      aeg.b a() {
         return new aeg.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
