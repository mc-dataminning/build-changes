import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class ael implements zp<ace> {
   public static final zg<wt, ael> a = zp.a(ael::a, ael::new);
   private final EnumSet<ael.a> b;
   private final List<ael.b> c;

   public ael(EnumSet<ael.a> $$0, Collection<aro> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(ael.b::new).toList();
   }

   public ael(ael.a $$0, aro $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new ael.b($$1));
   }

   public static ael a(Collection<aro> $$0) {
      EnumSet<ael.a> $$1 = EnumSet.of(ael.a.a, ael.a.b, ael.a.c, ael.a.d, ael.a.e, ael.a.f, ael.a.g);
      return new ael($$1, $$0);
   }

   private ael(wt $$0) {
      this.b = $$0.a(ael.a.class);
      this.c = $$0.a($$0x -> {
         ael.c $$1 = new ael.c($$0x.n());

         for (ael.a $$2 : this.b) {
            $$2.h.read($$1, (wt)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wt $$0) {
      $$0.a(this.b, ael.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (ael.a $$2 : this.b) {
            $$2.i.write((wt)$$0x, $$1);
         }
      });
   }

   @Override
   public zr<ael> a() {
      return agt.ag;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public EnumSet<ael.a> b() {
      return this.b;
   }

   public List<ael.b> e() {
      return this.c;
   }

   public List<ael.b> f() {
      return this.b.contains(ael.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)ze.v.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         ze.v.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.h = $$1.c(xz.a::a), ($$0, $$1) -> $$0.a($$1.h, xz.a::a)),
      c(($$0, $$1) -> $$0.e = dey.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = wf.a($$1, xk.d), ($$0, $$1) -> wf.a($$0, $$1.f(), xk.d)),
      g(($$0, $$1) -> $$0.g = $$1.l(), ($$0, $$1) -> $$0.c($$1.g));

      final ael.a.a h;
      final ael.a.b i;

      private a(final ael.a.a $$0, final ael.a.b $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public interface a {
         void read(ael.c var1, wt var2);
      }

      public interface b {
         void write(wt var1, ael.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dey e, @Nullable xi f, int g, @Nullable xz.a h) {

      b(aro $$0) {
         this($$0.cH(), $$0.gj(), true, $$0.g.k(), $$0.i.b(), $$0.P(), $$0.Q(), x.a($$0.ae(), xz::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dey e;
      @Nullable
      xi f;
      int g;
      @Nullable
      xz.a h;

      c(UUID $$0) {
         this.e = dey.e;
         this.a = $$0;
      }

      ael.b a() {
         return new ael.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
