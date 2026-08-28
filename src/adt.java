import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class adt implements zb<abn> {
   public static final ys<wf, adt> a = zb.a(adt::a, adt::new);
   private final EnumSet<adt.a> b;
   private final List<adt.b> c;

   public adt(EnumSet<adt.a> $$0, Collection<aqn> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(adt.b::new).toList();
   }

   public adt(adt.a $$0, aqn $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new adt.b($$1));
   }

   public static adt a(Collection<aqn> $$0) {
      EnumSet<adt.a> $$1 = EnumSet.of(adt.a.a, adt.a.b, adt.a.c, adt.a.d, adt.a.e, adt.a.f);
      return new adt($$1, $$0);
   }

   private adt(wf $$0) {
      this.b = $$0.a(adt.a.class);
      this.c = $$0.a($$0x -> {
         adt.c $$1 = new adt.c($$0x.n());

         for (adt.a $$2 : this.b) {
            $$2.g.read($$1, (wf)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wf $$0) {
      $$0.a(this.b, adt.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (adt.a $$2 : this.b) {
            $$2.h.write((wf)$$0x, $$1);
         }
      });
   }

   @Override
   public zd<adt> a() {
      return afz.af;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public EnumSet<adt.a> b() {
      return this.b;
   }

   public List<adt.b> e() {
      return this.c;
   }

   public List<adt.b> f() {
      return this.b.contains(adt.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)yq.t.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yq.t.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.g = $$1.c(xl.a::a), ($$0, $$1) -> $$0.a($$1.g, xl.a::a)),
      c(($$0, $$1) -> $$0.e = dcd.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vr.a($$1, ww.d), ($$0, $$1) -> vr.a($$0, $$1.f(), ww.d));

      final adt.a.a g;
      final adt.a.b h;

      private a(final adt.a.a $$0, final adt.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(adt.c var1, wf var2);
      }

      public interface b {
         void write(wf var1, adt.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dcd e, @Nullable wu f, @Nullable xl.a g) {

      b(aqn $$0) {
         this($$0.cB(), $$0.fZ(), true, $$0.c.k(), $$0.e.b(), $$0.O(), x.a($$0.ac(), xl::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dcd e;
      @Nullable
      wu f;
      @Nullable
      xl.a g;

      c(UUID $$0) {
         this.e = dcd.e;
         this.a = $$0;
      }

      adt.b a() {
         return new adt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
