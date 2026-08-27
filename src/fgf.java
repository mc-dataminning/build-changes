import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fgf implements fga, fgb {
   private static final agi a = new agi("spectator/teleport_to_team");
   private static final ur b = ur.c("spectatorMenu.team_teleport");
   private static final ur c = ur.c("spectatorMenu.team_teleport.prompt");
   private final List<fgb> d;

   public fgf() {
      etd $$0 = etd.N();
      this.d = a($$0, $$0.r.J());
   }

   private static List<fgb> a(etd $$0, ekt $$1) {
      return $$1.g().stream().flatMap($$1x -> fgf.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fgb> a() {
      return this.d;
   }

   @Override
   public ur b() {
      return c;
   }

   @Override
   public void a(ffz $$0) {
      $$0.a(this);
   }

   @Override
   public ur aQ_() {
      return b;
   }

   @Override
   public void a(euo $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aR_() {
      return !this.d.isEmpty();
   }

   static class a implements fgb {
      private final ekr a;
      private final Supplier<gcu> b;
      private final List<fls> c;

      private a(ekr $$0, List<fls> $$1, Supplier<gcu> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fgb> a(etd $$0, ekr $$1) {
         List<fls> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fls $$4 = $$0.I().a($$3);
            if ($$4 != null && $$4.e() != crx.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(ats.a().a($$2.size())).a();
            Supplier<gcu> $$6 = $$0.ak().a($$5);
            return Optional.of(new fgf.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(ffz $$0) {
         $$0.a(new fge(this.c));
      }

      @Override
      public ur aQ_() {
         return this.a.c();
      }

      @Override
      public void a(euo $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, atm.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         evy.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aR_() {
         return true;
      }
   }
}
