import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class adg implements yp<aba> {
   public static final yg<vt, adg> a = yp.a(adg::a, adg::new);
   private final EnumSet<adg.a> b;
   private final List<adg.b> c;

   public adg(EnumSet<adg.a> $$0, Collection<apv> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(adg.b::new).toList();
   }

   public adg(adg.a $$0, apv $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new adg.b($$1));
   }

   public static adg a(Collection<apv> $$0) {
      EnumSet<adg.a> $$1 = EnumSet.of(adg.a.a, adg.a.b, adg.a.c, adg.a.d, adg.a.e, adg.a.f);
      return new adg($$1, $$0);
   }

   private adg(vt $$0) {
      this.b = $$0.a(adg.a.class);
      this.c = $$0.a($$0x -> {
         adg.c $$1 = new adg.c($$0x.n());

         for (adg.a $$2 : this.b) {
            $$2.g.read($$1, (vt)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(vt $$0) {
      $$0.a(this.b, adg.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (adg.a $$2 : this.b) {
            $$2.h.write((vt)$$0x, $$1);
         }
      });
   }

   @Override
   public yr<adg> a() {
      return afl.af;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public EnumSet<adg.a> b() {
      return this.b;
   }

   public List<adg.b> e() {
      return this.c;
   }

   public List<adg.b> f() {
      return this.b.contains(adg.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)ye.s.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         ye.s.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(wz.a::a), ($$0, $$1) -> $$0.a($$1.g, wz.a::a)),
      c(($$0, $$1) -> $$0.e = czd.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vi.a($$1, wk.d), ($$0, $$1) -> vi.a($$0, $$1.f(), wk.d));

      final adg.a.a g;
      final adg.a.b h;

      private a(adg.a.a $$0, adg.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(adg.c var1, vt var2);
      }

      public interface b {
         void write(vt var1, adg.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, czd e, @Nullable wi f, @Nullable wz.a g) {

      b(apv $$0) {
         this($$0.cw(), $$0.fY(), true, $$0.d.l(), $$0.f.b(), $$0.N(), x.a($$0.ab(), wz::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      czd e;
      @Nullable
      wi f;
      @Nullable
      wz.a g;

      c(UUID $$0) {
         this.e = czd.e;
         this.a = $$0;
      }

      adg.b a() {
         return new adg.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
