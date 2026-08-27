import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class ffs implements ffn, ffo {
   private static final agg a = new agg("spectator/teleport_to_team");
   private static final ur b = ur.c("spectatorMenu.team_teleport");
   private static final ur c = ur.c("spectatorMenu.team_teleport.prompt");
   private final List<ffo> d;

   public ffs() {
      esr $$0 = esr.N();
      this.d = a($$0, $$0.r.I());
   }

   private static List<ffo> a(esr $$0, ekh $$1) {
      return $$1.g().stream().flatMap($$1x -> ffs.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<ffo> a() {
      return this.d;
   }

   @Override
   public ur b() {
      return c;
   }

   @Override
   public void a(ffm $$0) {
      $$0.a(this);
   }

   @Override
   public ur aP_() {
      return b;
   }

   @Override
   public void a(eub $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aQ_() {
      return !this.d.isEmpty();
   }

   static class a implements ffo {
      private final ekf a;
      private final Supplier<gch> b;
      private final List<flf> c;

      private a(ekf $$0, List<flf> $$1, Supplier<gch> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<ffo> a(esr $$0, ekf $$1) {
         List<flf> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            flf $$4 = $$0.I().a($$3);
            if ($$4 != null && $$4.e() != crp.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(ato.a().a($$2.size())).a();
            Supplier<gch> $$6 = $$0.ak().a($$5);
            return Optional.of(new ffs.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(ffm $$0) {
         $$0.a(new ffr(this.c));
      }

      @Override
      public ur aP_() {
         return this.a.c();
      }

      @Override
      public void a(eub $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ati.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         evl.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aQ_() {
         return true;
      }
   }
}
