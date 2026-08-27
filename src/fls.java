import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fls implements fln, flo {
   private static final ajc a = new ajc("spectator/teleport_to_team");
   private static final vs b = vs.c("spectatorMenu.team_teleport");
   private static final vs c = vs.c("spectatorMenu.team_teleport.prompt");
   private final List<flo> d;

   public fls() {
      eyk $$0 = eyk.P();
      this.d = a($$0, $$0.r.K());
   }

   private static List<flo> a(eyk $$0, epz $$1) {
      return $$1.g().stream().flatMap($$1x -> fls.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<flo> a() {
      return this.d;
   }

   @Override
   public vs b() {
      return c;
   }

   @Override
   public void a(flm $$0) {
      $$0.a(this);
   }

   @Override
   public vs aQ_() {
      return b;
   }

   @Override
   public void a(ezx $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aR_() {
      return !this.d.isEmpty();
   }

   static class a implements flo {
      private final epu a;
      private final Supplier<giy> b;
      private final List<frk> c;

      private a(epu $$0, List<frk> $$1, Supplier<giy> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<flo> a(eyk $$0, epu $$1) {
         List<frk> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            frk $$4 = $$0.K().a($$3);
            if ($$4 != null && $$4.e() != cwb.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(awt.a().a($$2.size())).a();
            Supplier<giy> $$6 = $$0.am().a($$5);
            return Optional.of(new fls.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(flm $$0) {
         $$0.a(new flr(this.c));
      }

      @Override
      public vs aQ_() {
         return this.a.c();
      }

      @Override
      public void a(ezx $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, awm.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fbj.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aR_() {
         return true;
      }
   }
}
