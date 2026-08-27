import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fda implements fcv, fcw {
   private static final aep a = new aep("spectator/teleport_to_team");
   private static final te b = te.c("spectatorMenu.team_teleport");
   private static final te c = te.c("spectatorMenu.team_teleport.prompt");
   private final List<fcw> d;

   public fda() {
      eqn $$0 = eqn.N();
      this.d = a($$0, $$0.s.I());
   }

   private static List<fcw> a(eqn $$0, eie $$1) {
      return $$1.g().stream().flatMap($$1x -> fda.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fcw> a() {
      return this.d;
   }

   @Override
   public te b() {
      return c;
   }

   @Override
   public void a(fcu $$0) {
      $$0.a(this);
   }

   @Override
   public te aF_() {
      return b;
   }

   @Override
   public void a(erx $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aG_() {
      return !this.d.isEmpty();
   }

   static class a implements fcw {
      private final eic a;
      private final Supplier<fzg> b;
      private final List<fil> c;

      private a(eic $$0, List<fil> $$1, Supplier<fzg> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fcw> a(eqn $$0, eic $$1) {
         List<fil> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fil $$4 = $$0.I().a($$3);
            if ($$4 != null && $$4.e() != cph.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(art.a().a($$2.size())).a();
            Supplier<fzg> $$6 = $$0.ak().a($$5);
            return Optional.of(new fda.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fcu $$0) {
         $$0.a(new fcz(this.c));
      }

      @Override
      public te aF_() {
         return this.a.c();
      }

      @Override
      public void a(erx $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, aro.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         eth.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aG_() {
         return true;
      }
   }
}
