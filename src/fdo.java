import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fdo implements fdj, fdk {
   private static final aez a = new aez("spectator/teleport_to_team");
   private static final tl b = tl.c("spectatorMenu.team_teleport");
   private static final tl c = tl.c("spectatorMenu.team_teleport.prompt");
   private final List<fdk> d;

   public fdo() {
      eqp $$0 = eqp.O();
      this.d = a($$0, $$0.r.I());
   }

   private static List<fdk> a(eqp $$0, eig $$1) {
      return $$1.g().stream().flatMap($$1x -> fdo.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fdk> a() {
      return this.d;
   }

   @Override
   public tl b() {
      return c;
   }

   @Override
   public void a(fdi $$0) {
      $$0.a(this);
   }

   @Override
   public tl aI_() {
      return b;
   }

   @Override
   public void a(erz $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aJ_() {
      return !this.d.isEmpty();
   }

   static class a implements fdk {
      private final eie a;
      private final Supplier<gaa> b;
      private final List<fjb> c;

      private a(eie $$0, List<fjb> $$1, Supplier<gaa> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fdk> a(eqp $$0, eie $$1) {
         List<fjb> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fjb $$4 = $$0.J().a($$3);
            if ($$4 != null && $$4.e() != cpy.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(ash.a().a($$2.size())).a();
            Supplier<gaa> $$6 = $$0.al().a($$5);
            return Optional.of(new fdo.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fdi $$0) {
         $$0.a(new fdn(this.c));
      }

      @Override
      public tl aI_() {
         return this.a.c();
      }

      @Override
      public void a(erz $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, asb.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         etj.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aJ_() {
         return true;
      }
   }
}
