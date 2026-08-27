import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fim implements fih, fii {
   private static final ahg a = new ahg("spectator/teleport_to_team");
   private static final vf b = vf.c("spectatorMenu.team_teleport");
   private static final vf c = vf.c("spectatorMenu.team_teleport.prompt");
   private final List<fii> d;

   public fim() {
      evi $$0 = evi.O();
      this.d = a($$0, $$0.r.K());
   }

   private static List<fii> a(evi $$0, emx $$1) {
      return $$1.g().stream().flatMap($$1x -> fim.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fii> a() {
      return this.d;
   }

   @Override
   public vf b() {
      return c;
   }

   @Override
   public void a(fig $$0) {
      $$0.a(this);
   }

   @Override
   public vf aO_() {
      return b;
   }

   @Override
   public void a(ewu $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.d.isEmpty();
   }

   static class a implements fii {
      private final ems a;
      private final Supplier<gfm> b;
      private final List<fob> c;

      private a(ems $$0, List<fob> $$1, Supplier<gfm> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fii> a(evi $$0, ems $$1) {
         List<fob> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fob $$4 = $$0.J().a($$3);
            if ($$4 != null && $$4.e() != ctm.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(auv.a().a($$2.size())).a();
            Supplier<gfm> $$6 = $$0.al().a($$5);
            return Optional.of(new fim.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fig $$0) {
         $$0.a(new fil(this.c));
      }

      @Override
      public vf aO_() {
         return this.a.c();
      }

      @Override
      public void a(ewu $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, auo.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         eyf.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }
}
