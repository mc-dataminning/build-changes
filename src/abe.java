import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class abe implements xf<za> {
   private final EnumSet<abe.a> a;
   private final List<abe.b> b;

   public abe(EnumSet<abe.a> $$0, Collection<ane> $$1) {
      this.a = $$0;
      this.b = $$1.stream().map(abe.b::new).toList();
   }

   public abe(abe.a $$0, ane $$1) {
      this.a = EnumSet.of($$0);
      this.b = List.of(new abe.b($$1));
   }

   public static abe a(Collection<ane> $$0) {
      EnumSet<abe.a> $$1 = EnumSet.of(abe.a.a, abe.a.b, abe.a.c, abe.a.d, abe.a.e, abe.a.f);
      return new abe($$1, $$0);
   }

   public abe(ui $$0) {
      this.a = $$0.a(abe.a.class);
      this.b = $$0.a((ui.a<abe.b>)($$0x -> {
         abe.c $$1 = new abe.c($$0x.p());

         for (abe.a $$2 : this.a) {
            $$2.g.read($$1, $$0x);
         }

         return $$1.a();
      }));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, abe.a.class);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (abe.a $$2 : this.a) {
            $$2.h.write($$0x, $$1);
         }
      });
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public EnumSet<abe.a> a() {
      return this.a;
   }

   public List<abe.b> d() {
      return this.b;
   }

   public List<abe.b> e() {
      return this.a.contains(abe.a.a) ? this.b : List.of();
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
      b(($$0, $$1) -> $$0.g = $$1.c(vw.a::a), ($$0, $$1) -> $$0.a($$1.g, vw.a::a)),
      c(($$0, $$1) -> $$0.e = ctm.a($$1.n()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.n(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = $$1.c(ui::m), ($$0, $$1) -> $$0.a($$1.f(), ui::a));

      final abe.a.a g;
      final abe.a.b h;

      private a(abe.a.a $$0, abe.a.b $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public interface a {
         void read(abe.c var1, ui var2);
      }

      public interface b {
         void write(ui var1, abe.b var2);
      }
   }

   public static record b(UUID a, @Nullable GameProfile b, boolean c, int d, ctm e, @Nullable vf f, @Nullable vw.a g) {

      b(ane $$0) {
         this($$0.cw(), $$0.fR(), true, $$0.c.l(), $$0.e.b(), $$0.N(), x.a($$0.ab(), vw::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      ctm e;
      @Nullable
      vf f;
      @Nullable
      vw.a g;

      c(UUID $$0) {
         this.e = ctm.e;
         this.a = $$0;
      }

      abe.b a() {
         return new abe.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
