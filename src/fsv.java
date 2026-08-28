import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fsv implements fsq, fsr {
   private static final akk a = new akk("spectator/teleport_to_team");
   private static final wu b = wu.c("spectatorMenu.team_teleport");
   private static final wu c = wu.c("spectatorMenu.team_teleport.prompt");
   private final List<fsr> d;

   public fsv() {
      ffn $$0 = ffn.Q();
      this.d = a($$0, $$0.r.M());
   }

   private static List<fsr> a(ffn $$0, exd $$1) {
      return $$1.g().stream().flatMap($$1x -> fsv.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fsr> a() {
      return this.d;
   }

   @Override
   public wu b() {
      return c;
   }

   @Override
   public void a(fsp $$0) {
      $$0.a(this);
   }

   @Override
   public wu aQ_() {
      return b;
   }

   @Override
   public void a(fgz $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aR_() {
      return !this.d.isEmpty();
   }

   static class a implements fsr {
      private final ewy a;
      private final Supplier<gqi> b;
      private final List<fyo> c;

      private a(ewy $$0, List<fyo> $$1, Supplier<gqi> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fsr> a(ffn $$0, ewy $$1) {
         List<fyo> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fyo $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dca.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(aym.a().a($$2.size())).a();
            Supplier<gqi> $$6 = $$0.am().a($$5);
            return Optional.of(new fsv.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fsp $$0) {
         $$0.a(new fsu(this.c));
      }

      @Override
      public wu aQ_() {
         return this.a.c();
      }

      @Override
      public void a(fgz $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, aye.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         fil.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aR_() {
         return true;
      }
   }
}
