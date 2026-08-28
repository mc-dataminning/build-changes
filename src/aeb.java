import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aeb implements zf<abu> {
   public static final yw<wj, aeb> a = zf.a(aeb::a, aeb::new);
   private final EnumSet<aeb.a> b;
   private final List<aeb.b> c;

   public aeb(EnumSet<aeb.a> $$0, Collection<arr> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aeb.b::new).toList();
   }

   public aeb(aeb.a $$0, arr $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aeb.b($$1));
   }

   public static aeb a(Collection<arr> $$0) {
      EnumSet<aeb.a> $$1 = EnumSet.of(aeb.a.a, aeb.a.b, aeb.a.c, aeb.a.d, aeb.a.e, aeb.a.f, aeb.a.h, aeb.a.g);
      return new aeb($$1, $$0);
   }

   private aeb(wj $$0) {
      this.b = $$0.a(aeb.a.class);
      this.c = $$0.a($$0x -> {
         aeb.c $$1 = new aeb.c($$0x.n());

         for (aeb.a $$2 : this.b) {
            $$2.i.read($$1, (wj)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wj $$0) {
      $$0.a(this.b, aeb.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aeb.a $$2 : this.b) {
            $$2.j.write((wj)$$0x, $$1);
         }
      });
   }

   @Override
   public zh<aeb> a() {
      return agn.ag;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public EnumSet<aeb.a> b() {
      return this.b;
   }

   public List<aeb.b> e() {
      return this.c;
   }

   public List<aeb.b> f() {
      return this.b.contains(aeb.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yu.y.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yu.y.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.i = $$1.c(xp.a::a), ($$0, $$1) -> $$0.a($$1.i, xp.a::a)),
      c(($$0, $$1) -> $$0.e = djj.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vu.a($$1, xa.d), ($$0, $$1) -> vu.a($$0, $$1.f(), xa.d)),
      g(($$0, $$1) -> $$0.h = $$1.l(), ($$0, $$1) -> $$0.c($$1.h)),
      h(($$0, $$1) -> $$0.g = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.g));

      final aeb.a.a i;
      final aeb.a.b j;

      private a(final aeb.a.a $$0, final aeb.a.b $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public interface a {
         void read(aeb.c var1, wj var2);
      }

      public interface b {
         void write(wj var1, aeb.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, djj e, @Nullable wy f, boolean g, int h, @Nullable xp.a i) {

      b(arr $$0) {
         this($$0.cF(), $$0.gh(), true, $$0.f.k(), $$0.h.b(), $$0.O(), $$0.a(cro.g), $$0.P(), y.a($$0.aa(), xp::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      djj e;
      @Nullable
      wy f;
      boolean g;
      int h;
      @Nullable
      xp.a i;

      c(UUID $$0) {
         this.e = djj.e;
         this.a = $$0;
      }

      aeb.b a() {
         return new aeb.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
