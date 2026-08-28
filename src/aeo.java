import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aeo implements zw<aci> {
   public static final zn<xa, aeo> a = zw.a(aeo::a, aeo::new);
   private final EnumSet<aeo.a> b;
   private final List<aeo.b> c;

   public aeo(EnumSet<aeo.a> $$0, Collection<arg> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aeo.b::new).toList();
   }

   public aeo(aeo.a $$0, arg $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aeo.b($$1));
   }

   public static aeo a(Collection<arg> $$0) {
      EnumSet<aeo.a> $$1 = EnumSet.of(aeo.a.a, aeo.a.b, aeo.a.c, aeo.a.d, aeo.a.e, aeo.a.f);
      return new aeo($$1, $$0);
   }

   private aeo(xa $$0) {
      this.b = $$0.a(aeo.a.class);
      this.c = $$0.a($$0x -> {
         aeo.c $$1 = new aeo.c($$0x.n());

         for (aeo.a $$2 : this.b) {
            $$2.g.read($$1, (xa)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(xa $$0) {
      $$0.a(this.b, aeo.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aeo.a $$2 : this.b) {
            $$2.h.write((xa)$$0x, $$1);
         }
      });
   }

   @Override
   public zy<aeo> a() {
      return agu.af;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public EnumSet<aeo.a> b() {
      return this.b;
   }

   public List<aeo.b> e() {
      return this.c;
   }

   public List<aeo.b> f() {
      return this.b.contains(aeo.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)zl.t.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         zl.t.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(yg.a::a), ($$0, $$1) -> $$0.a($$1.g, yg.a::a)),
      c(($$0, $$1) -> $$0.e = dbv.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = wm.a($$1, xr.d), ($$0, $$1) -> wm.a($$0, $$1.f(), xr.d));

      final aeo.a.a g;
      final aeo.a.b h;

      private a(final aeo.a.a $$0, final aeo.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(aeo.c var1, xa var2);
      }

      public interface b {
         void write(xa var1, aeo.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dbv e, @Nullable xp f, @Nullable yg.a g) {

      b(arg $$0) {
         this($$0.cz(), $$0.gb(), true, $$0.c.k(), $$0.e.b(), $$0.N(), x.a($$0.ab(), yg::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dbv e;
      @Nullable
      xp f;
      @Nullable
      yg.a g;

      c(UUID $$0) {
         this.e = dbv.e;
         this.a = $$0;
      }

      aeo.b a() {
         return new aeo.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
