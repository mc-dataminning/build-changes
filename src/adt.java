import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class adt implements yw<abl> {
   public static final yn<wa, adt> a = yw.a(adt::a, adt::new);
   private final EnumSet<adt.a> b;
   private final List<adt.b> c;

   public adt(EnumSet<adt.a> $$0, Collection<are> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(adt.b::new).toList();
   }

   public adt(adt.a $$0, are $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new adt.b($$1));
   }

   public static adt a(Collection<are> $$0) {
      EnumSet<adt.a> $$1 = EnumSet.of(adt.a.a, adt.a.b, adt.a.c, adt.a.d, adt.a.e, adt.a.f, adt.a.h, adt.a.g);
      return new adt($$1, $$0);
   }

   private adt(wa $$0) {
      this.b = $$0.a(adt.a.class);
      this.c = $$0.a($$0x -> {
         adt.c $$1 = new adt.c($$0x.n());

         for (adt.a $$2 : this.b) {
            $$2.i.read($$1, (wa)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wa $$0) {
      $$0.a(this.b, adt.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (adt.a $$2 : this.b) {
            $$2.j.write((wa)$$0x, $$1);
         }
      });
   }

   @Override
   public yy<adt> a() {
      return age.ag;
   }

   public void a(abl $$0) {
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
         $$2.getProperties().putAll((Multimap)yl.x.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         yl.x.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.i = $$1.c(xg.a::a), ($$0, $$1) -> $$0.a($$1.i, xg.a::a)),
      c(($$0, $$1) -> $$0.e = dge.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = vl.a($$1, wr.d), ($$0, $$1) -> vl.a($$0, $$1.f(), wr.d)),
      g(($$0, $$1) -> $$0.h = $$1.l(), ($$0, $$1) -> $$0.c($$1.h)),
      h(($$0, $$1) -> $$0.g = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.g));

      final adt.a.a i;
      final adt.a.b j;

      private a(final adt.a.a $$0, final adt.a.b $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public interface a {
         void read(adt.c var1, wa var2);
      }

      public interface b {
         void write(wa var1, adt.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, dge e, @Nullable wp f, boolean g, int h, @Nullable xg.a i) {

      b(are $$0) {
         this($$0.cG(), $$0.gh(), true, $$0.f.k(), $$0.h.b(), $$0.O(), $$0.a(cox.g), $$0.P(), x.a($$0.ad(), xg::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dge e;
      @Nullable
      wp f;
      boolean g;
      int h;
      @Nullable
      xg.a i;

      c(UUID $$0) {
         this.e = dge.e;
         this.a = $$0;
      }

      adt.b a() {
         return new adt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
