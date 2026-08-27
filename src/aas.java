import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aas implements wu<yo> {
   private final EnumSet<aas.a> a;
   private final List<aas.b> b;

   public aas(EnumSet<aas.a> $$0, Collection<amq> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(aas.b::new).toList();
   }

   public aas(aas.a $$0, amq $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new aas.b($$1));
   }

   public static aas a(Collection<amq> $$0) {
      EnumSet<aas.a> $$1 = EnumSet.of(aas.a.a, aas.a.b, aas.a.c, aas.a.d, aas.a.e, aas.a.f);
      return new aas($$1, $$0);
   }

   public aas(ue $$0) {
      this.a = $$0.a(aas.a.class);
      this.b = $$0.a((ue.a<aas.b>)($$0x -> {
         aas.c $$1 = new aas.c($$0x.p());

         for (aas.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, aas.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aas.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public EnumSet<aas.a> a() {
      return this.a;
   }

   public List<aas.b> d() {
      return this.b;
   }

   public List<aas.b> e() {
      return this.a.contains(aas.a.a) ? this.b : List.of();
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
      b(($$0, $$1) -> $$0.g = $$1.c(vs.a::a), ($$0, $$1) -> $$0.a($$1.g, vs.a::a)),
      c(($$0, $$1) -> $$0.e = csv.a($$1.n()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.n(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(ue::m), ($$0, $$1) -> $$0.a($$1.f(), ue::a));

      final aas.a.a g;
      final aas.a.b h;

      private a(aas.a.a $$0, aas.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(aas.c var1, ue var2);
      }

      public interface b {
         void write(ue var1, aas.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, csv e, @Nullable vb f, @Nullable vs.a g) {

      b(amq $$0) {
         this($$0.cw(), $$0.fR(), true, $$0.c.l(), $$0.e.b(), $$0.N(), x.a($$0.ab(), vs::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      csv e;
      @Nullable
      vb f;
      @Nullable
      vs.a g;

      c(UUID $$0) {
         this.e = csv.e;
         this.a = $$0;
      }

      aas.b a() {
         return new aas.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
