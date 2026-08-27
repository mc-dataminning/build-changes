import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class adq implements yz<abk> {
   public static final yq<wd, adq> a = yz.a(adq::a, adq::new);
   private final EnumSet<adq.a> b;
   private final List<adq.b> c;

   public adq(EnumSet<adq.a> $$0, Collection<aqf> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(adq.b::new).toList();
   }

   public adq(adq.a $$0, aqf $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new adq.b($$1));
   }

   public static adq a(Collection<aqf> $$0) {
      EnumSet<adq.a> $$1 = EnumSet.of(adq.a.a, adq.a.b, adq.a.c, adq.a.d, adq.a.e, adq.a.f);
      return new adq($$1, $$0);
   }

   private adq(wd $$0) {
      this.b = $$0.a(adq.a.class);
      this.c = $$0.a($$0x -> {
         adq.c $$1 = new adq.c($$0x.n());

         for (adq.a $$2 : this.b) {
            $$2.g.read($$1, (wd)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wd $$0) {
      $$0.a(this.b, adq.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (adq.a $$2 : this.b) {
            $$2.h.write((wd)$$0x, $$1);
         }
      });
   }

   @Override
   public zb<adq> a() {
      return afv.af;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public EnumSet<adq.a> b() {
      return this.b;
   }

   public List<adq.b> e() {
      return this.c;
   }

   public List<adq.b> f() {
      return this.b.contains(adq.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yo.s.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yo.s.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(xj.a::a), ($$0, $$1) -> $$0.a($$1.g, xj.a::a)),
      c(($$0, $$1) -> $$0.e = czr.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vs.a($$1, wu.d), ($$0, $$1) -> vs.a($$0, $$1.f(), wu.d));

      final adq.a.a g;
      final adq.a.b h;

      private a(adq.a.a $$0, adq.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(adq.c var1, wd var2);
      }

      public interface b {
         void write(wd var1, adq.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, czr e, @Nullable ws f, @Nullable xj.a g) {

      b(aqf $$0) {
         this($$0.cx(), $$0.fZ(), true, $$0.d.l(), $$0.f.b(), $$0.N(), x.a($$0.ab(), xj::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      czr e;
      @Nullable
      ws f;
      @Nullable
      xj.a g;

      c(UUID $$0) {
         this.e = czr.e;
         this.a = $$0;
      }

      adq.b a() {
         return new adq.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
