import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fik implements fif, fig {
   private static final ahg a = new ahg("spectator/teleport_to_team");
   private static final vf b = vf.c("spectatorMenu.team_teleport");
   private static final vf c = vf.c("spectatorMenu.team_teleport.prompt");
   private final List<fig> d;

   public fik() {
      evg $$0 = evg.O();
      this.d = a($$0, $$0.r.K());
   }

   private static List<fig> a(evg $$0, emw $$1) {
      return $$1.g().stream().flatMap($$1x -> fik.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fig> a() {
      return this.d;
   }

   @Override
   public vf b() {
      return c;
   }

   @Override
   public void a(fie $$0) {
      $$0.a(this);
   }

   @Override
   public vf aO_() {
      return b;
   }

   @Override
   public void a(ews $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.d.isEmpty();
   }

   static class a implements fig {
      private final emr a;
      private final Supplier<gfk> b;
      private final List<fnz> c;

      private a(emr $$0, List<fnz> $$1, Supplier<gfk> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fig> a(evg $$0, emr $$1) {
         List<fnz> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fnz $$4 = $$0.J().a($$3);
            if ($$4 != null && $$4.e() != ctl.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(auu.a().a($$2.size())).a();
            Supplier<gfk> $$6 = $$0.al().a($$5);
            return Optional.of(new fik.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fie $$0) {
         $$0.a(new fij(this.c));
      }

      @Override
      public vf aO_() {
         return this.a.c();
      }

      @Override
      public void a(ews $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, aun.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         eyd.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }
}
