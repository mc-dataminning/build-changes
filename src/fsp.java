import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fsp implements fsk, fsl {
   private static final alf a = new alf("spectator/teleport_to_team");
   private static final xp b = xp.c("spectatorMenu.team_teleport");
   private static final xp c = xp.c("spectatorMenu.team_teleport.prompt");
   private final List<fsl> d;

   public fsp() {
      ffh $$0 = ffh.Q();
      this.d = a($$0, $$0.r.M());
   }

   private static List<fsl> a(ffh $$0, ewx $$1) {
      return $$1.g().stream().flatMap($$1x -> fsp.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fsl> a() {
      return this.d;
   }

   @Override
   public xp b() {
      return c;
   }

   @Override
   public void a(fsj $$0) {
      $$0.a(this);
   }

   @Override
   public xp aN_() {
      return b;
   }

   @Override
   public void a(fgt $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aO_() {
      return !this.d.isEmpty();
   }

   static class a implements fsl {
      private final ews a;
      private final Supplier<gqb> b;
      private final List<fyi> c;

      private a(ews $$0, List<fyi> $$1, Supplier<gqb> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fsl> a(ffh $$0, ews $$1) {
         List<fyi> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fyi $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dbx.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azh.a().a($$2.size())).a();
            Supplier<gqb> $$6 = $$0.am().a($$5);
            return Optional.of(new fsp.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fsj $$0) {
         $$0.a(new fso(this.c));
      }

      @Override
      public xp aN_() {
         return this.a.c();
      }

      @Override
      public void a(fgt $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayz.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fif.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aO_() {
         return true;
      }
   }
}
