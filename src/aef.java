import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aef implements zj<aby> {
   public static final za<wn, aef> a = zj.a(aef::a, aef::new);
   private final EnumSet<aef.a> b;
   private final List<aef.b> c;

   public aef(EnumSet<aef.a> $$0, Collection<arv> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aef.b::new).toList();
   }

   public aef(aef.a $$0, arv $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aef.b($$1));
   }

   public static aef a(Collection<arv> $$0) {
      EnumSet<aef.a> $$1 = EnumSet.of(aef.a.a, aef.a.b, aef.a.c, aef.a.d, aef.a.e, aef.a.f, aef.a.h, aef.a.g);
      return new aef($$1, $$0);
   }

   private aef(wn $$0) {
      this.b = $$0.a(aef.a.class);
      this.c = $$0.a($$0x -> {
         aef.c $$1 = new aef.c($$0x.n());

         for (aef.a $$2 : this.b) {
            $$2.i.read($$1, (wn)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wn $$0) {
      $$0.a(this.b, aef.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aef.a $$2 : this.b) {
            $$2.j.write((wn)$$0x, $$1);
         }
      });
   }

   @Override
   public zl<aef> a() {
      return agr.ag;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public EnumSet<aef.a> b() {
      return this.b;
   }

   public List<aef.b> e() {
      return this.c;
   }

   public List<aef.b> f() {
      return this.b.contains(aef.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yy.y.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yy.y.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.i = $$1.c(xt.a::a), ($$0, $$1) -> $$0.a($$1.i, xt.a::a)),
      c(($$0, $$1) -> $$0.e = djw.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vy.a($$1, xe.d), ($$0, $$1) -> vy.a($$0, $$1.f(), xe.d)),
      g(($$0, $$1) -> $$0.h = $$1.l(), ($$0, $$1) -> $$0.c($$1.h)),
      h(($$0, $$1) -> $$0.g = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.g));

      final aef.a.a i;
      final aef.a.b j;

      private a(final aef.a.a $$0, final aef.a.b $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public interface a {
         void read(aef.c var1, wn var2);
      }

      public interface b {
         void write(wn var1, aef.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, djw e, @Nullable xc f, boolean g, int h, @Nullable xt.a i) {

      b(arv $$0) {
         this($$0.cG(), $$0.gi(), true, $$0.f.k(), $$0.h.b(), $$0.O(), $$0.a(csb.g), $$0.P(), y.a($$0.aa(), xt::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      djw e;
      @Nullable
      xc f;
      boolean g;
      int h;
      @Nullable
      xt.a i;

      c(UUID $$0) {
         this.e = djw.e;
         this.a = $$0;
      }

      aef.b a() {
         return new aef.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
