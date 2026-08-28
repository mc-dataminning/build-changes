import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aek implements zo<acd> {
   public static final zf<ws, aek> a = zo.a(aek::a, aek::new);
   private final EnumSet<aek.a> b;
   private final List<aek.b> c;

   public aek(EnumSet<aek.a> $$0, Collection<arn> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aek.b::new).toList();
   }

   public aek(aek.a $$0, arn $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aek.b($$1));
   }

   public static aek a(Collection<arn> $$0) {
      EnumSet<aek.a> $$1 = EnumSet.of(aek.a.a, aek.a.b, aek.a.c, aek.a.d, aek.a.e, aek.a.f, aek.a.g);
      return new aek($$1, $$0);
   }

   private aek(ws $$0) {
      this.b = $$0.a(aek.a.class);
      this.c = $$0.a($$0x -> {
         aek.c $$1 = new aek.c($$0x.n());

         for (aek.a $$2 : this.b) {
            $$2.h.read($$1, (ws)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(ws $$0) {
      $$0.a(this.b, aek.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aek.a $$2 : this.b) {
            $$2.i.write((ws)$$0x, $$1);
         }
      });
   }

   @Override
   public zq<aek> a() {
      return ags.ag;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public EnumSet<aek.a> b() {
      return this.b;
   }

   public List<aek.b> e() {
      return this.c;
   }

   public List<aek.b> f() {
      return this.b.contains(aek.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)zd.v.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         zd.v.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.h = $$1.c(xy.a::a), ($$0, $$1) -> $$0.a($$1.h, xy.a::a)),
      c(($$0, $$1) -> $$0.e = des.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = we.a($$1, xj.d), ($$0, $$1) -> we.a($$0, $$1.f(), xj.d)),
      g(($$0, $$1) -> $$0.g = $$1.l(), ($$0, $$1) -> $$0.c($$1.g));

      final aek.a.a h;
      final aek.a.b i;

      private a(final aek.a.a $$0, final aek.a.b $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public interface a {
         void read(aek.c var1, ws var2);
      }

      public interface b {
         void write(ws var1, aek.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, des e, @Nullable xh f, int g, @Nullable xy.a h) {

      b(arn $$0) {
         this($$0.cH(), $$0.gj(), true, $$0.d.k(), $$0.f.b(), $$0.P(), $$0.Q(), x.a($$0.ae(), xy::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      des e;
      @Nullable
      xh f;
      int g;
      @Nullable
      xy.a h;

      c(UUID $$0) {
         this.e = des.e;
         this.a = $$0;
      }

      aek.b a() {
         return new aek.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
