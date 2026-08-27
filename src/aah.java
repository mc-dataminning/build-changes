import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aah implements wk<yd> {
   private final EnumSet<aah.a> a;
   private final List<aah.b> b;

   public aah(EnumSet<aah.a> $$0, Collection<amf> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(aah.b::new).toList();
   }

   public aah(aah.a $$0, amf $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new aah.b($$1));
   }

   public static aah a(Collection<amf> $$0) {
      EnumSet<aah.a> $$1 = EnumSet.of(aah.a.a, aah.a.b, aah.a.c, aah.a.d, aah.a.e, aah.a.f);
      return new aah($$1, $$0);
   }

   public aah(tu $$0) {
      this.a = $$0.a(aah.a.class);
      this.b = $$0.a((tu.a<aah.b>)($$0x -> {
         aah.c $$1 = new aah.c($$0x.p());

         for (aah.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, aah.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aah.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public EnumSet<aah.a> a() {
      return this.a;
   }

   public List<aah.b> d() {
      return this.b;
   }

   public List<aah.b> e() {
      return this.a.contains(aah.a.a) ? this.b : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.a).add("entries", this.b).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll($$1.B());
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         $$0.a($$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(vi.a::a), ($$0, $$1) -> $$0.a($$1.g, vi.a::a)),
      c(($$0, $$1) -> $$0.e = crx.a($$1.n()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.n(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(tu::m), ($$0, $$1) -> $$0.a($$1.f(), tu::a));

      final aah.a.a g;
      final aah.a.b h;

      private a(aah.a.a $$0, aah.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(aah.c var1, tu var2);
      }

      public interface b {
         void write(tu var1, aah.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, crx e, @Nullable ur f, @Nullable vi.a g) {

      b(amf $$0) {
         this($$0.cw(), $$0.fS(), true, $$0.c.l(), $$0.e.b(), $$0.N(), x.a($$0.ab(), vi::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      crx e;
      @Nullable
      ur f;
      @Nullable
      vi.a g;

      c(UUID $$0) {
         this.e = crx.e;
         this.a = $$0;
      }

      aah.b a() {
         return new aah.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
