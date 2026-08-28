import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aez implements aac<acr> {
   public static final zt<xg, aez> a = aac.a(aez::a, aez::new);
   private final EnumSet<aez.a> b;
   private final List<aez.b> c;

   public aez(EnumSet<aez.a> $$0, Collection<asi> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aez.b::new).toList();
   }

   public aez(aez.a $$0, asi $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aez.b($$1));
   }

   public static aez a(Collection<asi> $$0) {
      EnumSet<aez.a> $$1 = EnumSet.of(aez.a.a, aez.a.b, aez.a.c, aez.a.d, aez.a.e, aez.a.f, aez.a.g);
      return new aez($$1, $$0);
   }

   private aez(xg $$0) {
      this.b = $$0.a(aez.a.class);
      this.c = $$0.a($$0x -> {
         aez.c $$1 = new aez.c($$0x.n());

         for (aez.a $$2 : this.b) {
            $$2.h.read($$1, (xg)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(xg $$0) {
      $$0.a(this.b, aez.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aez.a $$2 : this.b) {
            $$2.i.write((xg)$$0x, $$1);
         }
      });
   }

   @Override
   public aae<aez> a() {
      return ahk.ag;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public EnumSet<aez.a> b() {
      return this.b;
   }

   public List<aez.b> e() {
      return this.c;
   }

   public List<aez.b> f() {
      return this.b.contains(aez.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)zr.x.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         zr.x.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.h = $$1.c(ym.a::a), ($$0, $$1) -> $$0.a($$1.h, ym.a::a)),
      c(($$0, $$1) -> $$0.e = dhe.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = ws.a($$1, xx.d), ($$0, $$1) -> ws.a($$0, $$1.f(), xx.d)),
      g(($$0, $$1) -> $$0.g = $$1.l(), ($$0, $$1) -> $$0.c($$1.g));

      final aez.a.a h;
      final aez.a.b i;

      private a(final aez.a.a $$0, final aez.a.b $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public interface a {
         void read(aez.c var1, xg var2);
      }

      public interface b {
         void write(xg var1, aez.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dhe e, @Nullable xv f, int g, @Nullable ym.a h) {

      b(asi $$0) {
         this($$0.cG(), $$0.gf(), true, $$0.f.k(), $$0.h.b(), $$0.O(), $$0.P(), x.a($$0.ad(), ym::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dhe e;
      @Nullable
      xv f;
      int g;
      @Nullable
      ym.a h;

      c(UUID $$0) {
         this.e = dhe.e;
         this.a = $$0;
      }

      aez.b a() {
         return new aez.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
