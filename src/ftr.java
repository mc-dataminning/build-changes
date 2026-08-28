import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class ftr implements ftm, ftn {
   private static final akq a = akq.b("spectator/teleport_to_team");
   private static final wy b = wy.c("spectatorMenu.team_teleport");
   private static final wy c = wy.c("spectatorMenu.team_teleport.prompt");
   private final List<ftn> d;

   public ftr() {
      fgi $$0 = fgi.Q();
      this.d = a($$0, $$0.r.M());
   }

   private static List<ftn> a(fgi $$0, eya $$1) {
      return $$1.g().stream().flatMap($$1x -> ftr.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<ftn> a() {
      return this.d;
   }

   @Override
   public wy b() {
      return c;
   }

   @Override
   public void a(ftl $$0) {
      $$0.a(this);
   }

   @Override
   public wy aR_() {
      return b;
   }

   @Override
   public void a(fht $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aS_() {
      return !this.d.isEmpty();
   }

   static class a implements ftn {
      private final exv a;
      private final Supplier<grf> b;
      private final List<fzk> c;

      private a(exv $$0, List<fzk> $$1, Supplier<grf> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<ftn> a(fgi $$0, exv $$1) {
         List<fzk> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fzk $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dcr.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(ayv.a().a($$2.size())).a();
            Supplier<grf> $$6 = $$0.am().a($$5);
            return Optional.of(new ftr.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(ftl $$0) {
         $$0.a(new ftq(this.c));
      }

      @Override
      public wy aR_() {
         return this.a.c();
      }

      @Override
      public void a(fht $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayn.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fjf.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aS_() {
         return true;
      }
   }
}
