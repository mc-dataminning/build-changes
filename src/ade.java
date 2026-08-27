import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class ade implements yn<aay> {
   public static final ye<vr, ade> a = yn.a(ade::a, ade::new);
   private final EnumSet<ade.a> b;
   private final List<ade.b> c;

   public ade(EnumSet<ade.a> $$0, Collection<apt> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(ade.b::new).toList();
   }

   public ade(ade.a $$0, apt $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new ade.b($$1));
   }

   public static ade a(Collection<apt> $$0) {
      EnumSet<ade.a> $$1 = EnumSet.of(ade.a.a, ade.a.b, ade.a.c, ade.a.d, ade.a.e, ade.a.f);
      return new ade($$1, $$0);
   }

   private ade(vr $$0) {
      this.b = $$0.a(ade.a.class);
      this.c = $$0.a($$0x -> {
         ade.c $$1 = new ade.c($$0x.n());

         for (ade.a $$2 : this.b) {
            $$2.g.read($$1, (vr)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(vr $$0) {
      $$0.a(this.b, ade.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (ade.a $$2 : this.b) {
            $$2.h.write((vr)$$0x, $$1);
         }
      });
   }

   @Override
   public yp<ade> a() {
      return afj.af;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public EnumSet<ade.a> b() {
      return this.b;
   }

   public List<ade.b> e() {
      return this.c;
   }

   public List<ade.b> f() {
      return this.b.contains(ade.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yc.s.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yc.s.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(wx.a::a), ($$0, $$1) -> $$0.a($$1.g, wx.a::a)),
      c(($$0, $$1) -> $$0.e = cyu.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vg.a($$1, wi.d), ($$0, $$1) -> vg.a($$0, $$1.f(), wi.d));

      final ade.a.a g;
      final ade.a.b h;

      private a(ade.a.a $$0, ade.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(ade.c var1, vr var2);
      }

      public interface b {
         void write(vr var1, ade.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, cyu e, @Nullable wg f, @Nullable wx.a g) {

      b(apt $$0) {
         this($$0.cw(), $$0.fY(), true, $$0.d.l(), $$0.f.b(), $$0.N(), x.a($$0.ab(), wx::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      cyu e;
      @Nullable
      wg f;
      @Nullable
      wx.a g;

      c(UUID $$0) {
         this.e = cyu.e;
         this.a = $$0;
      }

      ade.b a() {
         return new ade.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
