import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fie implements fhz, fia {
   private static final ahd a = new ahd("spectator/teleport_to_team");
   private static final vd b = vd.c("spectatorMenu.team_teleport");
   private static final vd c = vd.c("spectatorMenu.team_teleport.prompt");
   private final List<fia> d;

   public fie() {
      eva $$0 = eva.N();
      this.d = a($$0, $$0.r.K());
   }

   private static List<fia> a(eva $$0, emq $$1) {
      return $$1.g().stream().flatMap($$1x -> fie.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fia> a() {
      return this.d;
   }

   @Override
   public vd b() {
      return c;
   }

   @Override
   public void a(fhy $$0) {
      $$0.a(this);
   }

   @Override
   public vd aO_() {
      return b;
   }

   @Override
   public void a(ewm $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.d.isEmpty();
   }

   static class a implements fia {
      private final eml a;
      private final Supplier<gff> b;
      private final List<fnt> c;

      private a(eml $$0, List<fnt> $$1, Supplier<gff> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fia> a(eva $$0, eml $$1) {
         List<fnt> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            fnt $$4 = $$0.I().a($$3);
            if ($$4 != null && $$4.e() != ctf.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(aup.a().a($$2.size())).a();
            Supplier<gff> $$6 = $$0.ak().a($$5);
            return Optional.of(new fie.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fhy $$0) {
         $$0.a(new fid(this.c));
      }

      @Override
      public vd aO_() {
         return this.a.c();
      }

      @Override
      public void a(ewm $$0, float $$1, int $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, aui.f($$4 * $$1, $$5 * $$1, $$6 * $$1) | $$2 << 24);
         }

         $$0.a($$1, $$1, $$1, (float)$$2 / 255.0F);
         exx.a($$0, this.b.get(), 2, 2, 12);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }
}
