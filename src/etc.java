import com.mojang.text2speech.Narrator;
import javax.annotation.Nullable;

public class etc extends euq {
   private static final sw a = sw.c("accessibility.onboarding.screen.narrator");
   private static final int b = 4;
   private static final int c = 16;
   private final fjz k = new fjz(euw.b);
   private final epx l;
   private final enr m;
   private final boolean n;
   private boolean o;
   private float p;
   @Nullable
   private epg q;

   public etc(enr $$0) {
      super(sw.c("accessibility.onboarding.screen.title"));
      this.m = $$0;
      this.l = new epx(true);
      this.n = enn.N().aU().a();
   }

   @Override
   public void b() {
      int $$0 = this.l();
      ese $$1 = new ese(this.g, this.h - $$0);
      $$1.b().d().a(4);
      esf $$2 = $$1.a(new esf());
      $$2.b().b().a(4);
      esf.b $$3 = $$2.d(1);
      $$3.c().a(2);
      this.q = new epg(this.i, this.e, this.g);
      $$3.a(this.q, $$3.b().e(16));
      epf $$4 = this.m.an().a(this.m, 0, 0, 150);
      $$4.r = this.n;
      $$3.a($$4);
      if (this.n) {
         this.c($$4);
      }

      $$3.a(epm.b($$0x -> this.a(new etd(this, this.f.m))));
      $$3.a(epm.a($$0x -> this.a(new eua(this, this.f.m, this.f.ad()))));
      $$1.a(epi.a(sv.j, $$0x -> this.aw_()).a(), $$1.a().f().a(8));
      $$1.c();
      ese.a($$1, 0, $$0, this.g, this.h, 0.5F, 0.0F);
      $$1.a(this::d);
   }

   private int l() {
      return 90;
   }

   @Override
   public void aw_() {
      this.a(new euw(true, this.l));
   }

   private void a(euq $$0) {
      this.m.ah = false;
      this.m.aq();
      Narrator.getNarrator().clear();
      this.f.a($$0);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.B();
      this.k.a(0.0F, 1.0F);
      $$0.a(0, 0, this.g, this.h, -1877995504);
      this.l.a($$0, this.g, 1.0F);
      if (this.q != null) {
         this.q.a($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void B() {
      if (!this.o && this.n) {
         if (this.p < 40.0F) {
            this.p++;
         } else if (this.f.aB()) {
            Narrator.getNarrator().say(a.getString(), true);
            this.o = true;
         }
      }
   }
}
