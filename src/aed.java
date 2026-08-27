import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aed implements zl<abw> {
   public static final zc<wp, aed> a = zl.a(aed::a, aed::new);
   private final EnumSet<aed.a> b;
   private final List<aed.b> c;

   public aed(EnumSet<aed.a> $$0, Collection<aqu> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aed.b::new).toList();
   }

   public aed(aed.a $$0, aqu $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aed.b($$1));
   }

   public static aed a(Collection<aqu> $$0) {
      EnumSet<aed.a> $$1 = EnumSet.of(aed.a.a, aed.a.b, aed.a.c, aed.a.d, aed.a.e, aed.a.f);
      return new aed($$1, $$0);
   }

   private aed(wp $$0) {
      this.b = $$0.a(aed.a.class);
      this.c = $$0.a($$0x -> {
         aed.c $$1 = new aed.c($$0x.n());

         for (aed.a $$2 : this.b) {
            $$2.g.read($$1, (wp)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wp $$0) {
      $$0.a(this.b, aed.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aed.a $$2 : this.b) {
            $$2.h.write((wp)$$0x, $$1);
         }
      });
   }

   @Override
   public zn<aed> a() {
      return agj.ag;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public EnumSet<aed.a> b() {
      return this.b;
   }

   public List<aed.b> e() {
      return this.c;
   }

   public List<aed.b> f() {
      return this.b.contains(aed.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)za.t.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         za.t.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(xv.a::a), ($$0, $$1) -> $$0.a($$1.g, xv.a::a)),
      c(($$0, $$1) -> $$0.e = dbx.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = we.a($$1, xg.d), ($$0, $$1) -> we.a($$0, $$1.f(), xg.d));

      final aed.a.a g;
      final aed.a.b h;

      private a(aed.a.a $$0, aed.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(aed.c var1, wp var2);
      }

      public interface b {
         void write(wp var1, aed.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dbx e, @Nullable xe f, @Nullable xv.a g) {

      b(aqu $$0) {
         this($$0.cE(), $$0.gk(), true, $$0.d.l(), $$0.f.b(), $$0.P(), y.a($$0.ad(), xv::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dbx e;
      @Nullable
      xe f;
      @Nullable
      xv.a g;

      c(UUID $$0) {
         this.e = dbx.e;
         this.a = $$0;
      }

      aed.b a() {
         return new aed.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
