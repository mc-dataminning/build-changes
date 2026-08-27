import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fde implements fcz, fda {
   private static final aer a = new aer("spectator/teleport_to_team");
   private static final tf b = tf.c("spectatorMenu.team_teleport");
   private static final tf c = tf.c("spectatorMenu.team_teleport.prompt");
   private final List<fda> d;

   public fde() {
      eqm $$0 = eqm.O();
      this.d = a($$0, $$0.u.I());
   }

   private static List<fda> a(eqm $$0, eid $$1) {
      return $$1.g().stream().flatMap($$1x -> fde.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fda> a() {
      return this.d;
   }

   @Override
   public tf b() {
      return c;
   }

   @Override
   public void a(fcy $$0) {
      $$0.a(this);
   }

   @Override
   public tf aF_() {
      return b;
   }

   @Override
   public void a(erw $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aG_() {
      return !this.d.isEmpty();
   }

   static class a implements fda {
      private final eib a;
      private final Supplier<fzl> b;
      private final List<fiq> c;

      private a(eib $$0, List<fiq> $$1, Supplier<fzl> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fda> a(eqm $$0, eib $$1) {
         List<fiq> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fiq $$4 = $$0.J().a($$3);
            if ($$4 != null && $$4.e() != cpj.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(aru.a().a($$2.size())).a();
            Supplier<fzl> $$6 = $$0.al().a($$5);
            return Optional.of(new fde.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fcy $$0) {
         $$0.a(new fdd(this.c));
      }

      @Override
      public tf aF_() {
         return this.a.c();
      }

      @Override
      public void a(erw $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, arp.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         etg.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aG_() {
         return true;
      }
   }
}
