import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import java.util.Locale;
import javax.annotation.Nullable;

public abstract class fiv extends byo {
   private static final String g = "http://skins.minecraft.net/MinecraftSkins/%s.png";
   @Nullable
   private ffb cl;
   protected eei b;
   public float c;
   public float d;
   public float e;
   public final few f;

   public fiv(few $$0, GameProfile $$1) {
      super($$0, $$0.R(), $$0.S(), $$1);
      this.b = eei.b;
      this.f = $$0;
   }

   @Override
   public boolean G_() {
      ffb $$0 = this.b();
      return $$0 != null && $$0.e() == cmj.d;
   }

   @Override
   public boolean f() {
      ffb $$0 = this.b();
      return $$0 != null && $$0.e() == cmj.b;
   }

   public boolean a() {
      return this.b() != null;
   }

   @Nullable
   protected ffb b() {
      if (this.cl == null) {
         this.cl = enn.N().I().a(this.ct());
      }

      return this.cl;
   }

   @Override
   public void l() {
      this.b = this.dl();
      super.l();
   }

   public eei b(float $$0) {
      return this.b.a(this.dl(), (double)$$0);
   }

   public boolean c() {
      ffb $$0 = this.b();
      return $$0 != null && $$0.h();
   }

   public acq d() {
      ffb $$0 = this.b();
      return $$0 == null ? fvm.a(this.ct()) : $$0.j();
   }

   @Nullable
   public acq e() {
      ffb $$0 = this.b();
      return $$0 == null ? null : $$0.k();
   }

   public boolean h() {
      return this.b() != null;
   }

   @Nullable
   public acq i() {
      ffb $$0 = this.b();
      return $$0 == null ? null : $$0.l();
   }

   public static void a(acq $$0, String $$1) {
      fuw $$2 = enn.N().X();
      fug $$3 = $$2.b($$0, ful.c());
      if ($$3 == ful.c()) {
         fug var4 = new fuj(null, String.format(Locale.ROOT, "http://skins.minecraft.net/MinecraftSkins/%s.png", aps.a($$1)), fvm.a(hy.a($$1)), true, null);
         $$2.a($$0, var4);
      }
   }

   public static acq c(String $$0) {
      return new acq("skins/" + Hashing.sha1().hashUnencodedChars(aps.a($$0)));
   }

   public String j() {
      ffb $$0 = this.b();
      return $$0 == null ? fvm.b(this.ct()) : $$0.i();
   }

   public float m() {
      float $$0 = 1.0F;
      if (this.fO().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bhg.d) / this.fO().b() + 1.0F) / 2.0F;
      if (this.fO().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cfz $$1 = this.fk();
      if (this.fi()) {
         if ($$1.a(cgc.nG)) {
            int $$2 = this.fm();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (enn.N().m.au().a() && this.gl()) {
            return 0.1F;
         }
      }

      return apa.i(enn.N().m.af().c().floatValue(), 1.0F, $$0);
   }
}
