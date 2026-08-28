import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aea implements zg<abu> {
   public static final yx<wk, aea> a = zg.a(aea::a, aea::new);
   private final EnumSet<aea.a> b;
   private final List<aea.b> c;

   public aea(EnumSet<aea.a> $$0, Collection<aqv> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aea.b::new).toList();
   }

   public aea(aea.a $$0, aqv $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aea.b($$1));
   }

   public static aea a(Collection<aqv> $$0) {
      EnumSet<aea.a> $$1 = EnumSet.of(aea.a.a, aea.a.b, aea.a.c, aea.a.d, aea.a.e, aea.a.f);
      return new aea($$1, $$0);
   }

   private aea(wk $$0) {
      this.b = $$0.a(aea.a.class);
      this.c = $$0.a($$0x -> {
         aea.c $$1 = new aea.c($$0x.n());

         for (aea.a $$2 : this.b) {
            $$2.g.read($$1, (wk)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wk $$0) {
      $$0.a(this.b, aea.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aea.a $$2 : this.b) {
            $$2.h.write((wk)$$0x, $$1);
         }
      });
   }

   @Override
   public zi<aea> a() {
      return agg.af;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public EnumSet<aea.a> b() {
      return this.b;
   }

   public List<aea.b> e() {
      return this.c;
   }

   public List<aea.b> f() {
      return this.b.contains(aea.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yv.t.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yv.t.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(xq.a::a), ($$0, $$1) -> $$0.a($$1.g, xq.a::a)),
      c(($$0, $$1) -> $$0.e = dct.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vw.a($$1, xb.d), ($$0, $$1) -> vw.a($$0, $$1.f(), xb.d));

      final aea.a.a g;
      final aea.a.b h;

      private a(final aea.a.a $$0, final aea.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(aea.c var1, wk var2);
      }

      public interface b {
         void write(wk var1, aea.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dct e, @Nullable wz f, @Nullable xq.a g) {

      b(aqv $$0) {
         this($$0.cA(), $$0.fY(), true, $$0.c.k(), $$0.e.b(), $$0.O(), x.a($$0.ac(), xq::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dct e;
      @Nullable
      wz f;
      @Nullable
      xq.a g;

      c(UUID $$0) {
         this.e = dct.e;
         this.a = $$0;
      }

      aea.b a() {
         return new aea.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
