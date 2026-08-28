import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class ftd implements fsy, fsz {
   private static final akk a = new akk("spectator/teleport_to_team");
   private static final wu b = wu.c("spectatorMenu.team_teleport");
   private static final wu c = wu.c("spectatorMenu.team_teleport.prompt");
   private final List<fsz> d;

   public ftd() {
      ffw $$0 = ffw.Q();
      this.d = a($$0, $$0.r.M());
   }

   private static List<fsz> a(ffw $$0, exl $$1) {
      return $$1.g().stream().flatMap($$1x -> ftd.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fsz> a() {
      return this.d;
   }

   @Override
   public wu b() {
      return c;
   }

   @Override
   public void a(fsx $$0) {
      $$0.a(this);
   }

   @Override
   public wu aR_() {
      return b;
   }

   @Override
   public void a(fhh $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aS_() {
      return !this.d.isEmpty();
   }

   static class a implements fsz {
      private final exg a;
      private final Supplier<gqq> b;
      private final List<fyw> c;

      private a(exg $$0, List<fyw> $$1, Supplier<gqq> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fsz> a(ffw $$0, exg $$1) {
         List<fyw> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fyw $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dcd.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(ayo.a().a($$2.size())).a();
            Supplier<gqq> $$6 = $$0.am().a($$5);
            return Optional.of(new ftd.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fsx $$0) {
         $$0.a(new ftc(this.c));
      }

      @Override
      public wu aR_() {
         return this.a.c();
      }

      @Override
      public void a(fhh $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayg.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fit.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aS_() {
         return true;
      }
   }
}
