import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aem implements zq<acf> {
   public static final zh<wu, aem> a = zq.a(aem::a, aem::new);
   private final EnumSet<aem.a> b;
   private final List<aem.b> c;

   public aem(EnumSet<aem.a> $$0, Collection<arq> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aem.b::new).toList();
   }

   public aem(aem.a $$0, arq $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aem.b($$1));
   }

   public static aem a(Collection<arq> $$0) {
      EnumSet<aem.a> $$1 = EnumSet.of(aem.a.a, aem.a.b, aem.a.c, aem.a.d, aem.a.e, aem.a.f, aem.a.g);
      return new aem($$1, $$0);
   }

   private aem(wu $$0) {
      this.b = $$0.a(aem.a.class);
      this.c = $$0.a($$0x -> {
         aem.c $$1 = new aem.c($$0x.n());

         for (aem.a $$2 : this.b) {
            $$2.h.read($$1, (wu)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wu $$0) {
      $$0.a(this.b, aem.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aem.a $$2 : this.b) {
            $$2.i.write((wu)$$0x, $$1);
         }
      });
   }

   @Override
   public zs<aem> a() {
      return agu.ag;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public EnumSet<aem.a> b() {
      return this.b;
   }

   public List<aem.b> e() {
      return this.c;
   }

   public List<aem.b> f() {
      return this.b.contains(aem.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)zf.w.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         zf.w.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.h = $$1.c(ya.a::a), ($$0, $$1) -> $$0.a($$1.h, ya.a::a)),
      c(($$0, $$1) -> $$0.e = dfj.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = wg.a($$1, xl.d), ($$0, $$1) -> wg.a($$0, $$1.f(), xl.d)),
      g(($$0, $$1) -> $$0.g = $$1.l(), ($$0, $$1) -> $$0.c($$1.g));

      final aem.a.a h;
      final aem.a.b i;

      private a(final aem.a.a $$0, final aem.a.b $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public interface a {
         void read(aem.c var1, wu var2);
      }

      public interface b {
         void write(wu var1, aem.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dfj e, @Nullable xj f, int g, @Nullable ya.a h) {

      b(arq $$0) {
         this($$0.cG(), $$0.gf(), true, $$0.f.k(), $$0.h.b(), $$0.O(), $$0.P(), x.a($$0.ad(), ya::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dfj e;
      @Nullable
      xj f;
      int g;
      @Nullable
      ya.a h;

      c(UUID $$0) {
         this.e = dfj.e;
         this.a = $$0;
      }

      aem.b a() {
         return new aem.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      }
   }
}
