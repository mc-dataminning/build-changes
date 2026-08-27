import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fhn implements fhi, fhj {
   private static final agt a = new agt("spectator/teleport_to_team");
   private static final vb b = vb.c("spectatorMenu.team_teleport");
   private static final vb c = vb.c("spectatorMenu.team_teleport.prompt");
   private final List<fhj> d;

   public fhn() {
      euk $$0 = euk.N();
      this.d = a($$0, $$0.r.J());
   }

   private static List<fhj> a(euk $$0, ema $$1) {
      return $$1.g().stream().flatMap($$1x -> fhn.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fhj> a() {
      return this.d;
   }

   @Override
   public vb b() {
      return c;
   }

   @Override
   public void a(fhh $$0) {
      $$0.a(this);
   }

   @Override
   public vb aQ_() {
      return b;
   }

   @Override
   public void a(evw $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aR_() {
      return !this.d.isEmpty();
   }

   static class a implements fhj {
      private final ely a;
      private final Supplier<geo> b;
      private final List<fnc> c;

      private a(ely $$0, List<fnc> $$1, Supplier<geo> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fhj> a(euk $$0, ely $$1) {
         List<fnc> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fnc $$4 = $$0.I().a($$3);
            if ($$4 != null && $$4.e() != csv.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(auf.a().a($$2.size())).a();
            Supplier<geo> $$6 = $$0.ak().a($$5);
            return Optional.of(new fhn.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fhh $$0) {
         $$0.a(new fhm(this.c));
      }

      @Override
      public vb aQ_() {
         return this.a.c();
      }

      @Override
      public void a(evw $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, aty.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         exg.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aR_() {
         return true;
      }
   }
}
